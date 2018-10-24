package pl.jg.Streams;

import pl.jg._UsefullStuff.Bike;
import pl.jg._UsefullStuff.BikeService;

public class FindAny {

    public static void main(String[] args) {

        Bike rockAndRollBike = BikeService
                .getBikeList()
                .stream()
                .filter(bike -> bike.getColor().equals("deep purple") && bike.isRadio() == true)
                .findAny()
                .orElse(null);

        System.out.println(rockAndRollBike);
    }
}
