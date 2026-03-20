package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class DiccionarioTest {

    @Test
    void nuevoPar(String s) {

        Diccionario.mapa.clear();
        nuevoPar("hola@hello");

        assertTrue(Diccionario.mapa.get("hola"), );

    }

    @Test
    void traduce() {
    }

    @Test
    void palabraAleatoria() {
    }

    @Test
    void primeraLetraTraduccion() {
    }
}