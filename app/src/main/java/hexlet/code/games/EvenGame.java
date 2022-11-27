package hexlet.code.games;

public class EvenGame {
    private static final int QUESTIONS_COUNT = 3;
    public static void startEvenGame() {
        String tip = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[QUESTIONS_COUNT];
        String[] correctAnswers = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int questionNumber = getQuestion();
            questions[i] = String.valueOf(questionNumber);
            correctAnswers[i] = getCorrectAnswer(questionNumber);
        }
        Engine.startGame(tip, questions, correctAnswers);
    }

    public static int getQuestion() {
        return (int) (Math.random() * 100);
    }

    public static String getCorrectAnswer(int currentNumber) {
        return (currentNumber % 2 == 0) ? "yes" : "no";
    }

}
