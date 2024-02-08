/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class VectorAdministrador {

    private Administrador vectorAdministradores[];
    private int tamanio;

    public VectorAdministrador() {
    }

    public VectorAdministrador(int tamanio) {
        this.tamanio = tamanio;
        vectorAdministradores = new Administrador[tamanio];
    }

    public void CrearVector() {
        vectorAdministradores = new Administrador[tamanio];
    }

    public Administrador getVectorAdministradores(int pos) {
        return vectorAdministradores[pos];
    }

    public void setVectorAdministradores(Administrador dato, int pos) {
        this.vectorAdministradores[pos] = dato;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int buscarLineal(long identificacion) {//Esta es la busqueda
        //Secuencial o lineal implementada con for y con whle (el ciclo while esta comentado)
        int posicion = -1;
        for (int i = 0; i < vectorAdministradores.length; i++) {
            //Creamos nuestro administrador para guardar la informacion que nos devuelve
            //El metodo getVectorAdministradores(int pos)
            Administrador miAdministrador = getVectorAdministradores(i);

            //Preguntamos si la identificacion que me pasan es igual a la de
            //miAdministrador
            if (identificacion == miAdministrador.getIdentificacion()) {
                posicion = i;
            } else {
                posicion = -1;
            }
        }

        return posicion;
    }

    public int busquedaBinaria(long identificacion) {
        int inicio = 0;
        int fin = vectorAdministradores.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            // Si el elemento objetivo es igual al elemento del medio
            if (getVectorAdministradores(medio).getIdentificacion() == identificacion) {
                return medio; // Elemento encontrado, devuelve el índice
            }
            // Si el elemento objetivo es menor, busca en la mitad inferior
            if (getVectorAdministradores(medio).getIdentificacion() > identificacion) {
                fin = medio - 1;
            } // Si el elemento objetivo es mayor, busca en la mitad superior
            else {
                inicio = medio + 1;
            }
        }

        return -1; // Elemento no encontrado
    }

    public Administrador obtenerAdministrador(long indentificacion) {
        int posicion = buscarLineal(indentificacion);
        if (posicion >= 0) {
            return getVectorAdministradores(posicion);
        } else {
            return null;
        }
    }

    public DefaultTableModel mostrarUnAdmin(long identificacion) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();

        String columnas[] = {
            "identificacion",
            "nombre",
            "edad",
            "fecha Nacimiento",
            "usuario",
            "contraseña"
        };

        defaultTableModel.setColumnIdentifiers(columnas);
        Object fila[] = new Object[6];

        if (obtenerAdministrador(identificacion) != null) {
            fila[0] = obtenerAdministrador(identificacion).getIdentificacion();
            fila[1] = obtenerAdministrador(identificacion).getNombre();
            fila[2] = obtenerAdministrador(identificacion).getEdad();
            fila[3] = obtenerAdministrador(identificacion).getFechaNacimiento();
            fila[4] = obtenerAdministrador(identificacion).getUsuario();
            fila[5] = obtenerAdministrador(identificacion).getContrasenia();
            defaultTableModel.addRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "No existe un administradro "
                    + "con la identificacion: " + identificacion);

        }
        return defaultTableModel;
    }

    public DefaultTableModel cargarTabla() {
        DefaultTableModel dtm = new DefaultTableModel();

        String columnas[] = {
            "identificacion",
            "nombre",
            "edad",
            "fecha Nacimiento",
            "usuario",
            "contraseña"
        };

        dtm.setColumnIdentifiers(columnas);

        return dtm;
    }

    public DefaultTableModel mostrarAdministradores() {
        DefaultTableModel dtm = new DefaultTableModel();

        String columnas[] = {
            "identificacion",
            "nombre",
            "edad",
            "fechaNacimiento",
            "usuario",
            "contraseña"
        };

        dtm.setColumnIdentifiers(columnas);
        Object fila[] = new Object[6];

        int i = 0;
        while (i < vectorAdministradores.length) {
            fila[0] = getVectorAdministradores(i).getIdentificacion();
            fila[1] = getVectorAdministradores(i).getNombre();
            fila[2] = getVectorAdministradores(i).getEdad();
            fila[3] = getVectorAdministradores(i).getFechaNacimiento();
            fila[4] = getVectorAdministradores(i).getUsuario();
            fila[5] = getVectorAdministradores(i).getContrasenia();
            dtm.addRow(fila);
            i++;
        }
        return dtm;
    }

}
