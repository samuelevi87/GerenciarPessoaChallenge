package com.sl3v1.gerenciarpessoachallenge.domain.repositories;

import com.sl3v1.gerenciarpessoachallenge.domain.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long>{
}
