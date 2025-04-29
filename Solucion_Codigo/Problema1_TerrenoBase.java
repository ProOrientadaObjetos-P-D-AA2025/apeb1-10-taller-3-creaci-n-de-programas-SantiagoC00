package taller3poo;

public class Problema1_TerrenoBase {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;
    
    
    public void setAncho(double an) {
        ancho = an;
    }

    public void setLargo(double lar) {
        largo = lar;
    }

    public void setValorMetroCuadrado(double v) {
        valorMetroCuadrado = v;
    }

    public void calcularArea() {
        area = largo * ancho;
    }
    public void calcularCostoTerreno(){
        costoTerreno = valorMetroCuadrado * area;   
    }
   public String toString() {
        return String.format("Ancho: %.2f\nLargo: %.2f\nValor m2: %.2f\nArea: %.2f\nCosto: %.2f",
                ancho, largo, valorMetroCuadrado, area, costoTerreno);
    }
}
