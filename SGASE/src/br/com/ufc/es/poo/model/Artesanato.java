
package br.com.ufc.es.poo.model;

import java.util.ArrayList;


public class Artesanato extends CursosOfertados {

    public Atelie local;
    public Artesanato(String nome,int cargaHoraria) {
        super(nome, cargaHoraria);
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

    @Override
    public double mediaAluno(AlunoBolsista p) {
        double media = (p.getNotaProva(0) + p.getNotaProva(1) + p.getNotaTrabalho(0) + p.getNotaTrabalho(1))/p.notaProva.length + p.notaTrabalho.length;
        return media;
    }
    

}
