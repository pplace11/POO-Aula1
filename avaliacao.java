package aula2;
public class avaliacao {
    public static void main(String[] args) {
        double litro = 20;
        double desconto = 10;
        double preco= 1.5;
        double calculadorDesconto1 = calculadorDesconto(15, 3, 1.5);
        double calculadorDesconto2 = calculadorDesconto(35, 5, 1.5);
        double calculadorDescontosum = calculadorDesconto1 + calculadorDesconto2;
        System.out.println(calculadorDescontosum);

    }
    public static double calculadorDesconto(double litro,double desconto,double preco) {
        return ( litro * preco) - ( desconto * preco * litro);
    }
}
