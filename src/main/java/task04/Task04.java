package task04;
/*4*. Дан стрим Stream stream = Stream.of("we", "wee", "qwer", "oooo");
( или любой другой…не суть )
Вывести на экран СТРИМОМ самую длинную строку. Если несколько одинаковых, то значит несколько.
*/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");

        stream.collect(Collectors.groupingBy(String::length))
                        .entrySet()
                        .stream().max(Map.Entry.comparingByKey())
                        .ifPresent(System.out::println);
    }
}
