public class Aeronave {
    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeDeCombustivel;
    private double queimaDeCombustivelPorMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeDeCombustivel, double queimaDeCombustivelPorMinuto) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
        this.queimaDeCombustivelPorMinuto = queimaDeCombustivelPorMinuto;
    }

    public double calcularAutonomia(){
        return capacidadeDeCombustivel/queimaDeCombustivelPorMinuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getCapacidadeDeCombustivel() {
        return capacidadeDeCombustivel;
    }

    public void setCapacidadeDeCombustivel(double capacidadeDeCombustivel) {
        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
    }

    public double getQueimaDeCombustivelPorMinuto() {
        return queimaDeCombustivelPorMinuto;
    }

    public void setQueimaDeCombustivelPorMinuto(double queimaDeCombustivelPorMinuto) {
        this.queimaDeCombustivelPorMinuto = queimaDeCombustivelPorMinuto;
    }

    public double calcularDistanciaMaxima(){
        return calcularAutonomia() * velocidadeMaxima;
    }


    @Override
    public String toString() {
        return "Aeronave{" +
                "modelo='" + modelo + '\'' +
                ", passageiros=" + passageiros +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", capacidadeDeCombustivel=" + capacidadeDeCombustivel +
                ", queimaDeCombustivelPorMinuto=" + queimaDeCombustivelPorMinuto +
                '}';
    }
}
