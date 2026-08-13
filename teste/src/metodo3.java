import java.util.Scanner;

public class metodo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com um número : ");
        int numero = leitor.nextInt();

    sequencia(numero);













        leitor.close();
    }
    public static void sequencia(int num){
        int z = num+20;
        while(num<z){
            num++;
            System.out.println(num);
        }
    }
}
