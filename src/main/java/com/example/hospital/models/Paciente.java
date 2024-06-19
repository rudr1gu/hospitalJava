package com.example.hospital.models;

public class Paciente implements IPaciente{
    private String nome;
    private int idade;
    private int RG;
    private String CPF;
    private String dataNascimento;
    private String telefone;
    private String email;
    private String endereco;
    private String plano;
    private String condicao;
    private String dataCadastro;
    private boolean internado;

    public Paciente(String nome, int idade, int RG, String CPF, String dataNascimento, String telefone, String email, String endereco, String plano, String condicao, String dataCadastro, boolean internado){
        this.setNome(nome);
        this.setIdade(idade);
        this.setRG(RG);
        this.setCPF(CPF);
        this.setDataNascimento(dataNascimento);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setPlano(plano);
        this.setCondicao(condicao);
        this.setDataCadastro(dataCadastro);
        this.setInternado(internado);
        this.setEndereco(endereco);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getRG() {
        return RG;
    }

    @Override
    public void setRG(int RG) {
        this.RG = RG;
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPlano() {
        return plano;
    }

    @Override
    public void setPlano(String plano) {
        this.plano = plano;
    }

    @Override
    public String getCondicao() {
        return condicao;
    }

    @Override
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    @Override
    public String getDataCadastro() {
        return dataCadastro;
    }
    @Override
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    @Override
    public boolean isInternado() {
        return internado;
    }

    @Override
    public void setInternado(boolean internado) {
        this.internado = internado;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEndereco() {
       return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}