package paquete;

public class Coche {
    int numeroP=0;
    Coche() {

    }
    public void agregarP() {
        numeroP++;
    }
    public void mostrarP(){
        System.out.println("El numero de Puertas que tiene el auto es " + numeroP);
    }
}
