public class Flor {
    private String nomeDaFlor;
    private double precoDaFlor;
    private String nomeCliente;

    public Flor(String nomeDaFlor, double precoDaFlor, String nomeCliente) {
        setNomeDaFlor(nomeDaFlor);
        setPrecoDaFlor(precoDaFlor);
        setNomeCliente(nomeCliente);
    }

    public String getNomeDaFlor() {
        return nomeDaFlor;
    }

    public void setNomeDaFlor(String nomeDaFlor) {
        if (nomeDaFlor == null || nomeDaFlor.isBlank()){
            System.out.println("Erro, nome de flor inválido");
        }else {
            this.nomeDaFlor = nomeDaFlor;
        }
    }

    public double getPrecoDaFlor() {
        return precoDaFlor;
    }

    public void setPrecoDaFlor(double precoDaFlor) {
        if (precoDaFlor <= 0){
            throw new IllegalArgumentException("Preço inválido");
        }else {
            this.precoDaFlor = precoDaFlor;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()){
            System.out.println("Erro, nome de cliente inválido");
        }else {
            this.nomeCliente = nomeCliente;
        }
    }

    @Override
    public String toString() {
        return "Flor{" +
                "nomeDaFlor='" + nomeDaFlor + '\'' +
                ", precoDaFlor=" + precoDaFlor +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}