import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int numeroMes;
    String nomeMes;

    Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero do mes(1 a 12): ");
        numeroMes = ler.nextInt();
        nomeMes = ".";

        switch(numeroMes) {
            case 1:
                nomeMes = "janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                nomeMes = "Mes invalido";
        }
        System.out.println(nomeMes);
        ler.close();
    }
}