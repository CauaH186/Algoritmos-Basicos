/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit;
import java.util.Scanner;
/**
 *
 * @author Cauã
 */
public class DiasViv {
    public static void main (String[] args){
        int anos,meses,dias,diasTotal;
		Scanner num = new Scanner (System.in);
		System.out.print("Digite quantos anos você tem: ");
		anos = num.nextInt();
		System.out.print("Digite quantos meses você tem: ");
		meses = num.nextInt();
		System.out.print("Digite quantos dias você tem: ");
		dias = num.nextInt();
		diasTotal = ((anos * 365) + (meses * 30) + (dias));
		System.out.println(diasTotal);
    } 
    
}
