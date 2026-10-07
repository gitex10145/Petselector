import java.util.Sanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();
        System.out.print("Enter your favorite season: ");
        String season = scanner.nextLine();

    scanner.close();
    if (color.equalsIgnoreCase("blue")&& season.equalsIgnoreCase("fall")) 
system.out.println("Your pet is an alligator!");");
    else if (color.equalsIgnoreCase("blue") && season.equalsIgnoreCase("spring")) 
        System.out.println("Your pet is an ostrich!");
    else if (color.equalsIgnoreCase("green") && season.equalsIgnoreCase("spring")) 
        System.out.println("You enjoy the freshness of spring!");
    else 
        System.out.println("You have a diverse taste in colors and seasons!");
    }
}