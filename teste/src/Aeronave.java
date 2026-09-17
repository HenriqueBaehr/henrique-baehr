public class Aeronave {
    private String modelo;
    private int passageiros;
    private double velocidadeMaxima;
    private double capacidadeDeCombustivel;
    private double queimaDeCombustivelPorMinuto;

    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double capacidadeDeCombustivel, double queimaDeCombustivelPorMinuto) {
        setModelo(modelo);
        setPassageiros(passageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setCapacidadeDeCombustivel(capacidadeDeCombustivel);
        setQueimaDeCombustivelPorMinuto(queimaDeCombustivelPorMinuto);
    }

    public double calcularAutonomia(){
        return capacidadeDeCombustivel/queimaDeCombustivelPorMinuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Erro, modelo da aeronave inválida");
        }else {
            this.modelo = modelo;
        }
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        if (passageiros <= 0){
            System.out.println("Erro, número inválido");
        }else {
            this.passageiros = passageiros;
        }
    }

    public double getVelocidadeMaxima() {
            return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima <= 0){
            System.out.println("Erro, número inválido");
        }else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public double getCapacidadeDeCombustivel() {
        return capacidadeDeCombustivel;
    }

    public void setCapacidadeDeCombustivel(double capacidadeDeCombustivel) {
        if (capacidadeDeCombustivel <= 0){
            System.out.println("Erro, número inválido");
        }else {
            this.capacidadeDeCombustivel = capacidadeDeCombustivel;
        }
    }

    public double getQueimaDeCombustivelPorMinuto() {
        return queimaDeCombustivelPorMinuto;
    }

    public void setQueimaDeCombustivelPorMinuto(double queimaDeCombustivelPorMinuto) {
        if (queimaDeCombustivelPorMinuto <= 0){
            System.out.println("Erro, número inválido");
        }else {
            this.queimaDeCombustivelPorMinuto = queimaDeCombustivelPorMinuto;
        }
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
