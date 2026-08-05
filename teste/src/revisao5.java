import java.util.Scanner;

public class revisao5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int array[] = {1,2,3,4,5};
        int n = 0;
        int maior = array[0];
        int menor = array[0];
        int soma = 0;

        for (int l = 0;l<5;l++){
            if(array[l]>maior){
                maior=array[l];
            }
            if (array[l]<menor){
                menor = array[l];
            }
            soma = soma + array[l];
            n++;
        }
        double media = soma/(n);

        System.out.println("O maior número é : "+ maior);
        System.out.println("O menor número é : "+ menor);
        System.out.println("A média dos números é : "+media);







        leitor.close();
    }
}
