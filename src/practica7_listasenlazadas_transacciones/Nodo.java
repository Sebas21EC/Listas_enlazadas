/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7_listasenlazadas_transacciones;

/**
 *
 * @author SebasCarlosama
 */
public class Nodo {

    private Object informacion;
    private Nodo siguiente;

    /**
     * Construnctor
     */
    public Nodo(Object objeto) {
        this.informacion = objeto;
        this.siguiente = null;
    }

    /**
     * ********Propiedades****
     */
    public Object getInformacion() {
        return informacion;
    }

    public void setInformacion(Object informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
