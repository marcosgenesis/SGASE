package br.com.ufc.poo.es.model;


public abstract class AuxiliarCozinha extends CursoOfertado {
    
    private Cozinha local;
    public AuxiliarCozinha() {
    }
    public AuxiliarCozinha(String nome, int cargaHoraria, Aluno[] alunos, Avaliacao[] avaliacoes, Professor[] professores) {
        super(nome, cargaHoraria, alunos, avaliacoes, professores);
    }
    public void mediaCurso(){
        
    }

}