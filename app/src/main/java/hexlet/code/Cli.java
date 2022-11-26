package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        System.out.println("Hello, " + username + "!");
        return username;
    }
}
