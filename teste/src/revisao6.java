import java.util.Scanner;

public class revisao6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        double soma2 = 0;
        double n = 0;
        double h = 0;
        int custoMenor = 1000000;
        int maisQuartos = 0;
        int menosQuartos = 10;
        int tamanhoMenosQuartos =0;
        int tamanhoMaisQuartos =0;

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
                if(c == 2 ){
                    soma = soma + matriz[l][c];
                    n++;
                    if (matriz[l][c]<custoMenor){
                        custoMenor = matriz[l][c];
                    }
                    if (matriz[l][c]>300000){
                        soma2 = soma2 + matriz[l][0];
                        h++;
                    }

                }
                if (c == 1){
                    if (matriz[l][c]<menosQuartos){
                        menosQuartos = matriz[l][c];
                        tamanhoMenosQuartos = matriz[l][1];
                    }
                    if (matriz[l][c]>maisQuartos){
                        maisQuartos = matriz[l][c];
                        tamanhoMaisQuartos = matriz[l][1];
                    }
                }
            }
        }
        double media = soma/n;
        double media2 = soma2/h;
        int diferenca = (tamanhoMaisQuartos - tamanhoMenosQuartos);
        System.out.println("A média dos preços das casas é : "+media+"reais");
        System.out.println("O custo da casa mais barata é "+ custoMenor);
        System.out.println("A diferença de tamanho da casa com o maior número de quartos para a casa com o menor número de quartos é "+ diferenca);
        System.out.println("A média do tamanho das casas que custam mais de 300.000 mil é "+media2);




    leitor.close();

        
    }
}
