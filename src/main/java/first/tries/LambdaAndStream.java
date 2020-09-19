package first.tries;

import com.sun.tools.doclets.formats.html.SingleIndexWriter;

import java.util.Optional;
import java.util.function.Function;

class StringMapper implements Function<String, Integer>{   //klasa będzie zamieniać Stringa na Integera...
    @Override
    public Integer apply(String s) {
        return s.length();
    }

}


interface DoubleString{
    String doubleDouble(String value);
}


public class LambdaAndStream {


    public static void main(String[] args) {

        DoubleString myDoubleString = new DoubleString() {
            @Override
            public String doubleDouble(String value) {
                return value + value;
            }
        };

        DoubleString expectedString = string -> string + string;  //lambda jest implementacją metody interfejsu funkcyjnego (interface funkcyjny to interface , ktory zawiera jedną metodę)


        //poniższe... Function to interface... natomiast metoda Integer to implementacja metody interfejsu w ramach klasy anonimowej...
        Function<String, Integer> myFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return null;
            }
        };

        // koniec klasy anonimowej..................................................................................




        String myName = "Krystian";

        //Optional - klasa, pudełeczko na inny obiekt... ma wsparcie --> ucz się o tym...
        Optional<String> maybeName = Optional.ofNullable(myName);
        maybeName.map(new StringMapper());

        maybeName.map(s -> s.length());
               // .ifPresent();


    }






}
