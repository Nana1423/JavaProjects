
package com.mycompany.vehiculo2;

import java.util.Scanner;


public class Vehiculo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String marca, modelo;
        float precio, menorPrecio;
        int numeroVehiculos, indiceMenor;
        
        //Usuario digita la cantidad de autos a registrar
        System.out.print("Digite la cantidad de Vehiculos: ");
        numeroVehiculos = scan.nextInt();
        VehiculoM coches[] = new VehiculoM[numeroVehiculos];
        
        //Usuario registra los coches
        for (int i=0; i<numeroVehiculos;i++) {
            System.out.print("Digite la marca: ");
            marca = scan.next();
            System.out.print("Digite el modelo: ");
            modelo = scan.next();
            System.out.print("Digite el precio: ");
            precio = scan.nextFloat();
            
            coches [i] = new VehiculoM (marca, modelo,precio);
        }
        
        //Encontrando el coche mas barato
        menorPrecio = 0;
        indiceMenor = 0;
        for (int i=0; i<numeroVehiculos; i++) {
            if (coches[i].getPrecio()<menorPrecio) {
                menorPrecio = coches[i].getPrecio();
                indiceMenor = i;
            }
        }
        
        //Imprimiendo el modelo con el menor precio
        System.out.println("Especificaciones del auto mas barato:");
        System.out.print(coches[indiceMenor].mostrarDatos());
      
        
    }
}
