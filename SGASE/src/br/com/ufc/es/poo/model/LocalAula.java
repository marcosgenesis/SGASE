
package br.com.ufc.es.poo.model;


public class LocalAula {

    protected Endereco endereco;
    protected int vagas[]; //30 vagas
    
    public LocalAula(Endereco endereco, int vagas[]) {
        super();
        this.endereco = endereco;
        this.vagas = vagas; //vetor fica assim mesmo?
    }

    public boolean verificaVagas() {
        return false;
    }

    
}
