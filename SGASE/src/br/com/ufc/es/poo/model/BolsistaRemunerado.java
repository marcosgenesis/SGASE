
package br.com.ufc.es.poo.model;

public class BolsistaRemunerado extends AlunoBolsista {

    private String tipoConta;
    private int agencia;
    private int numeroConta;
    private double bolsa;

    public BolsistaRemunerado(String tipoConta, int numeroConta, double bolsa, String cpf, int id, String email, String nome, int matricula, String turno, int[] presenca, int[] faltas, double[] notaProva, double[] notaTrabalho, double mediaAluno) {
        super(cpf, id, email, nome, matricula, turno, presenca, faltas, notaProva, notaTrabalho, mediaAluno);
        this.tipoConta = tipoConta;
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

    public void cadastraFrequenciaRemunerada() {
     
    }

    @Override
    public String toString() {
        return "BolsistaRemunerado{" + "tipoConta=" + tipoConta + ", agencia=" + agencia + ", numeroConta=" + numeroConta + ", bolsa=" + bolsa + '}';
    }
    
   

    
}
