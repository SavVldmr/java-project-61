package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    private static final int QUESTIONS_COUNT = 3;
    public static void startGcdGame() {
        String tip = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[QUESTIONS_COUNT];
        String[] correctAnswers = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber1 = getQuestion();
            int questionNumber2 = getQuestion();
            questions[i] = String.valueOf(questionNumber1) + " " + String.valueOf(questionNumber2);
            correctAnswers[i] = getCorrectAnswer(questionNumber1, questionNumber2);
        }
        Engine.startGame(tip, questions, correctAnswers);
    }

    private static int getQuestion() {
        return (int) (Math.random() * 100);
    }

     private static String getCorrectAnswer(int a, int b)  {
        return String.valueOf(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

}