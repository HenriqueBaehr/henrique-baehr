import java.time.LocalDate;

public class Ex9 {

    public static void main(String[] args) {

        Pessoa1 p1 = new Pessoa1("Carlos", LocalDate.of(2005,10,25));
        Pessoa1 p2 = new Pessoa1("Maria", LocalDate.of(2004,8,27));

        Familia f1 = new Familia();

        f1.adicionarPessoa(p1);
        f1.adicionarPessoa(p2);

        System.out.println(f1.encontrarPessoaMaisVelha());

    }
}
