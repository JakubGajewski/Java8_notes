package pl.jg.optionals;

public class Frame {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Frame(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "material='" + material + '\'' +
                '}';
    }
}
