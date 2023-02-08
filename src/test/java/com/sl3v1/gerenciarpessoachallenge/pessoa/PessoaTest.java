package com.sl3v1.gerenciarpessoachallenge.pessoa;

import com.sl3v1.gerenciarpessoachallenge.endereco.Endereco;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
        Endereco endereco = Mockito.mock(Endereco.class);
        Mockito.when(endereco.getLogradouro()).thenReturn("Rua 1");

        Pessoa pessoa = new PessoaBuilder()
                .comNome("João")
                .comDataNascimento(of(2000, 1, 1))
                .comEndereco(endereco)
                .build();
        assertEquals("Rua 1", pessoa.getEndereco().getLogradouro());
    }
}