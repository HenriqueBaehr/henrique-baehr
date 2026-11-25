
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Familia {

    private List<Pessoa1> listaPessoas1;

    public Familia(){
        listaPessoas1 = new ArrayList<Pessoa1>();
    }

    public void  adicionarPessoa(Pessoa1 p){
        listaPessoas1.add(p);
    }

    public Pessoa1 encontrarPessoaMaisVelha(){

        LocalDate dataMaisVelha = LocalDate.now();

        Pessoa1 pessoaMaisVelha = null;

        for (Pessoa1 p : listaPessoas1){
            if (p.getDataNascimento().isBefore(dataMaisVelha)){
                dataMaisVelha = p.getDataNascimento();
                pessoaMaisVelha = p;
            }
        }
        return pessoaMaisVelha;
    }
}
