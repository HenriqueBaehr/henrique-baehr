import java.util.Scanner;

public class metodo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int vetor[] = { 1, 2, 3, 4, 5 };

        maiorNumero(vetor);
        menorNumero(vetor);
        numeroMedio(vetor);















        leitor.close();
    }
    public static void maiorNumero (int vetor[]){
        int maior = Integer.MIN_VALUE;
        for (int l = 0; l<vetor.length; l++){
            if (vetor[l]>maior) {
                maior = vetor[l];
            }
        }
        System.out.println("O maior número é "+maior);
    }
    public static void menorNumero (int vetor[]){
        int menor = Integer.MAX_VALUE;
        for (int l = 0; l<vetor.length; l++) {
            if (vetor[l] < menor) {
                menor = vetor[l];
            }
        }
        System.out.println("O menor valor é "+menor);
    }
    public static void numeroMedio (int vetor[]){
        int soma = 0;
        int n = 0;
        for (int l = 0; l<vetor.length; l++) {
            soma = soma +vetor[l];
            n++;
            }
        int media = soma/n;
        System.out.println("A média dos números é "+media);
    }
}
