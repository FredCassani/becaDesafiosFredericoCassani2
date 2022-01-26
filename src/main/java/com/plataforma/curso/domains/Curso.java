package com.plataforma.curso.domains;

import java.time.LocalDate;

public class Curso {

    private Long id;
    private String nome;
    private String descricao;
    private Integer quantidadeAluno;
    private LocalDate dataInicio;
    private Integer professor;
    private LocalDate dataTermino;

    public Curso() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeAluno() {
        return quantidadeAluno;
    }

    public void setQuantidadeAluno(Integer quantidadeAluno) {
        this.quantidadeAluno = quantidadeAluno;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Integer getProfessor() {
        return professor;
    }

    public void setProfessor(Integer professor) {
        this.professor = professor;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidadeAluno=" + quantidadeAluno +
                ", dataInicio=" + dataInicio +
                ", professor=" + professor +
                ", dataTermino=" + dataTermino +
                '}';
    }
}
