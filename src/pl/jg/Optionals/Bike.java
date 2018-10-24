package pl.jg.Optionals;

import java.util.Optional;

public class Bike {
    private Optional <Frame> frame;

    public Optional<Frame> getFrame() {
        return frame;
    }

    public void setFrame(Optional<Frame> frame) {
        this.frame = frame;
    }

    public Bike(Optional<Frame> frame) {
        this.frame = frame;
    }

    public Bike() {
    }
}
