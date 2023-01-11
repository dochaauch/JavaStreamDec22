package task05;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*5. Отсортировать строки в алфавитном порядке стримом и в обратном*/
public class Task05 {
    public static void main(String[] args) {
        String str = "my name is my my";

        String sortedString =  Stream.of(str.split(" "))
                .sorted()
                .collect(Collectors.joining(" "));

        String reverseSortedString = Stream.of(str.split(" "))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" "));

        System.out.println(sortedString);
        System.out.println(reverseSortedString);
    }
}
