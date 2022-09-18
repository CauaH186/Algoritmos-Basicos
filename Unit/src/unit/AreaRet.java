
package unit;
import java.util.Scanner;

public class AreaRet {
    public static void main (String[] args){
        double base, altura, area;
		Scanner num = new Scanner(System.in);
		System.out.print("Digite a base do Retangulo: ");
		base = num.nextDouble();
		System.out.print("Digite a altura do Retangulo: ");
		altura = num.nextDouble();
		area = base * altura;
                if (base == altura){
                    System.out.printf("Não é um retangulo e sim um quadrado de aréa igual a: %.1f%n", area);
                } else {
                    System.out.printf("A area do retangulo é de: %.1f%n", area);
                }
               
		
    }
}
