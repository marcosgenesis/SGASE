
package br.com.ufc.es.poo.model;
import br.com.ufc.br.poo.es.model.Avaliacao;
import java.util.ArrayList;


public abstract class CursosOfertados {

    private ArrayList<AlunoBolsista> participantes;
    private ArrayList<Avaliacao> avaliacoes;
    private ArrayList<Professor> professores;
    private String nome;
    private int cargaHoraria;
 
    public CursosOfertados(ArrayList<AlunoBolsista> participantes, ArrayList<Avaliacao> avaliacoes, ArrayList<Professor> professores,String nome,int cargaHoraria) {
        this.participantes = participantes;
        this.avaliacoes = avaliacoes;
        this.professores = professores;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

   
    public ArrayList<AlunoBolsista> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<AlunoBolsista> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public Professor getProfessor(int index) {
        for(Professor u : professores) {
            if (u.getId() == index) {
               return u;
            }
         }
        return professores.get(index);
    }
    public void setProfessor(Professor professorNovo,Professor professorAntigo) {
        this.professores.remove(professorAntigo.getId());
        this.professores.add(professorNovo);
    }
    public void addProfessor(Professor professorNovo){
        this.professores.add(professorNovo);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public  void mediaCurso(){
        
    }
    
    public abstract double mediaAluno(AlunoBolsista p, double notaTrabalho[], double notaProva[]);
    
      
     
    @Override
    public String toString() {
        return "CursosOfertados{" + "participantes=" + participantes + ", avaliacoes=" + avaliacoes + ", professores=" + professores + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + '}';
    }


    
    
}
