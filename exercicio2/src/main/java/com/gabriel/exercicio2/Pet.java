package com.gabriel.exercicio2;

public class Pet {

    private int id;
    private String nome;
    private String raca;
    private String especie;

    public Pet(int id, String nome, String raca, String especie) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
    }

    public Pet() {

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
