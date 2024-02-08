package application;

public class Program {


    public static int fatorialCalculo(int x, int acc){

        if (x == 0){
            return acc;
        }else{
            return fatorialCalculo(x - 1, x * acc);
        }

    }
    public static int fatorial(int x){
        return fatorialCalculo(x, 1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(3));
    }

}
