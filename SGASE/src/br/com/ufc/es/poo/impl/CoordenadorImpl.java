
package br.com.ufc.es.poo.impl;
import br.com.ufc.es.poo.model.*;
import br.com.ufc.es.poo.Interfaces.*;
import br.com.ufc.es.poo.model.AlunoBolsista;
import br.com.ufc.es.poo.model.Professor;
import br.com.ufc.es.poo.model.Turma;
import br.com.ufc.es.poo.model.Usuario;
import java.util.ArrayList;


public class CoordenadorImpl extends Usuario implements Coordenador{

    
    public CoordenadorImpl(String cpf, String nome, String email,String senha) {
        super(cpf, nome, email, senha );
    }

    public void verificaFrequenciaRemunerada() {
        
    }

    public void cadastraProfessor(Turma turma, Professor professor) {
        turma.getCurso().addProfessor(professor);
    }
    
    public void editaProfessor(Turma turma, Professor professorNovo,Professor professorAntigo) {
        //turma.getCurso().setProfessor(professorNovo,professorAntigo);
    }
  
    public void removeProfessor(Turma turma,Professor professorRemovido) {
        turma.getCurso().getProfessores().remove(professorRemovido);
    }

    public void cadastraAluno(Turma turma,AlunoBolsista alunoCadastrado) {
        turma.getParticipantes().add(alunoCadastrado);
    }

    public void editaAluno(Turma turma) {
    
    }

    public void removeAluno() {
      //
    }

}
    