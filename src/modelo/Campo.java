/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author franklinz
 */
public class Campo {
    int Capacidad;
    private ArrayList <String> ModosJuego = new ArrayList();
    private ArrayList <String> Marcadoras = new ArrayList();

    public Campo(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public ArrayList<String> getModosJuego() {
        return ModosJuego;
    }

    public void setModosJuego(ArrayList<String> ModosJuego) {
        this.ModosJuego = ModosJuego;
    }

    public ArrayList<String> getMarcadoras() {
        return Marcadoras;
    }

    public void setMarcadoras(ArrayList<String> Marcadoras) {
        this.Marcadoras = Marcadoras;
    }

    public int getCapacidad() {
        return Capacidad;
    }
    
}
