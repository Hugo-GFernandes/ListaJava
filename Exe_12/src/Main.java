import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    double Pcar, CarPorc, CustoF;


    Scanner ler = new Scanner(System.in);


    System.out.println("Digite o custo de fabrica do carro: ");
    Pcar = ler.nextDouble();
    CarPorc = Pcar * 0.45;
    CarPorc = CarPorc * 0.28;
    CustoF = Pcar + CarPorc;
    System.out.println("Custo final ao cliente: " + CustoF);



    }
}