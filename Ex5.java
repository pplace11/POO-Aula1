package aula2;
public class Ex5 {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "graus Celsius é igual a" + fahrenheit + "graus Fahrenheit.");
    }
    public static double celsiusParaFahrenheit (double celsius) {
        return (celsius * 9/5) + 32;
    }
}
