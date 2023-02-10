package com.sl3v1.gerenciarpessoachallenge.domain.config;

import com.sl3v1.gerenciarpessoachallenge.services.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {
    @Autowired
    private DbService dbService;

    @Bean
    public void instanciaBaseDeDados() {
        this.dbService.instanciaBD();
    }
}
