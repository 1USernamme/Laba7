import java.util.*;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ", " + age + " years old, Grade: " + grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // 1) Створення списків
        List<Student> studentsArrayList = new ArrayList<>();
        List<Student> studentsLinkedList = new LinkedList<>();

        // 2) Додавання студентів у списки
        studentsArrayList.add(new Student("Alice", 20, 90.5));
        studentsArrayList.add(new Student("Bob", 22, 88.3));
        studentsLinkedList.add(new Student("Charlie", 21, 75.2));
        studentsLinkedList.add(new Student("David", 23, 95.0));

        // 3) Використовуємо нетипізований ітератор
        System.out.println("1. Нетипізований ітератор для ArrayList:");
        Iterator it = studentsArrayList.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            System.out.println(student);
        }

        // 4) Використовуємо типізований ітератор
        System.out.println("\n2. Типізований ітератор для LinkedList:");
        Iterator<Student> typedIt = studentsLinkedList.iterator();
        while (typedIt.hasNext()) {
            Student student = typedIt.next();
            System.out.println(student);
        }

        // 5) Використовуємо типізований цикл "for-each"
        System.out.println("\n3. Типізований цикл for-each для ArrayList:");
        for (Student student : studentsArrayList) {
            System.out.println(student);
        }

        // 6) Використовуємо типізований цикл "for-each" для LinkedList
        System.out.println("\n4. Типізований цикл for-each для LinkedList:");
        for (Student student : studentsLinkedList) {
            System.out.println(student);
        }
    }
}
