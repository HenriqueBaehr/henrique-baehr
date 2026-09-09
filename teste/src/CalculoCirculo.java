public class CalculoCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        Circulo c4 = new Circulo();

        c1.raio = 4.0;
        c2.raio = 1.0;
        c3.raio = 3.0;
        c4.raio = 2.0;

        System.out.println(c1.obterArea());
        System.out.println(c2.obterArea());
        System.out.println(c3.obterArea());
        System.out.println(c4.obterArea());
    }
}
