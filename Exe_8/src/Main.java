import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double D, Cot, R;


        Scanner ler = new Scanner(System.in);

        System.out.println("Cotacao atual: ");
        Cot = ler.nextDouble();
        System.out.println("Valor em dolar: ");
        D = ler.nextDouble();
        R = D * Cot;
        System.out.println(D + " $ = " + R + " R$");

    }
}