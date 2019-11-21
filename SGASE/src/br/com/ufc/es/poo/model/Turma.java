
package br.com.ufc.es.poo.model;

import java.util.ArrayList;

public class Turma {
    
    public AlunoBolsista alunos [];
    private CursosOfertados curso;
    private double mediaGeralTurma;
    private ArrayList<AlunoBolsista> participantes;
    private Professor professores[];
    private int identificacao;
   
    public Turma(){
        //
    }

    public Turma(CursosOfertados curso,int identificacao) {
        this.curso = curso;
        this.mediaGeralTurma = 0;
        this.identificacao = identificacao;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professorNovo, int index) {
        this.professores[index] = professorNovo;
    }
    public boolean getProfessor(Professor professorProcurado) {
        boolean achou = false;
        for (Professor professor : professores) {
            if(professor.getCpf().equals(professorProcurado.getCpf())) achou=true;
        } 
        return achou;
    }

    public void setProfessor(Professor[] professores) {
        this.professores = professores;
    }
    public ArrayList<AlunoBolsista> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<AlunoBolsista> participantes) {
        this.participantes = participantes;
    }
    
    public AlunoBolsista[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoBolsista[] alunos) {
        this.alunos = alunos;
    }

    public double getMediaGeralTurma() {
        return mediaGeralTurma;
    }

    public void setMediaGeralTurma(double mediaGeralTurma) {
        this.mediaGeralTurma = mediaGeralTurma;
    }

    public AlunoBolsista[] getAllAlunos() {
        return alunos;
    }

    public AlunoBolsista getAluno(int index) {
        return alunos[index];
    }

    public void setAluno(AlunoBolsista alunoNovo, int index) {
        this.alunos[index] = alunoNovo;
    }
    
    public void setAllAlunos(AlunoBolsista[] alunos) {
        this.alunos = alunos;
    }

    public CursosOfertados getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Turma{" + "alunos=" + alunos + ", curso=" + curso + ", mediaGeralTurma=" + mediaGeralTurma + ", participantes=" + participantes + '}';
    }

  

   
    

    
}
