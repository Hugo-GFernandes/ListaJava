import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        String nome;
        Double sal, salF, V;


        Scanner ler = new Scanner(System.in);



        System.out.println("Nome do vendedor: ");
        nome = ler.nextLine();
        System.out.println("Salario fixo: ");
        sal = ler.nextDouble();
        System.out.println("Vendas em dinheiro no mes: ");
        V = ler.nextDouble();

        salF = sal + (V * 0.15);
        System.out.println("Nome: " + nome);
        System.out.println("Vendas: " + V);
        System.out.println("Salario final: " + salF);

    }
}