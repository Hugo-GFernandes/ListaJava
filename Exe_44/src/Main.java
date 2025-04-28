import java.util.Scanner;
public class Main {
    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static double calcularS(int N) {
        double S = 1.0;

        for (int i = 1; i <= N; i++) {
            S += 1.0 / fatorial(i);
        }

        return S;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor inteiro e positivo para N: ");
        int N = ler.nextInt();

        if (N >= 0) {
            double resultado = calcularS(N);
            System.out.println("O valor de S é: " + resultado);
        } else {
            System.out.println("Valor inválido. N deve ser inteiro e positivo.");
        }

        ler.close();



    }
}
