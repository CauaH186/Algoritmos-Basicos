package projeto.poo;

// Alunos:
//Cauã Henrique - 01564863
//Isabelly Luisy - 01565513
//Cassiano Ferreira - 01566503

import java.util.Scanner;
import javax.swing.JOptionPane;

class ProjetoPOO {
  static double v1, v2;

  public static void valores() {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite o primeiro valor: ");
    v1 = ler.nextDouble();
    System.out.print("Digite o segundo valor: ");
    v2 = ler.nextDouble();
  }

  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,
        "Alunos que fizeram: \nCauã Henrique - 01564863 \nIsabelly Luisy - 01565513 \nCassiano Ferreira - 01566503");
    Scanner ler = new Scanner(System.in);
    int opc = 0;
    while (opc != 5) {
      System.out.print("1 - Soma \n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n5 - Sair \nEscolha sua opção: ");
      opc = ler.nextInt();
      System.out.println("");
      switch (opc) {
        case 1:
          Operacoes soma = new Soma();
          valores();
          soma.setN1(v1);
          soma.setN2(v2);
          System.out.println("O resultado da operacao é de: " + soma.calcular() + "\n");
          break;

        case 2:
          Operacoes sub = new Subtracao();
          valores();
          sub.setN1(v1);
          sub.setN2(v2);
          System.out.println("O resultado da operacao é de: " + sub.calcular() + "\n");
          break;

        case 3:
          Operacoes div = new Divisao();
          valores();
          div.setN1(v1);
          div.setN2(v2);
          System.out.println("O resultado da operacao é de: " + div.calcular() + "\n");
          break;

        case 4:
          Operacoes mult = new Multiplicacao();
          valores();
          mult.setN1(v1);
          mult.setN2(v2);
          System.out.println("O resultado da operacao é de: " + mult.calcular() + "\n");
          break;

        case 5:
          System.out.println("Obrigado por usar");
          break;

        default:
          System.out.println("Opcão invalida. Tente novamente");
      }
    }
  }
}
