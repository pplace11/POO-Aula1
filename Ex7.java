package aula2;
public class Ex7 {
    public static void main(String[] args) {
        double metro = 5;
        double centimetros = metroParaCentimetros(metro);
        System.out.println(metro + "metros é igual a" + centimetros + "perimetros");
    }
    public static double metroParaCentimetros(double metro){
        return metro * 108;
    }
}
