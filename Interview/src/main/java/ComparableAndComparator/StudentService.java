package ComparableAndComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentService implements Comparator<Student> {
    static StudentService studentService = new StudentService();
    ;

    public static void main(String arg[]) {
        studentService.sortByRollNumber();
    }

    void sortByRollNumber() {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setRollNumber(1);
        s1.setName("Rajiv");
        s1.setSection("12A");

        s2.setRollNumber(2);
        s2.setName("Prity");
        s2.setSection("12B");

        s3.setRollNumber(3);
        s3.setName("Ghunnu");
        s3.setSection("1A");
        List<Student> list = Stream.of(s3, s2, s1).collect(Collectors.toList());

        System.out.println(list);

        Collections.sort(list, studentService);
        System.out.println(list);

    }


    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNumber() < s2.getRollNumber() ? -1 : s1.getRollNumber() == s2.getRollNumber() ? 0 : 1;
    }
}
