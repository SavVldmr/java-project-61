package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
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
            case "5":
                ProgressionGame.startProgressionGame();
                break;
            case "6":
                PrimeGame.startPrimeGame();
                break;
            default:
                System.exit(0);
        }

    }
}
