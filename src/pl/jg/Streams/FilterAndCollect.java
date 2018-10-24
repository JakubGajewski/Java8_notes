package pl.jg.Streams;

import pl.jg._UsefullStuff.Bike;
import pl.jg._UsefullStuff.BikeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {

    public static void main(String[] args) {

        List<Bike> monocycleList = BikeService.getBikeList()
                .stream()
                .filter(bike->bike.getNumberOfWheels() == 1)
                .collect(Collectors.toList());

        monocycleList.forEach(System.out::println);
        
    }
}
