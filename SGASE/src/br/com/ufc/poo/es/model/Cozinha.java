
import br.com.ufc.poo.es.model.LocalAula;
import java.util.ArrayList;

public class Cozinha extends LocalAula {
    public Cozinha() {
    }
    
    private int[] vagas = new int[15];
    ArrayList<String> ingredientes = new ArrayList();
    ArrayList<String> materiais = new ArrayList();

    public boolean verificaIngredientes(String meterialIngrediente) {
        return ingredientes.contains(meterialIngrediente);
    }
    public boolean verificaMateriais(String meterialProcurado) {
        return materiais.contains(meterialProcurado);
    }

    @Override
    public String toString() {
        return "Cozinha{" + "vagas=" + vagas + ", ingredientes=" + ingredientes + ", materiais=" + materiais + '}';
    }
    
}