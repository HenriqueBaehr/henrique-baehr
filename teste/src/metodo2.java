import java.util.Scanner;

public class metodo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome : ");
        String nome = leitor.next();

        if (nome.equalsIgnoreCase("Osmar")){
            osmarHenrique();
        } else if (nome.equalsIgnoreCase("Patrick")) {
            patrickRuchinski();
        } else if (nome.equalsIgnoreCase("Diogo")) {
            diogoFatuetibennerqz();
        } else if (nome.equalsIgnoreCase("Eduardo")) {
            eduardoScheibt();
        }


        leitor.close();


    }
    public static void osmarHenrique(){
        System.out.println("Seu nome é Osmar,");
        System.out.println("Você tem 36 anos,");
        System.out.println("você é estudante de desenvolvimento de sistemas");
    }
    public static void patrickRuchinski(){
        System.out.println("Seu nome é Patrick");
        System.out.println("Você tem 30 anos");
        System.out.println("você é estudante de desenvolvimento de sistemas");
    }
    public static void diogoFatuetibennerqz(){
        System.out.println("Seu nome é Diogo");
        System.out.println("Você tem 23 anos");
        System.out.println("você é estudante de desenvolvimento de sistemas");
    }
    public static void eduardoScheibt(){
        System.out.println("Seu nome é Eduardo");
        System.out.println("Você tem 22 anos");
        System.out.println("você é estudante de desenvolvimento de sistemas");
    }


}
