
package br.com.ufc.es.poo.model;

import br.com.ufc.es.poo.model.Professor;
import java.util.Scanner;
import java.util.ArrayList;

public class AlunoBolsista extends Usuario {

    protected int matricula;
    protected String turno ; 
    protected int presenca[] = new int[192];
    protected int faltas [] = new int [48];
    protected double notaProva [ ] = new double [2];
    protected double notaTrabalho [] = new double[2];
    protected double mediaAluno;
    protected FrequenciaRemunerada frequenciaRemunerada []= new FrequenciaRemunerada [12];
    protected CursosOfertados cursoMatriculado;
    protected double mediaTurma;
    
    public AlunoBolsista(){}
    public AlunoBolsista(String cpf, String senha, String email, String nome, 
            int matricula, int presenca, int faltas, double notaProva, double notaTrabalho,double mediaAluno,FrequenciaRemunerada frequenciaRemunerada[],CursosOfertados cursoMatriculado, double mediaTurma) {
        super(cpf,nome,email,senha);
        this.matricula = matricula;
        this.turno = turno;
        this.notaProva = this.notaProva;
        this.notaTrabalho = this.notaTrabalho;
        this.mediaAluno = 0;
        this.frequenciaRemunerada = frequenciaRemunerada;
        this.cursoMatriculado = cursoMatriculado;
        this.mediaTurma = mediaTurma;
        }

    public double getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(double mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public FrequenciaRemunerada[] getFrequenciaRemunerada() {
        return frequenciaRemunerada;
    }

    public void setFrequenciaRemunerada(FrequenciaRemunerada[] frequenciaRemunerada) {
        this.frequenciaRemunerada = frequenciaRemunerada;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado.getNome();
    }

    public void setCursoMatriculado(CursosOfertados cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
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
      public int[] getFaltas() {
        return faltas;
    }

    public double getMediaTurma() {
        return mediaTurma;
    }

    public void setMediaTurma(double mediaTurma) {
        this.mediaTurma = mediaTurma;
    }

    public void setFaltas(int[] faltas) {
        this.faltas = faltas;
    }

    public void visualizarPresenca(Professor x) {  
        System.out.println("Seu numero de presenças é" +x.totalPresenca(this) + " e seu numero de faltas é "+x.totalFalta(this));
    }    
    

    public void visualizaMediaAluno(CursosOfertados x) {
        System.out.println("A media do aluno eh" +x.mediaAluno(this, notaTrabalho, notaProva));
    }

    public void visualizaMediaTurma(AlunoBolsista p) {
        System.out.println(p.getMediaTurma());
    }

    @Override
    public String toString() {
        return "AlunoBolsista{" + "matricula=" + matricula + ", turno=" + turno + ", presenca=" + presenca + ", faltas=" + faltas + ", notaProva=" + notaProva + ", notaTrabalho=" + notaTrabalho + ", mediaAluno=" + mediaAluno + ", frequenciaRemunerada=" + frequenciaRemunerada + ", cursoMatriculado=" + cursoMatriculado + ", mediaTurma=" + mediaTurma + '}';
    }

    
 

    
    
    


    
    

}
