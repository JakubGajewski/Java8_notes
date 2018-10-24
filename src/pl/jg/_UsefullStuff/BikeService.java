package pl.jg._UsefullStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BikeService {

    private static List<Bike> bikeList = Arrays.asList(new Bike (2, "red"),
    new Bike (2, "red"),
    new Bike (2, "black"),
    new Bike (2, "white"),
    new Bike (2, "red"),
    new Bike (1, "red"),
    new Bike (1, "pink"),
    new Bike (2, "red"),
    new Bike (2, "red"),
    new Bike (3, "blue"),
    new Bike (3, "blue"),
    new Bike (3, "red"),
    new Bike (2, "red"),
    new Bike (2, "red"),
    new Bike (2, "deep purple"),
    new Bike (2, "deep purple", true));


    public static List<Bike> getBikeList() {
        return bikeList;
    }

    public static void setBikeList(List<Bike> bikeList) {
        BikeService.bikeList = bikeList;
    }
}
