
package restDivCont;

import java.util.Scanner;

/**
 *
 * @author Cauã
 */
public class DivCont {
    public int pessoas;
    public double conta,contadiv;
    
public void divisao (){
    Scanner div = new Scanner (System.in);
    System.out.print("Qual o valor total da conta: R$ ");
    conta = div.nextDouble();
    System.out.println("Quantas pessoas irão pagar a conta?: ");
    pessoas = div.nextInt();
    
    contadiv = conta / pessoas;
    
    System.out.println("O valor da conta para cada pessoa é de: R$" + contadiv);
}
}
