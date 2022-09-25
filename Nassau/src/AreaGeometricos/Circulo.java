package AreaGeometricos;
import javax.swing.JOptionPane;

public class Circulo {
    public double area, raio;
    
    public void calcC (){
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo"));
        area = 3.14 * (Math.pow(raio, 2));
        JOptionPane.showMessageDialog(null, "A aréa do círculo é de: " + area);
    }
                        
    
}
