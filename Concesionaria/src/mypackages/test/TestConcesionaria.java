package mypackages.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mypackages.entities.Auto;
import mypackages.entities.Moto;
import mypackages.entities.Vehiculo;

public class TestConcesionaria {

    public static void main(String[] args) {
//-------------------Objectos Auto------------------------------------------ 
        Auto auto1 = new Auto(4, "Peugeot", "206", 200);
        Auto auto2 = new Auto(5, "Peugeot", "208", 250);

//--------------------Objectos Moto-----------------------------------------        
        Moto moto1 = new Moto(125, "Honda", "Titan", 60);
        Moto moto2 = new Moto(160, "Yamaha", "YBR",  80);

//--------------------Lista Concesionaria---------------------------------
        //--Interfaz List--
        List<Vehiculo> listaConcesionaria = new ArrayList();

        listaConcesionaria.add(auto1);
        listaConcesionaria.add(moto1);
        listaConcesionaria.add(auto2);
        listaConcesionaria.add(moto2);

//---------------------Salida Consola----------------------------------------
        System.out.println("=======================================================");

        //------------------------ORDEN PEDIDO --------------------------------------------------------------
        listaConcesionaria.forEach(objetosListaConcesionaria -> System.out.println(objetosListaConcesionaria));

        //--Si se requiere a lo largo del proyecto el uso abreviado del metodo forEach utilizar..
        //listaConcesionaria.forEach(System.out::println);
        System.out.println("=======================================================");

        //-----------------------VEHICULO MAS CARO-----------------------------------------------
        //Precio mayor
        double precioMayor = listaConcesionaria
                .stream()
                .max(Comparator.comparing(Vehiculo -> Vehiculo.getPrecio()))
                .get()
                .getPrecio();

        //Vehiculo de mayor precio
        listaConcesionaria
                .stream()
                .filter(objetoVehiculo -> objetoVehiculo.getPrecio() == (precioMayor))
                .forEach(objetosListaConcesionaria -> System.out.println("Vehiculo mas Caro: " 
                + objetosListaConcesionaria.getMarca()
                + " " 
                + objetosListaConcesionaria.getModelo()));

        //-----------------------VEHICULO MAS BARATO-----------------------------------------------
        //Precio menor
        double precioMenor = listaConcesionaria
                .stream()
                .min(Comparator.comparing(Vehiculo -> Vehiculo.getPrecio()))
                .get()
                .getPrecio();

        //Vehiculo de menor precio
        listaConcesionaria
                .stream()
                .filter(objetoVehiculo -> objetoVehiculo.getPrecio() == (precioMenor))
                .forEach(objetosListaConcesionaria -> System.out.println("Vehiculo mas Barato: " 
                + objetosListaConcesionaria.getMarca() 
                + " " 
                + objetosListaConcesionaria.getModelo()));

        //-----------------------VEHICULO  QUE CONTENGA EN EL MODELO LA LETRA 'Y'-------------
        listaConcesionaria
                .stream()
                .filter(objetoVehiculo -> objetoVehiculo.getModelo().contains("Y"))
                .forEach(objetosListaConcesionaria -> System.out.println("Vehículo que contiene en el modelo la letra ‘Y’ :" 
                + objetosListaConcesionaria.getMarca()
                + " "
                + objetosListaConcesionaria.getModelo()
                + " $"
                + objetosListaConcesionaria.getPrecio()));

        System.out.println("=======================================================");

        //-----------------------VEHICULOS ORDENADOS DE MAYOR A MENOR 'PRECIO'---------------------------------
        System.out.println("Vehículos ordenados por precio de menor a mayor:");

        listaConcesionaria
                .stream()
                .sorted(Comparator.comparingDouble(Vehiculo -> Vehiculo.getPrecio()))
                .forEach(objetosListaConcesionaria -> System.out.println(objetosListaConcesionaria.getMarca() 
                + " " 
                + objetosListaConcesionaria.getModelo()));

        System.out.println("=======================================================");

        //-----------------------VEHICULOS ORDENADOS POR ORDEN NATURAL('ALFABETICAMENTE')---------------------------------
        System.out.println("Vehiculos ordenados por orden Natural(Alfabeticamente):");
        listaConcesionaria
                .stream()
                .sorted(Comparator.comparing(Vehiculo->Vehiculo.getMarca()))
                .forEach(objetosListaConcesionaria->System.out.println(objetosListaConcesionaria.toString()));
        
        
        
        System.out.println("=======================================================");

    }

}
