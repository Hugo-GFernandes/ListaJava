import java.util.Scanner;
public class Main {
    public static void calcularTaboada(int N, String O, int T) {
        for (int i = 1; i <= T; i++) {
            int resultado = 0;

            switch (O.toLowerCase()) {
                case "soma":
                    resultado = N + i;
                    break;
                case "subtração":
                    resultado = N - i;
                    break;
                case "multiplicação":
                    resultado = N * i;
                    break;
                case "divisão":
                    if (i != 0) {
                        resultado = N / i;
                    } else {
                        System.out.println("Divisão por zero não permitida!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador inválido!");
                    return;
            }

            System.out.println(N + " " + O + " " + i + " = " + resultado);
        }
    }
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = ler.nextInt();

        ler.nextLine();

        System.out.print("Digite o operador (soma, subtração, multiplicação ou divisão): ");
        String O = ler.nextLine();

        System.out.print("Digite o valor de T (limite da taboada): ");
        int T = ler.nextInt();

        calcularTaboada(N, O, T);

        ler.close();
    }
}
