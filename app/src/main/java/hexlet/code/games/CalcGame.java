package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "What is the result of the expression?";
    private static String[][] questionsAnswers = new String[QUESTIONS_COUNT][2];
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    private static final char[] MATH_OPERATORS = {'+', '-', '*'};
    public static void launch() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER + 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER + 1);
            int randomIndexOperator = (int) (Math.random() * MATH_OPERATORS.length);
            char operator = MATH_OPERATORS[randomIndexOperator];
            switch (operator) {
                case '+':
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum + secondNum);
                    break;
                case '-':
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum - secondNum);
                    break;
                default:
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum * secondNum);
                    break;
            }
            questionsAnswers[i][QUESTION_ROW_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.startGame(TIP, questionsAnswers);
    }
}
