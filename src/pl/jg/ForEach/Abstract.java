package pl.jg.ForEach;

import pl.jg._UsefullStuff.Bike;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Abstract {
    public static void main(String[] args) {
        List<Bike> bikeList = Arrays.asList(new Bike(2, "black", true), new Bike(1,"red"), new Bike(2, "pink"));
        bikeList.forEach(new Consumer<Bike>() {
           public void accept (Bike bike) {
                if (!bike.isRadio()) {
                    System.out.println("Bike goes silently!");
                } else {
                    System.out.println("Na na na na!!!");
                }
            }
        });
}}
