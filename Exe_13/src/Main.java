import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int num;


        Scanner ler = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        if (num > 10 ) {
            System.out.println(num + " e maior que 10");

        }

    }
}