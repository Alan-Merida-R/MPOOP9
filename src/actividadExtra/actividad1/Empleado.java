/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad1;

/**
 *Clase que crea un empleado
 * @author alumno
 */
public class Empleado{//como todas las clases heredan de object no se one esto en los demàs
    private String nombre;
    private int numEmpleado, sueldo;
    /**
     * Constructor vacío
     */
    public Empleado() {
    }
    /**
     * Constructor con parametros
     * @param nombre Nombre del empleado
     * @param numEmpleado Número de empleado
     * @param sueldo Sueldo que recibe el empleado
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * Método que aumenta el sueldo del Empleado
     * @param porcentaje Porcentaje que aumenta el sueldo
     */
    public void aumentarSueldo(int porcentaje){
        sueldo += (int) (sueldo*porcentaje/100);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumEmpleado() {
        return numEmpleado;
    }
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * Método que imprime los atributos de la clase Empleado
     * @return Atributos de empleado
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}
