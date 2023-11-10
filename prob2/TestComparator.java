package prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product("Macbook Air", 1200.0, 2022));
        productList.add(new Product("Iphone 15", 1500.0, 2023));
        productList.add(new Product("Apple Watch", 500.0, 2021));

        Collections.sort(productList, new PriceComparator()) ;
        System.out.println("sorted list by price");
        System.out.println(productList);


        Collections.sort(productList, new TitleComparator()) ;
        System.out.println("sorted list by title");
        System.out.println(productList);





    }
   static class PriceComparator implements Comparator<Product> {

        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());

        }


    }
    static class TitleComparator implements Comparator<Product> {

        @Override
        public int compare(Product p1, Product p2) {
            return p1.getTitle().compareTo(p2.getTitle());

        }


    }
}
