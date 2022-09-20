package reprovadoAprovado;
import java.util.Scanner;

public class Media {
    public double nota1, nota2, media;
    
    public void calc (){
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite a sua primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.print("Digite sua Segunda nota: ");
        nota2 = ler.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if (media > 6){
            System.out.println("Você foi aprovado");
        }
        else if (media >= 4) {
            System.out.println("Você está de recuperação");
        }
        else {
            System.out.println("Você está reprovado");
        }
    }
}
