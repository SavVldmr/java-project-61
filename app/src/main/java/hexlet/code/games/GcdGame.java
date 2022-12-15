package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "Find the greatest common divisor of given numbers.";
    private static String[][] questionsAnswers = new String[QUESTIONS_COUNT][2];
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    public static void launch() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber1 = (int) (Math.random() * MAX_RANDOM_NUMBER);
            int questionNumber2 = (int) (Math.random() * MAX_RANDOM_NUMBER);
            questionsAnswers[i][QUESTION_ROW_NUMBER] = questionNumber1 + " " + questionNumber2;
            questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(gcd(questionNumber1, questionNumber2));
        }
        Engine.startGame(TIP, questionsAnswers);
    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

}
