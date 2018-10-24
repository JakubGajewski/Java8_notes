package pl.jg.Streams;

import pl.jg._UsefullStuff.Bike;
import pl.jg._UsefullStuff.BikeService;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

       List <Bike> bikesWithDoubledNumberOfWheels = BikeService.getBikeList()
               .stream()
               .map((b) -> {
                   b.setNumberOfWheels(b.getNumberOfWheels()*2);
                   return b;
               })
               .collect(Collectors.toList());

       bikesWithDoubledNumberOfWheels.forEach(System.out::println);

       List <Bike> bikesPaintedToBlack = BikeService.getBikeList()
               .stream()
               .map((b)-> {
                   b.setColor("black");
                   return b;
               })
               .collect(Collectors.toList());

       //And the bikes are ridiiing!!!
        bikesPaintedToBlack.forEach(bike -> bike.noiseOfGumsOnTheAsphalt());
    }
}
