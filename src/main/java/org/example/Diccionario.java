package org.example;

import java.util.*;

public class Diccionario {


    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();

    static HashMap<String, String> mapa = new HashMap<>();
    static Set<String> listaIndices = new HashSet<>();
    static ArrayList<String> listaIndicesFinal;



    public static void nuevoPar(String claveValor){

        String[] texto = claveValor.split("@");
        mapa.put(texto[0], texto[1]);

    }

    public static String traduce(String clave){
        return mapa.get(clave);
    }
    public static String palabraAleatoria(){
        int indice = aleatorio.nextInt(0, listaIndicesFinal.size());
        String palabra = listaIndicesFinal.get(indice);
        listaIndicesFinal.remove(indice);
        return palabra;
    }
    public static char primeraLetraTraduccion(String clave){

        String valor = mapa.get(clave);
        return valor.charAt(0);

    }


}
