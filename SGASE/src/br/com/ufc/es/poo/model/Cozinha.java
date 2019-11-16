
package br.com.ufc.es.poo.model;
import java.util.ArrayList;
public class Cozinha extends LocalAula {

    private int vagas[]; //15 vagas
    private ArrayList<String> ingredientes;
    private ArrayList<String> materiais;

    public Cozinha(Endereco endereco, int vagas[],ArrayList<String> ingredientes, ArrayList<String> materiais) {
        super( endereco, vagas);
        this.vagas = vagas;
        this.ingredientes = ingredientes;
        this.materiais = materiais;
    }

    public boolean verificaIngredientes() {
        return false;
    }

    public boolean verificaMateriais() {
        return false;
    }
    
}
