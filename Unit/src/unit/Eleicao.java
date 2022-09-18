
package unit;
import java.util.Scanner;

public class Eleicao {
    public static void main (String [] args){
        double votostotal, nulos, brancos, validos, pnulos, pbrancos, pvalidos;
		
	Scanner num = new Scanner (System.in);
	System.out.print("Qual o numero total de eleitores?: ");
	votostotal = num.nextDouble();
	System.out.print("Quantos eleitores votaram branco?: ");
	brancos = num.nextDouble();
	System.out.print("Quantos eleitores votaram nulo?: ");
	nulos = num.nextDouble();
	System.out.print("Quantos votos válidos: ");
	validos = num.nextDouble();
		
	pbrancos = (brancos * 100) / votostotal;	
	pnulos = (nulos * 100) / votostotal;
	pvalidos = (validos * 100) / votostotal;
		
	System.out.printf("A eleição teve: %.2f%% de votos brancos%n", pbrancos);
	System.out.printf("A eleição teve: %.2f%% de votos nulos%n", pnulos);
	System.out.printf("A eleição teve: %.2f%% de votos validos%n", pvalidos);
    }
    }
