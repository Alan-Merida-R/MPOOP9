/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;
import mpoop9.Poligono;
/**
 *Clase que crea un Cuadrilatero
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a, b;
    private float base, altura;
/**
 * Metodo constructor vacio
 */
    public Cuadrilatero() {
    }
    /**
     * Metodo constructor con atributos
     * @param base es la base del poligono
     * @param altura es la altura del poligono
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Metodo que te da el perimetro
     * @return 
     */
    @Override
    public float perimetro(){
        return 2*a+2*b;
    }
    /**
     * Metodo que te da el area
     * @return 
     */
    @Override
    public float area(){
        return base*altura;
    }
    /**
     * Metodo que te da los atributos de la clase
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
