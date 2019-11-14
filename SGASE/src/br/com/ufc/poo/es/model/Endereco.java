package br.com.ufc.poo.es.model;

public class Endereco {
    
    private String cep;
    private String logradouro;
    private String rua;
    private int numeroCasa;
    
    public Endereco() {
    }

    public Endereco(String cep, String logradouro, String rua, int numeroCasa) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", logradouro=" + logradouro + ", rua=" + rua + ", numeroCasa=" + numeroCasa + '}';
    }
    
}