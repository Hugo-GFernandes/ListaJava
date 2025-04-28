import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double V, Vrend;

        Scanner ler = new Scanner(System.in);


        System.out.println("Valor depositado: ");
        V = ler.nextDouble();

        Vrend = V + (V * 0.0070);

        System.out.println("Valor com rendimento apos um mes: " + Vrend);

    }
}