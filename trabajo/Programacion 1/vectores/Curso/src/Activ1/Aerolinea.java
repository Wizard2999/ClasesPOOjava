/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activ1;

/**
 *
 * @author Groot1915
 */
public class Aerolinea {
    
    private double distancia;
    private int nDias;
    private final int precioKm = 890500;
    
    public Aerolinea(){        
    }

    public Aerolinea(double distancia, int nDias) {
        this.distancia = distancia;
        this.nDias = nDias;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getnDias() {
        return nDias;
    }

    public void setnDias(int nDias) {
        this.nDias = nDias;
    }

    public int getPrecioKm() {
        return precioKm;
    }
    
    public boolean descuento(){
        
        if(getDistancia()>1000 && getnDias()>7){
            return true;
        }else {
            return false;
        }
    }
    
    public double precioPasaje(){
        
        double sinde;
        
        sinde = (getDistancia()*getPrecioKm());
        
        if(descuento()==true){
            return (sinde-(sinde*0.3));
        }else{
            return sinde;
        }                        
    }
    
}
