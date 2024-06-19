package com.example.hospital.models;

public class Internacao extends Paciente{
    private String dataInternacao;
    private String dataAlta;
    private String motivoInternacao;
    private String medicoResponsavel;
    private String enfermeiroResponsavel;

    public Internacao(String nome, int idade, int RG, String CPF, String dataNascimento, String telefone, String email, String endereco, String plano, String condicao, String dataCadastro, boolean internado, String dataInternacao, String dataAlta, String motivoInternacao, String medicoResponsavel, String enfermeiroResponsavel){
        super(nome, idade, RG, CPF, dataNascimento, telefone, email, endereco, plano, condicao, dataCadastro, internado);
        this.setDataInternacao(dataInternacao);
        this.setDataAlta(dataAlta);
        this.setMotivoInternacao(motivoInternacao);
        this.setMedicoResponsavel(medicoResponsavel);
        this.setEnfermeiroResponsavel(enfermeiroResponsavel);
    }

    public String getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(String dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public String getEnfermeiroResponsavel() {
        return enfermeiroResponsavel;
    }

    public void setEnfermeiroResponsavel(String enfermeiroResponsavel) {
        this.enfermeiroResponsavel = enfermeiroResponsavel;
    }

}
