/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activ1;

/**
 *
 * @author Groot1915
 */
public class SueldoTra {

    private int horasTraba;
    private double valorHora;
    
    public SueldoTra(){
        
    }

    public SueldoTra(int horasTraba, double valorHora) {
        this.horasTraba = horasTraba;
        this.valorHora = valorHora;
    }

    public int getHorasTraba() {
        return horasTraba;
    }

    public void setHorasTraba(int horasTraba) {
        this.horasTraba = horasTraba;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public int horasEx(){
        int sera = getHorasTraba()-40;
        
        if(sera>0){
            return sera;
        }else{
            return 0;
        }
    }

    public double calcularSueldoSem() {
        if (getHorasTraba() > 40) {

            
            return (((getHorasTraba() - horasEx()) * getValorHora()) + (horasEx() * (getValorHora() * 2)));
        } else if (getHorasTraba() >= 0) {
            return (getHorasTraba() * getValorHora());
        } else {
            return 0;
        }
    }

}
