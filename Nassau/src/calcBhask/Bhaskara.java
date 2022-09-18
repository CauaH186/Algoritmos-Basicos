
package calcBhask;
import java.util.Scanner;

/**
 *
 * @author Cauã
 */
public class Bhaskara {
       
    public Double a,b,c,raiz1, raiz2, delta, raizDelta;

public void raiz (){
    Scanner calculo = new Scanner (System.in); 
    System.out.println("Esse programa irá calcular uma equação de 2º grau usando a formula de Bhaskara");
    System.out.print("Digite o valor de A: ");
    a = calculo.nextDouble();
    System.out.print("Digite o valor de B: ");
    b = calculo.nextDouble();
    System.out.print("Digite o valor de C: ");
    c = calculo.nextDouble();
    
    
        
        /*
        Calculo da formula de Bhaskara
        */   
    
    delta = Math.pow(b, 2) - 4 * a * c;
    raizDelta = Math.sqrt(delta);
    raiz1 = (-b + raizDelta) / 2 * a;            
    raiz2 = (-b - raizDelta) / 2 * a;
    if (delta > 0){
        System.out.println("Os resultados do calculo são: " + raiz1 + " e " + raiz2);
    }
    else {
        System.out.println("A equação de 2º grau não possui raízes reais");
        }
    }
}
