
package br.com.ufc.es.poo.model;

import java.util.ArrayList;

public class Turma {
    
    public AlunoBolsista alunos [];
    private CursosOfertados curso;
    private double mediaGeralTurma;
    private ArrayList<AlunoBolsista> participantes;

   
    public Turma(){
        //
    }

    public Turma(AlunoBolsista[] alunos, CursosOfertados curso, double mediaGeralTurma, ArrayList<AlunoBolsista> participantes) {
        this.alunos = alunos;
        this.curso = curso;
        this.mediaGeralTurma = mediaGeralTurma;
        this.participantes = participantes;
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
