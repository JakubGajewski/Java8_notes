package pl.jg.interfaces;

@FunctionalInterface
public interface PowerCalculator {

    public Integer power(Integer input);

    default public void sayHello() {
        System.out.println("hello!");
    };
}
