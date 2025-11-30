package org.osantos.appalmacenventasmayoreo.producto;

import org.osantos.appalmacenventasmayoreo.vendedor.Persona;

import java.util.Date;

public class Producto {
    private String marca;
    private String articulo;
    private double costo;
    private double cantidad;
    private Date fechaAlmacen;
    private Date fechaVenta;

    public Producto(String marca, Date fechaVenta, Date fechaAlmacen, double cantidad, double costo, String articulo) {
        this.marca = marca;
        this.cantidad = cantidad;
        this.costo = costo;
        this.articulo = articulo;
        this.fechaVenta = fechaVenta;
        this.fechaAlmacen = fechaAlmacen;
    }


    public String getMarca() {
        return marca;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public Date getFechaAlmacen() {
        return fechaAlmacen;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public String getArticulo() {
        return articulo;
    }

    String vender (Persona persona){
        return persona.ventaRealizadaPor();
    }

}
