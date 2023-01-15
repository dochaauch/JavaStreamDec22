package task09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Collectors;

/*9*. Прочитать файл
Вывести на экран кол-во повторений в таком виде
"4A2G1T2F2D2V"

Не выбрасывать исключение
**Если в стринге есть какие то другое символы кроме букв - выбросить исключение*/
public class Task09F {
    public static void main(String[] args) {
        String path = "./src/main/java/Voina_i_mir.txt";
        readAndCombine(path);
    }

    private static void readAndCombine(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.lines()
                    .flatMapToInt(String::chars)
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .forEach(entry -> System.out.print(entry.getValue() + "" +entry.getKey()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
