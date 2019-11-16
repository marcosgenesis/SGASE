
package br.com.ufc.es.poo.model;


public class Coordenador extends Usuario {

    
    public Coordenador(String cpf, int id, String email, String nome) {
        super(cpf, id, email, nome);
    }

    public void verificaFrequenciaRemunerada() {
        //
    }

    public void cadastraProfessor(Turma turma, Professor professor) {
        turma.getCurso().addProfessor(professor);
    }
    
    public void editaProfessor(Turma turma, Professor professorNovo,Professor professorAntigo) {
        turma.getCurso().setProfessor(professorNovo,professorAntigo);
    }
  
    public void removeProfessor(Turma turma,Professor professorRemovido) {
        turma.getCurso().getProfessores().remove(professorRemovido);
    }

    public void cadastraAluno(Turma turma,AlunoBolsista alunoCadastrado) {
        turma.getCurso().getParticipantes().add(alunoCadastrado);
    }

    public void editaAluno(Turma turma) {
    }

    public void removeAluno() {
      //
    }
    
}
    