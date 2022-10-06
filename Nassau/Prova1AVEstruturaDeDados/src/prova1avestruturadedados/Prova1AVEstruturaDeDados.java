package prova1avestruturadedados;
import java.util.Random;
import java.util.Scanner;
/**
 * O Projeto foi realizado pela equipe:
 * 1 - Matrícula e Nome do Aluno 01
 * 2 - Matrícula e Nome do Aluno 02
 * 3 - Matrícula e Nome do Aluno 03
 * 
 * Turma: 2NA
 * Disciplina: Estrutura de Dados
 * Professor: José Mário Souza
 */
public class Prova1AVEstruturaDeDados {
    public static void main(String[] args) {
        int vet[] = new int[20];
        int vetAux[] = new int[vet.length];
        Random aleatorio = new Random();
        for(int i=0; i<vet.length;i++){
            vet[i] = aleatorio.nextInt(1000);
        }
        System.out.println("### Lista Desordenada ###");
        for(int val:vet){
            System.out.print(val+"-");
        }
        System.out.println("");
        Scanner leia = new Scanner(System.in);
        int opc = 0;
        while (opc != 4){
            System.out.println("");
            System.out.println("# Vamos Ordenar? #");
            System.out.println("1 - Por Troca");
            System.out.println("2 - Por Sele��o");
            System.out.println("3 - Por Inser��o");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Informe a op��o desejada: ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    vetAux = vet.clone();
                    ordenarPorTroca(vetAux);
                    break;
                case 2:
                    vetAux = vet.clone();
                    ordenarPorSelecao(vetAux);
                    break;
                case 3:
                    vetAux = vet.clone();
                    ordenarPorInsercao(vetAux);
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Op��o Inv�lida!");
                    break;
            } 
        }
    }

    private static void ordenarPorTroca(int vetAux[]) {
        int tro = 0; //Variavel para contar a quantidade de Trocas desse metodo
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordena��o por Troca ###");   
        int aux;
        boolean controle;
        
        for (int i = 0; i < vetAux.length; i++) {
        	controle = true;
            
            for (int j = 0; j < (vetAux.length - 1); j++) {
                com++;
                if(vetAux[j] > vetAux[j +1]) {
                    aux = vetAux[j];
                    vetAux[j] = vetAux[j + 1];
                    vetAux[j+1] = aux;
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
        for(int i=0; i<vetAux.length;i++){
        System.out.print(vetAux[i]+ " ");
        }
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void ordenarPorSelecao(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordenação por Seleção ###");
        //criar aqui a lógica da Ordenação por Seleção
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

        private static void ordenarPorInsercao(int vetAux[]) {
        int tro = 0; //Variável para contar a quantidade de Trocas desse método
        int com = 0; //Variável para contar a quantidade de Comparações desse método
        System.out.println("### Ordenação por Inserção ###");
        int aux, j;
            for (int i = 1; i < vetAux.length; i++) {
                aux = vetAux[i];
                j = i-1;
                
                while (j >= 0 && vetAux[j] > aux) {
                	vetAux[j+1] = vetAux[j];
                    --j;
                    ++tro;++com;
                }
                ++com;
                vetAux[j+1] = aux;
            }
           
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void listarVetorOrdenado(int vetAux[]) {
        System.out.println("### Lista Ordenada ###");
        for(int val:vetAux){
            System.out.print(val+"-");
        }
        System.out.println("");
    }

    private static void listarComplexiade(int tro, int com) {
        System.out.println("### Complexidade ###");
        System.out.println("Comparações: "+com);
        System.out.println("Trocas: "+tro);
    }
    
}
