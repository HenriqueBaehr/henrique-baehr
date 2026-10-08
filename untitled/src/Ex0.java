public class Ex0 {
    public static void main(String[] args){

        Veiculo v1 = new Veiculo("Honda", "Civic", "XXX1X11", 2010, 45000);

        Veiculo v2 = new Veiculo("Mazda", "Mx3", "ABCDEF1", 1997, 50000);

        Veiculo v3 = new Veiculo("Toyota", "Corolla", "DEF2G22", 2015, 60000);

        Veiculo v4 = new Veiculo("Volkswagen", "Golf", "GHI3H33", 2012, 55000);

        Veiculo v5 = new Veiculo("Ford", "Focus", "JKL4I44", 2018, 70000);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println(c1.obterVeiculoMaisBarato());

        Concessionaria c2 = new Concessionaria();
        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);
        c2.adicionarVeiculo(v5);

        System.out.println(c2.obterVeiculoMaisBarato());


    }
}
