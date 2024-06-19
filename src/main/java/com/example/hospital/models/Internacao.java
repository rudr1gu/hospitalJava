package com.example.hospital.models;

public class Internacao {
    private String dataEntrada;
    private String dataSaida;
    private String condicao;
    private String nomePaciente;
    private String nomeMedico;
    private String nomeEnfermeiro;

    public Internacao(String dataEntrada, String dataSaida, String condicao, String nomePaciente, String nomeMedico, String nomeEnfermeiro){
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.condicao = condicao;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.nomeEnfermeiro = nomeEnfermeiro;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }

    public void setNomeEnfermeiro(String nomeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
    }
    
}
