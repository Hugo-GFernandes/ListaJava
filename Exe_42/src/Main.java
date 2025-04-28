import java.util.Scanner;
public class Main {
    public static int[] ordenarValores(int a, int b, int c) {
        int[] valores = {a, b, c};


        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (valores[i] > valores[j]) {

                    int temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }

        return valores;
    }
    public static void main(String[] args) {


        int a, b, c;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = ler.nextInt();
        System.out.println("Segundo valor: ");
        b = ler.nextInt();
        System.out.println("Terceiro valor: ");
        c = ler.nextInt();

        int[] resultado = ordenarValores(a, b, c);

        System.out.println("Valores ordenados: " + resultado[0] + ", " + resultado[1] + ", " + resultado[2]);

    }
}
