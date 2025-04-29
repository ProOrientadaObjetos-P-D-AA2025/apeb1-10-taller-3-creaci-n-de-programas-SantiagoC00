package taller3poo;

public class Problema2_EquivalenteHoraBase {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public Problema2_EquivalenteHoraBase(int h) {
        horas = h;
        minutos = h * 60;
        segundos = h * 3600;
        dias = h / 24.0;
    }
    public String toString() {
        return String.format("Horas: %d\nMinutos: %d\nSegundos: %d\nDias: %.2f",
                horas, minutos, segundos, dias);
    }
}
