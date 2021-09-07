package telenity;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestResults {
    public static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {

        return students
                .filter(student -> student.getScore()>passingScore)
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static List<Integer> getList(Stream<Integer> students, int passingScore) {
        return students
                .filter(student -> student>passingScore)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(99);

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 110));
        students.add(new Student("Alan", 22));
        students.add(new Student("Alan", 23));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);
//        getList(numbers.stream(), 2).forEach(System.out::println);

    }

}
