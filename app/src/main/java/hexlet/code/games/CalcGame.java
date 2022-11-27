package hexlet.code.games;

public class CalcGame {

    private static final int QUESTIONS_COUNT = 3;
    public static void startCalcGame() {
        String tip = "What is the result of the expression?";
        String[] questions = new String[QUESTIONS_COUNT];
        String[] correctAnswers = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int firstNum = (int) (Math.random() * 100 + 1);
            int secondNum = (int) (Math.random() * 100 + 1);
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
        Engine.startGame(tip, questions, correctAnswers);
    }
}
