public class Funcionario {
    String identificacao;

    String nome;

    String sobrenome;

    double salarioMensal;

    public double obterSalarioAnual(){
        return salarioMensal*12;
    }
    public String obterNomeCompleto(){
        return (nome+" "+sobrenome);
    }
    public double reajustarSalario(double reajuste){
        return (salarioMensal+reajuste);
    }

}
