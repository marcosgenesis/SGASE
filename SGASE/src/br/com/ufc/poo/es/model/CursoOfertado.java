
package br.com.ufc.poo.es.model;

import java.util.ArrayList;

public abstract class CursoOfertado {
    
    private String nome;
    private int cargaHoraria;
    private Aluno alunos[];
    private Avaliacao avaliacoes[];
    private Professor professores[];
    public CursoOfertado() {
    }

    public CursoOfertado(String nome, int cargaHoraria, Aluno[] alunos, Avaliacao[] avaliacoes, Professor[] professores) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
        this.avaliacoes = avaliacoes;
        this.professores = professores;
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

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    @Override
    public String toString() {
        return "CursoOfertado{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", alunos=" + alunos + ", avaliacoes=" + avaliacoes + ", professores=" + professores + '}';
    }
    
    
}