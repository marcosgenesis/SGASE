package br.com.ufc.poo.es.model;

public class LocalAula {

    private Endereco endereco;
    protected boolean vagas[];
    public LocalAula() {
    }
    public LocalAula(Endereco endereco, boolean[] vagas) {
        this.endereco = endereco;
        this.vagas = vagas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public boolean verificaVagas() {
        boolean result = true;
        for (boolean vaga : vagas) {
            if(!vaga) result= false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "LocalAula{" + "endereco=" + endereco + ", vagas=" + vagas + '}';
    }

}