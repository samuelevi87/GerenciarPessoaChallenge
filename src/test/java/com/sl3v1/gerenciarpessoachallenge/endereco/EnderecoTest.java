package com.sl3v1.gerenciarpessoachallenge.endereco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
@Test
    public void deveRetornarTipoEnderecoDoEndereco() {
        Endereco endereco = new EnderecoBuilder()
                .comLogradouro("Rua 1")
                .comCep("12345-678")
                .comNumero("1")
                .comCidade("São Paulo")
                .comTipoEndereco((TipoEndereco.COMERCIAL))
                .build();
        assertEquals("COMERCIAL", endereco.getTipoEndereco().toString());
    }

}