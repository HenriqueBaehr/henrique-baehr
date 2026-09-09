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

        if (unidadeDeBlumenau.descobrirReceitaMacas()>unidadeDeJoinville.descobrirReceitaMacas() && unidadeDeBlumenau.descobrirReceitaMacas()>unidadeDeFlorianopolis.descobrirReceitaMacas()){
            System.out.println("O mercado que mais obteve receita com as vendas das maças foi o de Blumenau com "+unidadeDeBlumenau.descobrirReceitaMacas()+" reais ganhos");
        } else if (unidadeDeJoinville.descobrirReceitaMacas()>unidadeDeBlumenau.descobrirReceitaMacas() && unidadeDeJoinville.descobrirReceitaMacas()>unidadeDeFlorianopolis.descobrirReceitaMacas()) {
            System.out.println("O mercado que mais obteve receita com as vendas das maças foi o de Joinville com "+unidadeDeJoinville.descobrirReceitaMacas()+" reais ganhos");
        } else if (unidadeDeFlorianopolis.descobrirReceitaMacas()>unidadeDeBlumenau.descobrirReceitaMacas() && unidadeDeFlorianopolis.descobrirReceitaMacas()>unidadeDeJoinville.descobrirReceitaMacas()) {
            System.out.println("O mercado que mais obteve receita com as vendas das maças foi o de Florianopolis com "+unidadeDeFlorianopolis.descobrirReceitaMacas()+" reais ganhos");
        }
        if (unidadeDeBlumenau.descobrirReceitaLaranjas()<unidadeDeJoinville.descobrirReceitaLaranjas() && unidadeDeBlumenau.descobrirReceitaLaranjas()<unidadeDeFlorianopolis.descobrirReceitaLaranjas()) {
            System.out.println("O mercado que menos obteve receita com as vendas das laranjas foi o de Blumenau com " + unidadeDeBlumenau.descobrirReceitaLaranjas() + " reais ganhos");
        } else if (unidadeDeJoinville.descobrirReceitaLaranjas()<unidadeDeBlumenau.descobrirReceitaLaranjas() && unidadeDeJoinville.descobrirReceitaLaranjas()<unidadeDeFlorianopolis.descobrirReceitaLaranjas()) {
            System.out.println("O mercado que menos obteve receita com as vendas das laranjas foi o de Joinville com " + unidadeDeJoinville.descobrirReceitaLaranjas() + " reais ganhos");
        } else if (unidadeDeFlorianopolis.descobrirReceitaLaranjas()<unidadeDeBlumenau.descobrirReceitaLaranjas() && unidadeDeFlorianopolis.descobrirReceitaLaranjas()<unidadeDeJoinville.descobrirReceitaLaranjas()) {
            System.out.println("O mercado que menos obteve receita com as vendas das laranjas foi o de Florianopolis com " + unidadeDeFlorianopolis.descobrirReceitaLaranjas() + " reais ganhos");
        }

        if (unidadeDeBlumenau.descobrirReceitaTotal()>unidadeDeJoinville.descobrirReceitaTotal() && unidadeDeBlumenau.descobrirReceitaTotal()<unidadeDeFlorianopolis.descobrirReceitaTotal()){
            System.out.println("A loja de Blumenau teve a segunda maior receita total com " + unidadeDeBlumenau.descobrirReceitaTotal() + " reais faturados");
        } else if (unidadeDeBlumenau.descobrirReceitaTotal()>unidadeDeFlorianopolis.descobrirReceitaTotal() && unidadeDeBlumenau.descobrirReceitaTotal()<unidadeDeJoinville.descobrirReceitaTotal()) {
            System.out.println("A loja de Blumenau teve a segunda maior receita total com " + unidadeDeBlumenau.descobrirReceitaTotal() + " reais faturados");
        } else if (unidadeDeJoinville.descobrirReceitaTotal()>unidadeDeBlumenau.descobrirReceitaTotal() && unidadeDeJoinville.descobrirReceitaTotal()<unidadeDeFlorianopolis.descobrirReceitaTotal()) {
            System.out.println(System.out.println("A loja de Joinville teve a segunda maior receita total com " + unidadeDeJoinville.descobrirReceitaTotal() + " reais faturados");
        }


    }

}
