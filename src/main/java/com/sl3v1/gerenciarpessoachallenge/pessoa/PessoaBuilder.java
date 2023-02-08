package com.sl3v1.gerenciarpessoachallenge.pessoa;

import com.sl3v1.gerenciarpessoachallenge.endereco.Endereco;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PessoaBuilder {
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private List<Endereco> endereco;

    public PessoaBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public PessoaBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder comDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public PessoaBuilder comEndereco(List<Endereco> enderecos) {
        this.endereco = enderecos;
        return this;
    }

    public Pessoa build() {
        if (Objects.isNull(nome)) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        return new Pessoa(id, nome, dataNascimento, endereco);
    }
}
