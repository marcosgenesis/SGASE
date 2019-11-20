
package br.com.ufc.es.poo.model;

import java.util.ArrayList;


public class BolsistaVoluntario extends AlunoBolsista {

    public BolsistaVoluntario(){
        
    }
    public BolsistaVoluntario(String cpf, String senha, String email, String nome, 
            int matricula, int presenca, int faltas, double notaProva, double notaTrabalho,double mediaAluno,FrequenciaRemunerada frequenciaRemunerada[],CursosOfertados cursoMatriculado, double mediaTurma){
        super(cpf, senha, email, nome, 
            matricula, presenca, faltas, notaProva, notaTrabalho,mediaAluno,frequenciaRemunerada,cursoMatriculado,mediaTurma);
    }
   
    
    public void selecionaProjeto(Projeto projeto ) {
        ArrayList<AlunoBolsista> alunos = projeto.getAlunos();
        projeto.getAlunos().add(this);
    }
    
}
