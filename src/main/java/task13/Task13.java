package task13;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*13**Написать метод
input -> int a =221
out -> 122

ipmut -> int b = -123
out -> -321

!!Помните по диапазон интов!!*/
public class Task13 {
    public static void main(String[] args) {
        int a = 221;
        int b = -123;
        IntStream.of(b)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
