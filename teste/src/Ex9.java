public class Ex9 {
    public static void main(String[] args) {
        Carro c1 = new Carro(50);

        System.out.println(c1.getVelocidadeCarro());

        c1.acelerar(5);

        System.out.println(c1.getVelocidadeCarro());

        c1.reduzir(15);

        System.out.println(c1.getVelocidadeCarro());

    }
}
