
public class Carro {
    private double velocidadeCarro;

    public Carro(double velocidadeCarro) {
        setVelocidadeCarro(velocidadeCarro);
    }

    public void acelerar(double aceleracao){
        if (aceleracao < 0 || aceleracao >= 20){
            throw new IllegalArgumentException("Aceleração inválida");
        }
        setVelocidadeCarro(velocidadeCarro + aceleracao);
    }

    public void reduzir(double reducao){
        if (reducao<0 || reducao >= 30){
            throw new IllegalArgumentException("Redução inválida");
        }

        setVelocidadeCarro(velocidadeCarro - reducao);

    }






    public double getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public void setVelocidadeCarro(double velocidadeCarro) {
        if(velocidadeCarro < 0){
            throw new IllegalArgumentException("velocidade não pode ser negativa");
        }
        this.velocidadeCarro = velocidadeCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeCarro=" + velocidadeCarro +
                '}';
    }
}
