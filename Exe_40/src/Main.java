import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);


        System.out.println("Digite o nome do pretendente: ");
        String nome = ler.nextLine();

        System.out.println("Digite a idade do pretendente: ");
        int idade = ler.nextInt();

        System.out.println("Digite o grupo de risco (1 para Baixo, 2 para Médio, 3 para Alto): ");
        int grupoRisco = ler.nextInt();

        int categoria = 0;


        if (idade < 17 || idade > 70) {
            System.out.println("Idade fora da faixa permitida para aquisição de seguro.");
        } else {
            if (idade >= 17 && idade <= 20) {
                if (grupoRisco == 1) {
                    categoria = 1;
                } else if (grupoRisco == 2) {
                    categoria = 2;
                } else if (grupoRisco == 3) {
                    categoria = 3;
                }
            } else if (idade >= 21 && idade <= 24) {
                if (grupoRisco == 1) {
                    categoria = 2;
                } else if (grupoRisco == 2) {
                    categoria = 3;
                } else if (grupoRisco == 3) {
                    categoria = 4;
                }
            } else if (idade >= 25 && idade <= 34) {
                if (grupoRisco == 1) {
                    categoria = 3;
                } else if (grupoRisco == 2) {
                    categoria = 4;
                } else if (grupoRisco == 3) {
                    categoria = 5;
                }
            } else if (idade >= 35 && idade <= 64) {
                if (grupoRisco == 1) {
                    categoria = 4;
                } else if (grupoRisco == 2) {
                    categoria = 5;
                } else if (grupoRisco == 3) {
                    categoria = 6;
                }
            } else if (idade >= 65 && idade <= 70) {
                if (grupoRisco == 1) {
                    categoria = 7;
                } else if (grupoRisco == 2) {
                    categoria = 8;
                } else if (grupoRisco == 3) {
                    categoria = 9;
                }
            }


            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria do seguro: " + categoria);
        }

        ler.close();
    }
}