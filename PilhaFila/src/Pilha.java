import java.util.Scanner;

public class Pilha {
    Scanner ler = new Scanner(System.in);
    public Object pilha[];
    public int posicaoPilha;
    public String numeros = "";
    public Object valor;

    public Pilha() {
        posicaoPilha = -1;
        pilha = new Object[100];
    }

    public boolean pilhaVazia() {
        if (posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public boolean pilhaCheia() {
        if (posicaoPilha >= pilha.length - 1) {
            return true;
        }
        return false;
    }

    public int tamanhoPilha() {
        if (pilhaVazia()) {
            return 0;
        }
        return posicaoPilha + 1;
    }

    public void empilhar() {
        if (!pilhaCheia()) {
            System.out.print("Digite o valor que deseja adicionar a pilha: ");
            valor = ler.nextLine();
            pilha[++posicaoPilha] = valor;
            listar();
        } else {
            System.out.println("A pilha está cheia");
            System.out.println("");
        }

    }

    public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        System.out.println("O elemento que será removido é: " + pilha[posicaoPilha]);
        return pilha[posicaoPilha--];
    }

    public void listar() {
        if (posicaoPilha == -1)
            System.out.println("A pilha está vazia");
        else {
            numeros = "";
            for (int i = 0; i < tamanhoPilha(); i++) {
                numeros += pilha[i] + " ";
            }
            System.out.println("Elementos da pilha: " + numeros);
            System.out.println("");
        }
    }
}
