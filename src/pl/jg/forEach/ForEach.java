package pl.jg.forEach;

import pl.jg._usefulStuff.Bike;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {

        List<Bike> bikeList = Arrays.asList(new Bike(2, "black", true), new Bike(1,"red"), new Bike(2, "pink",true));


        //Anonymus consumer implementation
        bikeList.forEach(new Consumer<Bike>() {
           public void accept (Bike bike) {
                if (!bike.isRadio()) {
                    System.out.println("Silent bike goes!");
                } else {
                    System.out.println("Ni na na naaa!!!!");
                }
            }
        });

        //Block lambda expression
        bikeList.forEach(((bike) -> {
            if (!bike.isRadio()) {
                System.out.println("Silent bike goes!");
            } else {
                System.out.println("Ni na na na!");
            };
        }));

        //Method reference:
        bikeList.forEach(System.out::println);

        //Short lambda:
        bikeList.forEach(bike -> bike.noiseOfGumsOnTheAsphalt());


    }
}
