package pl.jg.comparators;

import java.util.Comparator;
import java.util.List;

public class SortWithComparatorComparing {
    public static void main(String[] args) {

        List<Sweater> sweaterList = Sweater.createSomeSweaters();

        sweaterList.sort(Comparator.comparing(Sweater::getSize));


        Comparator<Sweater> sweaterComparator
                = Comparator.comparing(Sweater::getSize);
        sweaterList.sort(sweaterComparator);
    }
}
