package pl.jg.comparators;

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
    public String toString() {
        return "Sweater{" +
                "size=" + size +
                ", color=" + color +
                '}';
    }
}
