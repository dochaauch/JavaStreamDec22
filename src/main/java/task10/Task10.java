package task10;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*10. Дана стринга String r = "otiwuklf"
Написать метод где вы вводите символ, а метод возвращает индекс.
Если буквы нет, то соответствующее сообщение*/
public class Task10 {
    public static void main(String[] args) {
        String r = "otiwuklf";
        char letter = 'a';
        int res = findIndexWithStream(r, letter);
        System.out.println(res);
    }

    public static int findIndexWithStream(String str, char c) {
        return IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == c)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("no such element"));
    }
}



