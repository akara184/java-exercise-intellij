package application;

import java.util.Arrays;

public class Program {


    //NÃO É UMA TRANSPARÊNCIA REFERENCIAL!!
    public static int globalValue = 10;

    public static void main(String[] args) {

        int[] vect = new int[]{3, 4, 5};
        changeOddValues(vect); // O comportamento dessa função depende de valor externo
        System.out.println(Arrays.toString(vect));
    }

    public static void changeOddValues(int[] numbers){
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] % 2 != 0){
                numbers[i] += globalValue;

            }
        }

    }

}
