
package Desc;
import java.util.Scanner;

public class Calculo {
    public String nomeDoLivro;
    public int qtdLivros;
    public double precoTotal, porcentagem;
    
    public void porcentagem(){
        Scanner ler = new Scanner (System.in);
        System.out.print("Qual o nome do livro?: ");
        nomeDoLivro = ler.nextLine();
        System.out.print("Quantos livros serão comprados?: ");
        qtdLivros = ler.nextInt();
        System.out.print("Qual o preço total da compra?: ");
        precoTotal = ler.nextDouble();
        
        if (qtdLivros > 0 &&qtdLivros <= 10) {
            System.out.printf("Você comprou o livro %s e valor total da compra é de: %.2fR$ e você não possui nenhum desconto %n", nomeDoLivro,precoTotal);
            
        } else if (qtdLivros >= 11 && qtdLivros <= 20) {
            precoTotal = precoTotal - (10.0 / 100.0) * precoTotal;
            System.out.printf("Você comprou o livro %s e valor total da compra é de: %.2fR$ e você ganhou 10%% desconto %n", nomeDoLivro,precoTotal);
            
        } else if (qtdLivros >= 21 && qtdLivros <= 50) {
            precoTotal = precoTotal - (20.0 / 100.0) * precoTotal;
            System.out.printf("Você comprou o livro %s e valor total da compra é de: %.2fR$ e você ganhou 20%% desconto %n", nomeDoLivro,precoTotal);
            
        } else if (qtdLivros >= 51) {
            precoTotal = precoTotal - (25.0 / 100.0) * precoTotal;
            System.out.printf("Você comprou o livro %s e valor total da compra é de: %.2fR$ e você ganhou 25%% desconto %n", nomeDoLivro,precoTotal);
            
        } else {
            
            System.out.println("Você não inseriu um valor válido.");
        }
       
    }
}
