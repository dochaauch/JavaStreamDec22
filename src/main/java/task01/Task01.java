package task01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*1.**** Создать стрим который принимает на вход Стрингу
а на выходе выводит на экран кол-во слов и повторений данного слова:
inut-> my name is
out -> my : 1
          name : 1
          is : 1*/

public class Task01 {
    public static void main(String[] args) {
        String str = "my name is my my";
        findCountOfWords(str);
        findCountInOneRow(str);
    }

    private static void findCountOfWords(String str) {
        Map<String, Integer> map = new HashMap<>();
        Stream.of(str.split(" "))
                .forEach(word -> {
            map.merge(word,1, Integer::sum);
        });
        map.forEach((k, v) -> System.out.printf("%s : %s\n", k, v));
    }

    public static void findCountInOneRow(String str) {
        Stream.of(str.split(" "))
                .collect(Collectors.toMap(Function.identity(), w -> 1L, Long::sum))
                .entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
