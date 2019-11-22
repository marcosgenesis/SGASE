
package br.com.ufc.es.poo.model;

import br.com.ufc.es.poo.model.Professor;
import java.util.Scanner;
import java.util.ArrayList;

public class AlunoBolsista extends Usuario {

    protected int matricula;
    protected int presenca[] = new int[192];
    protected int faltas [] = new int [48];
    protected double notaProva [] = new double [2];
    protected double notaTrabalho [] = new double[2];
    protected double mediaAluno;
    protected FrequenciaRemunerada frequenciaRemunerada [] = new FrequenciaRemunerada [12];
    protected CursosOfertados cursoMatriculado;
    
    public AlunoBolsista(){}
    public AlunoBolsista(String cpf, String senha, String email, String nome, 
            int matricula,CursosOfertados cursoMatriculado) {
        super(cpf,nome,email,senha);
        this.matricula = matricula;
        this.mediaAluno = 0;
        this.cursoMatriculado = cursoMatriculado;
    }

    
    public CursosOfertados getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(CursosOfertados cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
    
    public double getNotaProva(int index){
        return notaProva[index];
    }
    public double getNotaTrabalho(int index){
        return notaTrabalho[index];
    }
    public void setNotaTrabalho(int index,double valor){
        this.notaTrabalho[index] = valor;
    }
    public void visualizarPresenca(Professor x) {  
        System.out.println("Seu numero de presenças é" +x.totalPresenca(this) + " e seu numero de faltas é "+x.totalFalta(this));
    }    
    

    public void visualizaMediaAluno(CursosOfertados x) {
        System.out.println("A media do aluno é " +x.mediaAluno(this));
    }

    //public void visualizaMediaTurma() {
      //  System.out.println(p.getMediaTurma());
    
    

    @Override
    public String toString() {
        return "AlunoBolsista{" + "matricula=" + matricula + ", presenca=" + presenca + ", faltas=" + faltas + ", notaProva=" + notaProva + ", notaTrabalho=" + notaTrabalho + ", mediaAluno=" + mediaAluno + ", frequenciaRemunerada=" + frequenciaRemunerada + ", cursoMatriculado=" + cursoMatriculado + '}';
    }
    
    }

 

    
    
    


    
    

