package com.sl3v1.gerenciarpessoachallenge.domain.exceptions;

import java.io.Serial;

public class ObjetoNaoEncontrado extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;
    public ObjetoNaoEncontrado(String message) {
        super(message);
    }
    public ObjetoNaoEncontrado(String message, Throwable cause) {
        super(message, cause);
    }
}
