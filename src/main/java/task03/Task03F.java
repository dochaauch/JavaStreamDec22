package task03;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

/*3**. Дан текстовой файл
вывести на экран кол-во букв в верхнем и нижнем регистре используя СТРИМЫ*/

public class Task03F {
    public static void main(String[] args) {
        String path = "./src/main/java/Voina_i_mir.txt";
        readAndCountUpperCase(path);
    }

    private static void readAndCountUpperCase(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Map<String, Long> letterCount = br.lines()
                    .flatMapToInt(String::chars)
                    .mapToObj(i -> (char) i)
                    .collect(Collectors.groupingBy(c -> Character.isUpperCase(c)
                            ? "UpperCase" : "LowerCase", Collectors.counting()));
            System.out.println("Upper case letters: " + letterCount.get("UpperCase"));
            System.out.println("Lower case letters: " + letterCount.get("LowerCase"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
