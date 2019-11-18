
package br.com.ufc.es.poo.model;
import br.com.ufc.es.poo.model.AlunoBolsista;
import java.util.ArrayList;
import java.util.Date;

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
 
   
   public void cadastraNotaProva(AlunoBolsista p, double notaProva[], double nota1, double nota2){ //alimenta o vetor de provas
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
 
   public boolean verificaFrequencia(AlunoBolsista p,FrequenciaRemunerada frequenciaRemunerada[], Professor x, Date mesAtual){ //professor passado na main, dataatual bm vai ser lido na mian tbm
        for(int i = 0; i < frequenciaRemunerada.length;i++){
           if(frequenciaRemunerada[i].getNomeBolsista().equals(p.getNome())){
                frequenciaRemunerada[i].setAutenticacaoProfessor(true);
           }else if(frequenciaRemunerada[i].getCurso().equals(p.getCursoMatriculado())){
                frequenciaRemunerada[i].setAutenticacaoProfessor(true);
           }else if(frequenciaRemunerada[i].getProfessor().equals(x.getNome())){ //comparando o professor de frequencia remunerada com o  
                frequenciaRemunerada[i].setAutenticacaoProfessor(true);
           }else if(frequenciaRemunerada[i].getMesReferente().equals(mesAtual)){
                frequenciaRemunerada[i].setAutenticacaoProfessor(true);
           }
       }
       return false;
   }
   
      public double mediaTurma(ArrayList participantes, AlunoBolsista p){ //método concreto
        double mediaGeral = 0;
        for(int i=0; i < participantes.size();i++){
            mediaGeral += p.getMediaAluno();
        }
        p.setMediaTurma(mediaGeral);
        return mediaGeral;
    }
   
    
}
