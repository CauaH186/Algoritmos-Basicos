package Banco;

import javax.swing.JOptionPane;

public class Caixa_JOp {
    double saldo = 0;
    double saque; 
    int opc = 0;
        public void bancoo(){
            while (opc != 4) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Depositar \n2 - Sacar \n3 - Saldo \n4 - Sair\nEscolha uma opção"));
            switch (opc){
                case 1 -> {
                    saldo = saldo + Double.parseDouble(JOptionPane.showInputDialog("Seu saldo atual é de: R$" + saldo + "\nDigite o valor que você quer depositar"));
                    JOptionPane.showMessageDialog(null, "Seu novo saldo é de: R$" + saldo);
                }
                case 2 -> { 
                    saldo = saldo - Double.parseDouble(JOptionPane.showInputDialog("Seu saldo atual é de: R$" + saldo + "\nDigite o valor que você quer sacar"));
                    JOptionPane.showMessageDialog(null, "Seu novo saldo é de: R$" + saldo);
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Seu saldo é de: R$" + saldo);
                }
                case 4 -> JOptionPane.showMessageDialog(null, "Você finalizou sua sessão");

                default -> {
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }
        
}
}
} 
