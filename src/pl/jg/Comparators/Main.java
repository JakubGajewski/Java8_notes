package pl.jg.Comparators;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Sweater> sweaterList = Arrays.asList(new Sweater(Size.L, Color.BLACK), new Sweater(Size.S, Color.RED), new Sweater(Size.M, Color.BLACK));

        Collections.sort(sweaterList, (a, b) -> a.getColor().compareTo(b.getColor()) == 0 ? a.getSize().compareTo(b.getSize()) : a.getColor().compareTo(b.getColor()));
    }
}