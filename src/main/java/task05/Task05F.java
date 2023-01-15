package task05;

import java.io.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*5. Отсортировать строки в алфавитном порядке стримом и в обратном*/
public class Task05F {
    public static void main(String[] args) {
        String path = "./src/main/java/Voina_i_mir.txt";
        System.out.println(readAndSort(path));
        System.out.println(readAndSortReverse(path));
    }

    private static String readAndSort(String path) {
        String sorted;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            sorted = br.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .sorted()
                    .collect(Collectors.joining(" "));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sorted;
    }
    private static String readAndSortReverse(String path) {
        String sorted;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            sorted = br.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.joining(" "));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sorted;
    }
}
