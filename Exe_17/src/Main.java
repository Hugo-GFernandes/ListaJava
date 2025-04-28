import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int C, TotN, N;


    Scanner ler = new Scanner(System.in);

    C = 1;
    TotN = 0;
    do {
        System.out.println("Digite o " + C + "o. numero: ");
        N = ler.nextInt();
        if ((N < 150) && (N > 10)){
            TotN = TotN + 1;

        }
        C = C + 1;
    }
    while (C < 81);
        System.out.println("-------------------------------------------");
        System.out.println("Existem " + TotN + " Numeros entre 10 e 150");
        System.out.println("-------------------------------------------");
    }
}