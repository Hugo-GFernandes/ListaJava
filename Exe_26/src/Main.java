import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int N;

    Scanner ler = new Scanner(System.in);


        do {
            System.out.println("Digite um numero de 1 a 5: ");
            N = ler.nextInt();
            if ((N < 1) || (N > 5)){
                System.out.println("Numero invalido, tente novamente");
            }
        } while ((N < 1) || (N > 5));


                switch (N) {
                    case 1:
                        System.out.println("Um");
                        break;
                    case 2:
                        System.out.println("Dois");
                        break;
                    case 3:
                        System.out.println("Tres");
                        break;
                    case 4:
                        System.out.println("Quatro");
                        break;
                    case 5:
                        System.out.println("Cinco");
                        break;
                }




    }
}