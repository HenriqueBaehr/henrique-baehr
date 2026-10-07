import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioArrayList {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = leitor.nextInt();

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        int indice = lista.indexOf(valor);

        if (indice != -1){
            System.out.println(indice);
        }else{
            System.out.println("Não está presente");
        }


        leitor.close();



    }
}
