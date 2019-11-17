
package br.com.ufc.es.poo.model;

import br.com.ufc.br.poo.es.model.Avaliacao;
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
    
    public void getMediaCurso(AlunoBolsista alunos[]){
    
    }
    
    public double getMediaAluno(AlunoBolsista p, double notaTrabalho[], double notaProva[]){
       int i=0; double mediaTrabalho = 0, mediaProva = 0; double mediaFinal;
       for(i = 0; i < notaTrabalho.length; i++){
           mediaTrabalho += (notaTrabalho[i] * 2);
       }
       for(int j = 0; j < notaProva.length; j++){
           mediaProva +=(notaProva[j] * 1) ;
       }
       mediaFinal = (mediaProva + mediaTrabalho)/4;
       return mediaFinal;
    }

    
    @Override
    public String toString() {
        return "InformaticaBasica{" + "local=" + local + '}';
    }
}
