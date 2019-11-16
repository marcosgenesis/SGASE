
package br.com.ufc.es.poo.model;


public class Telefone {
    
    private int ddd;
    private String numeroTelefone;
    private int codigoOperadora;
   
    public Telefone(int ddd, String numeroTelefone, int codigoOperadora) {
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
        this.codigoOperadora = codigoOperadora;
    }

   
    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getCodigoOperadora() {
        return codigoOperadora;
    }

    public void setCodigoOperadora(int codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }
 
    @Override
    public String toString() {
        return "Telefone{" + "ddd=" + ddd + ", numeroTelefone=" + numeroTelefone + ", codigoOperadora=" + codigoOperadora + '}';
    }

    
}
