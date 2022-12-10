package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner console = new Scanner(System.in);
        String response = console.nextLine();
        switch (response) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                EvenGame.startEvenGame();
                break;
            case "3":
                CalcGame.startCalcGame();
                break;
            case "4":
                GcdGame.startGcdGame();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                break;
        }

    }
}
