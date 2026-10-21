public class Ex3 {
    public static void main(String[] args){

        Aluno a1 = new Aluno("Fibeas", 67, "40028922", "culinária", 9.3);
        Aluno a2 = new Aluno("Mariana", 22, "12345678", "informática", 8.5);
        Aluno a3 = new Aluno("João", 19, "87654321", "programação", 7.8);
        Aluno a4 = new Aluno("Beatriz", 25, "56781234", "administração", 9.7);
        Aluno a5 = new Aluno("Lucas", 21, "43218765", "gastronomia", 8.9);
        Aluno a6 = new Aluno("Pedro", 20, "12349876", "culinária", 8.7);
        Aluno a7 = new Aluno("Ana", 23, "98761234", "informática", 9.1);
        Aluno a8 = new Aluno("Gabriel", 18, "45678912", "programação", 7.5);
        Aluno a9 = new Aluno("Julia", 24, "78912345", "gastronomia", 9.4);
        Aluno a10 = new Aluno("Rafael", 22, "32165498", "administração", 8.2);

        SistemaAlunos s1 = new SistemaAlunos();

        s1.adicionarAluno(a1);
        s1.adicionarAluno(a2);
        s1.adicionarAluno(a3);
        s1.adicionarAluno(a4);
        s1.adicionarAluno(a5);
        s1.adicionarAluno(a6);
        s1.adicionarAluno(a7);
        s1.adicionarAluno(a8);
        s1.adicionarAluno(a9);
        s1.adicionarAluno(a10);


        System.out.println(s1.obterAlunosDoMesmoCursoComIdadeEMediaParecidas("culinária", 19, 7.0));
        System.out.println(s1.bucarAlunoMatricula("43218765"));







    }
}
