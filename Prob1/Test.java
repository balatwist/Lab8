package Prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        BiFunction<Double, Double, List>  bi = (x, y) -> {

            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };
        System.out.println(bi.apply(2.0,3.0));
    }
}
