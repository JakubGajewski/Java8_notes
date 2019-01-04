package pl.jg.runnable;

public class Main {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run () {
                System.out.println("hello 1!");
            }
        };

        Runnable r2 = () -> {
            System.out.println("hello 2!");
        };
    }
}
