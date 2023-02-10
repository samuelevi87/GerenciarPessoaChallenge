package com.sl3v1.gerenciarpessoachallenge.services;

import com.sl3v1.gerenciarpessoachallenge.domain.exceptions.ObjetoNaoEncontrado;
import com.sl3v1.gerenciarpessoachallenge.domain.models.Pessoa;
import com.sl3v1.gerenciarpessoachallenge.domain.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa findById(Long id) {
        return repository.findById(id).get();
    }

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Pessoa findById2(Long id) throws ObjetoNaoEncontrado {
        Optional<Pessoa> obj = repository.findById(id);
        Pessoa pessoa = obj.orElseThrow(() -> new ObjetoNaoEncontrado(
                "Não existe pessoa com o Id:" + id));
        return pessoa;
    }
}
