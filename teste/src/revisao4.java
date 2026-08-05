import java.util.Scanner;

public class revisao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int login = 1;
        int maiorLogin = 0;
        int menorLogin = 0;
        double maior = 0;
        double menor = 1000000000;
        double soma = 0;
        int quantidade = 0;
        while(login != 0){
            System.out.println("informe qual é o seu número de inscrição ou zero para terminar : ");
            login = leitor.nextInt();
            if (login != 0){
                System.out.println("Informe qual é a sua altura em metros : ");
                double altura = leitor.nextDouble();

                if (altura>maior){
                    maior = altura;
                maiorLogin = login;
                }
                if (altura<menor){
                    menor = altura;
                    menorLogin = login;
                }
                soma = (soma+altura);
                quantidade++;

            }

        }
        double media = soma/quantidade;
        System.out.println("O maior atleta é do login : "+maiorLogin+" e sua altura é : "+maior+"m");
        System.out.println("O menor atleta é do login : "+menorLogin+" e sua altura é : "+menor+"m");
        System.out.println("A média de altura dos atletas é : "+media);
        System.out.println("A quantidade de atletas cadastrados é : "+quantidade);

        leitor.close();



    }
}
