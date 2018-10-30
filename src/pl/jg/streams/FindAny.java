package pl.jg.streams;

import pl.jg._usefulStuff.Bike;
import pl.jg._usefulStuff.BikeService;

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
