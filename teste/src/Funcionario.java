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
    public void reajustarSalario(double percentualAumento){
        double aumento = salarioMensal*percentualAumento/100;
        double salarioFinal =salarioMensal + aumento;
        salarioMensal = salarioFinal;
    }

}
