import java.util.Scanner;
import java.text.DecimalFormat;

public class revisao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("0.00");

        System.out.println("Informe seu nome : ");
        String nome = leitor.next();

        System.out.println("Informe seu salário fixo : ");
        double fixo = leitor.nextDouble();

        System.out.println("Informe quantos reais você vendeu : ");
        double vendas = leitor.nextDouble();

        double salario = fixo + (vendas)*15/100;

        System.out.println("O salário final é : "+df1.format(salario));

        leitor.close();


    }
}
