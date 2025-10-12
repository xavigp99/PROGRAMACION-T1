import java.sql.SQLOutput;
import java.util.Objects;

public class Ejercicio5 {
    public static void main(String[] args) {
        final String aplicacion = "MiApp";
        String version = "1.0.0";
        String usuario = "Laura";
        int nivel = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: "+aplicacion);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+Math.PI);
        System.out.println("Usuario actual: "+usuario);
        System.out.println("Nivel: "+nivel);
        System.out.println("Puntuación: "+puntuacion);

        usuario = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("Usuario actualizado: "+usuario);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizada: "+puntuacion);
        }
    }

