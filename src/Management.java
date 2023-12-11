import java.util.List;
import java.util.stream.Stream;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface Management<Etudiants> {
    void displayStudents(List<Etudiants> students, Consumer<Etudiants> con);
    void displayStudentsByFilter(List<Etudiants> students, Predicate<Etudiants> pre, Consumer<Etudiants> con);
    String returnStudentsNames(List<Etudiants> students, Function<Etudiants, String> fun);
    Etudiant createStudent(Supplier<Etudiants> sup);
    List<Etudiants> sortStudentsById(List<Etudiants> students, Comparator<Etudiants> com);
    Stream<Etudiants> convertToStream(List<Etudiants> students);
}
