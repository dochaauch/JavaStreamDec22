package task04;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*4*. Найти самое длинное слово в файле
Вывести на экран СТРИМОМ самую длинную строку. Если несколько одинаковых, то значит несколько.
*/

public class Task04F {
    public static void main(String[] args) {
        String path = "./src/main/java/Voina_i_mir.txt";
        readAndFindLongestWord(path);
    }

    private static void readAndFindLongestWord(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .collect(Collectors.groupingBy(String::length))
                    .entrySet()
                    .stream().max(Map.Entry.comparingByKey())
                    .ifPresent(e -> System.out.println("Longest words: " + e.getValue() + ", length: " + e.getKey()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
