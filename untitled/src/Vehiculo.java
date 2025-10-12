public class Vehiculo {

    private int ruedas;
    private int puertas;
    private int km;

    public Vehiculo(int ruedas, int puertas, int km) { //CONSTRUCTOR
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.km = km;
    }



    public void comparacion() {
        if (this.ruedas > this.puertas) {
            System.out.println("Este es descapotable");
        } else {
            System.out.println("Este es coche");
        }
    }

    public void sumakm() {

    }


    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo(4, 5, 150000);
        Vehiculo descapotable = new Vehiculo(4, 3, 200000);
        coche.comparacion();
        System.out.println(coche.puertas);
        System.out.println(coche.km);
        descapotable.comparacion();
        System.out.println(descapotable.puertas);
        System.out.println(descapotable.km);
    }


}