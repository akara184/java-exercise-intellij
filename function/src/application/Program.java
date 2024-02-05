package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();


        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        //For the first instance, my list's type is Product, but later I do transform it into: Product -> String(But in upperCase)
        //And storing it in 'names'
        //The objective of map is to apply everything that is in a list basing on what we proposed
        //And to call map I do need to call Stream first, cause stream.map
        //Função map, ela pega uma coleção de valores e aplica a cada um dos valores da coleção a função que estiver entre parentêses.
        ////////////////////////////////////////////////////////////////////////////////////////////
        //  List<String> names = list.stream().map(new UpperCaseName()).toList();
        // OR
        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        ////////////////////////////////////////////////////////////////////////////////////////////
        //Usando lambda:
        //Function<Product,String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);






    }
}
