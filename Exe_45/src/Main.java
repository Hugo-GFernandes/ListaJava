import java.util.Scanner;
public class Main {
    public static double Potencia(double A, double B){

        return Math.pow(A, B);
    }

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double X = ler.nextDouble();
        System.out.println("Outro valor: ");
        double Z = ler.nextDouble();

        System.out.println( X + " elevado a " + Z + " e: " + Potencia(X, Z));


    }
}