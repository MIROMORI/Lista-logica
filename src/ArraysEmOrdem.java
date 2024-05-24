import java.util.Arrays;

public class ArraysEmOrdem {
    public static void main(String[] args) {
        //criar array e declarar array com valores (aleatorios)
        int[] array = {13, -2, 57};
        arrayCrescente(array);
        System.out.println("Array em ordem decrescente: ");
        arrayDecrescente(array);
    }

    //organizar em ordem
    public static void arrayCrescente(int[] array) {
        Arrays.sort(array);
        System.out.println("Array em ordem crescente: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayDecrescente(int[] array){
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio < fim){
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
