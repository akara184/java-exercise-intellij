import java.util.ArrayList;
import java.util.Arrays;
class quicksort {


    static int buscaMenor(ArrayList<Integer> arr){

        int menor = arr.get(0);
        int menor_indice = 0;

        for ( int i = 1; i < arr.size(); i++) {
            if(arr.get(i) < menor);
            menor = arr.get(i);
            menor_indice = i;
        }
        return menor_indice;
    }

    static ArrayList<Integer> ordenacaoPorSelecao(ArrayList<Integer> arr){
        ArrayList<Integer> novoArr = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++ ){
            int menor = buscaMenor(arr);
            novoArr.add(menor);
        }

        return novoArr;
    }



    public static void main(String[] args){

        ArrayList<Integer> minhaArray = new ArrayList<>(Arrays.asList(5,3,6,2,10));
        System.out.println(ordenacaoPorSelecao(minhaArray));



    }


}
