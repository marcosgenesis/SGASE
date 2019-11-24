
package br.com.ufc.es.poo.model;

import java.util.ArrayList;
import br.com.ufc.es.poo.model.Turma;

public class InformaticaBasica extends CursosOfertados {

    public Laboratorio local;
    
    
    public InformaticaBasica(String nome,int cargaHoraria) {
        super (nome, cargaHoraria);
        //this.local = local;
    }

  
    public Laboratorio getLocal() {
        return local;
    }

    public void setLocal(Laboratorio local) {
        this.local = local;
    }

    public double getMediaAluno(AlunoBolsista p, double notaTrabalho[], double notaProva[]){ //método abstrato
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

    @Override
    public double mediaAluno(AlunoBolsista p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
