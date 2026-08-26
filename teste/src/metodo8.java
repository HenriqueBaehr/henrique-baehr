import java.util.Scanner;

public class metodo8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double nota1 = leitor.nextDouble();

        System.out.println("Informe a segunda nota");
        double nota2 = leitor.nextDouble();

        System.out.println("Informe a terceira nota");
        double nota3 = leitor.nextDouble();

        System.out.println( media(nota1,nota2,nota3));







        leitor.close();
    }
    public static double media (double n1, double n2, double n3){
        if (n1 > 10 || n1 < 0 || n2 > 10 || n2 < 0 || n3 > 10 || n3 < 0){
            return 0;
        }
        return  (n1+n2+n3)/3;
    }
}
