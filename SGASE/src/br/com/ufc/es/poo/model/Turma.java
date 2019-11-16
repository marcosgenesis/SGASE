
package br.com.ufc.es.poo.model;

public class Turma {
    
    public AlunoBolsista alunos [];
    private CursosOfertados curso;
    public Turma(){}
    public Turma(AlunoBolsista[] alunos, CursosOfertados curso) {
        this.alunos = alunos;
        this.curso = curso;
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
    

    
}
