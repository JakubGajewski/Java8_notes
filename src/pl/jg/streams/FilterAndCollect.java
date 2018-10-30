package pl.jg.streams;

import pl.jg._usefulStuff.Bike;
import pl.jg._usefulStuff.BikeService;

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
