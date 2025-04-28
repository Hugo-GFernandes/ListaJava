import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    double V, Vcliente, D;
    int Comb;

    Scanner ler = new Scanner(System.in);
    D = 0;

        System.out.println("Digite o valor do veiculo: ");
        V = ler.nextDouble();
        System.out.println("Tipo do combustivel(1 para gasolina, 2 para" +
                "alcool e 3 para diesel): ");
        Comb = ler.nextInt();
        switch (Comb) {
            case 1:
             D = V * 0.21;
             break;
            case 2:
                D = V * 0.25;
                break;
            case 3:
                D = V * 0.14;
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
        System.out.println("Desconto: " + D);
        Vcliente = V - D;
        System.out.println("Valor para o cliente " + Vcliente );
    }
}