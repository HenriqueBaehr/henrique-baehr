import java.util.Scanner;

public class revisao6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int n = 0;

        int matriz[][] = {
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };
        for(int l = 0;l<15;l++){
            for (int c = 0;c<3;c++){
                if(c == 2){
                    soma = soma + matriz[l][c];
                    n++;
                }
            }
        }
        double media = soma/n;
        System.out.println("A média dos preços das casas é : "+media);




        
    }
}
