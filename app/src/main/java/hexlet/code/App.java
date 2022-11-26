package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner console = new Scanner(System.in);
        String response = console.nextLine();
        switch (response) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                EvenCheckGame.startEvenCheckGame();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                break;
        }

    }
}
