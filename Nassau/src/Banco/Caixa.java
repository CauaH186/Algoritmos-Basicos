
package Banco;
import java.util.Scanner;

public class Caixa {
    public double saldo = 0;
    public double saque; 
    public int opc = 1;
    
    public void banco(){
        
        Scanner ler = new Scanner (System.in);
        while (opc != 4) {
             System.out.printf("1 - Depositar %n2 - Sacar %n3 - Saldo %n4 - Sair%n");
            System.out.print("Escolha uma opção: ");
            opc = ler.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.printf("Seu saldo atual é de: %.2fR$%n", saldo);
                    System.out.print("Digite o valor que você quer depositar: R$");
                    saldo = saldo + ler.nextDouble();
                    System.out.printf("Seu novo saldo é de: %.2fR$%n", saldo);
                    System.out.println(" ");
                }
                case 2 -> { 
                    System.out.printf("Seu saldo atual é de: %.2fR$%n", saldo);
                    System.out.print("Digite o valor que você deseja sacar: R$");
                    saque = ler.nextDouble();
                    saldo = saldo - saque;
                    System.out.println("Você sacou: R$" + saque);
                    System.out.printf("Seu novo saldo é de: %.2fR$%n", saldo);
                    System.out.println(" ");
                }
                case 3 -> {
                    System.out.printf("Seu saldo é de: %.2fR$%n", saldo);
                    System.out.println(" ");
                }
                case 4 -> System.out.println("Você finalizou sua sessão");

                default -> {
                    System.out.println("Opção inválida");
                    System.out.println(" ");
                }
            }
        }
       
    }
}
