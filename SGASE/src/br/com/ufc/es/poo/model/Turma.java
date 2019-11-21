
package br.com.ufc.es.poo.model;

import java.util.ArrayList;

public class Turma {
    
    public AlunoBolsista alunos [];
    private CursosOfertados curso;
    private double mediaGeralTurma;
    private ArrayList<AlunoBolsista> participantes = new ArrayList();
    private Professor professores[];
    private int identificacao;
    private int numeroAlunos = 0;
    public Turma(){
    }
    public Turma(int identificacao,CursosOfertados curso) {
        this.mediaGeralTurma = 0;
        this.curso = curso;
        this.identificacao = identificacao;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
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
        return participantes.get(index);
    }

    public void setAluno(AlunoBolsista alunoNovo) {
        participantes.add(alunoNovo);
    }
    
    public void setAllAlunos(AlunoBolsista[] alunos) {
        this.alunos = alunos;
    }

    public String getCurso() {
        return this.curso.getNome();
    }

    @Override
    public String toString() {
        return "Turma{" + "alunos=" + alunos + ", curso=" + curso + ", mediaGeralTurma=" + mediaGeralTurma + ", participantes=" + participantes + '}';
    }

  

   
    

    
}
