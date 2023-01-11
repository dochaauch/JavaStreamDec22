package task08;
/*8. Вывести 7 самых больших чисел из массива чисел Стримом*/

import java.util.Arrays;
import java.util.Comparator;

public class Task08 {
    public static void main(String[] args) {
        int[] array = {5,66,88,3,6,0,1,-2,7};
        sevenLargestAcs(array);
        sevenLargestDesc(array);
    }

    private static void sevenLargestDesc(int[] array) {
        Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(7)
                .forEach(System.out::println);
    }

    private static void sevenLargestAcs(int[] array) {
        Arrays.stream(array)
                .sorted()
                .skip(array.length - 7)
                .forEach(System.out::println);
    }
}
