
package br.com.ufc.es.poo.model;
import br.com.ufc.es.poo.model.AlunoBolsista;

public class Professor extends Usuario {

 
    public Professor(String cpf, int id, String email, String nome) {
        super(cpf, id, email, nome);
    }

    public void falta(AlunoBolsista p){
        int i = 0;
        for(i =0; i < p.faltas.length ;i++){
            p.presenca[i] += 2;
        }
    }
    
    public void presenca(AlunoBolsista p){
        int i = 0;
         for(i=0; i < p.presenca.length; i++){
             p.presenca[i] += 2;
        }
    }
 
   
   public void cadastraNotaProva(AlunoBolsista p, double notaProva[], double nota1, double nota2){
       int i = 0;
       for(i =0; i < notaProva.length; i++){
           notaProva[i] = nota1;
           notaProva[i + 1] = nota2;
       }
   }

    
}
