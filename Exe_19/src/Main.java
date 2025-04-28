import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int i, TotH, TotM;
    String nome, sexo;


    Scanner ler = new Scanner(System.in);

    TotH = 0;
    TotM = 0;
    for (i = 1; i < 57; i++){
        System.out.println("-----------------");
        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite seu sexo(H/M): ");
        sexo = ler.nextLine().toUpperCase();
        if (sexo.equals("H")){
            System.out.println("Nome: " + nome + ", Sexo: Homem");
            TotH = TotH + 1;
        } else if (sexo.equals("M")){
            System.out.println("Nome: " + nome + ", Sexo: Mulher ");
            TotM = TotM + 1;

        }

    }
        System.out.println("------------------");
        System.out.println("Total de mulheres: " + TotM);
        System.out.println("Total de homens: " + TotH);
    }
}