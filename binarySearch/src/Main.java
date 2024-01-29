class binarySearch {

    public static void search(int[] lista, int numero) {

        int inicio = 0; // somente 0
        int ultimo = lista.length - 1; //O tamanho da minha lista em index
        while (inicio <= ultimo) {
            int meio = (inicio + ultimo) / 2;
            int chute = lista[meio];

            if (chute == numero) {
                System.out.println("meu número é " + chute);
                break;
            }

            if (chute > numero) {
                ultimo = meio - 1;
            }
            else {
                inicio = meio + 1;

            }
        }
    }



    public static void main(String[] args) {
       int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        search(lista, 16);
        search(lista, 15);

    }
}
