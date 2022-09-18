
package unit;
import java.util.Scanner;
/**
 *
 * @author Cauã
 */
public class NumAnt {
    public static void main (String[] args){
        int a;
		Scanner num = new Scanner(System.in);
		System.out.print("Digite um número: ");
		a = num.nextInt();
		System.out.println(a + " " + --a);
    }
}
