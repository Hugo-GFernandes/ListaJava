import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = ler.nextLine();
        System.out.println("Digite a idade do funcionario: ");
        int idd = ler.nextInt();
        ler.nextLine();
        System.out.println("Digite o sexo do funcionario(M/F): ");
        String sexo = ler.nextLine().toUpperCase();
        System.out.println("Salario fixo do funcionario: ");
        double SalFixo = ler.nextDouble();
        if ((sexo.equals("M")) && (idd >= 30)){
            SalFixo += 100;
        } else if ((sexo.equals("M")) && (idd < 30)){
            SalFixo += 50;

        } else if ((sexo.equals("F")) && (idd >= 30)){
            SalFixo += 200;

        } else if ((sexo.equals("F")) && (idd < 30)){
            SalFixo += 80;

        }
        System.out.println("Nome: " + nome);
        System.out.println("Salario liquido: " + SalFixo);

    }
}