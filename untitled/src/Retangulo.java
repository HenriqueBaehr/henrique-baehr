public class Retangulo {
    private double altura;
    private double largura;


    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Altura inválida");
        }else{
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0){
            throw new IllegalArgumentException("Largura inválida");
        }else {
            this.largura = largura;
        }
    }


    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }

    public double obterPerimetro(){
        double perimetro = 2*(altura+largura);
        return perimetro;
    }

    public double obterArea(){
        double area = altura*largura;
        return area;
    }
}
