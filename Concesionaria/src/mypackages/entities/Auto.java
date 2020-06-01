package mypackages.entities;

public  class Auto extends Vehiculo {

    private int puertas;
 
    //Constructor Auto(int,String,String,double);
    public Auto(int puertas, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    
    //Getters and Setters
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    //Method toString
    @Override
    public String toString() {
        return "Marca:" + marca + "//Modelo:" + modelo + "//Puertas:" + puertas + "//Precio:$" + precio;
    }
    
    
    
    
     
   
    
    
    
}
