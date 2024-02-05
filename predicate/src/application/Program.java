package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //(Product)p -> p
        // list.removeIf( (Product) p -> p.getPrice() >= 100); __ ERROR __ java: incompatible types: entities.Product is not a functional interface
        //When we do: list.removeIf( p -> p.getPrice() >= 100);
        // '-- We already pass a functional interface called 'Predicate'. In this Predicate, it performs type inference...
        //     Given the context, it already determines what type of OBJECT we are dealing with...
//          __________________________________________________________________________________________
        // Method reference with static method: list.removeIf(Product::staticProductPredicate);
        // Method reference with non-static method list.removeIf(Product::nonStaticProductPredicate);
        //  __________________________________________________________________________________________
        // Declared lambda expression
        //        double min = 100.0;
        //        Predicate<Product> pred = p -> p.getPrice() >= min;
        //
        //        list.removeIf(pred);

        double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);

        for (Product p : list){
            System.out.println(p);
        }
    }

}
