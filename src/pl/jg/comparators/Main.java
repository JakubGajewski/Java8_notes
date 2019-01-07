package pl.jg.comparators;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<ComparableSweater> comparableSweaterList = Arrays.asList(new ComparableSweater(Size.L, Color.BLACK), new ComparableSweater(Size.XL, Color.BLUE), new ComparableSweater(Size.M, Color.BLACK));
        List<Sweater> sweaterList = Arrays.asList(new Sweater(Size.L, Color.BLACK), new Sweater(Size.S, Color.RED), new Sweater(Size.M, Color.BLACK));

        Collections.sort(comparableSweaterList);
        Collections.sort(sweaterList, (a, b) -> a.getSize().compareTo(b.getSize()) == 0 ? a.getColor().compareTo(b.getColor()) : a.getSize().compareTo(b.getSize()));

        comparableSweaterList.forEach(System.out::println);
        sweaterList.forEach(System.out::println);

        Collections.sort(sweaterList, new Comparator<Sweater>() {
            @Override
            public int compare(Sweater o1, Sweater o2) {
                return o1.getSize().compareTo(o2.getSize());
            }
        });

        sweaterList.forEach(System.out::println);
    }
}