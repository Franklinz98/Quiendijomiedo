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
public class Juego {

    private ArrayList<Equipo> Equipo = new ArrayList();
    private double puntaje;
    private int Golpeslogrados;
    private String modojuego;
    private String marcadora;
    private double promedio;
    private Campo campo;
    private boolean ganador;

    public Juego(String modojuego, String marcadora, Campo campo) {
        this.modojuego = modojuego;
        this.marcadora = marcadora;
        this.campo = campo;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public void setGolpeslogrados(int Golpeslogrados) {
        this.Golpeslogrados = Golpeslogrados;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Equipo> getEquipo() {
        return Equipo;
    }

    public double getPromedio() {
        return promedio;
    }

}
