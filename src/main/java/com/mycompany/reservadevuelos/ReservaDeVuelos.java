/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reservadevuelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
public class ReservaDeVuelos {

    public static void main(String[] args) {
        ArrayList<Reserva> reservas = new ArrayList();
        reservas.add( new Reserva(1, null));
        reservas.add( new Reserva(2, null));

        Flota flota = new Flota();

        //creo los pilotos
        Piloto[] pilotos = new Piloto[2];
        pilotos[0] = new Piloto("Jose","2342342",23545,null);
        pilotos[1] = new Piloto("Ana","89746454",23550,null);


        Vuelo vuelo = new Vuelo(8514,null,reservas);
        ArrayList<Vuelo> vuelos= new ArrayList();
        vuelos.add(vuelo);


        //setear reservas en vuelo
        reservas.get(0).setV(vuelo);
        reservas.get(1).setV(vuelo);

        Avion avion = new Avion(12000,
                vuelos,
                flota,
                pilotos);

        vuelo.setPertenece(avion);

        pilotos[0].setVuela(avion);
        pilotos[1].setVuela(avion);

        pilotos[0].Volar();
        JOptionPane.showMessageDialog(null, "Reservas\n------------------------------------\n"
                + "Numero de Reserva: "+reservas.get(0).getNumReserva()+
                "\nVuelo: "+ reservas.get(0).getV().getId()+
                "\n------------------------------------"
                + "\nNumero de Reserva: "+reservas.get(1).getNumReserva()+
                "\nVuelo: "+ reservas.get(1).getV().getId()+"\n------------------------------------");

    }
}
