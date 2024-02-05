package util;

import entities.Product;

import java.util.function.Predicate;

//A functional interface just has one abstract method to be implemented
//Predicate returns boolean

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
