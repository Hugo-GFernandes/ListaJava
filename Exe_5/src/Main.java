import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double nota1, nota2, nota3, media;
        String nome;

        Scanner ler = new Scanner(System.in);


        System.out.println("Nome do aluno: ");
        nome = ler.nextLine();
        System.out.println("Primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Segunda nota: ");
        nota2 = ler.nextDouble();
        System.out.println("Terceira nota: ");
        nota3 = ler.nextDouble();



        media = (nota1 + nota2 + nota3)/3;

        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);
    }
}