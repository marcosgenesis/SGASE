
package br.com.ufc.es.poo.model;

import java.util.ArrayList;


public abstract class Artesanato extends CursosOfertados {

    public Atelie local;
    public Artesanato(ArrayList<AlunoBolsista> participantes, ArrayList<Avaliacao> avaliacoes, ArrayList<Professor> professores,String nome,int cargaHoraria) {
        super(participantes, avaliacoes, professores, nome, cargaHoraria);
    }

    
    public abstract void mediaCurso();
    
    //public abstract void mediaCurso();
    

}
