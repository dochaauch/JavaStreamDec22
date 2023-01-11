package task12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*12 ** Написать метод, который принимает стрингу из нескольких слов и возвращает перевернутое предложение.
ВОЗВРАЩАЕМОЕ ЗНАЧЕНИЕ STRING!
 input -> my name is
out -> is name my*/
public class Task12 {
    public static void main(String[] args) {
        String s = "my name is";
        String rev = Stream.of(s.split(" "))
                .reduce((s1, s2) -> s2 + " " + s1)
                .orElse("");
        System.out.println(rev);
    }
}
