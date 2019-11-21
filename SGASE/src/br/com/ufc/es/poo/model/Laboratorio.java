
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
    
    public int verificaComputadores(boolean computadorLivre) { //metodo
        int cont = 0 ;
        for(int i=0; i < 30; i++){
            computadores.add(i);
            cont ++;  
        }
       return cont;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "computadores=" + computadores + ", computadorlivre=" + computadorlivre + '}';
    }

    
}
