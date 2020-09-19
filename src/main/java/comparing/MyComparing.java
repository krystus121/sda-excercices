package comparing;

import java.util.ArrayList;
import java.util.List;

public class MyComparing {

    String name;
    String surname;

    public MyComparing(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    static int comparePersonFromSecondLetter(MyComparing one, MyComparing two){
        return one.getName().substring(1).compareTo(two.getName().substring(1));
    }

    public static void main(String[] args) {
        List<MyComparing> persons = new ArrayList<>();
        persons.add(new MyComparing("Krystian", "Be"));
        persons.add(new MyComparing("Andrzej", "Kowalski"));

        persons.sort((o1, o2) -> MyComparing.comparePersonFromSecondLetter(o1,o2));


        for (MyComparing ziom : persons){
            System.out.println(ziom.getName());
        }
    }
}
