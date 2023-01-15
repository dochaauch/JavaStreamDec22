package task01;


import java.io.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*1.**** Создать стрим который принимает на вход текстовой файл
а на выходе выводит на экран кол-во слов и повторений данного слова:
inut-> my name is
out -> my : 1
          name : 1
          is : 1*/


public class Task01F {
    public static void main(String[] args) {
        String path = "./src/main/java/Voina_i_mir.txt";
        readTextAndCount(path);
        readTextAndCountOneLine(path);
    }
    public static void readTextAndCount(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            Stream<String> lines = br.lines();
            Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" ")));
            Map<String, Long> wordCount = words.collect(Collectors
                    .groupingBy(String::toLowerCase, Collectors.counting()));
            wordCount
                    .entrySet()
                    .stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readTextAndCountOneLine(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.lines()
            .flatMap(line -> Stream.of(line.split(" ")))
            .collect(Collectors
                    .groupingBy(String::toLowerCase, Collectors.counting()))
                    .entrySet()
                    .stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
