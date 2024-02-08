package application;

public class Program {

    public static int fatorial(int x){

        if(x == 1){
            return 1;
        }
        else{
            return  x *  fatorial(fatorial( x-1));
        }
    }


    public static void main(String[] args) {

        System.out.println(fatorial(3));

    }


}
