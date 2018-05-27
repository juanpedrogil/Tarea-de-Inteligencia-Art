/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemajarras;

/**
 *
 * @author juanpedrog
 */
public class Jarra {
    private int capacidad;//Representa la capacidad de la jarra
    private int cantidad;//Representa la cantidad de agua que tiene la jarra actualmente

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Jarra(int capacidad, int cantidad) {
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }
}
