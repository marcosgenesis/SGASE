
package br.com.ufc.es.poo.model;


public class Usuario {
    
    protected String cpf;
    protected String email;
    protected String nome;
    protected String senha;
    public Usuario(){}
    public Usuario(String cpf,String nome, String email,String senha) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        return "cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", senha=" + senha ;
    }


    



}
