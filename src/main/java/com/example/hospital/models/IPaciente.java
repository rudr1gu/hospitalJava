package com.example.hospital.models;

public interface IPaciente {

    public String getNome();
    public void setNome(String nome);
    public int getIdade();
    public void setIdade(int idade);
    public int getRG();
    public void setRG(int RG);
    public String getCPF();
    public void setCPF(String CPF);
    public String getDataNascimento();
    public void setDataNascimento(String dataNascimento);
    public String getTelefone();
    public void setTelefone(String telefone);
    public String getEmail();
    public void setEmail(String email);
    public String getEndereco();
    public void setEndereco(String endereco);
    public String getPlano();
    public void setPlano(String plano);
    public String getCondicao();
    public void setCondicao(String condicao);
    public String getDataCadastro();
    public void setDataCadastro(String dataCadastro);
    public boolean isInternado();
    public void setInternado(boolean internado);
}
