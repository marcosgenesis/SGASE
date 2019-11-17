
package br.com.ufc.es.poo.Interfaces;

import br.com.ufc.es.poo.model.AlunoBolsista;
import br.com.ufc.es.poo.model.Professor;
import br.com.ufc.es.poo.model.Turma;


public interface Coordenador {
    public void verificaFrequenciaRemunerada();
    public void cadastraProfessor(Turma turma, Professor professor);
    public void editaProfessor(Turma turma, Professor professorNovo,Professor professorAntigo);
    public void removeProfessor(Turma turma,Professor professorRemovido);
    public void cadastraAluno(Turma turma,AlunoBolsista alunoCadastrado);
    public void editaAluno(Turma turma) ;
    public void removeAluno();
}
