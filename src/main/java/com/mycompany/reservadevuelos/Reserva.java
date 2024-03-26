/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservadevuelos;

/**
 *
 * @author juanc
 */
public class Reserva {
    private int numReserva;
    private Vuelo v;

    public Reserva(int numReserva, Vuelo v) {
        this.numReserva = numReserva;
        this.v = v;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public Vuelo getV() {
        return v;
    }

    public void setV(Vuelo v) {
        this.v = v;
    }
    
}
