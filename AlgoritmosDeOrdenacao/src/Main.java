import java.util.Random;
import java.util.Scanner;
public class Main {
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
            System.out.println("2 - Por Seleção");
            System.out.println("3 - Por Inserção");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Informe a opção desejada: ");
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
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    private static void ordenarPorTroca(int vetAux[]) {
        int tro = 0; //Variavel para contar a quantidade de Trocas desse metodo
        int com = 0; //VariÃ¡vel para contar a quantidade de ComparaÃ§Ãµes desse mÃ©todo
        System.out.println("### Ordenação por Troca ###");
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
        int tro = 0; //VariÃ¡vel para contar a quantidade de Trocas desse mÃ©todo
        int com = 0; //VariÃ¡vel para contar a quantidade de ComparaÃ§Ãµes desse mÃ©todo
        System.out.println("### OrdenaÃ§Ã£o por SeleÃ§Ã£o ###");
        //criar aqui a lÃ³gica da OrdenaÃ§Ã£o por SeleÃ§Ã£o
        listarComplexiade(tro,com);
        listarVetorOrdenado(vetAux);
    }

    private static void ordenarPorInsercao(int vetAux[]) {
        int tro = 0; //VariÃ¡vel para contar a quantidade de Trocas desse mÃ©todo
        int com = 0; //VariÃ¡vel para contar a quantidade de ComparaÃ§Ãµes desse mÃ©todo
        System.out.println("### OrdenaÃ§Ã£o por InserÃ§Ã£o ###");
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
        System.out.println("ComparaÃ§Ãµes: "+com);
        System.out.println("Trocas: "+tro);
    }

}
