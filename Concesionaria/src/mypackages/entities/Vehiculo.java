
package mypackages.entities;

//Abstract Class Vehiculo
public abstract class Vehiculo {
    String marca;
    String modelo;
    float precio;
    
    //Construct
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
  
    //Getters and Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //toString
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
    
    //compareTo
   /* @Override
    public int compareTo(Vehiculo x){
        return compareTo
    }*/
    
    

}
