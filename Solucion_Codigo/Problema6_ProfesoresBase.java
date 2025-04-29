package taller3poo;

public class Problema6_ProfesoresBase {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Problema6_ProfesoresBase(String nom, String ape, String ced, double sb) {
        nombre = nom;
        apellido = ape;
        cedula = ced;
        sueldoBasico = sb;
        calcularSueldoTotal();
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }
    public String toString() {
        return String.format("Profesor: %s %s\nCedula: %s\nSueldo Basico: %.2f\nSueldo Total: %.2f",
                nombre, apellido, cedula, sueldoBasico, sueldoTotal);
    }
    
}
