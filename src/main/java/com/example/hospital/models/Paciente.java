package com.example.hospital.models;

public class Paciente {
    private String nome;
    private int idade;
    private String plano;
    private int RG;
    private String condicao;


    public Paciente(String nome, int idade, String plano, int RG, String condicao){
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
        this.RG = RG;
        this.condicao = condicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
}