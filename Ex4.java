package aula2;
public class Ex4 {
    public static void main(String[] args) {
        int resultadosum = sum(3,4);
        int resultadosub = sub(3,4);
        int resultadodiv = div(3,4);
        int resultadomul = mul(3,4);
        System.out.println(resultadosub);
    }
    public static int sum(int x,int y) {
        return x+y;
    }
    public static int div(int x,int y) {
        return x/y;
    }
    public static int mul(int x,int y) {
        return x*y;
    }
    public static int sub(int x,int y) {
        return x-y;
    }
}
