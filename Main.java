import java.util.Scanner;

/*
 * Name: Danilo Vranic
 * Period: 2
 * Description: Finds your perfect pet based on your favorite color, season,
 * and the first letter of your name.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's figure out your perfect pet.");

        String color = "";
        String season = "";
        String name = "";

        System.out.print("Favorite color? (red/blue/green): ");
        color = sc.nextLine().trim().toLowerCase();
        if (!(color.equals("red") || color.equals("blue") || color.equals("green"))) {
            System.out.println("I only know red, blue, or green, so I'll just go with blue.");
            color = "blue";
        }

        System.out.print("What's your favorite season? (winter/spring/summer/fall): ");
        season = sc.nextLine().trim().toLowerCase();
        if (!(season.equals("winter") || season.equals("spring") || season.equals("summer") || season.equals("fall"))) {
            System.out.println("That one doesn't count, so let's say summer.");
            season = "summer";
        }

        System.out.print("And your first name? ");
        name = sc.nextLine().trim();
        if (name.length() == 0) {
            System.out.println("You didn't type anything, so I'll call you Sam.");
            name = "Sam";
        }

        char firstLetter = Character.toLowerCase(name.charAt(0));
        boolean startsWithVowel = "aeiou".indexOf(firstLetter) >= 0;

        System.out.print("Crunching the pet data");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
        }
        System.out.println();

        String pet = "";

        if (color.equals("blue")) {
            if (season.equals("fall")) {
                pet = "Alligator";
            } else if (season.equals("spring")) {
                pet = "Ostrich";
            } else if (!startsWithVowel && !season.equals("fall") && !season.equals("summer")) {
                pet = "Axolotl";
            }
        }

        if (color.equals("green")) {
            if (!startsWithVowel && season.equals("winter")) {
                pet = "Giraffe";
            } else if (!season.equals("fall")) {
                pet = "Dog";
            }
        }

        if (color.equals("red")) {
            if (startsWithVowel) {
                pet = "Porcupine";
            } else {
                pet = "Panda";
            }
        }

        if (season.equals("summer")) {
            pet = "Pony";
        }

        if (pet.equals("")) {
            pet = "Pet rock";
        }

        System.out.println("Well, " + name + ", your perfect pet is: " + pet + "!");
        System.out.println("(If you don't like it, blame the universe and not the code.)");

        sc.close();
    }
}