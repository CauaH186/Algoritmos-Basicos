package reprovadoAprovado;

import javax.swing.JOptionPane;

public class Media_JOp {
     public double nota1, nota2, media;
     
     public void media () {
         nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota:"));
         nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota:"));
         
         media = (nota1 + nota2) / 2;
         
         if (media > 7) {
             JOptionPane.showMessageDialog(null, "Você foi aprovado");
         } else if (media >= 4 && media < 7){
             JOptionPane.showMessageDialog(null, "Você está na final");
         } else {
             JOptionPane.showMessageDialog(null, "Você está reprovado");
         }
     }
}
