import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos;

    public Loja(){
        produtos = new ArrayList<>();
    }

    public void adicionarProdutos (Produto p){
        produtos.add(p);
    }

    public Produto obterProdutoMaisCaro(String marca){

        double maiorPreco = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;

        for (Produto p : produtos){
            if (p.getMarca().equals(marca)) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public List<Produto> obterProdutoDaMesmaMarcaEntreUmIntervaloDePreco(String marca, double precoMinimo, double precoMaximo){

        List<Produto> produtosDaMesmaMarcaComPrecosParecidos = new ArrayList<>();

        for (Produto p : produtos){
            if (p.getMarca() .equals(marca)){
                if (p.getPreco() >= precoMinimo){
                    if (p.getPreco() <= precoMaximo){
                        produtosDaMesmaMarcaComPrecosParecidos.add(p);
                    }
                }
            }
        }
        return produtosDaMesmaMarcaComPrecosParecidos;
    }


}
