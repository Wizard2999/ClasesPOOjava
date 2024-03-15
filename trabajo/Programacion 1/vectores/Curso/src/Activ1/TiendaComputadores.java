/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activ1;

/**
 *
 * @author Groot1915
 */
public class TiendaComputadores {

    private double precio;
    private String marca;

    public TiendaComputadores() {

    }

    public TiendaComputadores(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double calDescuento() {

        if (getPrecio() >= 1000000) {
            if ("ABACO".equals(getMarca())) {
                return (getPrecio() * 0.15);
            } else {
                return (getPrecio() * 0.1);
            }

        } else if ("ABACO".equals(getMarca())) {
            return (getPrecio() * 0.05);
        } else {
            return 0;
        }

    }

    public double total() {
        return (getPrecio() - calDescuento());
    }

}
