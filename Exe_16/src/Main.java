import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    double N1, N2, N3, media;
    String nome;


    Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        N1 = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        N2 = ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        N3 = ler.nextDouble();
        media = (N1 + N2 + N3)/3;
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Media: " + media);
        if (media <= 5){
            System.out.println("Reprovado");

        } else if ((media > 5.1) && (media<6.9)){
                System.out.println("Recuperacao");

        }       else {
                    System.out.println("Aprovado");
        }


    }
}