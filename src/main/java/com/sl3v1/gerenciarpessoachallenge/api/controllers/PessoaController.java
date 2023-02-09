package com.sl3v1.gerenciarpessoachallenge.api.controllers;

import com.sl3v1.gerenciarpessoachallenge.domain.models.Pessoa;
import com.sl3v1.gerenciarpessoachallenge.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping(value = "/{id}")
    public Pessoa findById (@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public List<Pessoa> findAll(){
        return service.findAll();
    }
}
