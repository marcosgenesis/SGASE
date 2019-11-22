
package br.com.ufc.es.poo.model;
import java.util.ArrayList;


public abstract class CursosOfertados {

    
    private ArrayList<Professor> professores;
    private String nome;
    private int cargaHoraria;
 
    public CursosOfertados(String nome,int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }



    public ArrayList<Professor> getProfessores() {
        return professores;
    }/*
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
    }*/
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
    
    
    public abstract double mediaAluno(AlunoBolsista p); //métoo abstrato

    @Override
    public String toString() {
        return "CursosOfertados{" + "professores=" + professores + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
          
    
      
     
 


    
    
}
