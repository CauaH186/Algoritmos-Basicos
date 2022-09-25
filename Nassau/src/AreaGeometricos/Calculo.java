package AreaGeometricos;

import javax.swing.JOptionPane;

public class Calculo {
  
    public int opc;
    
    public void area(){
        opc = 0;    
        while (opc != 5){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Quadrado \n2 - Retângulo \n3 - Círculo \n4 - Triângulo \n5 - Sair \nEscolha uma opção"));
            switch (opc){
            case 1 -> { 
                Quadrado calc1 = new Quadrado();
                calc1.calcQ();
            }
            case 2 -> {
                Retangulo calc2 = new Retangulo();
                calc2.calcR();
            }
            case 3 -> {
                Circulo calc3 = new Circulo();
                calc3.calcC();
            }
            case 4 -> {
                Triangulo calc4 = new Triangulo();
                calc4.calcT();
            }
            case 5 -> JOptionPane.showMessageDialog (null, "Volte sempre");
            default -> JOptionPane.showMessageDialog(null, "invalido");
                
        }
        }      
                
    }
}

