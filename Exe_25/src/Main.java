import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int N1, N2;


    Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        N1 = ler.nextInt();
        System.out.println("Digite o segundo: ");
        N2 = ler.nextInt();
        if (N1 == N2){
            System.out.println("Os numeros sao iguais");
        } else {
            System.out.println("Os numeros sao diferentes");
            if (N1 > N2){
                System.out.println(N1 + " e maior que " + N2);
            } else if (N2 > N1) {
                System.out.println(N2 + " e maior que " + N1);
            }
        }
    }
}