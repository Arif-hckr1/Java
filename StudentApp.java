package az.edu.bhos.lesson12_13;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {

    public static void main(String[] args) {
        Student[] students = init();
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new comparator2());
        Arrays.sort(students, new comparator3());
      
        System.out.println(Arrays.toString(students));

        
    }

    public static Student[] init() {
        return new Student[] {
                new Student(2L, "Eli", 56, 2012, false),
                new Student(1L, "Vei", 70, 2006, false),
                new Student(5L, "Fidan", 99, 2005, true),
        };
    }
}
