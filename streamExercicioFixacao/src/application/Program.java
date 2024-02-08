package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String file = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Email of people whose salary is more than " + salary + ":");
        System.out.println();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                //Armazeno fields para cada coisa q ele encontrar no ,
                String[] fields = line.split(",");
                //Eu instancio Employee dentro de uma ArrayList do tipo Employee
                list.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = br.readLine();
            }




            List<String> names = list.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            names.forEach(System.out::println);

            System.out.print("Sum of salary of people whose name starts with M': " );

            double salaryM = list.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, (x,y) -> x+y);

            System.out.print(salaryM);




        }catch(IOException e ){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
