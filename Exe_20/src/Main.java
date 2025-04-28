import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    String Resp;
    int ano, TotAte2000, TotG;
    double valor, desc, valorF;

    Scanner ler = new Scanner(System.in);

    TotAte2000 = 0;
    TotG = 0;
    do {
        System.out.println("Valor do veiculo: ");
        valor = ler.nextDouble();
        System.out.println("Digite o ano do veiculo: ");
        ano = ler.nextInt();
        ler.nextLine();
        if (ano <=2000){
            desc = valor * 0.12;
            TotAte2000 = TotAte2000 + 1;
            TotG = TotG + 1;
        } else {
            desc = valor * 0.07;
            TotG = TotG + 1;
        }
        valorF = valor - desc;
        System.out.println("--------------------------");
        System.out.println("Valor do desconto: " + desc);
        System.out.println("Valor final: " + valorF);
        System.out.println("-------------------------------------");
        System.out.println("Quer continuar calculando descontos? ");
        Resp = ler.nextLine().toUpperCase();
    }
    while (Resp.equals("S"));
        System.out.println("Total de carros de ano ate 2000: " + TotAte2000);
        System.out.println("Total geral de carros: " + TotG);


    }
}