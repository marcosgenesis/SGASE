
package br.com.ufc.es.poo.model;
import java.util.ArrayList;

public class Projeto {

    private String nome;
    private CursosOfertados areaDeConhecimento;
    private ArrayList<AlunoBolsista> alunos;
    private Professor professorOrientador;
    
    public Projeto(String nome, CursosOfertados areaDeConhecimento, ArrayList<AlunoBolsista> alunos, Professor professorOrientador) {
        this.nome = nome;
        this.areaDeConhecimento = areaDeConhecimento;
        this.alunos = alunos;
        this.professorOrientador = professorOrientador;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CursosOfertados getAreaDeConhecimento() {
        return areaDeConhecimento;
    }

    public void setAreaDeConhecimento(CursosOfertados areaDeConhecimento) {
        this.areaDeConhecimento = areaDeConhecimento;
    }

    public ArrayList<AlunoBolsista> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoBolsista> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessorOrientador() {
        return professorOrientador;
    }

    public void setProfessorOrientador(Professor professorOrientador) {
        this.professorOrientador = professorOrientador;
    }
@Override
    public String toString() {
        return "Projeto{" + "nome=" + nome + ", areaDeConhecimento=" + areaDeConhecimento + ", alunos=" + alunos + ", professorOrientador=" + professorOrientador + '}';
    }

   
}
