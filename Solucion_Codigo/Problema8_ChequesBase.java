package taller3poo;

public class Problema8_ChequesBase {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Problema8_ChequesBase(String cliente, String banco, double valor) {
        nombreCliente = cliente;
        nombreBanco = banco;
        valorCheque = valor;
        calcularComisionBanco();
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }
    public String toString() {
        return String.format("Cliente: %s\nBanco: %s\nValor Cheque: %.2f\nComision Banco: %.4f",
                nombreCliente, nombreBanco, valorCheque, comisionBanco);
    }
}
