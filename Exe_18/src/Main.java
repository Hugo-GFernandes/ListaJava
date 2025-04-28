import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int idd, i;


    Scanner ler = new Scanner(System.in);

    for (i = 1; i < 76; i++) {
        System.out.println("----------------");
        System.out.println("Digite a idade: ");
        idd = ler.nextInt();
        if (idd < 0){
            System.out.println("Idade invalida");

        } else if (idd < 18){
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }

    }


    }
}