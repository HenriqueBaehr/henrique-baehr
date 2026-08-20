import java.util.Scanner;

public class metodo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número base : ");
        double base = leitor.nextDouble();

        System.out.println("Insira um número : ");
        double numero1 = leitor.nextDouble();

        System.out.println("Insira um número : ");
        double numero2 = leitor.nextDouble();

        numeroMaisPerto(base, numero1, numero2);














        leitor.close();
    }
    public static void numeroMaisPerto (double b, double n1, double n2){
        double diferenca1 = Math.abs(n1 - b);
        double diferenca2 = Math.abs(n2 - b);

        if (diferenca1 < diferenca2){
            System.out.println("O número mais próximo da base é "+ n1);
        } else if (diferenca2 < diferenca1) {
            System.out.println("O número mais próximo da base é "+ n2);
        } else if (diferenca1 == diferenca2) {
            System.out.println("Ambos estão a mesma distância da base");
        }

    }

}
