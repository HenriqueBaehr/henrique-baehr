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
        double diferenca1 = 0;
        double diferenca2 = 0;
        if (n1 > b ){
           diferenca1 = n1 - b;
        } else if (n1 < b) {
            diferenca1 = b - n1;
        } else if (n1 == b) {
            diferenca1 = 0;
        }
        if (n2 > b ){
            diferenca2 = n2 - b;
        } else if (n2 < b) {
            diferenca2 = b - n2;
        } else if (n2 == b) {
            diferenca2 = 0;
        }
        if (diferenca1 < diferenca2){
            System.out.println("O número mais próximo da base é o primeiro");
        } else if (diferenca2 < diferenca1) {
            System.out.println("O número mais próximo da base é o segundo");
        } else if (diferenca1 == diferenca2) {
            System.out.println("Ambos estão a mesma distância da base");
        }

    }

}
