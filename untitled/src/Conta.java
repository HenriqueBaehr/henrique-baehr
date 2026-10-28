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
        if (saldo < saque){
            throw new IllegalArgumentException("Erro, quantidade de saque inválido");
        }else{
            saldo = saldo - saque;
        }
    }

    public void depositarValor(double deposito){
        if (deposito <= 0){
            throw new IllegalArgumentException("Erro, valor depositado inválido");
        }else{
            saldo = saldo + deposito;
        }
    }

    public void transferirValor(double transferir){
        if (saldo < transferir){
            throw new IllegalArgumentException("Erro, quantidade de transferência inválida");
        }else{
            saldo = saldo - transferir;
        }
    }



}
