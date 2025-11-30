package org.osantos.appalmacenventasmayoreo.producto;

import java.util.Date;

public final class ArticuloLimpieza extends Producto{
    private String aplicacion;
    private int tiempoReaccion;

    public ArticuloLimpieza(String marca, Date fechaVenta, Date fechaAlmacen, double cantidad, double costo, String articulo, String aplicacion, int tiempoReaccion) {
        super(marca, fechaVenta, fechaAlmacen, cantidad, costo, articulo);
        this.aplicacion = aplicacion;
        this.tiempoReaccion = tiempoReaccion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public int getTiempoReaccion() {
        return tiempoReaccion;
    }
}
