package org.osantos.appalmacenventasmayoreo;

import org.osantos.appalmacenventasmayoreo.producto.*;
import org.osantos.appalmacenventasmayoreo.vendedor.Persona;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Persona vendedor1 = new Persona("Juanito", 26);
        Persona vendedor2 = new Persona("Patricio", 34);
        Date fecha = new Date();



        Producto[] productos = new Producto[4];
        productos[0] = new ArticuloLimpieza("Maestro Limpio", fecha, 3, 24, "Cloro", "Detergente", 10);
        productos[1] = new NoPerecedero("Duvalin", fecha, 0.5, 35, "Dulce", 10, 60);
        productos[2] = new Perecedero("Alpura", fecha, 0.5, 24, "Queso", 15);
        productos[3] = new Perecedero("Alpura", fecha, 1.2, 17, "Crema", 30);

        String vendido = vendedor2.ventaRealizadaPor();
        System.out.println(vendido);

        for (Producto elementos : productos) {
            System.out.println(elementos);
        }

    }
}
