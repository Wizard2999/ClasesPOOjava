/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Activ1;

/**
 *
 * @author Groot1915
 */
public class AlmacenAra {

    private double PrecioTraje;
    
    public AlmacenAra(){
        
    }

    public AlmacenAra(double PrecioTraje) {
        this.PrecioTraje = PrecioTraje;
    }

    public double getPrecioTraje() {
        return PrecioTraje;
    }

    public void setPrecioTraje(double PrecioTraje) {
        this.PrecioTraje = PrecioTraje;
    }
    
    public double calDescuento(){
        if(getPrecioTraje()>250000){
            
            return (getPrecioTraje()*0.15);
        }else{
            return (getPrecioTraje()*0.08);
        }
    }
    
    public double calTotal(){
        return (getPrecioTraje()-calDescuento());
    }
    
}
