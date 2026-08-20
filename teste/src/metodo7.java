import java.util.Scanner;

public class metodo7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número sendo 1 para verão, 2 para inverno, 3 para outono e 4 para primavera");
        int estacoes = leitor.nextInt();

        if (estacoes == 1){
            System.out.println(verao());
        } else if (estacoes == 2) {
            System.out.println(inverno());
        } else if (estacoes == 3) {
            System.out.println(outono());
        } else if (estacoes == 4) {
            System.out.println(primavera());
        }else{
            System.out.println("Número inválido");
        }


        leitor.close();
    }
    public static String verao (){
        String verao = "É verão e o clima está quente";
        return verao;
    }
    public static String inverno () {
        String inverno = "É inverno e o clima está frio";
        return inverno;
    }
    public static String outono () {
        String outono = "É outono e as folhas mudam de cor e caem";
        return outono;
    }
    public static String primavera () {
        String primavera = "É primavera e as plantas florescem e os dias ficam mais coloridos";
        return primavera;
    }
}
