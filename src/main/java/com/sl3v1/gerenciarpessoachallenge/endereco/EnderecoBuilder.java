package com.sl3v1.gerenciarpessoachallenge.endereco;

import java.util.Objects;

public class EnderecoBuilder {
    private Long id;
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;
    private TipoEndereco tipoEndereco;

    public EnderecoBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public EnderecoBuilder comLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public EnderecoBuilder comCep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder comNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder comCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder comTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
        return this;
    }

    public Endereco build() {
        if (Objects.isNull(logradouro)) {
            throw new NullPointerException("Logradouro não pode ser nulo");
        }
        return new Endereco(id, logradouro, cep, numero, cidade, tipoEndereco);
    }
}
