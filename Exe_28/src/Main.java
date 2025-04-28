import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    double SalMin, aumentoTotal, Sal, reajustePercentual, valorReajuste;
    int  NumFuncionarios, i;
    String nome;

    Scanner ler = new Scanner(System.in);

    NumFuncionarios = 584;
    aumentoTotal = 0;

        System.out.println("Digite o salario minimo: ");
        SalMin = ler.nextDouble();
        ler.nextLine();
        for (i = 1; i <= NumFuncionarios; i++) {
            System.out.println("Funcionario " + i);
            System.out.println("Nome do funcionario");
            nome = ler.nextLine();
            System.out.println("Salario atual: ");
            Sal = ler.nextDouble();
            ler.nextLine();
            if (Sal < 3 * SalMin) {
                reajustePercentual = 0.50;
            } else if (Sal <= 10 * SalMin) {
                reajustePercentual = 0.20;
            } else if (Sal <= 20 * SalMin) {
                reajustePercentual = 0.15;
            } else {
                reajustePercentual = 0.10;
            }
            valorReajuste = Sal * reajustePercentual;
            double novoSal = Sal + valorReajuste;
            aumentoTotal += valorReajuste;
            System.out.println("Nome: " + nome);
            System.out.println("Reajuste: " + valorReajuste);
            System.out.println("Novo salario: " + novoSal);
        }
            System.out.println("Aumento total da folha" +
                    " de pagamento: " + aumentoTotal);


    }
}