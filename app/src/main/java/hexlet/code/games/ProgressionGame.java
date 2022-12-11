package hexlet.code.games;

import hexlet.code.Engine;
public class ProgressionGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MIN_NUMBERS_IN_A_ROW = 5;
    private static final int MAX_NUMBERS_IN_A_ROW = 10;
    private static final int MIN_INCREMENT = 5;
    private static final int MAX_INCREMENT = 30;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "What number is missing in the progression?";
    private static String[] questions = new String[QUESTIONS_COUNT];
    private static String[] correctAnswers = new String[QUESTIONS_COUNT];
    public static void startProgressionGame() {
        int numbersInARow = getRandomNumber(MIN_NUMBERS_IN_A_ROW, MAX_NUMBERS_IN_A_ROW);

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int hiddenNumberIndex = getRandomNumber(1, numbersInARow);
            int increment = getRandomNumber(MIN_INCREMENT, MAX_INCREMENT);
            int currentNumber = getRandomNumber(0, MAX_RANDOM_NUMBER);

            questions[i] = "";
            for (int j = 1; j <= numbersInARow; j++) {
                if (j != hiddenNumberIndex) {
                    questions[i] += String.valueOf(currentNumber);
                } else {
                    questions[i] += "..";
                    correctAnswers[i] = String.valueOf(currentNumber);
                }
                questions[i] += (j != numbersInARow) ? " " : "";
                currentNumber += increment;
            }
        }
        Engine.startGame(TIP, questions, correctAnswers);
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
