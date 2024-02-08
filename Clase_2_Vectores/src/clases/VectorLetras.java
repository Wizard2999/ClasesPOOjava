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
   

    public VectorLetras() {
        letras = new char[3];
    }

    public char getLetras(int pos) {
        return letras[pos];
    }

    public void setLetras(int pos, char info) {
        letras[pos] = info;
    }

    public String infoAreaTexto() {
        String infoLetras = "";
        for (int i = 0; i < letras.length; i++) {
            char letra = getLetras(i);
            infoLetras += letra + " ";
        }
        return infoLetras;
    }

    public DefaultTableModel infoTablaLetras() {
        DefaultTableModel modelo = new DefaultTableModel();

        String columnas[] = {
            "Letras"
        };

        modelo.setColumnIdentifiers(columnas);

        Object filas[] = new Object[1];
        for (int i = 0; i < letras.length; i++) {
            char letra = getLetras(i);
            filas[0] = letra;
            modelo.addRow(filas);
        }
        return modelo;
    }
}
