public class ReceitaFederal {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public ReceitaFederal(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("Erro, formato de nome inválido");
        }else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()){
            System.out.println("Erro, formato de cpf inválido");
        }else {
            this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()){
            System.out.println("Erro, formato de uf inválido");
        }else {
            this.uf = uf;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual <= 0){
            System.out.println("Erro, valor de renda anual inválido");
        }else {
            this.rendaAnual = rendaAnual;
        }
    }
    public double calcularImposto(){
        if (rendaAnual <= 4000){
            return rendaAnual;
        } else if (rendaAnual <= 9000) {
            return (rendaAnual * 5.8)/100;
        } else if (rendaAnual <= 25000) {
            return (rendaAnual * 15)/100;
        } else if (rendaAnual <= 35000) {
            return (rendaAnual * 27.5)/100;
        }else{
            return (rendaAnual * 30)/100;
        }
    }

    public double calcularSalarioLiquido(){
        return rendaAnual-calcularImposto();
    }

    @Override
    public String toString() {
        return "ReceitaFederal{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", rendaAnual=" + rendaAnual +
                '}';
    }
}
