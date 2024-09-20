package com.fernando;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;



@Alternative
@Priority(2)
@ApplicationScoped
public class SaidaConsole implements Imprimir {
    @Override
    public void imprimir(String texto) {
        System.out.println("Saida de console " + texto);
    }
}
