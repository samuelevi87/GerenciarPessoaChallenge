package com.sl3v1.gerenciarpessoachallenge.services;

import com.sl3v1.gerenciarpessoachallenge.domain.models.Pessoa;
import com.sl3v1.gerenciarpessoachallenge.domain.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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



}
