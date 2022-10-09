package paquete;

public class Coche {
    int numeroPuertas=0;
    Coche() {

    }
    public void agregarPuertas() {
        numeroPuertas++;
    }
    public void mostrarPuertas(){
        System.out.println("El numero de Puertas que tiene el auto es " + numeroPuertas);
    }
}
