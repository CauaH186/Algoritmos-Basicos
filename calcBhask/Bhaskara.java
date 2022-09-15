
package calcBhask;

import java.util.Scanner;

/**
 *
 * @author Cauã
 */
public class Bhaskara {
       
    public Double a,b,c,respos, resneg;

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
        respos = (-b + Math.sqrt((Math.pow(b, 2) - 4*a*c)));            
        resneg = (-b - Math.sqrt((Math.pow(b, 2) - 4*a*c)));
        if (Math.sqrt(Math.pow(b, 2) - 4 *a*c) < 0){
            System.out.println("Os resultados do calculo são: " + respos + " e " + resneg);
    }
        else {
            System.out.println("A equação de 2º grau não possui raízes reais");
        }
    }
}
