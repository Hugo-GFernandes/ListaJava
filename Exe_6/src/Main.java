import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int A, B, InvA, InvB;


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor inteiro de A: ");
        A = ler.nextInt();
        System.out.println("Digite um valor inteiro de B: ");
        B = ler.nextInt();

        InvA = B;
        InvB = A;

        System.out.println("Valor invertido de A: " + InvA);
        System.out.println("Valor invertido de B: " + InvB);


    }
}