package taller3poo;

public class Problema4_EquipoCelularesBase {
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;

    public Problema4_EquipoCelularesBase(String so, double tp, double ci, double iva, String mac, String imei) {
        sistemaOperativo = so;
        tamanoPantalla = tp;
        costoInicial = ci;
        ivaPorcentaje = iva;
        direccionMac = mac;
        informacionIMEI = imei;
        calcularCostoFinal();
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + (costoInicial * ivaPorcentaje / 100);
    }
    public String toString() {
        return String.format("Sistema Operativo: %s\nTamano Pantalla: %.2f\nCosto Inicial: %.2f\nIVA: %.2f%%\nCosto Final: %.2f\nMAC: %s\nIMEI: %s",
                sistemaOperativo, tamanoPantalla, costoInicial, ivaPorcentaje, costoFinal, direccionMac, informacionIMEI);
    }
}
