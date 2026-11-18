import java.time.LocalDate;
import java.time.Period;

public class MaiorIdade {

        private LocalDate dataNascimento = LocalDate.of(2009,8,17);

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
        this.dataNascimento = dataNascimento;
    }
    public boolean acharMaiorIdade(LocalDate dataNascimento){
        return Period.between(dataNascimento, LocalDate.now()).getYears() >= 18;
    }

    public MaiorIdade(LocalDate dataNascimento) {
       setDataNascimento(dataNascimento);
    }

    @Override
    public String toString() {
        return "MaiorIdade{" +
                "dataNascimento=" + dataNascimento +
                '}';
    }
}
