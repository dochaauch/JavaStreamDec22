package task12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*12 ** Написать метод, который принимает стрингу из нескольких слов и возвращает перевернутое предложение.
ВОЗВРАЩАЕМОЕ ЗНАЧЕНИЕ STRING!
 input -> my name is
out -> is name my*/
public class Task12F {
    public static void main(String[] args) {
        String path = "src/main/java/Voina_i_mir.txt";
        reverseText(path);
    }

    private static void reverseText(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = lines.size() - 1; i >= 0; i--) {
                sb.append(new StringBuilder(lines.get(i)).reverse());
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
