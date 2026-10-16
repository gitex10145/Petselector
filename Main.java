import java.util.Scanner;

/*
 * Danilo Vranic
 * period 2
 * pet game
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = "";
        String season = "";
        String name = "";

        System.out.print("Favorite color? red blue green: ");
        color = sc.nextLine().trim().toLowerCase();
        if (!(color.equals("red") || color.equals("blue") || color.equals("green"))) {
            // just use blue if bad input
            System.out.println("bad color, blue.");
            color = "blue";
        }

        System.out.print("Favorite season? winter spring summer fall: ");
        season = sc.nextLine().trim().toLowerCase();
        if (!(season.equals("winter") || season.equals("spring") || season.equals("summer") || season.equals("fall"))) {
            // pick summer if they type wrong thing
            System.out.println("bad season, summer.");
            season = "summer";
        }

        System.out.print("Your name? ");
        name = sc.nextLine().trim();
        if (name.length() == 0) {
            // if no name, just use Sam
            System.out.println("No name, Sam.");
            name = "Sam";
        }

        char firstLetter = Character.toLowerCase(name.charAt(0));
        boolean startsWithVowel = "aeiou".indexOf(firstLetter) >= 0;

        String pet = "";

        if (color.equals("blue")) {
            // blue stuff
            if (season.equals("fall")) {
                pet = "Alligator";
            } else if (season.equals("spring")) {
                pet = "Ostrich";
            } else if (!startsWithVowel && !season.equals("fall") && !season.equals("summer")) {
                pet = "Axolotl";
            }
        }

        if (color.equals("green")) {
            // green pet stuff
            if (!startsWithVowel && season.equals("winter")) {
                pet = "Giraffe";
            } else if (!season.equals("fall")) {
                pet = "Dog";
            }
        }

        if (color.equals("red")) {
            // red pet
            if (startsWithVowel) {
                pet = "Porcupine";
            } else {
                pet = "Panda";
            }
        }

        if (season.equals("summer")) {
            // summer makes pony
            pet = "Pony";
        }

        if (pet.equals("")) {
            // default pet
            pet = "Pet rock";
        }

        System.out.println("Your perfect pet is: " + pet);

        sc.close();
    }
}