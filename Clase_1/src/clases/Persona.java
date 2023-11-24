/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Persona {

    private int edad;
    private String nombre;
    private long id;

    public Persona() {

    }

    public Persona(int edad, String nombre, long id) {
        this.edad = edad;
        this.nombre = nombre;
        this.id = id;
    }

    //metodo get devuelte el tipo de dato y la informacion que hay en el
    //Metodo set me modifica las caracteristicas de un atributo
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;

    }

    public String informacion() {
        return "Datos de la persona:\n"
                + "Identificacion: " + getId() + "\n"
                + "Nombre: " + getNombre() + "\n"
                + "Edad: " + getEdad();
    }

    public boolean isMayorEdad() {
        if (getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public DefaultTableModel InfoTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        String columnas[] = {
            "Identificación",
            "Nombre",
            "Edad",
            "Es mayor de edad?"
        };

        modeloTabla.setColumnIdentifiers(columnas);

        Object fila[] = new Object[4];

        fila[0] = getId();
        fila[1] = getNombre();
        fila[2] = getEdad();
        fila[3] = isMayorEdad();
        
        modeloTabla.addRow(fila);
        return modeloTabla;
    }
}
