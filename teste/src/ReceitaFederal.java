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
            throw new IllegalArgumentException("Nome inválido");
        }
            this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11){
            throw new IllegalArgumentException("Cpf inválido");
        }
            this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2){
            throw new IllegalArgumentException("UF inválida");
        }
            this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0){
            throw new IllegalArgumentException("Renda anual inválida");
        }
            this.rendaAnual = rendaAnual;
    }
    private double calcularAliquota(){
        if (rendaAnual <= 4000){
            return 0;
        } else if (rendaAnual <= 9000) {
            return 0.058;
        } else if (rendaAnual <= 25000) {
            return 0.15;
        } else if (rendaAnual <= 35000) {
            return 0.275;
        }else{
            return 0.3;
        }
    }
    public double calcularImposto(){
        return rendaAnual * calcularAliquota();
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
