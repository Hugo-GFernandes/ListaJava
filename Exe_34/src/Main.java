import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = ler.nextInt();

        System.out.print("Digite a quantidade de horas/aula: ");
        int horasAula = ler.nextInt();

        double valorHora;


        if (nivel == 1) {
            valorHora = 12.00;
        } else if (nivel == 2) {
            valorHora = 17.00;
        } else if (nivel == 3) {
            valorHora = 25.00;
        } else {
            System.out.println("Nível inválido.");

            return;
        }

        double salario = valorHora * horasAula;

        System.out.println("O salário do professor é: R$ " + salario);

        ler.close();
    }
}