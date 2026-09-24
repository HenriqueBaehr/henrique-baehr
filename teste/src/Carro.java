
public class Carro {
    private double velocidadeCarro;

    public double getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public void setVelocidadeCarro(double velocidadeCarro) {
        
        this.velocidadeCarro = velocidadeCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeCarro=" + velocidadeCarro +
                '}';
    }
}
