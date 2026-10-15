import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Flor> flores;

    public Floricultura() {
        flores = new ArrayList<>();
    }

    public void adicionarFlor (Flor f){
        flores.add(f);
    }

    public List<Flor> obterFloresCompradas(String nomeCliente){
        List<Flor> floresCompradas = new ArrayList<>();

        for (Flor f : flores){
            if (f.getNomeCliente() .equals(nomeCliente)){
                floresCompradas.add(f);
            }

        }
        return floresCompradas;
    }




}
