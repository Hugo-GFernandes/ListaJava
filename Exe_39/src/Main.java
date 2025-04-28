import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);


        System.out.print("Digite o nome do estudante: ");
        String nome = ler.nextLine();
        System.out.print("Digite o número de matrícula: ");
        String matricula = ler.nextLine();
        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = ler.nextDouble();
        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        double notaSemestral = ler.nextDouble();
        System.out.print("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = ler.nextDouble();


        int pesoLaboratorio = 2;
        int pesoSemestral = 3;
        int pesoExameFinal = 5;


        double notaFinal = (notaLaboratorio * pesoLaboratorio + notaSemestral * pesoSemestral + notaExameFinal * pesoExameFinal)
                / (pesoLaboratorio + pesoSemestral + pesoExameFinal);


        String classificacao;
        if (notaFinal >= 8.0) {
            classificacao = "A";
        } else if (notaFinal >= 7.0) {
            classificacao = "B";
        } else if (notaFinal >= 6.0) {
            classificacao = "C";
        } else if (notaFinal >= 5.0) {
            classificacao = "D";
        } else {
            classificacao = "R";
        }


        System.out.println("Nome do estudante: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        ler.close();
    }
}