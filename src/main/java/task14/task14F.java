package task14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/*В задании где надо было посчитать кол- во слов стримом
( который лямбда ) подгрузить любую книгу с инета в текстовый файл и посчитать кол-во слов.*/
public class task14F {
    public static void main(String[] args) {
        String path = "./src/main/java/Voina_i_mir.txt";
        countOfWords(path);
    }

    private static void countOfWords(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            long count = br.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .count();
            System.out.println(count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
