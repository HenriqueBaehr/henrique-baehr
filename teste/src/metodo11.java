import java.util.Scanner;

public class metodo11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double vetor [] = {5, 6, 4, 12, -5, 0, 84};

        System.out.println(maiorElemento(vetor));
        System.out.println(menorElemento(vetor));
        System.out.println(mediaElementos(vetor));















        leitor.close();
    }
    public static double maiorElemento (double vetor [] ){
        double maiorValor = Double.MIN_VALUE;
        for (int i = 0; i< vetor.length; i++){
            if (vetor [i]> maiorValor){
                maiorValor = vetor[i];
            }
        }
            return maiorValor;
    }
    public static double menorElemento (double vetor [] ) {
        double menorValor = Double.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        return menorValor;
    }
        public static double mediaElementos (double vetor []){
            double soma = 0;

            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];
            }
            double media = soma / vetor.length;
            return media;
    }
}
