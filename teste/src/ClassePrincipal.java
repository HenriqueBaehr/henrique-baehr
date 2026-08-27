public class ClassePrincipal {
    public static void main(String[] args) {
    Veiculo v1 = new Veiculo();
    v1.marca = "Honda";
    v1.modelo = "Civic";
    v1.placa = "xxx1xx11";
    v1.ano = 2010;
    v1.preco = 50000;

        System.out.println(v1.marca+" "+v1.modelo);

        Veiculo v2 = new Veiculo();
        v2.marca = "Volkswagen";
        v2.modelo = "Gol";
        v2.placa = "XX2X2X12";
        v2.ano = 2015;
        v2.preco = 30000;

        System.out.println(v2.marca + " " + v2.modelo);
    }
}
