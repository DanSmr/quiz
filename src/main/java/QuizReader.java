import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class QuizReader {
    private String fileName;

    public QuizReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Question> readQuestionsToList() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader reader = new FileReader(this.fileName);
            // Define the type for List<Question> to help Gson understand the structure
            Type questionListType = new TypeToken<List<Question>>() {
            }.getType();

            // Read JSON file into a List<Question>
            List<Question> questionList = gson.fromJson(reader, questionListType);

        return questionList;
    }
}









