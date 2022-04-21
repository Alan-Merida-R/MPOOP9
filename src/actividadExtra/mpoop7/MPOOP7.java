/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadExtra.mpoop7;

import actividadExtra.actividad1.Empleado;
import actividadExtra.actividad1.Gerente;
import actividadExtra.actividad2.Alumno;
import actividadExtra.actividad2.Mascota;
import actividadExtra.actividad2.Perro;
import actividadExtra.actividad2.Gato;
import actividadExtra.actividad2.Mesero;
import actividadExtra.actividad2.ProfesorAsignatura;
import actividadExtra.actividad2.ProfesorCarrera;


/**
 *Clase Principal
 * @author alumno
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado= new Empleado();
        empleado.setNombre("Joaquin");
        empleado.setNumEmpleado(9886645);
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        empleado.aumentarSueldo(30);
        System.out.println(empleado.toString());
        System.out.println(empleado);
        Gerente gerente=new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(887766);
        gerente.setSueldo(30_000);
        gerente.setPresupuesto(100_000);
                //asignar presupuesto y setpresupuesto es lo mismo y por lo tanto se normaliza
        System.out.println(gerente);
        gerente.aumentarSueldo(50);
        System.out.println(gerente);
        Gerente gerente2=new Gerente(1_000_000,"Saul",113365,50_000);
        System.out.println(gerente2);
        
        System.out.println("##########Alumno###########");
        Alumno alumno=new Alumno("Ing. Electrica",4,new Mascota("Blanco","Labrador","Azul","Jackson",2),"Pedro",20);
        System.out.println(alumno);
        alumno.respirar();
        alumno.aprender();
        alumno.darseDeBaja();
        alumno.estudiar();
        
        System.out.println("#########Gato############");
        Gato gato=new Gato("Naranja","Toyger","Verde","Garfield",5);
        System.out.println(gato);
        gato.respirar();
        gato.jugar();
        gato.rasgunar();
        gato.saltar();
        gato.trepar();
        gato.dormir();
        
        System.out.println("########Perro###########");
        Perro perro=new Perro(true,"Café","Pastor Aleman","Gris","Tom",8);
        System.out.println(perro);
        perro.respirar();
        perro.correr();
        perro.corretear();
        perro.saltar();
        perro.dormir();
        perro.jugar();
        
        System.out.println("#######Mesero#########");
        Mesero mesero=new Mesero("El Colibri","Negro",5,3_000,12,5,new Mascota("Gris","Kinkalow","Azul","Kikin",4),"Carlos",23);
        System.out.println(mesero);
        mesero.respirar();
        mesero.aclararDudas();
        mesero.darPedidos();
        mesero.recibirPedidos();
        mesero.recibirPropina();
        mesero.tomarDescanso();
        
        System.out.println("#######Profesor de asignatura#######");
        ProfesorAsignatura profAsig=new ProfesorAsignatura("Termodinamica",50,5_000,7,9,new Mascota("Manchado","Dalmata","Cafe","Pulgas",9),"Xochitl",34);
        System.out.println(profAsig);
        profAsig.respirar();
        profAsig.aclararDudas();
        profAsig.ensenar();
        profAsig.explicar();
        profAsig.pasarAlumnos();
        profAsig.reprobar();
        
        System.out.println("########Profesor de Carrera##########");
        ProfesorCarrera profCarr=new ProfesorCarrera(4,10,500,30_000,8,4,new Mascota("Cafe","Pastor Belga","Cafe","McQueen",9),"Alberto",45);
        System.out.println(profCarr);
        profCarr.respirar();
        profCarr.aclararDudas();
        profCarr.ensenar();
        profCarr.explicar();
        profCarr.pasarAlumnos();
        profCarr.reprobar();
    
    }
}

