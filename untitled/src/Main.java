public class Main {

    // esto es un comentario
    /*
    Este comentario
    se puede dividir
    en varias lineas de codigo
     */
    //TODO me falta esto

    public static void main(String[] args){


        String miNombre = "Xavi"; // STRING = PALABRA Y VA ENTRE ""


        Character letraCompleja = 'A';                                              // VARIABLE COMPLEJA
        char letraDNI = 'G'; // CHAR = LETRA Y VA ENTRE ''                          // VARIABLE PRIMITIVA
        letraDNI = 'M';

        Integer numeroComplejo = 12;                                                // VARIABLE COMPLEJA
        int edad = 41; // int = numeros sin decimales                               // VARIABLE PRIMITIVA
        edad++;

        Double alturaCompleja = 1.80;                                               // VARIABLE COMPLEJA
        double altura = 1.75; // double = numeros con decimales ilimitado           // VARIABLE PRIMITIVA
        Float pesoComplejo = 74.86f;                                                // VARIABLE COMPLEJA
        float peso = 80.52f; // float = numeros con decimales limitado              // VARIABLE PRIMITIVA


        Boolean experienciaCompleja = true;
        boolean experiencia = true; // BOOLEAN = solo puede dar TRUE o FALSE
        experiencia = false; // he sobreescrito el false encima del true

        final String DNI = "48167988";

        System.out.println("Este es mi primer programa en Java");
        System.out.print("Esta es la segunda linea del programa\n");
        System.out.println("Mi nombre es: "+miNombre);
        System.out.println("La letra del DNI es: "+letraDNI);
        System.out.println(edad);
        System.out.println("Mi altura es de: "+altura+" cm");
        System.out.println("Mi peso es de: "+peso+" kg");
        System.out.println("Mi experiencia es: "+experiencia);
        System.out.println("El numero de dni es "+DNI+letraDNI);
        System.out.println("El numero PI es "+Math.PI);
        System.out.println("El numero E es "+Math.E);

    }

    public void nombreMetodo (){

    }
    //TODO Esto tambien me falta




}
