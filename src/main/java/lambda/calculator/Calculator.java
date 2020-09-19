package lambda.calculator;

@FunctionalInterface //wymusza, aby interface był interfejsem funkcyjnym, czyli posiadał jedną metodę do impementacji(może posiadać dodatkowe metody domyślne)
interface Sum{
    Integer add(int a, int b);
}


interface Subtractor{
    Integer subtract(int firstNumber, int secondNumber);
}

interface Multiplier{
    Integer multiply(int firstNumber, int secondNumber);
}

interface Dividor{
    Double divide(double firstNumber, double secondNumber);
}



public class Calculator {

    public static void main(String[] args) {

        Sum addValues = (a, b) -> {
           return a+b;
        };
        Subtractor subtractValues = (firstNumber, secondNumber) ->{
           return firstNumber-secondNumber;
        } ; //deklaracja zachowania, czyli implementacja metody...
        Multiplier multiply = (firstNumber, secondNumber) -> firstNumber * secondNumber; //nazwa parametrów nie musi być taka sama jak w interfejsie...
        Dividor divide = (firstNumber, secondNumber) -> firstNumber/secondNumber;


        System.out.println("Sum is: " + addValues.add(2,3)); //wykorzystanie tej deklaracji...
        System.out.println("Subtraction is: " + subtractValues.subtract(10,5));
        System.out.println("Multiplying is " + multiply.multiply(2,3));
        System.out.println("Dividing is: " + divide.divide(10,5));



        GenericAdd<Integer> genericAdd = (a, b) -> a+b;

    }


}
