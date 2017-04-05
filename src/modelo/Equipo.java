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
public class Equipo {
    int GolpesGlobales;
    Double PuntajeGlobal;
    ArrayList <Usuario> Participantes= new ArrayList();

    public int getGolpesGlobales() {
        return GolpesGlobales;
    }

    public void setGolpesGlobales(int GolpesGlobales) {
        this.GolpesGlobales = GolpesGlobales;
    }

    public Double getPuntajeGlobal() {
        return PuntajeGlobal;
    }

    public void setPuntajeGlobal(Double PuntajeGlobal) {
        this.PuntajeGlobal = PuntajeGlobal;
    }

    public ArrayList<Usuario> getParticipantes() {
        return Participantes;
    }

    public void setParticipantes(ArrayList<Usuario> Participantes) {
        this.Participantes = Participantes;
    }
    
}
