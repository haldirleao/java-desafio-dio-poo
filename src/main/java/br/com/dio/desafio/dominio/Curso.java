package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    // atributos
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // construtores
    public Curso() {
    }

    // getters & setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHorária) {
        this.cargaHoraria = cargaHorária;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHorária=" + cargaHoraria + "]";
    }

}
