
package salario;

import java.util.Scanner;

public class Salario {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int opc = 1;
        int i = 0;
        int novoSalario = 0;
        while (opc != 0) {
            ++i;
            Scanner ler = new Scanner(System.in);
            System.out.println("Deseja continuar 1 - Sim     0 - Nao");
            opc = ler.nextInt();
            System.out.print("Digite o salario do funcionario: ");
            
            int salario = ler.nextInt();
             
            novoSalario = (salario + novoSalario) / i;
            System.out.println("A media salarial da empresa eh de: " + novoSalario);
    }
    }
    
}
