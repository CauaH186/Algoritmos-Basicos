
package divisaoConta;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Cauã
 */
public class Calculo {
    
public void divisao (){
    DecimalFormat df = new DecimalFormat("0.00");
    double conta = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor total da conta?"));
    double pessoas = Double.parseDouble(JOptionPane.showInputDialog("Quantas pessoas irão pagar a conta?"));
    
    double contadiv = conta / pessoas;
    
    JOptionPane.showMessageDialog(null, "O valor da conta para cada pessoa é de: R$" + df.format(contadiv));
}
}
