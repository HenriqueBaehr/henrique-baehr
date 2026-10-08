public class Ex1 {
    public static void main(String[] args){

        Retangulo r1 = new Retangulo(10, 5);

        Retangulo r2 = new Retangulo(8, 4);

        Retangulo r3 = new Retangulo(12, 6);

        Retangulo r4 = new Retangulo(15, 7);

        Retangulo r5 = new Retangulo(20, 10);

        FormasGeometricas f1 = new FormasGeometricas();

        f1.adicionarRetangulo(r1);
        f1.adicionarRetangulo(r2);
        f1.adicionarRetangulo(r3);
        f1.adicionarRetangulo(r4);
        f1.adicionarRetangulo(r5);

        System.out.println(f1.obterRetanguloComMaiorArea());

        System.out.println(f1.obterRetanguloComMaiorPerimetro());





    }
}
