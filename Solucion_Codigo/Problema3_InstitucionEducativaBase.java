package taller3poo;

public class Problema3_InstitucionEducativaBase {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoPorEstudiante;
    private double presupuesto;

    public void setNombre(String n) { nombre = n; }
    public void setTipoInstitucion(String t) { tipoInstitucion = t; }
    public void setNumeroAlumnos(int n) { numeroAlumnos = n; }
    public void setNumeroDocentes(int n) { numeroDocentes = n; }
    public void setNumeroSedes(int n) { numeroSedes = n; }
    public void setGastoPorEstudiante(double g) { gastoPorEstudiante = g; }

    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastoPorEstudiante;
    }
    public String toString() {
        return String.format("Institución: %s (%s)\nAlumnos: %d\nDocentes: %d\nSedes: %d\nGasto Estudiante: %.2f\nPresupuesto: %.2f",
                nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, numeroSedes, gastoPorEstudiante, presupuesto);
    }
}
