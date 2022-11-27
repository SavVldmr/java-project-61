package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Engine {

    public static void startGame(String tip, String[] questions, String[] correctAnswers) {
        String username = Cli.greeting();
        System.out.println(tip);

        Scanner console = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            String correctAnswer = correctAnswers[i];
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            var currentAnswer = console.nextLine();
            boolean isAnswerCorrect = currentAnswer.equals(correctAnswer);
            if (isAnswerCorrect) {
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
