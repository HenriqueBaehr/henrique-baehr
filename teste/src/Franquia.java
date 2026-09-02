public class Franquia {
    public static void main(String[] args) {
        Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nome = "Cooper";
        unidadeDeBlumenau.numeroDeMacasVendidasPorAno = 100000;
        unidadeDeBlumenau.precoDeVendaDasMacas = 3;
        unidadeDeBlumenau.numeroDeLaranjasVendidasPorAno = 50000;
        unidadeDeBlumenau.PrecoDeVendaDasLaranjas = 2;

        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nome = "Super A";
        unidadeDeJoinville.numeroDeMacasVendidasPorAno = 200000;
        unidadeDeJoinville.precoDeVendaDasMacas = 2;
        unidadeDeJoinville.numeroDeLaranjasVendidasPorAno = 40000;
        unidadeDeJoinville.PrecoDeVendaDasLaranjas = 4;

        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nome = "Atacadão";
        unidadeDeFlorianopolis.numeroDeMacasVendidasPorAno = 300000;
        unidadeDeFlorianopolis.precoDeVendaDasMacas = 1;
        unidadeDeFlorianopolis.numeroDeLaranjasVendidasPorAno = 30000;
        unidadeDeFlorianopolis.PrecoDeVendaDasLaranjas = 3;

        System.out.println("O mercado " +unidadeDeBlumenau.nome+ " vendeu " +unidadeDeBlumenau.numeroDeMacasVendidasPorAno+ " maças por ano a um preço de " +unidadeDeBlumenau.precoDeVendaDasMacas+ " reais e " +unidadeDeBlumenau.numeroDeLaranjasVendidasPorAno+ " laranjas por ano a um preço de " +unidadeDeBlumenau.PrecoDeVendaDasLaranjas+ " reais");
        System.out.println("O mercado " +unidadeDeJoinville.nome+ " vendeu " +unidadeDeJoinville.numeroDeMacasVendidasPorAno+ " maças por ano a um preço de " +unidadeDeJoinville.precoDeVendaDasMacas+ " reais e " +unidadeDeJoinville.numeroDeLaranjasVendidasPorAno+ " laranjas por ano a um preço de " +unidadeDeJoinville.PrecoDeVendaDasLaranjas+ " reais");
        System.out.println("O mercado " +unidadeDeFlorianopolis.nome+ " vendeu " +unidadeDeFlorianopolis.numeroDeMacasVendidasPorAno+ " maças por ano a um preço de " +unidadeDeFlorianopolis.precoDeVendaDasMacas+ " reais e " +unidadeDeFlorianopolis.numeroDeLaranjasVendidasPorAno+ " laranjas por ano a um preço de " +unidadeDeFlorianopolis.PrecoDeVendaDasLaranjas+ " reais");


    }
}
