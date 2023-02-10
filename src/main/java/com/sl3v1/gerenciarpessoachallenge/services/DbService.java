package com.sl3v1.gerenciarpessoachallenge.services;

import com.sl3v1.gerenciarpessoachallenge.domain.builders.EnderecoBuilder;
import com.sl3v1.gerenciarpessoachallenge.domain.builders.PessoaBuilder;
import com.sl3v1.gerenciarpessoachallenge.domain.models.Endereco;
import com.sl3v1.gerenciarpessoachallenge.domain.models.Pessoa;
import com.sl3v1.gerenciarpessoachallenge.domain.repositories.EnderecoRepository;
import com.sl3v1.gerenciarpessoachallenge.domain.repositories.PessoaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.time.LocalDate.of;
import static java.util.Arrays.asList;

@Service
public class DbService {
    private final PessoaRepository pessoaRepository;
    private final EnderecoRepository enderecoRepository;
    @PersistenceContext
    private EntityManager manager;

    public DbService(PessoaRepository pessoaRepository, EnderecoRepository enderecoRepository) {
        this.pessoaRepository = pessoaRepository;
        this.enderecoRepository = enderecoRepository;
    }

    @Transactional
    public void instanciaBD() {
        final List<String> NOMES = new ArrayList<>(List.of("João", "Maria", "José", "Ana", "Pedro", "Lucas", "Julia", "Mateus", "Gabriela", "Thiago"));
        final List<String> LOGRADOUROS = new ArrayList<>(List.of("Rua A", "Rua B", "Rua C", "Rua D", "Rua E", "Avenida A", "Avenida B", "Avenida C", "Avenida D", "Avenida E"));
        final List<String> CIDADES = new ArrayList<>(List.of("São Paulo", "Rio de Janeiro", "Belo Horizonte", "Porto Alegre", "Curitiba", "Salvador", "Fortaleza", "Brasília", "Goiânia", "Recife"));
        final Random RANDOM = new Random();

        List<Endereco> enderecosPessoaMock01 = asList(
                new EnderecoBuilder()
                        .comLogradouro(LOGRADOUROS.get(RANDOM.nextInt(LOGRADOUROS.size())))
                        .comNumero(geraTresDigitosAleatorio().toString())
                        .comCidade(CIDADES.get(RANDOM.nextInt(CIDADES.size())))
                        .comCep(geraCEP())
                        .enderecoPrincipal(true)
                        .build(),
                new EnderecoBuilder()
                        .comLogradouro(LOGRADOUROS.get(RANDOM.nextInt(LOGRADOUROS.size())))
                        .comNumero(geraTresDigitosAleatorio().toString())
                        .comCidade(CIDADES.get(RANDOM.nextInt(CIDADES.size())))
                        .comCep(geraCEP())
                        .build());

        Pessoa pessoaMock01 = new PessoaBuilder()
                .comNome(NOMES.get(RANDOM.nextInt(NOMES.size())))
                .comDataNascimento(of(geraQuatrodigitosAleatorio(), geraMesAleatorio(), geraDoisDigitosAleatorio()))
                .comEndereco(enderecosPessoaMock01)
                .build();

        List<Endereco> enderecosPessoaMock02 = asList(
                new EnderecoBuilder()
                        .comLogradouro(LOGRADOUROS.get(RANDOM.nextInt(LOGRADOUROS.size())))
                        .comNumero(geraTresDigitosAleatorio().toString())
                        .comCidade(CIDADES.get(RANDOM.nextInt(CIDADES.size())))
                        .comCep(geraCEP())
                        .enderecoPrincipal(true)
                        .build(),
                new EnderecoBuilder()
                        .comLogradouro(LOGRADOUROS.get(RANDOM.nextInt(LOGRADOUROS.size())))
                        .comNumero(geraTresDigitosAleatorio().toString())
                        .comCidade(CIDADES.get(RANDOM.nextInt(CIDADES.size())))
                        .comCep(geraCEP())
                        .build());

        Pessoa pessoaMock02 = new PessoaBuilder()
                .comNome(NOMES.get(RANDOM.nextInt(NOMES.size())))
                .comDataNascimento(of(geraQuatrodigitosAleatorio(), geraMesAleatorio(), geraDoisDigitosAleatorio()))
                .comEndereco(enderecosPessoaMock02)
                .build();

        List<Endereco> enderecosPessoaMock03 = asList(
                new EnderecoBuilder()
                        .comLogradouro(LOGRADOUROS.get(RANDOM.nextInt(LOGRADOUROS.size())))
                        .comNumero(geraTresDigitosAleatorio().toString())
                        .comCidade(CIDADES.get(RANDOM.nextInt(CIDADES.size())))
                        .comCep(geraCEP())
                        .enderecoPrincipal(true)
                        .build(),
                new EnderecoBuilder()
                        .comLogradouro(LOGRADOUROS.get(RANDOM.nextInt(LOGRADOUROS.size())))
                        .comNumero(geraTresDigitosAleatorio().toString())
                        .comCidade(CIDADES.get(RANDOM.nextInt(CIDADES.size())))
                        .comCep(geraCEP())
                        .build());

        Pessoa pessoaMock03 = new PessoaBuilder()
                .comNome(NOMES.get(RANDOM.nextInt(NOMES.size())))
                .comDataNascimento(of(geraQuatrodigitosAleatorio(), geraMesAleatorio(), geraDoisDigitosAleatorio()))
                .comEndereco(enderecosPessoaMock03)
                .build();

        pessoaRepository.save(pessoaMock01);
        pessoaRepository.save(pessoaMock02);
        pessoaRepository.save(pessoaMock03);

    }

    private Integer geraQuatrodigitosAleatorio() {
        Random r = new Random();
        return r.nextInt(48) + 1960;
    }

    private Integer geraMesAleatorio() {
        Random r = new Random();
        return r.nextInt(11) + 1;
    }

    private Integer geraDoisDigitosAleatorio() {
        Random r = new Random();
        return r.nextInt(26) + 1;
    }

    private Integer geraTresDigitosAleatorio() {
        Random r = new Random();
        return r.nextInt(266) + 1;
    }

    private String geraCEP() {
        Random random = new Random();
        return String.format("%05d-%03d", random.nextInt(100000), random.nextInt(1000));
    }


}
