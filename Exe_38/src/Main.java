import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = ler.nextDouble();

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        double notaSemestral = ler.nextDouble();

        System.out.print("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = ler.nextDouble();


        int pesoLaboratorio = 2;
        int pesoSemestral = 3;
        int pesoExameFinal = 5;


        double mediaPonderada = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal)
                / (pesoLaboratorio + pesoSemestral + pesoExameFinal);


        System.out.println("A média ponderada é: " + mediaPonderada);


        if (mediaPonderada >= 7.0) {
            System.out.println("O aluno está aprovado.");
        } else if (mediaPonderada >= 5.0) {
            System.out.println("O aluno está em exame.");
        } else {
            System.out.println("O aluno está reprovado.");
        }

        ler.close();
    }
}