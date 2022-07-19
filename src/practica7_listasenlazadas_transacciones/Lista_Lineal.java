/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7_listasenlazadas_transacciones;

/**
 *
 * @author SebasCarlosama
 */
public class Lista_Lineal {

    private Nodo inicio;

    public Lista_Lineal() {
        this.inicio = null;
    }

    public void IngresarInicio(Object objeto) {
        Nodo nuevo = new Nodo(objeto);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void IngresarFinal(Object objeto) {
        Nodo nuevo = new Nodo(objeto);
        if (inicio == null) {
            inicio = new Nodo(objeto);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void IngresarOrdenado(Object informacion) {
        if (inicio == null) {
            inicio = new Nodo(informacion);
        } else {
            Nodo nuevo = new Nodo(informacion);
            double precio_a = ((Transaccion) informacion).getCantidad();
            double precio_b;
            Nodo aux_b = inicio, aux_a;

            if (precio_a < ((Transaccion) aux_b.getInformacion()).getCantidad()) {
                this.IngresarInicio(informacion);

            } else {

                if (aux_b.getSiguiente() == null) {
                    aux_b.setSiguiente(nuevo);
                } else {
                    aux_a = aux_b;
                    aux_b = aux_b.getSiguiente();
                    while (aux_b != null) {

                        precio_b = ((Transaccion) aux_b.getInformacion()).getCantidad();

                        if (precio_a > precio_b) {

                            if (aux_b.getSiguiente() == null) {
                                aux_b.setSiguiente(nuevo);
                                break;
                            } else {
                                aux_b = aux_b.getSiguiente();
                                aux_a = aux_a.getSiguiente();
                            }
                        } else {

                            nuevo.setSiguiente(aux_b);
                            aux_a.setSiguiente(nuevo);
                            break;
                        }
                    }

                }
            }

        }

    }

    public Nodo Retirar() {
        Nodo retorno;
        if (inicio != null) {
            if (inicio.getSiguiente() != null) {
                Nodo aux = inicio.getSiguiente();
                retorno = inicio;
                inicio = aux;
                return retorno;
            } else {
                retorno = inicio;
                inicio = null;
                return retorno;
            }
        } else {
            inicio = null;
            return null;
        }
    }

    @Override
    public String toString() {
        String r = "";
        Nodo aux = inicio;
        while (aux != null) {
            r += ((Transaccion) aux.getInformacion()).toString() + "\n\n";
            aux = aux.getSiguiente();
        }
        return r;
    }

}
