import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double C, F;

        Scanner ler = new Scanner(System.in);


        System.out.println("Digite os graus Celsius: ");
        C = ler.nextDouble();

        F = (9*C + 160) /5;

        System.out.println("Fahrenheit: " + F);



    }
}