package taller3poo;

public class Problema5_EstudianteBase {
    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private String estado;

    public Problema5_EstudianteBase (String nombre, double c1, double c2, double c3) {
        nombreEstudiante = nombre;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
        calcularPromedio();
        determinarEstado();
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
    }

    public void determinarEstado() {
        estado = promedio >= 6.5 ? "Aprobado" : "Reprobado";
    }
     public String toString() {
        return String.format("Nombre: %s\nNotas: %.2f, %.2f, %.2f\nPromedio: %.2f\nEstado: %s",
                nombreEstudiante, calificacion1, calificacion2, calificacion3, promedio, estado);
    }
}
