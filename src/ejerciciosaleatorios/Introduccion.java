/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

/**
 *
 * @author PocyxDesigner
 */
public class Introduccion {
    public static void verIntro() {
        System.out.println("\n____EJERCICIOS TEMA 6 DE JAVA (ALEATORIOS)____\n"
                + "\nEjercicio 1:\n"
                + "Escribe un programa que muestre la tirada de tres dados. Se debe mostrar\n" +
                  "también la suma total (los puntos que suman entre los tres dados).\n"
                + "\nEjercicio 2:\n"
                + "Realiza un programa que muestre al azar el nombre de una carta de la\n" +
                "baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,\n" +
                "diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9\n" +
                "cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que\n" +
                "sería el 1). Para convertir un número en una cadena de caracteres podemos\n" +
                "usar String.valueOf(n).\n"
                + "\nEjercicio 3:\n"
                + "Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja\n" +
                "de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.\n"
                + "\nEjercicio 4:\n"
                + "Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados\n" +
                "por espacios.\n"
                + "\nEjercicio 5:\n"
                + "Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)\n" +
                "separados por espacios. Muestra también el máximo, el mínimo y la media\n" +
                "de esos números.\n"
                + "\nEjercicio 6:\n"
                + "Escribe un programa que piense un número al azar entre 0 y 100. El usuario\n" +
                "debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento\n" +
                "fallido, el programa dirá cuántas oportunidades quedan y si el número introducido\n" +
                "es menor o mayor que el número secreto.\n"
                + "\nEjercicio 7:\n"
                + "Escribe un programa que muestre tres apuestas de la quiniela en tres columnas\n" +
                "para los 14 partidos y el pleno al quince (15 filas).\n"
                + "\nEjercicio 8:\n"
                + "Modifica el programa anterior para que la probabilidad de que salga un 1 sea\n" +
                "de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga\n" +
                "2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.\n"
                + "\nEjercicio 9:\n"
                + "Realiza un programa que vaya generando números aleatorios pares entre 0\n" +
                "y 100 y que no termine de generar números hasta que no saque el 24. El\n" +
                "programa deberá decir al final cuántos números se han generado.\n"
                + "\nEjercicio 10:\n"
                + "Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.\n" +
                "El carácter con el que se pinta cada línea se elige de forma aleatoria\n" +
                "entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud\n" +
                "aleatoria entre 1 y 40 caracteres.\n"
                + "\nEjercicio 11:\n"
                + "Escribe un programa que muestre 20 notas generadas al azar. Las notas deben\n" +
                "aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al\n" +
                "final aparecerá el número de suspensos, el número de suficientes, el número\n" +
                "de bienes, etc.\n"
                + "\nEjercicio 12:\n"
                + "Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)\n" +
                "con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para\n" +
                "convertir un entero en un carácter.\n"
                + "\nEjercicio 13:\n"
                + "Escribe un programa que simule la tirada de dos dados. El programa deberá\n" +
                "continuar tirando los dados una y otra vez hasta que en alguna tirada los dos\n" +
                "dados tengan el mismo valor.\n"
                + "\nEjercicio 14:\n"
                + "Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.\n" +
                "El programa intentará adivinar el número que estás pensando - un número\n" +
                "entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el\n" +
                "programa debe preguntar si el número que estás pensando es mayor o menor\n" +
                "que el que te acaba de decir.\n"
                + "\nEjercicio 15:\n"
                + "Realiza un generador de melodía con las siguientes condiciones:\n" +
                "a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,\n" +
                "sol, la y si.\n" +
                "b) Una melodía está formada por un número aleatorio de notas mayor o igual\n" +
                "a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).\n" +
                "c) Cada grupo de 4 notas será un compás y estará separado del siguiente\n" +
                "compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca\n" +
                "con dos barras.\n" +
                "d) La última nota de la melodía debe coincidir con la primera.\n"
                + "\nEjercicio 16:\n"
                + "Realiza un simulador de máquina tragaperras simplificada que cumpla los\n" +
                "siguientes requisitos:\n" +
                "a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5\n" +
                "figuras posibles: corazón, diamante, herradura, campana y limón.\n" +
                "b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,\n" +
                "ha perdido”.\n" +
                "c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,\n" +
                "ha recuperado su moneda”.\n" +
                "d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado\n" +
                "10 monedas”.\n"
                + "\nEjercicio 17:\n"
                + "Realiza un programa que pinte por pantalla una pecera con un pececito dentro.\n" +
                "Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo\n" +
                "serán de 4 unidades. No hay que comprobar que los datos se introducen\n" +
                "correctamente; podemos suponer que el usuario los introduce bien. Dentro\n" +
                "de la pecera hay que colocar de forma aleatoria un pececito, que puede estar\n" +
                "situado en cualquiera de las posiciones que quedan en el hueco que forma el\n" +
                "rectángulo.\n"
                + "\nEjercicio 18:\n"
                + "Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren\n" +
                "sustituir el color blanco por colores más alegres. Realiza un programa que\n" +
                "genere de forma aleatoria una secuencia de tres colores aleatorios (uno para\n" +
                "cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los\n" +
                "que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,\n" +
                "violeta y naranja.\n"
                + "\nEjercicio 19:\n"
                + "Escribe un programa que muestre 50 números enteros aleatorios comprendidos\n" +
                "entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra\n" +
                "luego el máximo de los pares el mínimo de los impares y la media de todos los\n" +
                "números generados.\n"
                + "\nEjercicio 20:\n"
                + "Realiza un programa que pinte por pantalla una cuba con cierta cantidad de\n" +
                "agua. La capacidad será indicada por el usuario. La cuba se llenará con una\n" +
                "cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que\n" +
                "pueda admitir. El ancho de la cuba no varía.\n"
                + "\nEjercicio 21:\n"
                + "Realiza un programa que genere una secuencia de cinco monedas de curso\n" +
                "legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,\n" +
                "5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos\n" +
                "posiciones posibles son cara y cruz.\n"
                + "\nEjercicio 22:\n"
                + "Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”\n" +
                "aleatorio. La cabeza se representará con el carácter @ y se debe colocar\n" +
                "exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,\n" +
                "el cuerpo irá serpenteando de la siguiente manera: se generará de forma\n" +
                "aleatoria un valor entre tres posibles que hará que el siguiente carácter se\n" +
                "coloque una posición a la izquierda del anterior, alineado con el anterior o una\n" +
                "posición a la derecha del anterior. La longitud de la serpiente se pedirá por\n" +
                "teclado y se supone que el usuario introducirá un dato correcto.\n"
                + "\nEjercicio 23:\n"
                + "Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.\n" +
                "Escribe un programa que genere de forma aleatoria la tirada de cinco dados.\n"
                + "\nEjercicio 24:\n"
                + "Escribe un programa que, dado un número introducido por teclado, elija al azar\n" +
                "uno de sus dígitos.\n"
                + "\nEjercicio 25:\n"
                + "Escribe un programa que muestre por pantalla 100 números enteros separados\n" +
                "por un espacio. Los números deben estar generados de forma aleatoria\n" +
                "en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre\n" +
                "almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).\n");
    }
}
