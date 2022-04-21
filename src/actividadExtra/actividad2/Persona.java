/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad2;

/**
 *Clase que crea una persona
 * @author alumno
 */
public class Persona extends SerVivo{
    private Mascota mascota;
    /**
     * Constructor vacío
     */
    public Persona() {
    }
    /**
     * Constructor con atributos
     * @param mascota Variable tipo mascota
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     */
    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }
    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    /**
     * Método que imprime los atributos del perro
     * @return Atributos del perro
     */
    @Override
    public String toString() {
        return super.toString()+"Persona{" + "mascota=" + mascota + '}';
    }
    
}
