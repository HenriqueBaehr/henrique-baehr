public class ContaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.identificacao = "6231";
        f1.nome = "Fibeas";
        f1.sobrenome = "Dobu";
        f1.salarioMensal = 6700;

        double reajuste = f1.salarioMensal/10;

        System.out.println("O seu salário anual é de "+f1.obterSalarioAnual());
        System.out.println("O seu nome completo é "+f1.obterNomeCompleto());
        System.out.println("O valor do seu salário mensal após o seu reajuste é "+f1.reajustarSalario(reajuste));
    }
}
