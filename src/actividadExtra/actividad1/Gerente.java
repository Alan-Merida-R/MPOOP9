/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad1;
/**
 *Clase que crea un gerente
 * @author alumno
 */
public class Gerente extends Empleado{
    private int presupuesto;
    /**
     * Método que asigna presupuesto
     * @param presupuesto Presupuesto del gerente
     */
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto=presupuesto;
    }
    /**
     * Constructor vacío
     */
    public Gerente() {
    }
    /**
     * Constructor con atributos
     * @param presupuesto Cantidad de presupuesto del gerente
     * @param nombre Nombre del gerente
     * @param numEmpleado Número de empleado del gerente
     * @param sueldo Sueldo que recibe el gerente
     */
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);//super signifca que viene de super clase es un método construtor
        this.presupuesto = presupuesto;
    }
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Método que imprime los atributos del gerente
     * @return Atributos del gerente
     */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    //con un super se sacan los demàs parametros
    
}
