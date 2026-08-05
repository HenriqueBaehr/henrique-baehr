import java.util.Scanner;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("0.00");
        System.out.println("Informe o seu número de matrícula : ");
        double matricula = leitor.nextDouble();

        System.out.println("Informe o seu nome : ");
        String nome = leitor.next();

        System.out.println("Informe o quantas horas você trabalha na semana : ");
        int horas = leitor.nextInt();

        System.out.println("Informe o quanto você ganha por hora");
        double valor = leitor.nextDouble();

        double salario = 4*horas*valor;

        System.out.println("A sua matrícula é : "+matricula+", seu nome é : "+nome+" e o seu salário é : "+df1.format(salario));

        leitor.close();

    }
}