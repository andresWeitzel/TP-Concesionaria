
package mypackages.entities;

//Class
public class Moto extends Vehiculo {
    private int cilindrada;
    
    //Constructor
    public Moto(int cilindrada, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }
    
    
    //Getters and Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    //Method toString
    @Override
    public String toString() {
       return "Marca:" + marca + "//Modelo:" + modelo + "//Cilindrada:" + cilindrada + "//Precio:$" + precio;
   }
    
    
    
    
}
