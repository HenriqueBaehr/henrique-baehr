import java.util.Scanner;

public class metodo10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um valor máximo : ");
        double maximo = leitor.nextDouble();

        System.out.println("Informe um valor mínimo : ");
        double minimo = leitor.nextDouble();

        System.out.println("Informe um valor : ");
        double valor = leitor.nextDouble();

        System.out.println(limite(maximo,minimo,valor));











        leitor.close();
    }
    public static String limite (double maximo, double minimo, double valor){
        String limite = "oi";
        if ( valor >= minimo && valor <= maximo){
            limite = valor+" está nos limites impostos.";
        }else{
            limite = valor+" está fora dos limites impostos.";
        }
        return limite;
    }
}
