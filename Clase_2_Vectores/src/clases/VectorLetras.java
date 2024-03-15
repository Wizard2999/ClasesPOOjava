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
public class VectorLetras {

    private char letras[];
    private int tamanio;

    public VectorLetras() {

    }

    public void inicializarVector() {
        letras = new char[tamanio];
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public char getLetras(int pos) {
        return letras[pos];
    }

    public char[] getLetras() {
        return letras;
    }    

    public void setLetras(int pos, char letra) {
        this.letras[pos] = letra;
    }

    public String infoAreaTexto() {
        String infoLetras = "Letras que has ingresado: \n";
        for (int i = 0; i < letras.length; i++ ){
            infoLetras += getLetras(i)+" ";
        }
        return  infoLetras;
    }

    public DefaultTableModel infoTablaLetras() {
        DefaultTableModel modelo = new DefaultTableModel();

        String columnas[] = {
            "Letras"
        };

        modelo.setColumnIdentifiers(columnas);

        Object filas[] = new Object[1];
        
        //Llenado del modelo de la tabla letras--------------------
        for (int i = 0; i < letras.length; i++) {
            char letra = getLetras(i);
            filas[0] = letra;
            modelo.addRow(filas);
        }
        //----------------------------------
        return modelo;
    }
    
}
