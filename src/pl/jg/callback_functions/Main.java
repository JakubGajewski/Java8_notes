public class Main {
    public static void main(String[] args) {

        Wihajster wihajster = new Wihajster();
        int counter = 0;

        counter = wihajster.addAndPrint(wihajster.addFive, "First let\'s add five!", counter);
        counter = wihajster.addAndPrint(wihajster.addFive, "Now let\'s add another five!", counter);
        counter = wihajster.addAndPrint(wihajster.addTen, "And now ten maybe...", counter);

        System.out.println("Final result is " + counter);
    }
}
