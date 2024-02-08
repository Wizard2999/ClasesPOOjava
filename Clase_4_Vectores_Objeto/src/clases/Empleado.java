/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Interfaces.Utilidades;

/**
 *
 * @author usuario
 */
public class Empleado extends Persona implements Utilidades {

    private int numHrs;
    private float valorHra;

    public Empleado() {
        super();
    }

    public int getNumHrs() {
        return numHrs;
    }

    public void setNumHrs(int numHrs) {
        this.numHrs = numHrs;
    }

    public float getValorHra() {
        return valorHra;
    }

    public void setValorHra(float valorHra) {
        this.valorHra = valorHra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public float sueldo() {
    return getNumHrs()*getValorHra();
    }

}
