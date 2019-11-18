
package br.com.ufc.es.poo.model;

import java.util.ArrayList;


public abstract class Artesanato extends CursosOfertados {

    public Atelie local;
    
    public Artesanato( ArrayList<Avaliacao> avaliacoes, ArrayList<Professor> professores,String nome,int cargaHoraria) {
        super( avaliacoes, professores, nome, cargaHoraria);
    }

     public double mediaCurso(ArrayList participantes, AlunoBolsista p){ 
        double mediaGeral = 0;
        for(int i=0; i < participantes.size();i++){
            mediaGeral += p.getMediaAluno();
        }
        return mediaGeral;
    } 
   
     public double getMediaAluno(AlunoBolsista p, double notaTrabalho[], double notaProva[]){
       int i=0; double mediaTrabalho = 0, mediaProva = 0; double mediaFinal;
       for(i = 0; i < notaTrabalho.length; i++){
           mediaTrabalho += (notaTrabalho[i] * 1);
       }
       for(int j = 0; j < notaProva.length; j++){
           mediaProva +=(notaProva[j] * 1) ;
       }
       mediaFinal = (mediaProva + mediaTrabalho)/4;
       return mediaFinal;
    }
    
   
    

}
