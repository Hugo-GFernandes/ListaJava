public class Main {
    public static void main(String[] args) {


        int Dist, Consumo, Comb;


        Dist = 180;
        Consumo = 30;
        Comb = Dist / Consumo;


        System.out.println("Distancia percorrida: " + Dist + "Km");
        System.out.println("Consumo do carro: " + Consumo + "Km/L");
        System.out.println("Combustivel gasto no percurso: " + Comb + "L");
    }
}