import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the quiz!");


        System.out.println("Write your answers in letters. If there is more than one answer, chain letters together eg. AB ");

        String fileName;
        while(true){
            String quizType = InputValidator.getCharInput(scanner, "Would you like to take a Math or Geography quiz! Enter M or G.");
            if(Objects.equals(quizType, "M")){
                fileName = "quiz-dictionary-math.json";
                break;
            } else if(Objects.equals(quizType, "G")) {
                fileName = "quiz-dictionary-geography.json";
                break;
            } else {
                System.out.println("invalid input");
            }
        }

        QuizReader quiz1 = new QuizReader(fileName);
        List<Question>  listOfQuestions = quiz1.readQuestionsToList();
        System.out.println(listOfQuestions);

        int rightAnswers = 0;
        for(Question question : listOfQuestions){
            System.out.println(question.getQuestion());
            if(question.getAnswer().length()>1){
                System.out.println("There are more correct answers.");
            } else {
                System.out.println("There is only one correct answer.");
            }
            System.out.println("A: " + question.getA());
            System.out.println("B: " + question.getB());
            System.out.println("C: " + question.getC());
            System.out.println("D: " + question.getD());
            String answer= InputValidator.getStringInput(scanner, "Write your answer: ");

            if(Objects.equals(answer.toUpperCase(), question.getAnswer())){
                System.out.println("Correct!");
                rightAnswers++;
            } else {
                System.out.println("That is incorrect.");
            }
            System.out.println("----------------------------------------");



        }
        System.out.println("\nYou answered " + rightAnswers + "correctly.");



    }
}