import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int num;




    Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        num = ler.nextInt();
        if ((num>100) && (num<200)){
            System.out.println("O numero esta entre 100 e 200");

        } else {
            System.out.println("O numero nao esta entre 100 e 200");
        }
    }
}