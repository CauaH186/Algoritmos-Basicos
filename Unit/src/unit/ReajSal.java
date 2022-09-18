
package unit;
import java.util.Scanner;
public class ReajSal {
    public static void main (String [] args){
        double salario, reajuste, salarioAjustado;
	Scanner num = new Scanner(System.in);
	System.out.print("Digite seu salario: R$");
	salario = num.nextDouble();
	System.out.print("Qual o porcentual do reajuste?: ");
	reajuste = num.nextDouble();
	salarioAjustado = salario + ((reajuste / 100) * salario);
	System.out.println("Seu salario pós reajuste é de: R$" + salarioAjustado);
     
    }
}
