
package br.com.ufc.es.poo.model;


public class Avaliacao {
    
    private String descricao;
    private boolean realizada;
    private int peso;
    private double notas[ ][ ] = new double[3][3];
    
    public Avaliacao(String descricao, boolean realizada, int peso){
        this.descricao = descricao;
        this.realizada = realizada;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
      public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public double mediaAluno() { //método
        return 0.0d;
    }
    @Override
    public String toString() {
        return "Avaliacao{" + "descricao=" + descricao + ", realizada=" + realizada + ", peso=" + peso + '}';
    }
}
