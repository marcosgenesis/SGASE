
package br.com.ufc.es.poo.model;

import java.util.Scanner;

public class BolsistaRemunerado extends AlunoBolsista {

    private String tipoConta;
    private int agencia;
    private int numeroConta;
    private double bolsa;

    public BolsistaRemunerado(String tipoConta, int agencia, int numeroConta, double bolsa, String cpf, int id, String email, String nome, int matricula, String turno, int[] presenca, int[] faltas, double[] notaProva, double[] notaTrabalho, double mediaAluno, FrequenciaRemunerada[] frequenciaRemunerada, CursosOfertados cursomatriculado, double mediaCurso) {
        super(cpf, id, email, nome, matricula, turno, presenca, faltas, notaProva, notaTrabalho, mediaAluno, frequenciaRemunerada, cursomatriculado, mediaCurso);
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.bolsa = bolsa;
    }


    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

   
    public void preencheFrequencia(FrequenciaRemunerada frequenciaRemunerada[]) { //preenche os atributos de FrequenciaRemunerada
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < frequenciaRemunerada.length; i++){
            frequenciaRemunerada[i].setMesReferente(ler.next());
            frequenciaRemunerada[i].setCurso(ler.nextLine());
            frequenciaRemunerada[i].setNomeBolsista(ler.nextLine());
            frequenciaRemunerada[i].setProfessor(ler.nextLine());
        }
       
    }

    @Override
    public String toString() {
        return "BolsistaRemunerado{" + "tipoConta=" + tipoConta + ", agencia=" + agencia + ", numeroConta=" + numeroConta + ", bolsa=" + bolsa + '}';
    }

    
}
