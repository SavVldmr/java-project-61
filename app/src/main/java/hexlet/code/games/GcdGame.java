package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "Find the greatest common divisor of given numbers.";
    private static String[] questions = new String[QUESTIONS_COUNT];
    private static String[] correctAnswers = new String[QUESTIONS_COUNT];
    public static void startGcdGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber1 = (int) (Math.random() * MAX_RANDOM_NUMBER);
            int questionNumber2 = (int) (Math.random() * MAX_RANDOM_NUMBER);
            questions[i] = String.valueOf(questionNumber1) + " " + String.valueOf(questionNumber2);
            correctAnswers[i] = getCorrectAnswer(questionNumber1, questionNumber2);
        }
        Engine.startGame(TIP, questions, correctAnswers);
    }

    private static String getCorrectAnswer(int a, int b)  {
        return String.valueOf(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

}
