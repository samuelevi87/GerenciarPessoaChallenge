package com.sl3v1.gerenciarpessoachallenge.domain.repositories;

import com.sl3v1.gerenciarpessoachallenge.domain.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long>{
}
