
package br.com.ufc.es.poo.model;

import java.util.Scanner;


public class FrequenciaRemunerada {
    private String mesReferente;
    private String nomeBolsista;
    private String curso;
    private String professor; //professor orientador que  dá o aval da frequencia
    private int frequencia [] = new int[12]; //referente a cada mês

    public FrequenciaRemunerada(String mesRefefente, String nomeBolsista, String curso, String professor) {
       this.mesReferente = mesReferente;
       this.nomeBolsista = nomeBolsista;
       this.curso = curso;
       this.professor = professor;
       this.frequencia = frequencia;
    }
      
    public String getMesReferente() {
        return mesReferente;
    }

    public void setMesReferente(String mesReferente) {
        this.mesReferente = mesReferente;
    }

    public String getNomeBolsista() {
        return nomeBolsista;
    }

    public void setNomeBolsista(String nomeBolsista) {
        this.nomeBolsista = nomeBolsista;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
        public int[] getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int[] frequencia) {
        this.frequencia = frequencia;
    }
    
    
    @Override
    public String toString() {
        return "FrequenciaRemunerada{" + "mesRefefente=" + mesReferente + ", nomeBolsista=" + nomeBolsista + ", curso=" + curso + ", professor=" + professor + ", frequencia=" + frequencia + '}';
    }

    
    
}
