/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad2;

/**
 * Clase Padre que crea un ser vivo
 * @author alumno
 */
public class SerVivo extends Object{
    private String nombre;
    private int edad;
    /**
     * Constructor vacío
     */
    public SerVivo() {
    }
    /**
     * Constructor con atributos
    * @param nombre Nombre propio del ser vivo
    * @param edad Edad delser vivo en aÃ±os (entero)
    */
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Método que hace respirar al ser vivo
     */
    public void respirar(){
        System.out.println("Estoy respirando");
    }
    /**
    * toString del ser vivo que imprime todos los atributos de un ser vivo
    * @return Atributos de un ser vivo
    */
    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
