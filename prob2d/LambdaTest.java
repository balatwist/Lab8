package prob2d;

import prob2.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<prob2.Product> productList=new ArrayList<>();
        productList.add(new prob2.Product("Macbook Air", 1200.0, 2022));
        productList.add(new prob2.Product("Iphone 15", 1500.0, 2023));
        productList.add(new Product("Apple Watch", 500.0, 2021));


        Collections.sort(productList, Comparator.comparing(Product::getTitle)
                .thenComparing(Product::getModel));

        System.out.println(productList);
    }



}
