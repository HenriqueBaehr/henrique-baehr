import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Aluno> alunos;

    public SistemaAlunos(){
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a){
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(a.getMatricula())){
                throw new IllegalArgumentException("Erro no cadastro da matrícula");
            }
        }
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
    public Aluno bucarAlunoMatricula(String matricula){


        for (Aluno a : alunos){
            if (a.getMatricula() .equals(matricula)){
                return a;
            }
        }
        return null;
    }



}
