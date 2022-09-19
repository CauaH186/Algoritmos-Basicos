package Faculdade;

import java.util.Scanner;

public class Calculo {
    public double mensalidade = 352.87;
    public int opc, mensVenc;
    
    public void calc (){
        Scanner ler = new Scanner (System.in);
        System.out.printf("1 - Manhã %n2 - Tarde %n3 - Noite%n");
        System.out.print("Qual turno do seu curso?: ");
        opc = ler.nextInt();
        System.out.println(" ");
        switch (opc){
            case 1 -> {
                System.out.printf("1 - Sim %n2 - Não%n");
                System.out.print("A mensalidade já passou do vencimento?: ");
                opc = ler.nextInt();
                System.out.println(" ");
                switch (opc){
                    case 1 -> {
                        mensalidade = mensalidade - (mensalidade * 0.2);
                        System.out.printf("O valor da mensalidade é de: %.2fR$%n", mensalidade);
                }
                    case 2 -> {
                        mensalidade = mensalidade - (mensalidade * 0.2);
                        mensalidade = mensalidade - (mensalidade * 0.05);
                        System.out.printf("O valor da mensalidade é de: %.2fR$%n", mensalidade);
                }
                    default -> System.out.println("Opção Inválida");
                }
            }
            case 2 -> { 
                System.out.printf("1 - Sim %n2 - Não%n");
                System.out.print("A mensalidade já passou do vencimento?: ");
                opc = ler.nextInt();
                System.out.println(" ");
                
                switch (opc){
                    case 1 -> {
                        mensalidade = mensalidade - (mensalidade * 0.13);
                        System.out.printf("O valor da mensalidade é de: %.2fR$%n", mensalidade);
                }
                    case 2 -> {
                        mensalidade = mensalidade - (mensalidade * 0.13);
                        mensalidade = mensalidade - (mensalidade * 0.05);
                        System.out.printf("O valor da mensalidade é de: %.2fR$%n", mensalidade);
                }
                    default -> System.out.println("Opção Inválida");
                }
            }
            case 3 -> {
                System.out.printf("1 - Sim %n2 - Não%n");
                System.out.print("A mensalidade já passou do vencimento?: ");
                opc = ler.nextInt();
                System.out.println(" ");
                switch (opc){
                    case 1 -> System.out.println("O valor da mensalidade é de: R$" + mensalidade);
                    case 2 -> {
                        mensalidade = mensalidade - (mensalidade * 0.05);
                        System.out.printf("O valor da mensalidade é de: %.2fR$%n", mensalidade);
                }
                    default -> System.out.println("Opção Inválida");
                }
            }
            default -> System.out.println("Opção Inválida");
        }
        
    }
            
    
}
