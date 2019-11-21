
package br.com.ufc.es.poo.model;

import java.util.ArrayList;


public class BolsistaVoluntario extends AlunoBolsista {

    public BolsistaVoluntario(){
        
    }
    public BolsistaVoluntario(String cpf, String senha, String email, String nome, 
            int matricula, double mediaAluno,CursosOfertados cursoMatriculado){
        super(cpf, senha, email, nome, 
            matricula, mediaAluno,cursoMatriculado);
    }
   
    
    public void selecionaProjeto(Projeto projeto ) {
        ArrayList<AlunoBolsista> alunos = projeto.getAlunos();
        projeto.getAlunos().add(this);
    }
    
}
