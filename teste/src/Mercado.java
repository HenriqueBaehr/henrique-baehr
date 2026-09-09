public class Mercado {
    String nome;
    int numeroDeMacasVendidasPorAno;
    double precoDeVendaDasMacas;
    int numeroDeLaranjasVendidasPorAno;
    double precoDeVendaDasLaranjas;
    public  double descobrirReceitaMacas(){
        return (numeroDeMacasVendidasPorAno*precoDeVendaDasMacas);
    }
    public double descobrirReceitaLaranjas(){
        return (numeroDeLaranjasVendidasPorAno*precoDeVendaDasLaranjas);
    }
    public double descobrirReceitaTotal(){
        return (numeroDeMacasVendidasPorAno*precoDeVendaDasMacas+numeroDeLaranjasVendidasPorAno*precoDeVendaDasLaranjas);
    }
}

