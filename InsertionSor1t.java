package javaapplication2;

public class InsertionSort {
    public static void main(String[] args) {
    int vetor [] = {1,2,3,7,6,5};
    int aux, j;
    int tro = 0;
    int com = 0;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i-1;
            
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                --j;
                ++tro;++com;
            }
            vetor[j+1] = aux;
            ++com;
        }
        System.out.println(tro);
        System.out.println(com);
        System.out.println(" ");
        for (int i = 1; i < vetor.length; i++) {
            System.out.println(vetor[i]+" ");

        }

    }
    
}
