
package programa;

import java.util.Scanner;

/**
 *
 * @author Cauã
 */
public class Bhaskara {
    public Double a,b,c,respos, resneg;
    
    public void raiz (){
        Scanner calculo = new Scanner (System.in); 
        System.out.println("Esse programa irá calcular a formula de bhaskara");
        System.out.print("Digite o valor de A: ");
        a = calculo.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = calculo.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = calculo.nextDouble();
        
        
        respos = (-b + Math.sqrt((Math.pow(b, 2) - 4*a*c))) / 2;            
        resneg = (-b - Math.sqrt((Math.pow(b, 2) - 4*a*c))) / 2;
        
        System.out.println("Os resultados do calculo são: " + respos + " e " + resneg);
        
        
    }
    
}
