package task11;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

/*11***. Дан массив интов. Написать метод в который вы передаете массив и еще одно число.
Метод должен ВЕРНУТЬ ИНДЕКС ДВУХ ЧИСЕЛ СУММА КОТОРЫХ ДАЕТ ЭТО ЧИСЛО.
ЕСЛИ ТАКОВЫХ НЕТ - СООБЩЕНИЕ.*/
public class Task11 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,99};
        int target = 99;
        System.out.println(findTwoNumbers(arr, target));
    }

    public static String findTwoNumbers(int[] arr, int target) {
        return IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == target)
                        .mapToObj(j -> String.format("Indexes of two numbers are: %d, %d", i, j))
                )
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("no such elements"));
    }
}
