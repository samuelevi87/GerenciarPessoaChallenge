package com.sl3v1.gerenciarpessoachallenge.api.controllers;

import com.sl3v1.gerenciarpessoachallenge.domain.exceptions.ObjetoNaoEncontrado;
import com.sl3v1.gerenciarpessoachallenge.domain.models.Pessoa;
import com.sl3v1.gerenciarpessoachallenge.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping(value = "/{pessoaId}")
    public ResponseEntity<Pessoa> findById (@PathVariable("pessoaId") Long pessoaId){
        Pessoa pessoaProcurada = service.findById(pessoaId);
        if (Objects.isNull(pessoaProcurada)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pessoaProcurada);
    }
    @GetMapping(value = "/e/{id}")
    public Pessoa findById2 (@PathVariable Long id) throws ObjetoNaoEncontrado {
        return service.findById2(id);
    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        List<Pessoa> pessoasList = service.findAll();
        return ResponseEntity.ok(pessoasList);
    }

}
