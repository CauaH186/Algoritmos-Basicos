package AreaGeo;

import java.util.Scanner;


public class Calculo {
  
    public int opc;
    
    public void area(){
        Scanner ler = new Scanner(System.in);
        
        
        System.out.printf("1 - Quadrado %n2 - Retângulo %n3 - Círculo %n4 - Triângulo %n");
        System.out.print("Escolha uma opção: ");
        opc = ler.nextInt();
            switch (opc){
            case 1 -> { 
                Quadrado calc1 = new Quadrado();
                calc1.calcQ();
            }
            case 2 -> {
                Retangulo calc2 = new Retangulo();
                calc2.calcR();
            }
            case 3 -> {
                Circulo calc3 = new Circulo();
                calc3.calcC();
            }
            case 4 -> {
                Triangulo calc4 = new Triangulo();
                calc4.calcT();
            }
            default -> System.out.println("invalido");
                
        }
              
    }
}
