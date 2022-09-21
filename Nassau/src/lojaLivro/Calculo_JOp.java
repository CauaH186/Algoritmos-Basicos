package lojaLivro;

import javax.swing.JOptionPane;

public class Calculo_JOp {
    public String nomeDoLivro;
    public int qtdLivros;
    public double precoTotal, porcentagem;
    
    public void calculo(){
        nomeDoLivro = JOptionPane.showInputDialog("Qual o nome do livro?");
        qtdLivros = Integer.parseInt(JOptionPane.showInputDialog("Quantos livros serão comprados?"));
        precoTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço total da compra?"));
        
        if (qtdLivros > 0 &&qtdLivros <= 10) {
            JOptionPane.showMessageDialog (null, "Você comprou o livro "+nomeDoLivro + " e valor total da compra é de: R$" + precoTotal + " e você não possui nenhum desconto.");
            
        } else if (qtdLivros >= 11 && qtdLivros <= 20) {
            precoTotal = precoTotal - (10.0 / 100.0) * precoTotal;
            JOptionPane.showMessageDialog (null, "Você comprou o livro "+nomeDoLivro + " e valor total da compra é de: R$" + precoTotal + " e você ganhou 10% desconto.");
            
        } else if (qtdLivros >= 21 && qtdLivros <= 50) {
            precoTotal = precoTotal - (20.0 / 100.0) * precoTotal;
            JOptionPane.showMessageDialog (null, "Você comprou o livro "+nomeDoLivro + " e valor total da compra é de: R$" + precoTotal + " e você ganhou 20% desconto.");
            
        } else if (qtdLivros >= 51) {
            precoTotal = precoTotal - (25.0 / 100.0) * precoTotal;
            JOptionPane.showMessageDialog (null, "Você comprou o livro "+nomeDoLivro + "e valor total da compra é de: R$" + precoTotal + " e você ganhou 25% desconto.");
            
        } else {        
            JOptionPane.showMessageDialog(null, "Você não inseriu um valor válido.");
        }
       
    }
}
