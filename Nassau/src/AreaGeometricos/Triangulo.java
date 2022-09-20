package AreaGeometricos;
import java.util.Scanner;

public class Triangulo {
    public double base, altura, area;
    
    public void calcT (){
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite a altura do triângulo: ");
        altura = valor.nextDouble();
        System.out.print("Digite a base do triângulo: ");
        base = valor.nextDouble();
        area = (altura * base) / 2;
        System.out.println("A aréa do triângulo é de: " + area);
    }
                        
    
}
