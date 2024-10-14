package aula2;
public class Ex6 {
    public static void main(String[] args) {
        double altura = 5;
        double largura = 8;
        calculadorPerimetro(altura, largura);
    }
    public static void calculadorPerimetro ( double altura, double largura){
        double perimetro = 2* (altura + largura);
        System.out.println("O perimetro do retangulo é:" + perimetro);
    }
}
