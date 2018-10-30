package pl.jg.interfaces;

@FunctionalInterface
public interface Formula {

    default public int addition (int first, int last) {
      return first+last;
    };

    public String getMessage();
}
