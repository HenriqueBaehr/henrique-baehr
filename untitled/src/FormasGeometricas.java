import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {


    private List<Retangulo> retangulos;

    public FormasGeometricas(){
        retangulos = new ArrayList<>();
    }

    public void adicionarRetangulo(Retangulo r){
        retangulos.add(r);

    }

    public Retangulo obterRetanguloComMaiorPerimetro(){

        double maiorPerimetro = Double.MIN_VALUE;
        Retangulo RetanguloComMaiorPerimetro = null;

        for (Retangulo r : retangulos){
            if (r.obterPerimetro() > maiorPerimetro){
                maiorPerimetro = r.obterPerimetro();
                RetanguloComMaiorPerimetro = r;
            }
        }
        return RetanguloComMaiorPerimetro;
    }

    public Retangulo obterRetanguloComMaiorArea(){

        double maiorArea = Double.MIN_VALUE;
        Retangulo RetanguloComMaiorArea = null;

        for (Retangulo r : retangulos){
            if (r.obterArea() > maiorArea){
                maiorArea = r.obterArea();
                RetanguloComMaiorArea = r;
            }
        }
        return RetanguloComMaiorArea;
    }
}
