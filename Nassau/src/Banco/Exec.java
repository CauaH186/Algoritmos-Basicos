/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author Cauã
 */
public class Exec {
    public static void main (String[] args){
    double saldo = 0;
    double saque; 
    int opc = 0;
        
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
