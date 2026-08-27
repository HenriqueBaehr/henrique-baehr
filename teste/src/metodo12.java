import java.util.Scanner;

public class metodo12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a palavra : ");
        String palavra = leitor.next();

        System.out.println(obterCaractere(palavra));










        leitor.close();
    }
    public static char obterCaractere(String palavra){
        if (palavra.length() % 2 == 0){
            return palavra.charAt(0);
        }
        return palavra.charAt(1);
    }
}
