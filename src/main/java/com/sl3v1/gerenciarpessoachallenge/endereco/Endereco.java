package com.sl3v1.gerenciarpessoachallenge.endereco;

import java.util.Objects;

public class Endereco {
    private Long id;
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;

    public Endereco(Long id, String logradouro, String cep, String numero, String cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;

        if (!id.equals(endereco.id)) return false;
        if (!Objects.equals(logradouro, endereco.logradouro)) return false;
        if (!Objects.equals(cep, endereco.cep)) return false;
        if (!Objects.equals(numero, endereco.numero)) return false;
        return Objects.equals(cidade, endereco.cidade);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (logradouro != null ? logradouro.hashCode() : 0);
        result = 31 * result + (cep != null ? cep.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        return result;
    }
}
