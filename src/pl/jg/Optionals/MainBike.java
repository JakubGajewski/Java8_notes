package pl.jg.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainBike {

    public static void main(String[] args) {

        List<Bike> bikeList = new ArrayList<>();

        bikeList.add(new Bike(new Frame("steel frame")));

        bikeList.add(new Bike(new Frame("H10 carbon fibre"), new Suspension(110,110)));

        for (int i = 0; i < bikeList.size(); i++) {
            System.out.println("Bicycle number: " + i);
            System.out.println("Bicycle frame: " + bikeList.get(i).getFrame());
            bikeList.get(i).getSuspension().ifPresent(s -> System.out.println("Bicycle suspension: " + s));
            System.out.println("-----------------------------------------------");
        }


    }
}
