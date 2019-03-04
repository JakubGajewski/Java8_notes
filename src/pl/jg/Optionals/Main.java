package pl.jg.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional emptyOptional = Optional.empty();

        System.out.println(emptyOptional.isPresent());
    }
    //aa
}
