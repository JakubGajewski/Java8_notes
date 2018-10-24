package pl.jg.Optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Bike> bikeList = new ArrayList<>();

        Bike mountainBike = new Bike();
        mountainBike.setFrame(Optional.of(new Frame("Scott")));
        bikeList.add(mountainBike);

        bikeList.add(new Bike(Optional.of(new Frame("Raleight steel frame"))));

        bikeList.add(new Bike());

        for (int i = 0; i < 3; i++) {
            System.out.println("Bicycle number: " + i);
            System.out.println("Bicycle frame: " + bikeList.get(i).getFrame());
        }
    }
}
