
package br.com.ufc.es.poo.model;
import br.com.ufc.es.poo.impl.CoordenadorImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administrador extends Usuario {

    private ArrayList<CoordenadorImpl> coordenador = new ArrayList <CoordenadorImpl>();
    
    public Administrador(String cpf, int id, String email, String nome) {
        super(cpf, id, email, nome);
        this.coordenador = coordenador;
    }

    public ArrayList<CoordenadorImpl> getCoordenador() {
        return coordenador;
    }
    
    public void setCoordenador(ArrayList<CoordenadorImpl> coordenador) {
        this.coordenador = this.coordenador;
    }
     public void cadastraCoordenadorImpl(CoordenadorImpl p) {
        int i = 0;
        for(i=0; i <coordenador.size(); i++ ){
            if(coordenador.get(i).getCpf().equals(p.getCpf())){
                System.out.println("Já existe um coordenador com esse cpf");
            }else{
                coordenador.add(p);
            }
        }
    }
     
     public void removeCoordenadorImpl(CoordenadorImpl p){
         Scanner ler = new Scanner(System.in);
         int i = 0;
         for(i = 0; i < coordenador.size(); i++){
             if(coordenador.get(i).getCpf().equals(p.getCpf())){
                 coordenador.remove(p);
             }
         }
     }
}
