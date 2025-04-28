import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    int i;
    float PreC, PreV, Dif, media;

    Scanner ler = new Scanner(System.in);

        for (i = 1; i < 41; i++) {
            System.out.println("---------------------------");
            System.out.println("Preco de custo do produto: ");
            PreC = ler.nextFloat();
            System.out.println("Preco de venda: ");
            PreV = ler.nextFloat();
            Dif = PreV - PreC;
            if (Dif > 0){
                System.out.println("Lucro de R$" + Dif);
            } else if (Dif == 0){
                System.out.println("Empate: sem lucro");
            } else {
                System.out.println("Prejuizo de R$" + Dif);
            }
            System.out.println("-------------------------------------");
            media = (PreC + PreV)/2;
            System.out.println("Media preco de custo e de venda: " + media);

        }
    }
}