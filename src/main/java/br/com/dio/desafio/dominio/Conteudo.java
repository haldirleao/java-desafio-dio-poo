package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    // constante
    protected static final double XP_PADRAO = 10d;

    // atributos
    private String titulo;
    private String descricao;

    // métodos
    public abstract double calcularXp();

    // getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}