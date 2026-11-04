public class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()){
            throw new IllegalArgumentException("Erro, nome de titualr inválido");
        }else {
            this.nomeTitular = nomeTitular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            throw new IllegalArgumentException("Saldo inválido");
        }else {
            this.saldo = saldo;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacarValor(double saque){
        if (saldo < saque || saque <= 0){
            throw new IllegalArgumentException("Erro, quantidade de saque inválido");
        }
            saldo = saldo - saque;
    }

    public void depositarValor(double deposito){
        if (deposito <= 0){
            throw new IllegalArgumentException("Erro, valor depositado inválido");
        }
            saldo = saldo + deposito;
    }

    public void transferirValor(double transferencia, Conta contaDestino){
        if (saldo < transferencia || transferencia <= 0 || contaDestino == null){
            throw new IllegalArgumentException("Erro, quantidade de transferência inválida");
        }
        saldo -= transferencia;
        contaDestino.saldo += transferencia;
    }

    public double simularInvestimento(double valorInvestido, int tempo){
        if (valorInvestido <= 0 || tempo <= 0){
            throw new IllegalArgumentException("Erro, tempo ou valor inválido");
        }
        double montante = valorInvestido*Math.pow(1.01, tempo);
        return montante;
    }




}
