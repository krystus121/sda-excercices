package comparing;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    // -1 - before
    // 0 -
    // 1 - after
    static int orderPersons(Person one, Person two){
       return one.name.compareTo(two.name);
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Stefan", "Kowalski"));
        persons.add(new Person("Andrzej", "Nowak"));

        persons.sort((o1, o2) -> Person.orderPersons(o1,o2));
    }
}
