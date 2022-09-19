package AreaGeo;
import java.util.Scanner;

public class Quadrado {
    public double lado;
    
    public void calcQ (){
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        lado = valor.nextDouble();
        lado = lado * lado;
        System.out.println("A aréa do quadrado é de: " + lado);
    }
                        
    
}
