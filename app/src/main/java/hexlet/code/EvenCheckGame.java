package hexlet.code;

import java.util.Scanner;

public class EvenCheckGame {
    public static void startEvenCheckGame() {
        String username = Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int answerInARow = 0;
        Scanner console = new Scanner(System.in);
        while (Math.abs(answerInARow) < 3) {
            int currentNumber = (int) (Math.random() * 100);
            boolean numberIsEven = currentNumber % 2 == 0;
            System.out.println("Question: " + currentNumber);
            System.out.print("Your answer: ");
            String currentAnswer = console.nextLine();
            if (((currentAnswer.equals("yes")) && numberIsEven) || ((currentAnswer.equals("no")) && !numberIsEven)) {
                if (answerInARow >= 0) {
                    answerInARow++;
                } else {
                    answerInARow = 1;
                }
                System.out.println("Correct!");
            } else {
                if (answerInARow <= 0) {
                    answerInARow--;
                } else {
                    answerInARow = -1;
                }
                System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was "
                        + ((currentAnswer.equals("yes")) ? "'no'" : "'yes'") + ".");
            }
        }
        if (answerInARow < 0) {
            System.out.println("Let's try again, " + username + "!");
        } else {
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
