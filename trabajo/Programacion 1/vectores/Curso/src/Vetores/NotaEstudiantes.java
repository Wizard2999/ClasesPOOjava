/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;


/**
 *
 * @author Groot1915
 */
public class NotaEstudiantes {

    private double notas[] = new double[30];

    public NotaEstudiantes() {

    }

    public double[] getNotas() {
        return notas;
    }

    public double getNotas(int pos) {
        return notas[pos];
    }

    public void setNotas(int pos, double notas) {
        this.notas[pos] = notas;
    }

    public int notasTyC() {
        int contador = 0;

        for (int i = 0; i < getNotas().length; i++) {

            if (getNotas(i) >= 3 && getNotas(i) <= 4) {

                contador++;

            }

        }
        return contador;
    }

    public int NotasC() {

        int contador = 0;

        for (int i = 0; i < getNotas().length; i++) {

            if (getNotas(i) > 4) {

                contador++;

            }

        }
        return contador;
    }

    public int nReprobados() {

        int contador = 0;

        for (int i = 0; i < getNotas().length; i++) {

            if (getNotas(i) < 3 && getNotas(i) != 0) {

                contador++;

            }

        }
        return contador;
    }

    public double promedioReprobados() {

        double promedioR = 0;

        for (int i = 0; i < getNotas().length; i++) {

            if (getNotas(i) < 3) {

                promedioR = promedioR + getNotas(i);

            }

        }

        promedioR = promedioR / nReprobados();

        return promedioR;

    }

    public double promedioEst() {
        
        double promedioT = 0;
        int totalEst = 0;
        
        for (int i = 0; i < getNotas().length; i++) {
            
            if(getNotas(i) >0){
                totalEst ++;
                
               promedioT = promedioT+ getNotas(i);
            }
            
        }
        
        return (promedioT / totalEst);
        
    }

}
