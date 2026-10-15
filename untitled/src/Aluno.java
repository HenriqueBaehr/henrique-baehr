public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private double mediaFinal;

    public Aluno(String nome, int idade, String matricula, String curso, double mediaFinal) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMediaFinal(mediaFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Erro, nome de aluno inválido");
        }else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0){
            throw new IllegalArgumentException("Erro, idade inválida");
        }else {
            this.idade = idade;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()){
            throw new IllegalArgumentException("Erro, matrícula inválida");
        }else {
            this.matricula = matricula;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null || curso.isBlank()){
            throw new IllegalArgumentException("Erro, curso inválido");
        }else {
            this.curso = curso;
        }
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        if (mediaFinal < 0 || mediaFinal > 10){
            throw new IllegalArgumentException("Erro, média final inválida");
        }else {
            this.mediaFinal = mediaFinal;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", mediaFinal=" + mediaFinal +
                '}';
    }
}
