import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opc = 1;
        int i = 0;
        int mediaSalario = 0; int salarioTotal = 0;
        do {
            ++i;
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite o salario do funcionario: ");
            int salario = ler.nextInt();
            salarioTotal += salario;
            mediaSalario = salarioTotal / i;
            System.out.println("A media salarial da empresa é de: " + mediaSalario);
            System.out.println("Deseja continuar? 1 - Sim     0 - Nao");
            opc = ler.nextInt();
        } while (opc != 0);
    }
}
