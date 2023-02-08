package com.sl3v1.gerenciarpessoachallenge.pessoa;

import com.sl3v1.gerenciarpessoachallenge.endereco.Endereco;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;

import static java.time.LocalDate.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {
    @Test
    public void deveRetornarNomeDaPessoa() {
        Pessoa pessoa = new PessoaBuilder()
                .comNome("João")
                .comDataNascimento(of(2000, 1, 1))
                .build();
        assertEquals("João", pessoa.getNome());
    }

    @Test
    public void deveRetornarDataNascimentoDaPessoa() {
        Pessoa pessoa = new PessoaBuilder()
                .comNome("João")
                .comDataNascimento(of(2000, 1, 1))
                .build();
        assertEquals(of(2000, 1, 1), pessoa.getDataNascimento());
    }

    @Test
    public void deveRetornarEnderecoDaPessoa() {
        List<Endereco> endereco = Collections.singletonList(Mockito.mock(Endereco.class));
        Mockito.when(endereco.get(0).getLogradouro()).thenReturn("Rua 1");

        Pessoa pessoa = new PessoaBuilder()
                .comNome("João")
                .comDataNascimento(of(2000, 1, 1))
                .comEndereco(endereco)
                .build();
        assertEquals("Rua 1", pessoa.getEnderecos().get(0).getLogradouro());
    }
}