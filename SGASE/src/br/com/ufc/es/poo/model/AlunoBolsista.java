
package br.com.ufc.es.poo.model;

import br.com.ufc.es.poo.model.Professor;
import java.util.Scanner;

public class AlunoBolsista extends Usuario {

    protected int matricula;
    protected String turno ; 
    protected int presenca[] = new int[192];
    protected int faltas [] = new int [48];
    protected double notaProva [ ] = new double [2];
    protected double notaTrabalho [] = new double[2];
    protected double mediaAluno;
 
    public AlunoBolsista(String cpf, int id, String email, String nome, int matricula, String turno) {
        super(cpf,id,email,nome);
        this.matricula = matricula;
        this.turno = turno;
        this.presenca = presenca;
        this.faltas = faltas;
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.mediaAluno = mediaAluno;
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

    public void setFaltas(int[] faltas) {
        this.faltas = faltas;
    }

    public void visualizarPresenca(Professor x) {  
        System.out.println("Seu numero de presenças é" +x.totalPresenca(this) + " e seu numero de faltas é "+x.totalFalta(this));
    }    
    

    public void visualizaMediaAluno(CursosOfertados x) {
        System.out.println("A media do aluno eh" +x.mediaAluno(this, notaTrabalho, notaProva));
    }

    public double visualizaMediaCurso() {
        return 0.0;
    }
   
    public void cadastraFrequencia(AlunoBolsista p,FrequenciaRemunerada frequencia[]) {
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < frequencia.length; i++){
            frequencia[i].setMesReferente(ler.next());
            frequencia[i].setNomeBolsista(ler.nextLine());
            frequencia[i].setCurso(ler.nextLine());
            frequencia[i].setProfessor(ler.nextLine());
        }
    }
    

    @Override
    public String toString() {
        return "AlunoBolsista{" + "matricula=" + matricula + ", turno=" + turno + ", presenca=" + presenca + ", faltas=" + faltas + ", notaProva=" + notaProva + ", notaTrabalho=" + notaTrabalho + '}';
    }

    
    

}
