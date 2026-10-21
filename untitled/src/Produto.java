public class Produto {
    private String marca;
    private  String modelo;
    private double preco;
    private int quantidade;

    public Produto(String marca, String modelo, double preco, int quantidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Erro, marca inválida");
        }else{
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Erro, nome de aluno inválido");
        }else{
            this.modelo = modelo;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0 ){
            throw new IllegalArgumentException("Erro, preço inválido");
        }else {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0 ){
            throw new IllegalArgumentException("Erro, quantidade inválida");
        }else {
            this.quantidade = quantidade;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void aumentarQuantidadeDoEstoque(int aumento){
        quantidade = quantidade + aumento;
    }

    public void diminuirQuantidadeDoEstoque(int quantidadeDeVenda){
        if (quantidade >= quantidadeDeVenda){
            quantidade = quantidade - quantidadeDeVenda;
        }else{
            throw new IllegalArgumentException("Erro, quantidade de venda inválida");
        }
    }
}
