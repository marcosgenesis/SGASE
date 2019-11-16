
package br.com.ufc.es.poo.model;
import java.util.ArrayList;

public abstract class AuxiliarCozinha extends CursosOfertados {

    public Cozinha local;
    public AuxiliarCozinha(ArrayList<AlunoBolsista> participantes, ArrayList<Avaliacao> avaliacoes, ArrayList<Professor> professores,String nome,int cargaHoraria, Cozinha local) {
        super(participantes, avaliacoes, professores, nome, cargaHoraria);
    }

   
    public abstract void mediaCurso();
    //public abstract void mediaCurso();
}
