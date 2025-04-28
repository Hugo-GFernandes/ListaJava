import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[3];


        System.out.print("Digite o primeiro valor: ");
        numeros[0] = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        numeros[1] = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        numeros[2] = scanner.nextInt();


        Arrays.sort(numeros);


        System.out.println("Valores em ordem crescente: " +
                numeros[0] + " " + numeros[1] + " " + numeros[2]);

        scanner.close();
    }
}