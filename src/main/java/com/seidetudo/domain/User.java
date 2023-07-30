package com.seidetudo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {

    private long id;
    private String usuario;
    private String senha;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User (String usuario, String senha, String email) {
        this.senha = senha;
        this.usuario =  usuario;
        this.email = email;

    }

    public User(DadosCadastrarUser user) {

        this.usuario = user.usuario();
        this.senha = user.senha();
        this.email = user.email();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Id // indica o id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// indica que o bd vai gerenciar o autoincremento
    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
