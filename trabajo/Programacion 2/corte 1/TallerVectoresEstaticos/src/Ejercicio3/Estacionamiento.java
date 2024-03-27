/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Estacionamiento {

    private static Vehiculo[] parqueo = new Vehiculo[3];
    private int cont;

    public Estacionamiento() {

    }

    public Vehiculo getParqueo(int pos) {
        return parqueo[pos];
    }

    public void setParqueo(int pos, Vehiculo vehiculo) {
        Estacionamiento.parqueo[pos] = vehiculo;
    }

    public boolean buscarVehiculo(Vehiculo buscar) {
        for (int i = 0; i < parqueo.length; i++) {
            Vehiculo vehiculo = parqueo[i];
            if (vehiculo != null) {
                if (vehiculo.getNumPlaca().equalsIgnoreCase(buscar.getNumPlaca())) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public Vehiculo buscarInfoVehiculo(String placa) {
        for (int i = 0; i < parqueo.length; i++) {
            Vehiculo vehiculo = parqueo[i];
            if (vehiculo != null) {
                if (vehiculo.getNumPlaca().equalsIgnoreCase(placa)) {
                    return vehiculo;
                }
            }
        }
        return null;
    }

    public void addVehiculo(Vehiculo nuevo) {
        if (buscarVehiculo(nuevo)) {
            JOptionPane.showMessageDialog(null, "El vehiculo ya esta registrado, no se puede ingresar");
        } else {
            if (cont < parqueo.length) {
                setParqueo(cont, nuevo);
                cont++;
            } else {
                JOptionPane.showMessageDialog(null, "El Parqueadero esta lleno");
            }
        }
    }

    public DefaultTableModel mostrarUnVehiculo(String placa) {
        DefaultTableModel model = new DefaultTableModel();

        if (buscarInfoVehiculo(placa) != null) {
            String columnas[] = {"# Placa", "Tipo", "Fecha y hora Entrada",
                "Fecha y hora Salida", "Valor a pagar"};
            model.setColumnIdentifiers(columnas);

            Object fila[] = new Object[5];
            fila[0] = buscarInfoVehiculo(placa).getNumPlaca();
            fila[1] = buscarInfoVehiculo(placa).getTipoVehiculo();
            fila[2] = buscarInfoVehiculo(placa).darFormato(buscarInfoVehiculo(placa).getFechaEntrada());
            fila[3] = buscarInfoVehiculo(placa).darFormato(buscarInfoVehiculo(placa).getFechaSalida());
            fila[4] = "no se";
            model.addRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "No existe el vehiculo");
        }
        return model;
    }

    public void OrdenarAscendente() {
        for (int i = 0; i < cont; i++) {
            Vehiculo vehiculo1 = parqueo[i];
            for (int j = 1; j < cont; j++) {
                Vehiculo vehiculo2 = parqueo[j];
                if (vehiculo1.getTipoVehiculo().compareToIgnoreCase(vehiculo2.getTipoVehiculo()) > 0
                        && vehiculo1.getNumPlaca().compareToIgnoreCase(vehiculo2.getNumPlaca()) > 0) {
                    setParqueo(i, vehiculo2);
                    setParqueo(j, vehiculo1);
                }
            }
        }
    }

    public DefaultTableModel mostrarTodos() {
        OrdenarAscendente();
        DefaultTableModel model = new DefaultTableModel();

        String columnas[] = {"# Placa", "Tipo", "Fecha y hora Entrada",
            "Fecha y hora Salida", "Valor a pagar"};
        model.setColumnIdentifiers(columnas);

        Object fila[] = new Object[5];
        for (int i = 0; i < cont; i++) {
            fila[0] = getParqueo(i).getNumPlaca();
            fila[1] = getParqueo(i).getTipoVehiculo();
            fila[2] = getParqueo(i).darFormato(getParqueo(i).getFechaEntrada());
            fila[3] = getParqueo(i).darFormato(getParqueo(i).getFechaSalida());
            fila[4] = "no se";
            model.addRow(fila);
        }

        return model;
    }
}
