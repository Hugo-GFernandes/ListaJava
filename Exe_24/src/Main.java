import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int num, i, numV;


    Scanner ler = new Scanner(System.in);


        System.out.println("Quantos numeros quer verificar? ");
        num = ler.nextInt();
        for (i = 0; i < num + 1; i++ ){
            System.out.println("Digite o numero: ");
            numV = ler.nextInt();
            if (numV < 0 ){
                System.out.println("Este numero e negativo");
            } else if (numV == 0){
                System.out.println("Este numero e igual a zero");
            } else {
                System.out.println("Este numero e positivo");
            }

        }
    }
}