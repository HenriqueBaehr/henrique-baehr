import java.util.Scanner;

public class metodo6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe as três primeiras letras de seu sobrenome : ");
        String tresLetrasSobrenome = leitor.next();

        System.out.println("Informe as duas primeiras letras de seu nome : ");
        String duasLetrasNome = leitor.next();

        System.out.println("Informe as duas primeiras letras do sobrenome de solteira de sua mãe : ");
        String duasLetrasSobrenome = leitor.next();

        System.out.println("Informe as três primeiras letras do nome da cidade onde você nasceu");
        String tresLetrasCidade = leitor.next();

        nome(tresLetrasSobrenome, duasLetrasNome);
        sobrenome(duasLetrasSobrenome, tresLetrasCidade);















        leitor.close();
    }
    public static void nome (String tresLS,String doisLN){
        System.out.print("Seu nome é : "+ tresLS + doisLN);

    }
    public static void sobrenome (String doisLs,String tresLC ){
        System.out.println(" "+doisLs + tresLC);

    }
}
