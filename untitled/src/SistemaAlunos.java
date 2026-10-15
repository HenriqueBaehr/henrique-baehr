import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Aluno> alunos;

    public SistemaAlunos(){
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a){
        alunos.add(a);
    }


    public List<Aluno> obterAlunosDoMesmoCursoComIdadeEMediaParecidas(String curso, int idade, double media){

        List<Aluno> alunosParecidos = new ArrayList<>();

        for (Aluno a : alunos){
            if (a.getCurso() .equals(curso)){
                if (a.getIdade() >= idade){
                    if (a.getMediaFinal() >= media){
                        alunosParecidos.add(a);
                    }
                }
            }
        }
        return alunosParecidos;


    }

}
