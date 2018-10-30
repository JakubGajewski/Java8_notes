package pl.jg.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Formula> formulaList = new ArrayList<>();

        formulaList.add(new Formula() {
            @Override
            public String getMessage() {
                return "Hi, I am Formula 1";
            }
        });

        Formula formula2 = () -> "Hi there!";

        PowerCalculator sqrter = (Integer input) -> input * input;
        PowerCalculator cuber = (input) -> input*input*input;

        sqrter.sayHello();
    }
}
