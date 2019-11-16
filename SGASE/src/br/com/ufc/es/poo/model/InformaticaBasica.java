
package br.com.ufc.es.poo.model;

import java.util.ArrayList;


public abstract class InformaticaBasica extends CursosOfertados {

    public Laboratorio local;
    public InformaticaBasica(ArrayList<AlunoBolsista> participantes, ArrayList<Avaliacao> avaliacoes, ArrayList<Professor> professores,String nome,int cargaHoraria, Laboratorio local) {
        super (participantes,  avaliacoes,  professores, nome, cargaHoraria);
        this.local = local;
    }

    public Laboratorio getLocal() {
        return local;
    }

    public void setLocal(Laboratorio local) {
        this.local = local;
    }

    public abstract void mediaCurso(); //método
    //public abstract void mediaCurso();

    
    @Override
    public String toString() {
        return "InformaticaBasica{" + "local=" + local + '}';
    }
}
