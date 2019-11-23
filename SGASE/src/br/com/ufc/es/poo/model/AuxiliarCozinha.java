
package br.com.ufc.es.poo.model;
import java.util.ArrayList;


public class AuxiliarCozinha extends CursosOfertados {

    public Cozinha local;
    public AuxiliarCozinha(String nome,int cargaHoraria) {
        super( nome, cargaHoraria);
    }

   
      public double mediaCurso(ArrayList participantes, AlunoBolsista p){ 
        double mediaGeral = 0;
        for(int i=0; i < participantes.size();i++){
            //mediaGeral += p.getMediaAluno();
        }
        return mediaGeral;
    }
    
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

    @Override
    public double mediaAluno(AlunoBolsista p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
