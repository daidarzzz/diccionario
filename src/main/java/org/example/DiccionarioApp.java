package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DiccionarioApp {

    static Scanner read = new Scanner(System.in);
    static void main(String[] args) {
        precarga();

        System.out.println("Bienvenido al diccionario de  español a inglés.");
        String opcion = "";
        int preguntas = 0;
        int aciertos = 0;
        while (true) {

            String palabra = Diccionario.palabraAleatoria();

            System.out.println(palabra + ": " + Diccionario.primeraLetraTraduccion(palabra) + "...");
            System.out.print("Indique la respuesta: ");
            opcion = read.next().toLowerCase();

            if (opcion.equals("salir")) {
                System.out.println("FIN DEL PROGRAMA");
                System.out.println("Total de preguntas: " + preguntas);
                System.out.println("Total de aciertos: " + aciertos);
                System.out.println("Total de fallos: " + (preguntas - aciertos));
                System.out.println("Aciertos: " + ((aciertos * 100) / preguntas) + "%");
                break;
            }
            if (Diccionario.mapa.get(palabra).equals(opcion)) {
                System.out.println("¡CORRECTO!");
                System.out.println();
                aciertos++;
            } else {
                System.out.println("NO. La respuesta es " + Diccionario.mapa.get(palabra));
            }

            preguntas++;

        }

    }

    public static void precarga() {

        Diccionario.nuevoPar("hola@hello");
        // --- BÁSICOS Y CORTESÍA ---
        Diccionario.nuevoPar("adios@goodbye");
        Diccionario.nuevoPar("gracias@thank you");
        Diccionario.nuevoPar("por favor@please");
        Diccionario.nuevoPar("si@yes");
        Diccionario.nuevoPar("no@no");
        Diccionario.nuevoPar("hola@hello");
        Diccionario.nuevoPar("bienvenido@welcome");
        Diccionario.nuevoPar("lo siento@sorry");
        Diccionario.nuevoPar("permiso@excuse me");
        Diccionario.nuevoPar("tal vez@maybe");

// --- EL HOGAR Y OBJETOS ---
        Diccionario.nuevoPar("casa@house");
        Diccionario.nuevoPar("coche@car");
        Diccionario.nuevoPar("puerta@door");
        Diccionario.nuevoPar("ventana@window");
        Diccionario.nuevoPar("mesa@table");
        Diccionario.nuevoPar("silla@chair");
        Diccionario.nuevoPar("cama@bed");
        Diccionario.nuevoPar("cocina@kitchen");
        Diccionario.nuevoPar("baño@bathroom");
        Diccionario.nuevoPar("pared@wall");
        Diccionario.nuevoPar("techo@ceiling");
        Diccionario.nuevoPar("suelo@floor");
        Diccionario.nuevoPar("llave@key");
        Diccionario.nuevoPar("espejo@mirror");
        Diccionario.nuevoPar("jardin@garden");
        Diccionario.nuevoPar("sofa@sofa");
        Diccionario.nuevoPar("lampara@lamp");
        Diccionario.nuevoPar("reloj@clock");
        Diccionario.nuevoPar("almohada@pillow");
        Diccionario.nuevoPar("sabana@sheet");

// --- ANIMALES ---
        Diccionario.nuevoPar("perro@dog");
        Diccionario.nuevoPar("gato@cat");
        Diccionario.nuevoPar("pajaro@bird");
        Diccionario.nuevoPar("pez@fish");
        Diccionario.nuevoPar("caballo@horse");
        Diccionario.nuevoPar("vaca@cow");
        Diccionario.nuevoPar("cerdo@pig");
        Diccionario.nuevoPar("leon@lion");
        Diccionario.nuevoPar("tigre@tiger");
        Diccionario.nuevoPar("elefante@elefant");
        Diccionario.nuevoPar("mono@monkey");
        Diccionario.nuevoPar("raton@mouse");
        Diccionario.nuevoPar("serpiente@snake");
        Diccionario.nuevoPar("abeja@bee");
        Diccionario.nuevoPar("araña@spider");

// --- VERBOS DE ACCIÓN ---
        Diccionario.nuevoPar("comer@eat");
        Diccionario.nuevoPar("beber@drink");
        Diccionario.nuevoPar("dormir@sleep");
        Diccionario.nuevoPar("correr@run");
        Diccionario.nuevoPar("caminar@walk");
        Diccionario.nuevoPar("hablar@speak");
        Diccionario.nuevoPar("leer@read");
        Diccionario.nuevoPar("escribir@write");
        Diccionario.nuevoPar("mirar@watch");
        Diccionario.nuevoPar("escuchar@listen");
        Diccionario.nuevoPar("comprar@buy");
        Diccionario.nuevoPar("vender@sell");
        Diccionario.nuevoPar("trabajar@work");
        Diccionario.nuevoPar("jugar@play");
        Diccionario.nuevoPar("estudiar@study");
        Diccionario.nuevoPar("cocinar@cook");
        Diccionario.nuevoPar("viajar@travel");
        Diccionario.nuevoPar("limpiar@clean");
        Diccionario.nuevoPar("abrir@open");
        Diccionario.nuevoPar("cerrar@close");
        Diccionario.nuevoPar("pensar@think");
        Diccionario.nuevoPar("aprender@learn");
        Diccionario.nuevoPar("entender@understand");

// --- COMIDA Y BEBIDA ---
        Diccionario.nuevoPar("agua@water");
        Diccionario.nuevoPar("pan@bread");
        Diccionario.nuevoPar("leche@milk");
        Diccionario.nuevoPar("queso@cheese");
        Diccionario.nuevoPar("carne@meat");
        Diccionario.nuevoPar("pescado@fish");
        Diccionario.nuevoPar("arroz@rice");
        Diccionario.nuevoPar("huevo@egg");
        Diccionario.nuevoPar("fruta@fruit");
        Diccionario.nuevoPar("manzana@apple");
        Diccionario.nuevoPar("platano@banana");
        Diccionario.nuevoPar("naranja@orange");
        Diccionario.nuevoPar("sal@salt");
        Diccionario.nuevoPar("azucar@sugar");
        Diccionario.nuevoPar("cafe@coffee");
        Diccionario.nuevoPar("te@tea");
        Diccionario.nuevoPar("zumo@juice");
        Diccionario.nuevoPar("vino@wine");
        Diccionario.nuevoPar("cerveza@beer");
        Diccionario.nuevoPar("pollo@chicken");

// --- COLORES ---
        Diccionario.nuevoPar("rojo@red");
        Diccionario.nuevoPar("azul@blue");
        Diccionario.nuevoPar("verde@green");
        Diccionario.nuevoPar("amarillo@yellow");
        Diccionario.nuevoPar("negro@black");
        Diccionario.nuevoPar("blanco@white");
        Diccionario.nuevoPar("gris@grey");
        Diccionario.nuevoPar("rosa@pink");
        Diccionario.nuevoPar("marron@brown");
        Diccionario.nuevoPar("morado@purple");

// --- ADJETIVOS ---
        Diccionario.nuevoPar("grande@big");
        Diccionario.nuevoPar("pequeño@small");
        Diccionario.nuevoPar("alto@tall");
        Diccionario.nuevoPar("bajo@short");
        Diccionario.nuevoPar("rapido@fast");
        Diccionario.nuevoPar("lento@slow");
        Diccionario.nuevoPar("bueno@good");
        Diccionario.nuevoPar("malo@bad");
        Diccionario.nuevoPar("feliz@happy");
        Diccionario.nuevoPar("triste@sad");
        Diccionario.nuevoPar("caliente@hot");
        Diccionario.nuevoPar("frio@cold");
        Diccionario.nuevoPar("nuevo@new");
        Diccionario.nuevoPar("viejo@old");
        Diccionario.nuevoPar("rico@rich");
        Diccionario.nuevoPar("pobre@poor");
        Diccionario.nuevoPar("facil@easy");
        Diccionario.nuevoPar("dificil@difficult");
        Diccionario.nuevoPar("limpio@clean");
        Diccionario.nuevoPar("sucio@dirty");
        Diccionario.nuevoPar("lleno@full");
        Diccionario.nuevoPar("vacio@empty");

// --- EDUCACIÓN Y TRABAJO ---
        Diccionario.nuevoPar("escuela@school");
        Diccionario.nuevoPar("profesor@teacher");
        Diccionario.nuevoPar("estudiante@student");
        Diccionario.nuevoPar("libro@book");
        Diccionario.nuevoPar("cuaderno@notebook");
        Diccionario.nuevoPar("lapiz@pencil");
        Diccionario.nuevoPar("boligrafo@pen");
        Diccionario.nuevoPar("tonto@dumb");
        Diccionario.nuevoPar("multa@fine");
        Diccionario.nuevoPar("nota@grade");
        Diccionario.nuevoPar("factura@invoice");
        Diccionario.nuevoPar("oficina@office");
        Diccionario.nuevoPar("ordenador@computer");
        Diccionario.nuevoPar("pantalla@screen");
        Diccionario.nuevoPar("teclado@keyboard");
        Diccionario.nuevoPar("raton@mouse");
        Diccionario.nuevoPar("reunion@meeting");
        Diccionario.nuevoPar("empresa@company");

// --- CIUDAD Y LUGARES ---
        Diccionario.nuevoPar("ciudad@city");
        Diccionario.nuevoPar("pueblo@town");
        Diccionario.nuevoPar("calle@street");
        Diccionario.nuevoPar("parque@park");
        Diccionario.nuevoPar("tienda@shop");
        Diccionario.nuevoPar("mercado@market");
        Diccionario.nuevoPar("hospital@hospital");
        Diccionario.nuevoPar("cine@cinema");
        Diccionario.nuevoPar("banco@bank");
        Diccionario.nuevoPar("restaurante@restaurant");
        Diccionario.nuevoPar("biblioteca@library");
        Diccionario.nuevoPar("playa@beach");
        Diccionario.nuevoPar("montaña@mountain");
        Diccionario.nuevoPar("rio@river");
        Diccionario.nuevoPar("puente@bridge");

// --- FAMILIA Y PERSONAS ---
        Diccionario.nuevoPar("familia@family");
        Diccionario.nuevoPar("padre@father");
        Diccionario.nuevoPar("madre@mother");
        Diccionario.nuevoPar("hermano@brother");
        Diccionario.nuevoPar("hermana@sister");
        Diccionario.nuevoPar("hijo@son");
        Diccionario.nuevoPar("hija@daughter");
        Diccionario.nuevoPar("abuelo@grandfather");
        Diccionario.nuevoPar("abuela@grandmother");
        Diccionario.nuevoPar("tio@uncle");
        Diccionario.nuevoPar("tia@aunt");
        Diccionario.nuevoPar("primo@cousin");
        Diccionario.nuevoPar("amigo@friend");
        Diccionario.nuevoPar("vecino@neighbor");
        Diccionario.nuevoPar("bebe@baby");
        Diccionario.nuevoPar("niño@child");
        Diccionario.nuevoPar("hombre@man");
        Diccionario.nuevoPar("mujer@woman");

// --- TIEMPO Y NATURALEZA ---
        Diccionario.nuevoPar("dia@day");
        Diccionario.nuevoPar("noche@night");
        Diccionario.nuevoPar("mañana@morning");
        Diccionario.nuevoPar("tarde@afternoon");
        Diccionario.nuevoPar("semana@week");
        Diccionario.nuevoPar("mes@month");
        Diccionario.nuevoPar("año@year");
        Diccionario.nuevoPar("hoy@today");
        Diccionario.nuevoPar("ayer@yesterday");
        Diccionario.nuevoPar("mañana@tomorrow");
        Diccionario.nuevoPar("sol@sun");
        Diccionario.nuevoPar("luna@moon");
        Diccionario.nuevoPar("estrella@star");
        Diccionario.nuevoPar("cielo@sky");
        Diccionario.nuevoPar("lluvia@rain");
        Diccionario.nuevoPar("nieve@snow");
        Diccionario.nuevoPar("viento@wind");
        Diccionario.nuevoPar("fuego@fire");
        Diccionario.nuevoPar("tierra@earth");
        Diccionario.nuevoPar("arbol@tree");
        Diccionario.nuevoPar("flor@flower");

// --- CUERPO HUMANO ---
        Diccionario.nuevoPar("cabeza@head");
        Diccionario.nuevoPar("cara@face");
        Diccionario.nuevoPar("ojo@eye");
        Diccionario.nuevoPar("nariz@nose");
        Diccionario.nuevoPar("boca@mouth");
        Diccionario.nuevoPar("oreja@ear");
        Diccionario.nuevoPar("pelo@hair");
        Diccionario.nuevoPar("mano@hand");
        Diccionario.nuevoPar("brazo@arm");
        Diccionario.nuevoPar("pierna@leg");
        Diccionario.nuevoPar("pie@foot");
        Diccionario.nuevoPar("dedo@finger");
        Diccionario.nuevoPar("corazon@heart");
        Diccionario.nuevoPar("sangre@blood");


        Diccionario.listaIndicesFinal = new ArrayList<>(Diccionario.mapa.keySet());

        System.out.println(Diccionario.listaIndicesFinal);

    }


}
