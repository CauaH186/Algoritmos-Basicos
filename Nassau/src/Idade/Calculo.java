package Idade;

import javax.swing.JOptionPane;

/*
A soma das idades de Joaquim e Lúcio é 60 anos. 
Sabendo que a idade de Joaquim é o triplo da idade
de Lúcio, qual é a idade de cada um deles? 
*/
public class Calculo {
    
    public void calc (){
        int idadeS = 60;
        int idadeL = idadeS / 4;
        int idadeJ = idadeL * 3;
        JOptionPane.showMessageDialog(null, "As idades de Joaquim e Lúcio são respectivamente: " +idadeJ+" e "+idadeL);
    }
}
