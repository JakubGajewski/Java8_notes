import java.util.function.Function;

public class Wihajster {

    public Function addFive = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer i) {
            return i + 5;
        }
    };

    public Function addTen = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer i) {
            return i + 10;
        }
    };

    public int addAndPrint (Function<Integer, Integer> function, String statement, Integer arg) {
        arg = function.apply(arg);
        System.out.println(statement);
        return arg;
    }
}