
package br.com.ufc.es.poo.model;


public class Usuario {
    
    protected String cpf;
    protected int id;
    protected String email;
    protected String nome;
    
    public Usuario(){
        
    }
    
    public Usuario(String cpf, int id, String email, String nome) {
        super();
        this.cpf = cpf;
        this.id = id;
        this.email = email;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cpf=" + cpf + ", id=" + id + ", email=" + email + ", nome=" + nome + '}';
    }



}
