package aula2;
public class Ex9 {
    public static void main(String[] args) {
        double distancia = 300.0;
        double velocidade = 80.0;
        double tempo = calcularTempo(distancia, velocidade);
        System.out.println("O tempo necessário para percorrer"+ distancia + "km a uma velocidade" + velocidade + "km/h é" + tempo + "horas");
    }
    public static double calcularTempo (double distancia, double velocidade){
        return distancia / velocidade;
    }
}
