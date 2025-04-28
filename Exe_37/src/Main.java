import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        System.out.print("Digite o nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        String sexo = ler.nextLine().trim().toUpperCase();

        System.out.print("Digite a altura (em metros): ");
        double altura = ler.nextDouble();

        System.out.print("Digite a idade: ");
        int idade = ler.nextInt();

        double pesoIdeal = 0;


        if (sexo.equals("M")) {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else if (sexo.equals("F")) {
            if (altura > 1.50) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            }
        } else {
            System.out.println("Sexo inválido!");
        }


        if (pesoIdeal > 0) {
            System.out.println(nome + " seu peso ideal é: "+ pesoIdeal);
        }

        ler.close();
    }
}