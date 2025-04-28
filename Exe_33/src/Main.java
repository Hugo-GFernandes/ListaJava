import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = ler.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = ler.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = ler.nextInt();


        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }

        ler.close();
    }
}