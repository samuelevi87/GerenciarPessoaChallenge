package com.sl3v1.gerenciarpessoachallenge.pessoa;

import com.sl3v1.gerenciarpessoachallenge.endereco.Endereco;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Pessoa(Long id, String nome, LocalDate dataNascimento, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (!id.equals(pessoa.id)) return false;
        if (!Objects.equals(nome, pessoa.nome)) return false;
        if (!Objects.equals(dataNascimento, pessoa.dataNascimento))
            return false;
        return Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (dataNascimento != null ? dataNascimento.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        return result;
    }
}
