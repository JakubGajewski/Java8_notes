package pl.jg.comparators;

import java.util.Arrays;
import java.util.List;

public class Sweater {

    private Size size;
    private Color color;

    public Sweater(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Sweater{" +
                "size=" + size +
                ", color=" + color +
                '}';
    }

    public static List<Sweater> createSomeSweaters () {
        return Arrays.asList(new Sweater(Size.L, Color.BLUE), new Sweater(Size.XS, Color.BLUE), new Sweater(Size.XL, Color.RED), new Sweater(Size.XL, Color.BLACK));
    }
}
