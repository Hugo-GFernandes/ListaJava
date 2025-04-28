import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int numP, i, idade, TotA;
    String nome, sexo, saude;

    Scanner ler = new Scanner(System.in);

        System.out.println("Numero de pessoas candidatas: ");
        numP = ler.nextInt();
        ler.nextLine();
        TotA = 0;
        for (i=1; i <= numP; i++){
            System.out.println("Digite o nome: ");
            nome = ler.nextLine();
            System.out.println("Digite o sexo(H/M): ");
            sexo = ler.nextLine();
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
            ler.nextLine();
            System.out.println("Digite o estado de saude(Saudavel/Enfermo): ");
            System.out.println("S: saudavel" +
                    " E: enfermo");
            saude = ler.nextLine().toUpperCase();
            if ((idade>=18) && (saude.equals("S"))){
                System.out.println("Apto para servir");
                TotA = TotA + 1;

            } else {
                System.out.println("Inapto a servir");
            }

        }
        System.out.println("Total de pessoas aptas a servir: " + TotA);
    }
}