package com.gabriel.exercicio2;

public class Pet {

    private Long id;
    private String nome;
    private String raca;
    private String especie;

    public Pet(Long id, String nome, String raca, String especie) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
