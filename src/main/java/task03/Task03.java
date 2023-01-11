package task03;
/*3**. Дана стринга  String ss = "KikJhYggfTgf" ( это пример )
вывести на экран кол-во букв в верхнем и нижнем регистре используя СТРИМЫ*/

public class Task03 {
    public static void main(String[] args) {
        String ss = "KikJhYggfTgf";
        countUpperAndLowerCases(ss);
    }

    private static void countUpperAndLowerCases(String ss) {
        long countUpper = ss.chars()
                .filter(Character::isUpperCase)
                .count();
        System.out.printf("Upper case %s, lower case %s",
                countUpper, ss.length() - countUpper);
    }
}
