public class Ex2 {
    public static void main(String[] args){

        Flor f1 = new Flor("Rosa", 67, "Fibeas");
        Flor f2 = new Flor("Tulipa", 45, "João");
        Flor f3 = new Flor("Girassol", 32, "Maria");
        Flor f4 = new Flor("Orquídea", 58, "Pedro");
        Flor f5 = new Flor("Margarida", 24, "Fibeas");

        Floricultura l1 = new Floricultura();

        l1.adicionarFlor(f1);
        l1.adicionarFlor(f2);
        l1.adicionarFlor(f3);
        l1.adicionarFlor(f4);
        l1.adicionarFlor(f5);

        System.out.println(l1.obterFloresCompradas("Fibeas"));

    }
}
