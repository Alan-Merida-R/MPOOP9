/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad2;

/**
 *Clase abtracta que crea un empleado
 * @author alumno
 */
public abstract class Empleado extends Persona{
    private float salario;
    private int horaEntrada, horaSalida;
    /**
     * Constructor vací­o
    */
    public Empleado() {
    }
    /**
    * Constructor con atributos
    * @param salario Salario que recibe el empleado
    * @param horaEntrada Hora de entrada del empleado
    * @param horaSalida Hora de salida del empleado
    * @param mascota Mascota del empleado con sus atributos
    * @param nombre Nombre del empleado
    * @param edad  Edad del empleado
    */
    public Empleado(float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public int getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    /**
     * Método para aclarar dudas
     */
    public void aclararDudas(){
        System.out.println("aclarando dudas");
    }
    /**
     * Metodo abstracto que te calcula el salario del empleado
     * @return 
     */
    public abstract float calcularSalario(int variableParaSalario);
    /**
    * Método que imprime los atributos del empleado
    * @return Atributos del empleado
    */
    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "salario=" + salario + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
    
}
