package org.osantos.appalmacenventasmayoreo.vendedor;

public final class Persona {
    private String nombre;
    private int idPersonal;

    public Persona(String nombre, int idPersonal) {
        this.nombre = nombre;
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public String ventaRealizadaPor(){
        return "Venta realizada por: " + this.nombre;
    }

}
