public class Ex4 {
    public static void main(String[] args){

        Produto p1 = new Produto("tigre", "cano pvc", 39.00, 22);
        Produto p2 = new Produto("tigre", "joelho pvc", 12.50, 15);
        Produto p3 = new Produto("amanco", "cano pvc", 35.00, 18);
        Produto p4 = new Produto("krona", "tubo pvc", 28.90, 20);
        Produto p5 = new Produto("tigre", "conexão pvc", 8.50, 30);
        Produto p6 = new Produto("amanco", "registro pvc", 24.90, 12);
        Produto p7 = new Produto("krona", "joelho pvc", 10.00, 25);
        Produto p8 = new Produto("tigre", "luva pvc", 6.90, 40);
        Produto p9 = new Produto("amanco", "cano pvc", 32.00, 16);
        Produto p10 = new Produto("krona", "registro pvc", 19.90, 14);



        Loja l1 = new Loja();

        l1.adicionarProdutos(p1);
        l1.adicionarProdutos(p2);
        l1.adicionarProdutos(p3);
        l1.adicionarProdutos(p4);
        l1.adicionarProdutos(p5);
        l1.adicionarProdutos(p6);
        l1.adicionarProdutos(p7);
        l1.adicionarProdutos(p8);
        l1.adicionarProdutos(p9);
        l1.adicionarProdutos(p10);

        System.out.println(l1.obterProdutoMaisCaro("tigre"));
        System.out.println(l1.obterProdutoDaMesmaMarcaEntreUmIntervaloDePreco("amanco", 20, 40));





    }
}
