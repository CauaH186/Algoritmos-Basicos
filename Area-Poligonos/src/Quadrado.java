import javax.swing.JOptionPane;

public class Quadrado {
    public double lado;

    public void calcQ (){
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado do quadrado"));
        lado = lado * lado;
        JOptionPane.showMessageDialog(null, "A aréa do quadrado é de: " + lado);
    }


}
