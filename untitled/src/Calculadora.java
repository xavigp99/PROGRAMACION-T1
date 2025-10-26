public class Calculadora {

    public static void suma(int a, int b){
        int resultado = a+b;
        System.out.println("Suma: "+resultado);
    }

    public static void resta(int a, int b){
        int resultado= a-b;
        System.out.println("Resta: "+resultado);
    }

    public static void multiplicacion(int a, int b){
        int resultado= a*b;
        System.out.println("Multiplicación: "+resultado);
    }

    public static void division(int a, int b){
        int resultado= a/b;
        System.out.println("División: "+resultado);
    }

    public static void main(String[] args){
        int numero1= 10;
        int numero2= 5;

        System.out.println("Número 1: "+numero1);
        System.out.println("Número 2: "+numero2);

        suma(numero1, numero2);
        resta(numero1, numero2);
        multiplicacion(numero1, numero2);
        division(numero1, numero2);
    }

}
