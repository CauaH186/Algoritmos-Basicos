package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {
    int vetor [] = {3,2,1};
    int com = 0;
    int tro = 0;
    
    int aux;
    boolean controle;
    
        for (int i = 0; i < vetor.length; i++) {
            controle = true;
            
            for (int j = 0; j < (vetor.length - 1); j++) {
                com++;
                
                if(vetor[j] > vetor[j +1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+1] = aux;
                    ++tro;
                    controle = false;
                }
            }
            if (controle){
                break;
            }
        }
        System.out.println(com);
        System.out.println(tro);
        for(int i=0; i<vetor.length;i++){
            System.out.print(vetor[i]+ " ");
        }
        
        
        
    }
    
}
