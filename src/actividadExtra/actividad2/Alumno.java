/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad2;

/**
 * Clase que crea un alumno
 * @author alumno
 */
public class Alumno extends Persona{
    private String carrera;
    private int semestre;
    /**
     * Constructor vacío
     */
    public Alumno() {
    }
    /**
     * Constructor con atributos
     * @param carrera Nombre de la carrera que cursa el alumno
     * @param semestre Semestre que está cursando el alumno
     * @param mascota Mascota que tiene el alumno y los atributos de dicha mascota
     * @param nombre Nombre del alumno
     * @param edad Edad del alumno
     */
    public Alumno(String carrera, int semestre, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Método para aprender cosas de su carrera
     */
    public void aprender(){
        System.out.println("Estoy aprendiendo la carrera"+carrera);
    }
    /**
     * Método para poner a estudiar al alumno
     */
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    /**
     * Método para darse de baja de alguna(s) materia(s)
     */
    public void darseDeBaja(){
        System.out.println("Me estoy dando de baja");
    }
    /**
     * To string que imprime los atributos del alumno
     * @return Atributos del alumno
     */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
}
