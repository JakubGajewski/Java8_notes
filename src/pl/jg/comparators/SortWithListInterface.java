package pl.jg.comparators;

import java.util.List;
import java.util.Comparator;

public class SortWithListInterface {
    public static void main(String[] args) {

        List<Sweater> sweaterList = Sweater.createSomeSweaters();

        sweaterList.sort(new Comparator<Sweater>() {
            @Override
            public int compare (Sweater sweater1, Sweater sweater2) {
                return sweater1.getSize().compareTo(sweater2.getSize());
            }
        });

        sweaterList.sort((s1,s2) -> s1.getSize().compareTo(s2.getSize()));
    }
}
