
package br.com.ufc.es.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {

    private ArrayList<Coordenador> coordenador = new ArrayList <Coordenador>();
    
    public Administrador(String cpf, int id, String email, String nome) {
        super(cpf, id, email, nome);
        this.coordenador = coordenador;
    }

    public ArrayList<Coordenador> getCoordenador() {
        return coordenador;
    }
    
    public void setCoordenador(ArrayList<Coordenador> coordenador) {
        this.coordenador = coordenador;
    }
     public void cadastraCoordenador(Coordenador p) {
        int i = 0;
        for(i=0; i <coordenador.size(); i++ ){
            if(coordenador.get(i).getCpf().equals(p.getCpf())){
                System.out.println("Já existe um coordenador com esse cpf");
            }else{
                coordenador.add(p);
            }
        }
    }    
}
