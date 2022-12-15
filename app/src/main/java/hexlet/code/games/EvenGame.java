package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[][] questionsAnswers = new String[QUESTIONS_COUNT][2];
    /*  questionsAnswers[][0] - questions;
        questionsAnswers[][1] - correct answers */
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    public static void launch() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber = (int) (Math.random() * MAX_RANDOM_NUMBER);
            questionsAnswers[i][QUESTION_ROW_NUMBER] = String.valueOf(questionNumber);
            questionsAnswers[i][ANSWER_ROW_NUMBER] = isEven(questionNumber);
        }
        Engine.startGame(TIP, questionsAnswers);
    }

    private static String isEven(int currentNumber) {
        return (currentNumber % 2 == 0) ? "yes" : "no";
    }

}
