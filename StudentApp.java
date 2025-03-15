package lesson12;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {

    public static void main(String[] args) {
        Student[] students = init();
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator2());
        Arrays.sort(students, new Comparator3());
        Arrays.sort(players, new Comparator<Player>() {
             @Override
             public int compare(Student student1, Student student2) {
                 return student2.name.compareTo(student1.name);
             }
         });
      
        System.out.println(Arrays.toString(students));

        
    }

    public static Student[] init() {
        return new Student[] {
                new Student(2L, "Eli", 56, 2012, false),
                new Student(1L, "Veli", 70, 2006, false),
                new Student(5L, "Fidan", 99, 2005, true),
        };
    }
}
