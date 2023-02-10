package com.sl3v1.gerenciarpessoachallenge.domain.models;

import com.sl3v1.gerenciarpessoachallenge.domain.builders.EnderecoBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnderecoTest {
    @Test
    public void deveRetornarLogradouroDoEndereco() {
        Endereco endereco = new EnderecoBuilder()
                .comLogradouro("Rua 1")
                .comCep("12345-678")
                .comNumero("1")
                .comCidade("São Paulo")
                .build();
        assertEquals("Rua 1", endereco.getLogradouro());
    }
    @Test
    public void deveRetornarCepDoEndereco() {
        Endereco endereco = new EnderecoBuilder()
                .comLogradouro("Rua 1")
                .comCep("12345-678")
                .comNumero("1")
                .comCidade("São Paulo")
                .build();
        assertEquals("12345-678", endereco.getCep());
    }

    @Test
    public void deveRetornarNumeroDoEndereco() {
        Endereco endereco = new EnderecoBuilder()
                .comLogradouro("Rua 1")
                .comCep("12345-678")
                .comNumero("1")
                .comCidade("São Paulo")
                .build();
        assertEquals("1", endereco.getNumero());
    }

    @Test
    public void deveRetornarCidadeDoEndereco() {
        Endereco endereco = new EnderecoBuilder()
                .comLogradouro("Rua 1")
                .comCep("12345-678")
                .comNumero("1")
                .comCidade("São Paulo")
                .build();
        assertEquals("São Paulo", endereco.getCidade());
    }
}