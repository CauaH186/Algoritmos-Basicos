import java.util.Scanner;
public class Fila {
    Scanner ler = new Scanner(System.in);
    public int inicio;
    public int fim;
    public int tamanho;
    public int elementos;
    public Object fila[];
    public Object valor;

    public Fila() {
        inicio = fim = -1;
        tamanho = 100;
        fila = new Object[tamanho];
        elementos = 0;
    }

    public boolean filaVazia() {
        if (elementos == 0) {
            return true;
        }
        return false;
    }

    public boolean filaCheia() {
        if (elementos == tamanho - 1) {
            return true;
        }
        return false;
    }

    public void incluir() {
        if (!filaCheia()) {
            System.out.print("Digite o elemento que deseja incluir na fila: ");
            valor = ler.nextLine();
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            fila[fim] = valor;
            elementos++;
            listar();
        } else {
            System.out.println("A fila está cheia");
            System.out.println("");
        }

    }

    public void excluir() {
        if (!filaVazia()) {
            System.out.println("O elemento removido da fila será: " + fila[inicio]);
            System.out.println("");
            inicio++;
            elementos--;
        }
    }

    public void listar() {
        if (inicio == -1)
            System.out.println("Não há elementos na fila");
        else {
            String numeros = "";
            for (int i = inicio; i <= fim; i++) {
                numeros += fila[i] + " ";
            }
            System.out.println("Esses elementos estão na fila: " + numeros);
            System.out.println("");
        }
    }
}
