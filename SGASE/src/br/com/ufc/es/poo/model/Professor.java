
package br.com.ufc.es.poo.model;
import br.com.ufc.es.poo.model.AlunoBolsista;

public class Professor extends Usuario {

 
    public Professor(String cpf, int id, String email, String nome) {
        super(cpf, id, email, nome);
    }

    public int totalFalta(AlunoBolsista p){
        int i = 0, j =0; int totalFaltas = 0;
        for(i =0; i < p.faltas.length ;i++){
            p.faltas[i] += 2;
        }
        for(j = 0; j < p.faltas.length; j ++){
            totalFaltas += p.faltas[i];
        }
        return totalFaltas;
    }
    
    public int totalPresenca(AlunoBolsista p){
        int i = 0, j = 0; int totalPresenca = 0;
         for(i=0; i < p.presenca.length; i++){
             p.presenca[i] += 2;
        }
         for(j = 0; j < p.presenca.length; j ++){
            totalPresenca += p.presenca[i];
        }
        return totalPresenca;
    }
 
   
   public void cadastraNotaProva(AlunoBolsista p, double notaProva[], double nota1, double nota2){
       int i = 0;
       for(i =0; i < notaProva.length; i++){
           notaProva[i] = nota1;
           notaProva[i + 1] = nota2;
       }
   }
   public void cadastraNotaTrabalho(AlunoBolsista p, double notaTrabalho[],double trabalho1, double trabalho2){
       int i = 0;
       for(i =0; i < notaTrabalho.length ; i++){
           notaTrabalho[i] = trabalho1;
           notaTrabalho[i + 1] = trabalho2;
       }
   }
   public void mediaAluno(AlunoBolsista p, double notaTrabalho[], double notaProva[]){
       int i=0; double mediaTrabalho = 0, mediaProva = 0;
       for(i = 0; i < notaTrabalho.length; i++){
           mediaTrabalho += notaTrabalho[i];
       }
       for(int j = 0; j < notaProva.length; j++){
           mediaProva += notaProva[i];
       }
       System.out.println("A media das provas eh" +mediaProva+ "e a media dos trabalhos eh" +mediaTrabalho);
   }   
   

}
