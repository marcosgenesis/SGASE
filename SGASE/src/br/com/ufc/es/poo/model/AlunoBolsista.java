
package br.com.ufc.es.poo.model;


public class AlunoBolsista extends Usuario {

    protected int matricula;
    protected String turno ; 
    protected int presenca[] = new int[192];
    protected double notaProva [ ] = new double [2];
    protected double notaTrabalho [] = new double[1];
 
    public AlunoBolsista(String cpf, int id, String email, String nome, int matricula, String turno) {
        super(cpf,id,email,nome);
        this.matricula = matricula;
        this.turno = turno;
        this.presenca = presenca;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double[] getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double[] notaProva) {
        this.notaProva = notaProva;
    }

    public double[] getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double[] notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public int[] getPresenca() {
        return presenca;
    }

    public void setPresenca(int[] presenca) {
        this.presenca = presenca;
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
