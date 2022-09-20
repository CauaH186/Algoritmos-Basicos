package AreaGeometricos;
import java.util.Scanner;

public class Circulo {
    public double area, raio;
    
    public void calcC (){
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = valor.nextDouble();
        area = 3.14 * (Math.pow(raio, 2));
        System.out.println("A aréa do círculo é de: " + area);
    }
                        
    
}
