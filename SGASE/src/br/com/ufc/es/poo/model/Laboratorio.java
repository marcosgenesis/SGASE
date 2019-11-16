
package br.com.ufc.es.poo.model;
import java.util.ArrayList;


public class Laboratorio extends LocalAula {

    private ArrayList<Integer> computadores;
    private boolean computadorlivre;
    
    public Laboratorio(Endereco endereco, int vagas[], ArrayList<Integer>computadores, boolean computadorLivre) {
        super( endereco,  vagas);
        computadores = new ArrayList();
    }


    public ArrayList<Integer> getComputadores() {
        return computadores;
    }

    public void setComputadores(ArrayList<Integer> computadores) {
        this.computadores = computadores;
    }

    public boolean isComputadorlivre() {
        return computadorlivre;
    }

    public void setComputadorlivre(boolean computadorlivre) {
        this.computadorlivre = computadorlivre;
    }
    
    public boolean verificaComputadores() { //metodo
        // TODO implement here
        return false;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "computadores=" + computadores + ", computadorlivre=" + computadorlivre + '}';
    }

    
}
