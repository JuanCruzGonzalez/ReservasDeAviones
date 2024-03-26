/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservadevuelos;

import java.util.ArrayList;

/**
 *
 * @author juanc
 */
public class Vuelo {
    private int id;
    private Avion pertenece;
    private ArrayList<Reserva> reservas;

    public Vuelo(int id, Avion pertenece, ArrayList<Reserva> reservas) {
        this.id = id;
        this.pertenece = pertenece;
        this.reservas = reservas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Avion getPertenece() {
        return pertenece;
    }

    public void setPertenece(Avion pertenece) {
        this.pertenece = pertenece;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    
}
