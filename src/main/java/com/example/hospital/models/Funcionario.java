package com.example.hospital.models;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private int RG;
    private String dataAdmissao;

    public Funcionario(String nome, int idade, String cargo, int RG, String dataAdmissao){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.RG = RG;
        this.dataAdmissao = dataAdmissao;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
}
