package task09;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*9*. Дано String s = "AAGGTFFDDVVAA" или похожая.
Вывести на экран кол-во повторений в таком виде
"4A2G1T2F2D2V"

**Если в стринге есть какие то другое символы кроме букв - выбросить исключение*/
public class Task09 {
    public static void main(String[] args) {
        String s = "AAGGTFFDDVVAA";

        s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(entry -> {
                    if(!Character.isLetter(entry.getKey())) {
                        throw new IllegalArgumentException("Input string must only contain letters.");
                    } else {
                    System.out.print(entry.getValue() + "" +entry.getKey());
                }
                });
    }
}
