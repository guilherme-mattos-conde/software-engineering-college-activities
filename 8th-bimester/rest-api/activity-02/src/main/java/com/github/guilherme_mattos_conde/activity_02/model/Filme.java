package com.github.guilherme_mattos_conde.activity_02.model;

public class Filme {
    private int id;
    private String nome;
    private String genero;
    private String diretor;

    public Filme(String nome, String genero, String diretor) {
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "[ " + nome + ", " + genero + ", " + diretor + " ]";
    }
}