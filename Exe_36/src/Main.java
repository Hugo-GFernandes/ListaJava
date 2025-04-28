import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria): ");
        int tipoCliente = ler.nextInt();

        System.out.print("Digite o consumo de energia em KW/h: ");
        double consumo = ler.nextDouble();

        double valorPorKwh = 0;


        if (tipoCliente == 1) {
            valorPorKwh = 0.60;
        } else if (tipoCliente == 2) {
            valorPorKwh = 0.48;
        } else if (tipoCliente == 3) {
            valorPorKwh = 1.29;
        } else {
            System.out.println("Tipo de cliente inválido.");
            ler.close();
            return;
        }


        double valorConta = valorPorKwh * consumo;

        System.out.println("O valor da conta de luz é: R$ " + valorConta);

        ler.close();
    }
}