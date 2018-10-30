package pl.jg._usefulStuff;

import java.util.Objects;

public class Bike {

    private Integer numberOfWheels;
    private String color;
    private Boolean radio;

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isRadio() {
        return radio;
    }

    public void setRadio(Boolean radio) {
        this.radio = radio;
    }

    public Bike() {
    }

    public void noiseOfGumsOnTheAsphalt() {
        System.out.println("Szszszszszszszszszsz");
    }

    public Bike(Integer numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.radio = false;
    }

    public Bike(Integer numberOfWheels, String color, Boolean radio) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(numberOfWheels, bike.numberOfWheels) &&
                Objects.equals(color, bike.color) &&
                Objects.equals(radio, bike.radio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheels, color, radio);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numberOfWheels=" + numberOfWheels +
                ", color='" + color + '\'' +
                ", radio=" + radio +
                '}';
    }
}
