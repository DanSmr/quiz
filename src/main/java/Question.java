import java.util.List;

public class Question {
    private String question;
    private List<Answer> answers;

    // Constructor
    public Question(String questionText, List<Answer> answers) {
        this.question = questionText;
        this.answers = answers;
    }

    // Getter and Setter
    public String getQuestionText() {
        return question;
    }

    public void setQuestionText(String questionText) {
        this.question = questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public boolean hasMultipleCorrectAnswers() {
        int correctCount = 0;

        for (Answer answer : answers) {
            if (answer.isCorrect()) {
                correctCount++;
            }
            if (correctCount > 1) {
                return true;
            }
        }

        return false;
    }
}



