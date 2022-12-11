package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {

    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TIP = "What is the result of the expression?";
    private static String[] questions = new String[QUESTIONS_COUNT];
    private static String[] correctAnswers = new String[QUESTIONS_COUNT];
    public static void startCalcGame() {
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * MAX_RANDOM_NUMBER + 1);
            int secondNum = (int) (Math.random() * MAX_RANDOM_NUMBER + 1);
            int randomNumOperator = (int) (Math.random() * 2) + 1;
            char operator;
            switch (randomNumOperator) {
                case 1:
                    operator = '+';
                    correctAnswers[i] = String.valueOf(firstNum + secondNum);
                    break;
                case 2:
                    operator = '-';
                    correctAnswers[i] = String.valueOf(firstNum - secondNum);
                    break;
                default:
                    operator = '*';
                    correctAnswers[i] = String.valueOf(firstNum * secondNum);
                    break;
            }
            questions[i] = String.valueOf(firstNum) + " " + operator + " " + String.valueOf(secondNum);
        }
        Engine.startGame(TIP, questions, correctAnswers);
    }
}
