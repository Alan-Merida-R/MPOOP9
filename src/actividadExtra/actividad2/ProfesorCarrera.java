/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadExtra.actividad2;

/**
 *Clase que crea un profesor de carrera
 * @author alumno
 */
public class ProfesorCarrera extends Profesor{
    private int numAsignaturas, grupos;
    /**
     * Constructor vacío
     */
    public ProfesorCarrera() {
    }
    /**
     * Constructor con atributos
    * @param numAsignaturas Numero de atributos del profesor de carrera
    * @param grupos Numero de grupos del profesor de carrera
    * @param numAlumnos Numero de alumnos del profesor de carrera
    * @param salario Salario del profesor de carrera
    * @param horaEntrada Hora de entrada del profesor de carrera
    * @param horaSalida Hora de salida del profesor de carrera
    * @param mascota Mascota del profesor de carrera con sus atributos
    * @param nombre Nombre del profesor de carrera
    * @param edad  Edad del profesor de carrera
    */
    public ProfesorCarrera(int numAsignaturas, int grupos, int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAsignaturas = numAsignaturas;
        this.grupos = grupos;
    }
    public int getNumAsignaturas() {
        return numAsignaturas;
    }
    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }
    public int getGrupos() {
        return grupos;
    }
    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }
    /**
    * To string que imprime todos los atributos de un profesor de carrera
    * @return Atributos del profesor de carrera
    */
    @Override
    public String toString() {
        return super.toString()+"ProfesorCarrera{" + "numAsignaturas=" + numAsignaturas + ", grupos=" + grupos + '}';
    }
    /**
     * reprobar alumnos con la calificacion
     * @param calidicacion calificacion del alumno
     */
    @Override
    public void reprobar(int calidicacion) {
        if(calidicacion<6)
        System.out.println("Reprobaste");
        else
            pasarAlumnos(calidicacion);
    }
    /**
     * aprobar alumnos dependiendo de su calificacion
     * @param calidicacion calificacion del alumno
     */
    @Override
    public void pasarAlumnos(int calidicacion) {
        if(calidicacion>=6)
            System.out.println("Pasaste");
        else
            reprobar(calidicacion);
    }
    /**
     * Calcula salario con el numero de materias
     * @param numeroDeTrabajos trabajos que tiene
     * @return 
     */
    @Override
    public float calcularSalario(int numeroDeTrabajos) {
        if (numeroDeTrabajos<2)
            setSalario(10000/(numeroDeTrabajos/2));
        return getSalario();
        
    }
}
