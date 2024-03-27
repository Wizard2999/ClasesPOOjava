/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Vehiculo {

    private String numPlaca;
    private String tipoVehiculo;
    private Date fechaEntrada, FechaSalida;

    public Vehiculo(String numPlaca,
            String tipoVehiculo,
            Date fechaEntrada,
            Date FechaSalida) {
        this.numPlaca = numPlaca;
        this.tipoVehiculo = tipoVehiculo;
        this.fechaEntrada = fechaEntrada;
        this.FechaSalida = FechaSalida;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String info() {
        return "Informacion del vehiculo:\n"
                + "Numero de placa: " + getNumPlaca()
                + "\nTipo vehiculo: " + getTipoVehiculo()
                + "\nFecha y hora de ingreso: " + darFormato(getFechaEntrada())
                + "\nFecha y hora de salid" + darFormato(getFechaEntrada());
    }

    public String darFormato(Date fecha) {
        String strDateFormat = "dd/mm/aaaa hh:mm:ss";
        SimpleDateFormat formateador = new SimpleDateFormat(strDateFormat);
        return formateador.format(fecha);
    }

    public float tarifa() {
        switch (getTipoVehiculo()) {
            case "Automovil":
                return 2000;

            case "Motocicleta":

                return 1000;
            case "Camioneta":

                return 2000;
        }
        return 0;
    }

    public float valorPagar() {
        return 0;
    }
}
