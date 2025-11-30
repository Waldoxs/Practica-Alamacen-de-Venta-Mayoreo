package org.osantos.appalmacenventasmayoreo.producto;

import org.osantos.appalmacenventasmayoreo.vendedor.Persona;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Producto {
    private String marca;
    private String articulo;
    private double costo;
    private double cantidad;
    private Date fechaVenta;

    public Producto(String marca, Date fechaVenta, double cantidad, double costo, String articulo) {
        this.marca = marca;
        this.cantidad = cantidad;
        this.costo = costo;
        this.articulo = articulo;
        this.fechaVenta = fechaVenta;

    }

    public String getMarca() {
        return marca;
    }

    public Date getFechaVenta() {
        return fechaVenta;
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

    @Override
    public String toString() {
        SimpleDateFormat formatoDia = new SimpleDateFormat("dd MM yyyy");
        return "marca: " + marca
                + ", articulo: " + articulo
                + ", costo: " + costo
                + ", cantidad: " + cantidad
                + ", fechaVenta: " + formatoDia.format(fechaVenta);
    }
    String vender(Persona persona) {
        return persona.ventaRealizadaPor();
    }

}
