import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int V;

        Scanner ler = new Scanner(System.in);


        System.out.println("Valor do produto: ");
        V = ler.nextInt();
        V = V / 5;
        System.out.println("Valor das 5 prestacoes: " + V );

    }
}