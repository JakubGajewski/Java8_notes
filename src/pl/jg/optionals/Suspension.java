package pl.jg.optionals;

public class Suspension {

    private Integer frontTravel;
    private Integer rearTravel;

    public Integer getFrontTravel() {
        return frontTravel;
    }

    public void setFrontTravel(Integer frontTravel) {
        this.frontTravel = frontTravel;
    }

    public Integer getRearTravel() {
        return rearTravel;
    }

    public void setRearTravel(Integer rearTravel) {
        this.rearTravel = rearTravel;
    }

    public Suspension(Integer frontTravel, Integer rearTravel) {
        this.frontTravel = frontTravel;
        this.rearTravel = rearTravel;
    }

    @Override
    public String toString() {
        return "Suspension{" +
                "frontTravel=" + frontTravel +
                ", rearTravel=" + rearTravel +
                '}';
    }
}
