
package br.com.ufc.es.poo.model;

import java.util.Scanner;

public class BolsistaRemunerado extends AlunoBolsista {

    private String tipoConta;
    private int agencia;
    private int numeroConta;
    private double bolsa;

    

   
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
