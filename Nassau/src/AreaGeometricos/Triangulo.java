package AreaGeometricos;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Triangulo {
    public double base, altura, area;
    
    public void calcT (){
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        area = (altura * base) / 2;
        JOptionPane.showMessageDialog(null, "A aréa do triângulo é de: " + area);
    }
                        
    
}
