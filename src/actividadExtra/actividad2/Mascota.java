/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad2;

/**
 *Clase que crea una mascota
 * @author alumno
 */
public abstract class Mascota extends SerVivo{
    private String color,raza,colorOjos;
    /**
     * Constructor vacío
     */
    public Mascota() {
    }
    /**
     * Constructor con atributos
     * @param color Color de la mascota
     * @param raza Raza de la mascota
     * @param colorOjos Color de ojos de la mascota
     * @param nombre Nombre de la mascota
     * @param edad Edad de la mascota
     */
    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getColorOjos() {
        return colorOjos;
    }
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    /**
     * Método que hace dormir a la mascota
     */
    public void dormir(){
        System.out.println("Zzzzzz"); 
    }
    /**
     * Método que hace jugar a la mascota
     */
    public abstract void jugar();
    /**
     * Método que hace saltar a la mascota
     */
    public abstract void saltar();
    /**
     * Método que imprime los atributos de la mascota
     * @return Atributos de la mascota
     */
    @Override
    public String toString() {
        return super.toString()+"Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
    
}
