public class Imposto {
    public static void main (String[] args) {

        ReceitaFederal a1 = new ReceitaFederal("Henrique","13817317234","SC", 6000 );
        ReceitaFederal a2 = new ReceitaFederal("Mariana", "24758193234", "SP", 7500);
        ReceitaFederal a3 = new ReceitaFederal("Carlos", "31946285234", "PR", 4500);
        ReceitaFederal a4 = new ReceitaFederal("Fernanda", "52817406234", "RJ", 8200);
        ReceitaFederal a5 = new ReceitaFederal("Lucas", "69135274234", "MG", 5600);

        ReceitaFederal [] receitas = { a1, a2, a3, a4, a5 };

        double maiorImposto = 0;
        ReceitaFederal maiorReceitaFederal = null;

        for (int i = 0; i < receitas.length; i++){
            if (receitas[i].calcularImposto() > maiorImposto){
                maiorImposto = receitas[i].calcularImposto();
                maiorReceitaFederal = receitas[i];
            }
        }

        System.out.println(maiorReceitaFederal);

        double somaImpostos = 0;

        for (int i = 0; i < receitas.length; i++){
            somaImpostos = receitas[i].calcularImposto() + somaImpostos;
        }

        System.out.println("O total de imposto pago é de R$" + somaImpostos);

















    }
}
