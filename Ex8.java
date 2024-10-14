package aula2;
public class Ex8 {
    public static void main(String[] args) {
        double altura = 1.75;
        double peso = 70.0;
        double imc = calculadorIMC(altura, peso);
        System.out.println("O IMC de uma pessoa com altura de" + altura + "metros e peso de" + peso + "kg é:" + imc);
    }
    public static double calculadorIMC(double altura, double peso){
        return peso / (altura * altura);
    }
}
