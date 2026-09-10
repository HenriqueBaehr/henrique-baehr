public class Mercado {
    String nome;
    int numeroDeMacasVendidasPorAno;
    double precoDeVendaDasMacas;
    int numeroDeLaranjasVendidasPorAno;
    double precoDeVendaDasLaranjas;

    public  double calcularReceitaMacas(){
        return (numeroDeMacasVendidasPorAno*precoDeVendaDasMacas);
    }
    public double calcularReceitaLaranjas(){
        return (numeroDeLaranjasVendidasPorAno*precoDeVendaDasLaranjas);
    }
    public double calcularReceitaTotal(){
        return (calcularReceitaMacas()+calcularReceitaLaranjas());
    }


    @Override
    public String toString() {
        return "Mercado{" +
                "nome='" + nome + '\'' +
                ", numeroDeMacasVendidasPorAno=" + numeroDeMacasVendidasPorAno +
                ", precoDeVendaDasMacas=" + precoDeVendaDasMacas +
                ", numeroDeLaranjasVendidasPorAno=" + numeroDeLaranjasVendidasPorAno +
                ", precoDeVendaDasLaranjas=" + precoDeVendaDasLaranjas +
                '}';
    }
}

