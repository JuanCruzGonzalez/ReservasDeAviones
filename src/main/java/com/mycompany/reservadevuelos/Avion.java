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
public class Avion {
    private int autonomia;
    private ArrayList<Vuelo> vuelo;
    private Flota flota;
    private Piloto piloto[];

    public Avion(int autonomia, ArrayList<Vuelo> vuelo, Flota flota, Piloto[] piloto) {
        this.autonomia = autonomia;
        this.vuelo = vuelo;
        this.flota = flota;
        this.piloto = piloto;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public ArrayList<Vuelo> getVuelo() {
        return vuelo;
    }

    public void setVuelo(ArrayList<Vuelo> vuelo) {
        this.vuelo = vuelo;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    public Piloto[] getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto[] piloto) {
        this.piloto = piloto;
    }
    
}
