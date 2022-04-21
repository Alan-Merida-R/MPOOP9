/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad2;

/**
 *Clase que crea un profesor
 * @author alumno
 */
public abstract class Profesor extends Empleado{
    private int numAlumnos;
    /**
     * Constructor vacío
     */
    public Profesor() {
    }
    /**
    * Constructor con atributos
    * @param numAlumnos NÃºmero de alumnos del profesor
    * @param salario Salario del profesor
    * @param horaEntrada Hora de entrada del profesor
    * @param horaSalida Hora de salida del profesor
    * @param mascota Mascota del profesor con sus atributos
    * @param nombre Nombre del profesor
    * @param edad Edad del profesor
    */
    public Profesor(int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }
    public int getNumAlumnos() {
        return numAlumnos;
    }
    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
    /**
     * Método que reprueba alumnos
     */
    public abstract void reprobar(int calidicacion);
    /**
     * Métodoabtracto que pasa alumnos
     */
    public abstract void pasarAlumnos(int calidicacion);
    /**
     * Método que explica un tema
     */
    public void explicar(){
        System.out.println("Estoy explicando");
    }
    /**
     * Método que enseña a los alumnos
     */
    public void ensenar(){
        System.out.println("Estoy enseñando");
    }
    /**
     * Método que imprime los atributos del profesor
     * @return Todos los atributos del profesor
     */
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "numAlumnos=" + numAlumnos + '}';
    }
    
            
}
