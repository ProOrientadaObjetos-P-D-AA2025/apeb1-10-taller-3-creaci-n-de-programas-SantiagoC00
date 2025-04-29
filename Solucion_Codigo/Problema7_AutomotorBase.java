package taller3poo;

public class Problema7_AutomotorBase {
     private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema7_AutomotorBase(String cedula, String marca, int anio, double valor) {
        cedulaDuenio = cedula;
        marcaVehiculo = marca;
        anioFabricacion = anio;
        valorVehiculo = valor;
        calcularValorMatricula();
    }

    public void calcularValorMatricula() {
        int antiguedad = 2025 - anioFabricacion;
        valorMatricula = valorVehiculo * 0.00002 * antiguedad;
    }
     public String toString() {
        return String.format("Dueno: %s\nMarca: %s\nAno: %d\nValor Vehiculo: %.2f\nValor Matricula: %.2f",
                cedulaDuenio, marcaVehiculo, anioFabricacion, valorVehiculo, valorMatricula);
    }
    
}
