import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    double Pcusto, ValorV, Perc;


    Scanner ler = new Scanner(System.in);


        System.out.println("Preco de custo do produto: ");
        Pcusto = ler.nextDouble();
        System.out.println("Porcentagem de acrescimo: ");
        Perc = ler.nextDouble();
        ValorV = Pcusto + (Pcusto * Perc);
        System.out.println("Valor de venda do produto: " + ValorV);


    }
}