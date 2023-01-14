package task13;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*13**Написать метод
input -> int a =221
out -> 122

ipmut -> int b = -123
out -> -321

!!Помните по диапазон интов!!*/
public class Task13 {
    public static void main(String[] args) {
        int a = 221419958;
        int b = -123;

        System.out.println(reverseInt(a));
        System.out.println();
        System.out.println(reverseInt(b));
    }

    private static String reverseInt(int num) {
        String s = String.valueOf(Integer.toString(Math.abs(num)).chars()
                .map(Character::getNumericValue)
                .mapToObj(Integer::toString)
                .reduce((i, j) -> j+i)
                .map(s1 -> num < 0 ? "-" + s1 : s1)
                .orElse(""));
        return s;
    }
}
