package hexlet.code;

import java.util.Scanner;

public class EvenCheckGame {
    public static void startEvenCheckGame() {
        String username = Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctAnswerInARow = 0;
        Scanner console = new Scanner(System.in);
        while (correctAnswerInARow < 3) {
            int currentNumber = (int) (Math.random() * 100);
            String correctAnswer = (currentNumber % 2 == 0) ? "yes" : "no";
            System.out.println("Question: " + currentNumber);
            System.out.print("Your answer: ");
            String currentAnswer = console.nextLine();
            boolean isAnswerCorrect = currentAnswer.equals(correctAnswer);
            if (isAnswerCorrect) {
                correctAnswerInARow++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + username + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
