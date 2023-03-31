import javax.swing.JOptionPane;

public class Retangulo {
    public double base, altura, area;

    public void calcR (){

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Retangulo:"));
        area = base * altura;
        if (base == altura){
            JOptionPane.showMessageDialog(null, "Não é um retangulo e sim um quadrado de aréa igual a: " + area);
        } else {
            JOptionPane.showMessageDialog(null, "A area do retangulo é de: 0" + area);
        }
    }


}
