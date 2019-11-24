
package br.com.ufc.es.poo.model;

import br.com.ufc.es.poo.model.Professor;
import java.util.Scanner;
import java.util.ArrayList;

public class AlunoBolsista extends Usuario {

    protected String matricula;
    protected int presenca;
    protected int faltas;
    protected double notaProva [] = new double [2];
    protected double notaTrabalho [] = new double[2];
    protected double mediaAluno;
    protected FrequenciaRemunerada frequenciaRemunerada [] = new FrequenciaRemunerada [12];
    protected CursosOfertados cursoMatriculado;
    
    public AlunoBolsista(){}
    public AlunoBolsista(String cpf, String senha, String email, String nome, 
            String matricula,CursosOfertados cursoMatriculado) {
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
    public void setNotaProva(int index,double valor){
        this.notaProva[index] = valor;
    }
    public void setNotaTrabalho(int index,double valor){
        this.notaTrabalho[index] = valor;
    }
<<<<<<< Updated upstream

    public int getPresenca() {
        return presenca;
    }

    public void addPresenca() {
        this.presenca++;
    }

    public int getFaltas() {
        return faltas;
    }

    public void addFalta() {
        this.faltas++;
    }
    
    
    public void visualizarPresenca(Professor x) {  
        System.out.println("Seu numero de presenças é" +x.totalPresenca(this) + " e seu numero de faltas é "+x.totalFalta(this));
=======
   
    public void visualizarPresenca() {
        System.out.println("Seu numero de presenças é" +this.presenca + " e seu numero de faltas é "+this.faltas);
>>>>>>> Stashed changes
    }    
    
    public void visualizaMediaAluno(CursosOfertados x) {
        System.out.println("A media do aluno é " +x.mediaAluno(this));
    }

    public void visualizaMediaTurma(ArrayList participantes, CursosOfertados x) {
        Professor p = null; //cria apenas pra ter acesso ao método
       System.out.println(p.getMediaTurma(participantes,x));
    }
    

    @Override
    public String toString() {
        return "AlunoBolsista{" + "matricula=" + matricula + ", presenca=" + presenca + ", faltas=" + faltas + ", notaProva=" + notaProva + ", notaTrabalho=" + notaTrabalho + ", mediaAluno=" + mediaAluno + ", frequenciaRemunerada=" + frequenciaRemunerada + ", cursoMatriculado=" + cursoMatriculado + '}';
    }
    
    }

 

    
    
    


    
    

