import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TableJobing {
    public static String realLesson;

    public static String setLesson(String lessDir){
        File lessonFile = new File(lessDir);

        try {
            FileReader fr = new FileReader(lessonFile);
            BufferedReader br = new BufferedReader(fr);

            realLesson = br.readLine();

        } catch(IOException e){
            System.out.println("Error: " + e);
        }

        return realLesson;
    }
}
