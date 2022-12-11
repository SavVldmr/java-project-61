package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[] questions = new String[QUESTIONS_COUNT];
    private static String[] correctAnswers = new String[QUESTIONS_COUNT];
    public static void startEvenGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber = getQuestion();
            questions[i] = String.valueOf(questionNumber);
            correctAnswers[i] = getCorrectAnswer(questionNumber);
        }
        Engine.startGame(TIP, questions, correctAnswers);
    }

    private static int getQuestion() {
        return (int) (Math.random() * MAX_RANDOM_NUMBER);
    }

    private static String getCorrectAnswer(int currentNumber) {
        return (currentNumber % 2 == 0) ? "yes" : "no";
    }

}
