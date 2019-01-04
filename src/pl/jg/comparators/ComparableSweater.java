package pl.jg.comparators;

public class ComparableSweater implements Comparable<ComparableSweater> {

    private Size size;

    private Color color;

    public ComparableSweater(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int compareTo(ComparableSweater o) {
        return this.size.compareTo(o.getSize());
    }

    @Override
    public String toString() {
        return "Sweater{" +
                "size=" + size +
                ", color=" + color +
                '}';
    }
}
