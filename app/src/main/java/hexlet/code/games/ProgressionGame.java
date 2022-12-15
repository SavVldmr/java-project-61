package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class ProgressionGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MIN_NUMBERS_IN_A_ROW = 5;
    private static final int MAX_NUMBERS_IN_A_ROW = 10;
    private static final int MIN_INCREMENT = 5;
    private static final int MAX_INCREMENT = 30;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "What number is missing in the progression?";
    private static String[][] questionsAnswers = new String[QUESTIONS_COUNT][2];
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static void launch() {
        int numbersInARow = getRandomNumber(MIN_NUMBERS_IN_A_ROW, MAX_NUMBERS_IN_A_ROW);
        String[] arrayOfNumbers = new String[numbersInARow];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int hiddenNumberIndex = getRandomNumber(0, numbersInARow - 1);
            int increment = getRandomNumber(MIN_INCREMENT, MAX_INCREMENT);
            int currentNumber = getRandomNumber(0, MAX_RANDOM_NUMBER);
            Arrays.fill(arrayOfNumbers, "");
            questionsAnswers[i][QUESTION_ROW_NUMBER] = "";
            for (int j = 0; j < numbersInARow; j++) {
                if (j != hiddenNumberIndex) {
                    arrayOfNumbers[j] = String.valueOf(currentNumber);
                } else {
                    arrayOfNumbers[j] = "..";
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(currentNumber);
                }
                currentNumber += increment;
            }
            questionsAnswers[i][QUESTION_ROW_NUMBER] = String.join(" ", arrayOfNumbers);
        }
        Engine.startGame(TIP, questionsAnswers);
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
