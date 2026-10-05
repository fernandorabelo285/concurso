/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Participante extends Persona {
    
    private int edad;
    private String genero;
    private Categoria categoria;
    private Responsable responsable;

    public Participante() {
    }

    public Participante(int edad, String genero, Categoria categoria, Responsable responsable) {
        this.edad = edad;
        this.genero = genero;
        this.categoria = categoria;
        this.responsable = responsable;
    }

    public Participante(int edad, String genero, Categoria categoria, Responsable responsable, String nombre, String email) {
        super(nombre, email);
        this.edad = edad;
        this.genero = genero;
        this.categoria = categoria;
        this.responsable = responsable;
    }

    

    
    
    
}
