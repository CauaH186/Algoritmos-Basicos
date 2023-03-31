import java.util.Scanner;

class Main {
    static double v1, v2;

    public static void valores() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        v1 = ler.nextDouble();
        System.out.print("Digite o segundo valor: ");
        v2 = ler.nextDouble();
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opc = 0;
        while (opc != 5) {
            System.out.print("1 - Soma \n2 - Subtração\n3 - Divisão\n4 - Multiplicação\n5 - Sair \nEscolha sua opção: ");
            opc = ler.nextInt();
            System.out.println();
            switch (opc) {
                case 1 -> {
                    Operacoes soma = new Soma();
                    valores();
                    soma.setN1(v1);
                    soma.setN2(v2);
                    System.out.println("O resultado da operacao é de: " + soma.calcular() + "\n");
                }
                case 2 -> {
                    Operacoes sub = new Subtracao();
                    valores();
                    sub.setN1(v1);
                    sub.setN2(v2);
                    System.out.println("O resultado da operacao é de: " + sub.calcular() + "\n");
                }
                case 3 -> {
                    Operacoes div = new Divisao();
                    valores();
                    div.setN1(v1);
                    div.setN2(v2);
                    System.out.println("O resultado da operacao é de: " + div.calcular() + "\n");
                }
                case 4 -> {
                    Operacoes mult = new Multiplicacao();
                    valores();
                    mult.setN1(v1);
                    mult.setN2(v2);
                    System.out.println("O resultado da operacao é de: " + mult.calcular() + "\n");
                }
                case 5 -> System.out.println("Obrigado por usar");
                default -> System.out.println("Opcão invalida. Tente novamente");
            }
        }
    }
}