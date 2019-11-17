
package br.com.ufc.es.poo.model;


public class FrequenciaRemunerada {
    private String mesRefefente;
    private String nomeBolsista;
    private String curso;
    private Professor professor;

    public FrequenciaRemunerada(String mesRefefente, String nomeBolsista, String curso, Professor professor) {
       this.mesRefefente = mesRefefente;
       this.nomeBolsista = nomeBolsista;
       this.curso = curso;
       this.professor = professor;
    }
      
    public String getMesRefefente() {
        return mesRefefente;
    }

    public void setMesRefefente(String mesRefefente) {
        this.mesRefefente = mesRefefente;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
}
