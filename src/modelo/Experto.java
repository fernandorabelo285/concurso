/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Experto extends Participante  {
    private int yearParticipacion;
    private Personaje lastPersonaje;

    public Experto() {
    }

    public Experto(int yearParticipacion, Personaje lastPersonaje) {
        this.yearParticipacion = yearParticipacion;
        this.lastPersonaje = lastPersonaje;
    }

   

    @Override
    public String toString() {
        return "Experto{" + "yearParticipacion=" + yearParticipacion + ", lastPersonaje=" + lastPersonaje + '}';
    }
    
    
}
