public class Franquia {
    public static void main(String[] args) {
        Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nome = "Cooper";
        unidadeDeBlumenau.numeroDeMacasVendidasPorAno = 100000;
        unidadeDeBlumenau.precoDeVendaDasMacas = 3;
        unidadeDeBlumenau.numeroDeLaranjasVendidasPorAno = 50000;
        unidadeDeBlumenau.precoDeVendaDasLaranjas = 2;

        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nome = "Super A";
        unidadeDeJoinville.numeroDeMacasVendidasPorAno = 200000;
        unidadeDeJoinville.precoDeVendaDasMacas = 2;
        unidadeDeJoinville.numeroDeLaranjasVendidasPorAno = 40000;
        unidadeDeJoinville.precoDeVendaDasLaranjas = 4;

        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nome = "Atacadão";
        unidadeDeFlorianopolis.numeroDeMacasVendidasPorAno = 300000;
        unidadeDeFlorianopolis.precoDeVendaDasMacas = 1;
        unidadeDeFlorianopolis.numeroDeLaranjasVendidasPorAno = 30000;
        unidadeDeFlorianopolis.precoDeVendaDasLaranjas = 3;

        System.out.println("O mercado " +unidadeDeBlumenau.nome+ " vendeu " +unidadeDeBlumenau.numeroDeMacasVendidasPorAno+ " maças por ano a um preço de " +unidadeDeBlumenau.precoDeVendaDasMacas+ " reais e " +unidadeDeBlumenau.numeroDeLaranjasVendidasPorAno+ " laranjas por ano a um preço de " +unidadeDeBlumenau.precoDeVendaDasLaranjas+ " reais");
        System.out.println("O mercado " +unidadeDeJoinville.nome+ " vendeu " +unidadeDeJoinville.numeroDeMacasVendidasPorAno+ " maças por ano a um preço de " +unidadeDeJoinville.precoDeVendaDasMacas+ " reais e " +unidadeDeJoinville.numeroDeLaranjasVendidasPorAno+ " laranjas por ano a um preço de " +unidadeDeJoinville.precoDeVendaDasLaranjas+ " reais");
        System.out.println("O mercado " +unidadeDeFlorianopolis.nome+ " vendeu " +unidadeDeFlorianopolis.numeroDeMacasVendidasPorAno+ " maças por ano a um preço de " +unidadeDeFlorianopolis.precoDeVendaDasMacas+ " reais e " +unidadeDeFlorianopolis.numeroDeLaranjasVendidasPorAno+ " laranjas por ano a um preço de " +unidadeDeFlorianopolis.precoDeVendaDasLaranjas+ " reais");

        Mercado mercados[] = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};

        double maiorReceitaMacas = 0;
        Mercado mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++){
            if (mercados[i].calcularReceitaTotal() > maiorReceitaMacas){
                maiorReceitaMacas = mercados[i].calcularReceitaMacas();
                mercadoMaiorReceitaMacas = mercados[i];
            }

        }
        System.out.println("Quem teve a maior receita das maçãs: " + mercadoMaiorReceitaMacas.nome + ", faturou: " + mercadoMaiorReceitaMacas.calcularReceitaMacas() + " reais");

        double menorReceitasLaranjas = Double.MAX_VALUE;
        Mercado mercadoMenorReceitLaranjas = null;

        for (int i = 0; i < mercados.length; i++){
            if (mercados[i].calcularReceitaLaranjas() < menorReceitasLaranjas){
                menorReceitasLaranjas = mercados[i].calcularReceitaLaranjas();
                mercadoMenorReceitLaranjas = mercados[i];
            }
        }
        System.out.println("Quem teve a menor receita de laranjas: " + mercadoMenorReceitLaranjas.nome + ", faturando: " + menorReceitasLaranjas + " reais");

        double segundaMaiorReceitaTotal = 0;

        Mercado mercadoSegundaMaiorReceitaTotal = null;

        double maiorReceitaTotal = 0;

        for (int i = 0; i < mercados.length ; i++){
            if (mercados[i].calcularReceitaTotal() > segundaMaiorReceitaTotal && mercados[i].calcularReceitaTotal() != maiorReceitaTotal){
                segundaMaiorReceitaTotal = mercados[i].calcularReceitaTotal();
                mercadoSegundaMaiorReceitaTotal = mercados[i];
            }
        }
        System.out.println("Mercado que teve a segunda maior receita total: " + mercadoSegundaMaiorReceitaTotal.nome + ", faturando: " + segundaMaiorReceitaTotal + " reais");

        double receitaGeralMacas = 0;
        double receitaGeralLaranjas = 0;

        for (int i = 0; i < mercados.length; i++){
            receitaGeralLaranjas += mercados[i].calcularReceitaLaranjas();
            receitaGeralMacas += mercados[i].calcularReceitaMacas();
        }

        if (receitaGeralMacas > receitaGeralLaranjas){
            System.out.println("A franquia teve uma receita maior com maçãs");
        } else if (receitaGeralLaranjas > receitaGeralMacas) {
            System.out.println("A franquia teve uma receita maior com laranjas");
        } else {
            System.out.println("As receitas foram iguais");
        }


    }

}
