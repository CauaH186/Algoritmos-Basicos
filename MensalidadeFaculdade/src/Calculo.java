
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Calculo {
    public double mensalidade = 352.87;
    public int opc, mensVenc;

    public void calc (){
        opc = 0;
        while (opc != 4) {
            DecimalFormat df = new DecimalFormat("0.00");
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Manhã \n2 - Tarde \n3 - Noite\n4 - Sair\nQual turno do seu curso?"));
            switch (opc){
                case 1 -> {
                    opc = Integer.parseInt(JOptionPane.showInputDialog ("1 - Sim \n2 - Não\nA mensalidade já passou do vencimento?"));
                    switch (opc){
                        case 1 -> {
                            mensalidade = mensalidade - (mensalidade * 0.2);
                            JOptionPane.showMessageDialog(null, "O valor da mensalidade é de: R$" + df.format(mensalidade));
                        }
                        case 2 -> {
                            mensalidade = mensalidade - (mensalidade * 0.2);
                            mensalidade = mensalidade - (mensalidade * 0.05);
                            JOptionPane.showMessageDialog(null, "O valor da mensalidade é de: R$" + df.format(mensalidade));
                        }
                        default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
                    }
                }
                case 2 -> {
                    opc = Integer.parseInt(JOptionPane.showInputDialog ("1 - Sim \n2 - Não\nA mensalidade já passou do vencimento?"));
                    switch (opc){
                        case 1 -> {
                            mensalidade = mensalidade - (mensalidade * 0.13);
                            JOptionPane.showMessageDialog(null, "O valor da mensalidade é de: R$" + df.format(mensalidade));
                        }
                        case 2 -> {
                            mensalidade = mensalidade - (mensalidade * 0.13);
                            mensalidade = mensalidade - (mensalidade * 0.05);
                            JOptionPane.showMessageDialog(null, "O valor da mensalidade é de: R$" + df.format(mensalidade));
                        }
                        default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
                    }
                }
                case 3 -> {
                    opc = Integer.parseInt(JOptionPane.showInputDialog ("1 - Sim \n2 - Não\nA mensalidade já passou do vencimento?"));
                    switch (opc){
                        case 1 ->   JOptionPane.showMessageDialog(null, "O valor da mensalidade é de: R$" + df.format(mensalidade));
                        case 2 -> {
                            mensalidade = mensalidade - (mensalidade * 0.05);
                            JOptionPane.showMessageDialog(null, "O valor da mensalidade é de: R$" + df.format(mensalidade));
                        }
                        default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
                    }
                }
                case 4 -> JOptionPane.showMessageDialog(null, "Volte sempre");
                default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }

    }


}
