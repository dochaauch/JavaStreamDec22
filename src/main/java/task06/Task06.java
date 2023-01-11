package task06;
/*6. Дан массив интов - вывести на экран все четные числа*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task06 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 44};
        Arrays.stream(array)
                .filter(el -> el %2 == 0)
                .forEach(System.out::println);
    }

}
