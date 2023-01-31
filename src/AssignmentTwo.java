import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignmentTwo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Lennon", "Musician", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Musician", 50000);
        Student student3 = new Student("Ringo", "Starr", 2.5);
        Student student4 = new Student("Paul", "McCartney", 3.0);

        List<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student3);
        people.add(student4);

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
