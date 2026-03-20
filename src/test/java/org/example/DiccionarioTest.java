package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

class DiccionarioTest {

    @BeforeEach
    void inicioPruebas() {
        // Reiniciamos el estado de la clase antes de cada test para cumplir los requisitos
        Diccionario.mapa = new HashMap<>();
        Diccionario.listaIndices = new HashSet<>();
        Diccionario.listaIndicesFinal = new ArrayList<>();
    }

    @Test
    void nuevoPar() {
        //Este test comprueba que se ha añadido correctamente al diccionario el nuevo par.
         Diccionario.nuevoPar("Mesa@Table");
         assertTrue(Diccionario.mapa.containsKey("Mesa"));
         assertEquals("Table", Diccionario.mapa.get("Mesa"));
    }

    @Test
    void traduce() {
        //Este test comprueba que el método traduce devuelve la traducción de un texto en español (clave-valor)Diccionario.nuevoPar("Mesa@Table");
        Diccionario.nuevoPar("Mesa@Table");

        String resultado = Diccionario.traduce("Mesa");
        assertEquals("Table", resultado);
    }

    @Test
    void traduceCasoExtremo(){
        //Intenta traducir una palabra que no existe, debe de devolver null
        String resultado = Diccionario.traduce("Mesa");
        assertNull(resultado);
    }

    @Test
    void palabraAleatoria() {
        //En este test, hacemos que la lista de índices solo tenga "Mesa", forzando
        // a que sea la única opción para la palabra aleatoria, y después comprobamos
        //Que el método devuelve correctamente "Mesa".

        Diccionario.listaIndicesFinal.add("Mesa");

        String palabra = Diccionario.palabraAleatoria();

        assertEquals("Mesa", palabra);
        //Comprobamos que después de escoger la palabra aleatoria, la elimina de la lista para no repetirla
        assertTrue(Diccionario.listaIndicesFinal.isEmpty());
    }

    @Test
    void primeraLetraTraduccion() {
        //Este test comprueba que el método devuelve la primera letra de la palabra
        //En inglés, en este caso de "Mesa".
        Diccionario.nuevoPar("Mesa@Table");

        char letra = Diccionario.primeraLetraTraduccion("Mesa");
        assertEquals('T', letra);

    }

    @Test
    void primeraLetraTraduccionCasoExtremo() {

        //Busco una palabra que no esté en el mapa, por lo cual, deberá devolver un espacio (' ')
        Diccionario.nuevoPar("Mesa@Table");

        char letra = Diccionario.primeraLetraTraduccion("castañas");
        assertEquals(' ', letra);

        char letra2 = Diccionario.primeraLetraTraduccion(null);
        assertEquals(' ', letra2);

    }
}