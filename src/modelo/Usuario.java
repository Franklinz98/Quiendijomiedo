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
public class Usuario {

    ArrayList<Juego> Juegos = new ArrayList();
    double PuntajeHistorico;
    double PromdioHistorico;
    int id;
    String nombre;

    public Usuario(double PuntajeHistorico, double PromdioHistorico, int id, String nombre) {
        this.PuntajeHistorico = PuntajeHistorico;
        this.PromdioHistorico = PromdioHistorico;
        this.id = id;
        this.nombre = nombre;
    }

    public double getPuntajeHistorico() {
        return PuntajeHistorico;
    }

    public double getPromdioHistorico() {
        return PromdioHistorico;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Juego> getJuegos() {
        return Juegos;
    }

    public void setJuegos(ArrayList<Juego> Juegos) {
        this.Juegos = Juegos;
    }
    

}
