package hexlet.code.games;
import hexlet.code.Engine;
public class PrimeGame {
    private static final int QUESTIONS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    public static void startPrimeGame() {
        String tip = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[QUESTIONS_COUNT];
        String[] correctAnswers = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber = getQuestion();
            questions[i] = String.valueOf(questionNumber);
            correctAnswers[i] = getCorrectAnswer(questionNumber);
        }
        Engine.startGame(tip, questions, correctAnswers);
    }

    private static int getQuestion() {
        return (int) (Math.random() * MAX_RANDOM_NUMBER);
    }

    private static String getCorrectAnswer(int currentNumber) {
        if (currentNumber < 2) {
            return "no";
        }
        for (int i = 2; i <= currentNumber / 2; i++) {
            if (currentNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
