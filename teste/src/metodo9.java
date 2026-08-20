import java.util.Scanner;

public class metodo9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número : ");
        int numero = leitor.nextInt();

        System.out.println(verdadeiroOuFalso(numero));











        leitor.close();
    }
    public static boolean verdadeiroOuFalso (int valor){
        if(valor % 2 == 0){
            boolean verdadeiroOuFalso = true;

        } else {
            boolean verdadeiroOuFalso = false;

        }
        return verdadeiroOuFalso;
    }
}
