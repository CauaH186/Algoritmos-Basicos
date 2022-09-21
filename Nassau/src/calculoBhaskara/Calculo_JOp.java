
package calculoBhaskara;

import javax.swing.JOptionPane;

public class Calculo_JOp {
    public double a,b,c,raiz1, raiz2, delta, raizDelta;
    
    public void raizes (){
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:"));
        
        delta = Math.pow(b, 2) - (4 * a * c);
        raizDelta = Math.sqrt(delta);
        raiz1 = (-b + raizDelta) / 2 * a;
        raiz2 = (-b - raizDelta) / 2 * a;
        
        if (delta > 0){
        JOptionPane.showMessageDialog(null, "Os resultados do calculo são: " + raiz1 + " e " + raiz2);
    } else {
        JOptionPane.showMessageDialog(null, "A equação de 2º grau não possui raízes reais");
        }
    }
}
