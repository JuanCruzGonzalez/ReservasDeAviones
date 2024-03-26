/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservadevuelos;

/**
 *
 * @author juanc
 */
public class Piloto extends Persona implements Volador{
    private int matricula;
    private Avion vuela;

    public Piloto(String Nombre, String dni, int matricula, Avion vuela) {
        super(Nombre, dni);
        this.matricula = matricula;
        this.vuela = vuela;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Avion getVuela() {
        return vuela;
    }

    public void setVuela(Avion vuela) {
        this.vuela = vuela;
    }
    @Override
    public void Volar(){
        System.out.println("Estoy volando....");
    }
}
