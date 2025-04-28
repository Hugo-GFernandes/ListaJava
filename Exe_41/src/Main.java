import java.util.Scanner;
public class Main {
    public static boolean NumeroPerfeito(int numero) {
        int somaDivisores = 0;


        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }


        return somaDivisores == numero;
    }
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero para verificacao: ");
        int numero = ler.nextInt();
        if (NumeroPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

    }
}
