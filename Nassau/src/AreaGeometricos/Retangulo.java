package AreaGeometricos;
import java.util.Scanner;

public class Retangulo {
    public double base, altura, area;
    
    public void calcR (){
        
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite a base do Retangulo: ");
		base = valor.nextDouble();
		System.out.print("Digite a altura do Retangulo: ");
		altura = valor.nextDouble();
		area = base * altura;
                if (base == altura){
                    System.out.printf("Não é um retangulo e sim um quadrado de aréa igual a: %.1f%n", area);
                } else {
                    System.out.printf("A area do retangulo é de: %.1f%n", area);
                }
    }
                        
    
}
