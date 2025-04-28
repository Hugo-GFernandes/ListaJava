import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor de A (número real): ");
        double A = ler.nextDouble();

        System.out.print("Digite o valor de B (número real): ");
        double B = ler.nextDouble();

        System.out.print("Digite o valor de C (operador: +, -, *, /): ");
        char C = ler.next().charAt(0);

        double resultado;

        switch (C) {
            case '+':
                resultado = A + B;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = A - B;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = A * B;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (B == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    resultado = A / B;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operador não definido.");
                break;
        }

        ler.close();
    }
}