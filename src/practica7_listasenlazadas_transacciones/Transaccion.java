/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7_listasenlazadas_transacciones;

/**
 *
 * @author SebasCarlosama
 */
public class Transaccion {

    private int numero_cuenta;
    private String fecha;
    private String tipo_transaccion;
    private double cantidad;

    public Transaccion(int numero_cuenta, String fecha, String tipo_transaccion, double cantidad) {
        this.numero_cuenta = numero_cuenta;
        this.fecha = fecha;
        this.tipo_transaccion = tipo_transaccion;
        this.cantidad = cantidad;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "N° de cuenta: " + this.numero_cuenta + "\nFecha: " + this.fecha + "\nTipo de transaccion: " + this.tipo_transaccion + "\nCantidad: " + this.cantidad+"\n";
    }

}
