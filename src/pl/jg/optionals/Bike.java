package pl.jg.optionals;

import java.util.Optional;

public class Bike {
    private Frame frame;
    private Suspension suspension;

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Optional<Suspension> getSuspension() {
        return Optional.ofNullable(suspension);
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }
    public Bike(Frame frame, Suspension suspension) {
        this.frame = frame;
        this.suspension = suspension;
    }

    public Bike(Frame frame) {
        this.frame = frame;
    }
}
