import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Arvore objArvoreAVL = new Arvore(null);
        int opc = 0;
        int valor;
        while (opc != 4) {
            System.out.println("#### ARVORE AVL ####");
            System.out.println("1 - Inserir N�");
            System.out.println("2 - Remover N�");
            System.out.println("3 - Imprimir �rvore");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Informe a op��o desejada: ");
            opc = ler.nextInt();
            switch (opc) {
                case 1:
                    //INSERIR
                    System.out.print("Informe o Valor: ");
                    valor = ler.nextInt();
                    objArvoreAVL.inserir(valor);
                    break;
                case 2:
                    //REMOVER
                    System.out.print("Informe o Valor: ");
                    valor = ler.nextInt();
                    objArvoreAVL.remover(valor);
                    break;
                case 3:
                    //IMPRIMIR
                    objArvoreAVL.imprimirArvore();
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Op��o inv�lida!");
                    break;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }

}
