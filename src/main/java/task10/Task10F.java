package task10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/*10. Дан текстовой файл
Написать метод где вы вводите символ, а метод возвращает индекс.
Если буквы нет, то соответствующее сообщение*/
public class Task10F {
    public static void main(String[] args) {
        String path = "./src/main/java/Voina_i_mir.txt";
        char letter = 'i';
        System.out.println(findIndexOfChar(path, letter));
    }

    private static long findIndexOfChar(String path, char letter) {
        long index = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String fileContent = new String(Files.readAllBytes(Paths.get(path)));
            return fileContent.indexOf(letter);
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
