package com.fernando;

import io.quarkus.logging.Log;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;

@Alternative
@Priority(5)
@ApplicationScoped
public class SaidaLog implements Imprimir {
    @Override
    public void imprimir(String texto) {
        Log.info("Saida de log " + texto);
    }
}
