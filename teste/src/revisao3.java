import java.util.Scanner;

public class revisao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("INforme seu peso em quilogramas : ");
        double peso = leitor.nextDouble();

        System.out.println("Informe sua altura em metros : ");
        double altura = leitor.nextDouble();

        double IMC = peso/(altura*altura);

        if (IMC<18.5){
            System.out.println("Magreza");
        } else if (IMC<25) {
            System.out.println("Saudável");
        } else if (IMC<30) {
            System.out.println("Sobrepeso");
        } else if (IMC<35) {
            System.out.println("Obesidade Grau 1");
        } else if (IMC<40) {
            System.out.println("Obesidade Grau 2(severa)");
        } else if (IMC>=40) {
            System.out.println("Obesidade Grau 3(morbida)");
        }
        leitor.close();


    }
}
