import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int num, i;


    Scanner ler = new Scanner(System.in);

    do {
        System.out.println("------------------");
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        if (num > 80) {
            System.out.println("Este numero e maior que 80");
        } else if (num < 25) {
            System.out.println("Este numero e menor que 25");
        } else if (num == 40) {
            System.out.println("Este numero e igual a 40");

        } else {
            System.out.println("Digite outro numero");
        }
    } while ((num > 25) && (num < 80) && (num != 40));
    }
}