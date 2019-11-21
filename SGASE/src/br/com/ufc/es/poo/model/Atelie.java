
package br.com.ufc.es.poo.model;
import java.util.ArrayList;


public class Atelie extends LocalAula {
  
    private int vagas []  = new int [10]; //10 vagas   
    private ArrayList<String> materiais ;

    public Atelie(Endereco endereco, int vagas[]) {
        super(endereco,  vagas);
        this.vagas = vagas;
        this.materiais = materiais;
    }

    public int[] getVagas() { 
        return vagas;
    }

    public void setVagas(int[] vagas) {
        this.vagas = vagas;
    }

    public ArrayList<String> getMateriais() {
        return materiais;
    }

    public void setMateriais(ArrayList<String> materiais) {
        this.materiais = materiais;
    }

    public String verificaMateriais() { //método
        String nomeMaterial = "Vazio";
        for(int i=0; i < materiais.size(); i++){
            if(i == 0){
                nomeMaterial = "";
            }
             nomeMaterial += materiais.get(i)+"\n";
        }
        return nomeMaterial;
    }
    public void adicionaMaterial(String material){
        boolean materiallivre = true;
        for(int i=0; i < materiais.size(); i++){
            if( materiais.get(i).equals(material)){
                materiallivre = false;   
            }
        }
        if(materiallivre){
            materiais.add(material);
        }else{
            System.out.println("esse material já existe no inventário");
        }
    }
    
       @Override
    public String toString() {
        return "Atelie{" + "vagas=" + vagas + ", materiais=" + materiais + '}';
    }

}
