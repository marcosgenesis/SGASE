
package br.com.ufc.es.poo.model;
import java.util.ArrayList;
public class Cozinha extends LocalAula {

    private int vagas[]; //15 vagas
    private ArrayList<String> ingredientes;
    private ArrayList<String> materiais;

    public Cozinha(Endereco endereco, int vagas[],ArrayList<String> ingredientes, ArrayList<String> materiais) {
        super( endereco, vagas);
        this.vagas = vagas;
        this.ingredientes = ingredientes;
        this.materiais = materiais;
    }

    public void verificaIngrediente(String ingrediente){
        boolean materiallivre = true;
        for(int i=0; i < ingredientes.size(); i++){
            if( ingredientes.get(i).equals(ingrediente)){
                materiallivre = false;   
            }
        }
        if(materiallivre){
            ingredientes.add(ingrediente);
        }else{
            System.out.println("esse material já existe no inventário");
        }
    }
   
    
    
    
}
