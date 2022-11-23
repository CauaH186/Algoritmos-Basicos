package pilha;

import javax.swing.JOptionPane;

public class Pilha {

    public Object pilha[];
    public int posicaoPilha;
        
    public Pilha(){
        this. posicaoPilha = -1;
        this.pilha = new Object [10];
    }
    
    public boolean pilhaVazia(){
        if (this.posicaoPilha == -1){
            return true;
        }
        return false;
    }
    
    public int tamanhoPilha(){
        if(this.pilhaVazia()){
            return 0;
        }
        return this.posicaoPilha + 1;
    }
    
    public void empilhar(Object valor){
        if (this. posicaoPilha < this.pilha.length - 1){
            this.pilha[++   posicaoPilha] = valor;
        }
    }
    
    public Object desempilhar(){
        if (pilhaVazia()){
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
    
    public Object ultimoValor(){
        if (this.pilhaVazia()){
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }
    public static void main(String[] args) {
        String opc = "1";
        Pilha p = new Pilha();
        while (opc != "0"){
            String numeros = "";
            for(int i = 0; i < p.tamanhoPilha(); i++) {
                numeros += p.pilha[i] + " ";
            }
            JOptionPane.showMessageDialog(null, "Elementos da pilha: " +numeros);
            opc = JOptionPane.showInputDialog("O que você deseja fazer?\n1 - Empilhar\n2 - Desempilhar\n3 - Ver o último elemento\n4 - Ver o tamanho da pilha");
            switch (opc) {
                case "1":
                    p.empilhar(Integer.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja adicionar")));
                    break;
                case "2":
                    p.desempilhar();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "O ultimo valor adicionado a pilha é: "+p.ultimoValor());
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "A pilha tem " + p.tamanhoPilha() + " elementos");
                    break;                  
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida. Tente Novamente");
            }
        }
    }
    
}
