
package br.com.ufc.es.poo.model;
import br.com.ufc.br.poo.es.model.Avaliacao;
import java.util.ArrayList;

public abstract class AuxiliarCozinha extends CursosOfertados {

    public Cozinha local;
    public AuxiliarCozinha(ArrayList<AlunoBolsista> participantes, ArrayList<Avaliacao> avaliacoes, ArrayList<Professor> professores,String nome,int cargaHoraria, Cozinha local) {
        super(participantes, avaliacoes, professores, nome, cargaHoraria);
    }

   
    /*public double mediaCurso(){
        
    }*/
    
    public double getMediaAluno(AlunoBolsista p, double notaTrabalho[], double notaProva[]){
       int i=0; double mediaTrabalho = 0, mediaProva = 0; double mediaFinal;
       for(i = 0; i < notaTrabalho.length; i++){
           mediaTrabalho += (notaTrabalho[i] * 1);
       }
       for(int j = 0; j < notaProva.length; j++){
           mediaProva +=(notaProva[j] * 2) ;
       }
       mediaFinal = (mediaProva + mediaTrabalho)/4;
       return mediaFinal;
    }
    
}
