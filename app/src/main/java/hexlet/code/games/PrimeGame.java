package hexlet.code.games;
import hexlet.code.Engine;
public class PrimeGame {
    private static final int QUESTIONS_COUNT = 3;
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
        return (int) (Math.random() * 100);
    }

    private static String getCorrectAnswer(int currentNumber) {
        return (currentNumberIsPrime(currentNumber)) ? "yes" : "no";
    }

    private static boolean currentNumberIsPrime(int currentNumber) {
        if (currentNumber < 2) {
            return false;
        }
        for (int i = 2; i <= currentNumber / 2; i++) {
            if (currentNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
