
package br.com.ufc.es.poo.model;


public class BolsistaVoluntario extends AlunoBolsista {

    public BolsistaVoluntario(String cpf, int id, String email, String nome, int matricula, String turno, int[] presenca, int[] faltas, double[] notaProva, double[] notaTrabalho, double mediaAluno) {
        super(cpf, id, email, nome, matricula, turno, presenca, faltas, notaProva, notaTrabalho, mediaAluno);
    }

  

    public void selecionaProjeto(Projeto projeto ) {
       
    }
    
}
