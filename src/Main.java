import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, "A", 20));
        students.add(new Etudiant(2, "B", 22));
        students.add(new Etudiant(3, "C", 21));


        StudentManagement studentManagement = new StudentManagement();


        System.out.println("Displaying all students:");
        studentManagement.displayStudents(students, System.out::println);
        System.out.println();

        System.out.println("Displaying students older than 20:");
        studentManagement.displayStudentsByFilter(students, student -> student.getAge() > 20, System.out::println);
        System.out.println();

        System.out.println("Names of all students: " + studentManagement.returnStudentsNames(students, Etudiant::getNom));
        System.out.println();

        System.out.println("Creating a new student:");
        Etudiant newStudent = studentManagement.createStudent(() -> new Etudiant(4, "D", 23));
        System.out.println("New Student: " + newStudent);
        System.out.println();

        System.out.println("Sorting students by ID:");
        List<Etudiant> sortedStudents = studentManagement.sortStudentsById(new ArrayList<>(students), Comparator.comparingInt(Etudiant::getId));
        studentManagement.displayStudents(sortedStudents, System.out::println);
        System.out.println();

        System.out.println("Converting students to a stream and displaying:");
        studentManagement.convertToStream(students).forEach(System.out::println);
    }
}