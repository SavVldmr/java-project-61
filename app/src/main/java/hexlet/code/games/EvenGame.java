package hexlet.code.games;

import java.util.Scanner;

public class EvenCheckGame {

    public static void printTheTip() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static int getQuestion() {
        return (int) (Math.random() * 100);
    }

    public static String getCorrectAnswer(int currentNumber) {
        return (currentNumber % 2 == 0) ? "yes" : "no";
    }
}
