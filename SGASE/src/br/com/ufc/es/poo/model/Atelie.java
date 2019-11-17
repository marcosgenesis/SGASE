
package br.com.ufc.es.poo.model;
import java.util.ArrayList;


public class Atelie extends LocalAula {
  
    private int vagas []  = new int [10]; //10 vagas   
    private ArrayList<String> materiais ;

    public Atelie(Endereco endereco, int vagas[]) {
        super(endereco,  vagas);
        this.vagas = vagas;
        this.materiais = materiais;
    }

    public int[] getVagas() { 
        return vagas;
    }

 
    public void setVagas(int[] vagas) {
        this.vagas = vagas;
    }

    public ArrayList<String> getMateriais() {
        return materiais;
    }

    public void setMateriais(ArrayList<String> materiais) {
        this.materiais = materiais;
    }

    public boolean verificaMateriais() { //método
        // TODO implement here
        return false;
    }
    
       @Override
    public String toString() {
        return "Atelie{" + "vagas=" + vagas + ", materiais=" + materiais + '}';
    }

}
