import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    int num1, num2;


    Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite um numero: ");
            num1 = ler.nextInt();
            System.out.println("Digite outro numero: ");
            num2 = ler.nextInt();

            if (num1 == num2) {
                System.out.println("Os numeros devem ser distintos");
            }
                else if (num1 > num2){
                    System.out.println(num1 + " e maior que " + num2);

                }
                    else{
                        System.out.println(num2 + " e maior que " + num1 );

                    }
        }
         while (num1 == num2);
    }
}