package task07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*7. Взять наш класс Student ( или сделать свой)
изменить имена и фамилии на заглавные и сгруппировать по курсу стримом*/
public class Task07 {
    public static void main(String[] args) {
        Student student01 = new Student("Ivar", "Kass", 7);
        Student student02 = new Student("Andry", "Shoq", 1);
        Student student03 = new Student("Meggy", "Appley", 3);
        Student student04 = new Student("Sam", "Jekky", 5);
        Student student05 = new Student("Jane", "Birg", 5);

        List<Student> studentList = new ArrayList<>(List.of(student01, student02, student03,
                student04, student05));

        Map<Integer, List<Student>> map = studentList.stream()
                .map(student -> {
                    student.setFamilyName(student.getFamilyName().toUpperCase());
                    student.setName(student.getName().toUpperCase());
                    return student;
                })
                .collect(Collectors.groupingBy(student -> student.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()) {
            System.out.println(entry);
        }
    }
}

@AllArgsConstructor
@Setter
@Getter
@ToString
class Student{
    private String name;
    private String familyName;
    private Integer course;
}
