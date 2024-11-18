public class Extras {

    public static boolean isAnswerCorrect(String userAnswer, Question question) {
        String correctAnswers = "";
        char optionLabel = 'A';

        for (Answer answer : question.getAnswers()) {
            if (answer.isCorrect()) {
                correctAnswers += optionLabel;
            }
            optionLabel++;
        }

        userAnswer = userAnswer.toUpperCase();
        correctAnswers = correctAnswers.toUpperCase();

        return userAnswer.equals(correctAnswers);
    }
}
