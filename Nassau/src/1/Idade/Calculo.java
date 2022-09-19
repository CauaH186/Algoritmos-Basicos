package Idade;
/*
A soma das idades de Joaquim e Lúcio é 60 anos. 
Sabendo que a idade de Joaquim é o triplo da idade
de Lúcio, qual é a idade de cada um deles? 
*/
public class Calculo {
    public int idadeJ, idadeL, idadeS;
    
    public void calc (){
        idadeS = 60;
        idadeL = idadeS / 4;
        idadeJ = idadeL * 3;
        System.out.println("As idades de Joaquim e Lúcio são respectivamente: " +idadeJ+" e "+idadeL);
    }
}
