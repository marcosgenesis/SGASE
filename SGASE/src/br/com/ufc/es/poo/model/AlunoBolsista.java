
package br.com.ufc.es.poo.model;


public class AlunoBolsista extends Usuario {

    protected int matricula;
    protected String turno ; 
   
 
    public AlunoBolsista(String cpf, int id, String email, String nome, int matricula, String turno) {
        super(cpf,id,email,nome);
        this.matricula = matricula;
        this.turno = turno;
    }

    public void participaAtv() {
       
    }

    public int visualizarPresenca() {
        return 0;
    }

    public double visualizaMediaAluno() {
        return 0.0;
    }

    public double visualizaMediaCurso() {
        return 0.0;
    }
   
    public void cadastraFrequencia() {
        //return null;
    }

    @Override
    public String toString() {
        return "AlunoBolsista{" + "matricula=" + matricula + ", turno=" + turno + '}';
    }

}
