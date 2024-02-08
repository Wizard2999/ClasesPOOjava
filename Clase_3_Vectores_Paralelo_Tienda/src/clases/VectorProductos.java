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
public class VectorProductos {

    private int codProdcuto[];
    private String nombreProduc[];
    private float precioCompra[];
    private float precioVenta[];
    private int cantidad[];
    private int tamanio;

    public VectorProductos() {

    }

    public void crearVectores() {
        codProdcuto = new int[tamanio];
        nombreProduc = new String[tamanio];
        precioCompra = new float[tamanio];
        precioVenta = new float[tamanio];
        cantidad = new int[tamanio];
    }

    public int getCodProdcuto(int pos) {
        return codProdcuto[pos];
    }

    public void setCodProdcuto(int pos, int dato) {
        this.codProdcuto[pos] = dato;
    }

    public String getNombreProduc(int pos) {
        return nombreProduc[pos];
    }

    public void setNombreProduc(int pos, String nombreProduc) {
        this.nombreProduc[pos] = nombreProduc;
    }

    public float getPrecioCompra(int pos) {
        return precioCompra[pos];
    }

    public void setPrecioCompra(int pos, float precioCompra) {
        this.precioCompra[pos] = precioCompra;
    }

    public float getPrecioVenta(int pos) {
        return precioVenta[pos];
    }

    public void setPrecioVenta(int pos, float precioVenta) {
        this.precioVenta[pos] = precioVenta;
    }

    public int getCantidad(int pos) {
        return cantidad[pos];
    }

    public void setCantidad(int pos, int cantidad) {
        this.cantidad[pos] = cantidad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setTamanio() {
        tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de "
                + "productos que quieres en tu tienda"));
        crearVectores();
    }

    public DefaultTableModel cargarTabla() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();

        String columnas[] = {
            "Codigo",
            "Nombre",
            "Precio compra",
            "Precio venta",
            "cantidad"};
        defaultTableModel.setColumnIdentifiers(columnas);

        Object filas[] = new Object[5];
        for (int i = 0; i < getTamanio(); i++) {
            filas[0] = getCodProdcuto(i);
            filas[1] = getNombreProduc(i);
            filas[2] = getPrecioCompra(i);
            filas[3] = getPrecioVenta(i);
            filas[4] = getCantidad(i);

            defaultTableModel.addRow(filas);
        }

        return defaultTableModel;
    }

    public String infoCargando(int pos) {
        String info = "Informacion datos posicion "+pos+" de los vectores";
        info+="\nCodigo:"+getCodProdcuto(pos)+
                "\nNombre: "+getNombreProduc(pos)+
                "\nPrecio compra: "+getPrecioCompra(pos)+
                "\nPrecio vente: "+getPrecioVenta(pos)+
                "\nCantidad: "+getCantidad(pos);
        return info;
    }
    
   
}
