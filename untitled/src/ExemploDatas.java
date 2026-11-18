import java.time.LocalDate;
import java.time.Period;

public class ExemploDatas {
    public static void main(String[] args){

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataNascimento = LocalDate.of(2009,8,17);

        System.out.println("Eu nasci dia " + dataNascimento);

        LocalDate dataNascimentoDiogo = LocalDate.of(2003, 4, 2);

        if (dataNascimentoDiogo.isBefore(dataNascimento)){
            System.out.println("Diogo é mais velho");
        }else{
            System.out.println("Henrique é mais velho");
        }

        int idadeDiogo = Period.between(dataNascimentoDiogo, hoje).getYears();

        System.out.println("O Diogo tem " + idadeDiogo + " anos");


    }
}
