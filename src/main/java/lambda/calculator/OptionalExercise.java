package lambda.calculator;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExercise {


    public static void main(String[] args) {
        getNickName()
                .map(s -> s.length()) //to zwróci nam nowego optionala z typem Integer... map zamienia Stringa w Integera
                .ifPresent(integer -> System.out.println("Nick len: " + integer));
    }


    static Optional<String> getNickName(){
        return Optional.ofNullable("maniek");
    }


}
