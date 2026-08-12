import java.util.Scanner;

public class metodo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe qual é a sua estação 1-verão, 2-inverno, 3-outono, 4-primavera");
        int clima = leitor.nextInt();

        if (clima == 1){
            climaVerao();
        } else if (clima == 2) {
            climaInverno();
        } else if (clima == 3) {
            climaOutono();
        } else if (clima == 4) {
            climaPrimavera();
        }else{
            System.out.println("Informe um número correspondente a uma estação");
        }


        leitor.close();
    }
    public static void climaVerao() {
        System.out.println("É verão e o tempo está quente");
    }
    public static void climaInverno() {
        System.out.println("É inverno e o tempo está frio");
    }
    public static void climaOutono() {
        System.out.println("É outono com um clima ameno com uma tendência para o frio");
    }
    public static void climaPrimavera() {
        System.out.println("É primavera com um clima ameno com uma tendência para o calor");
    }
}
