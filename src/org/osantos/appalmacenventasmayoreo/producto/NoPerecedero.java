package org.osantos.appalmacenventasmayoreo.producto;

import java.util.Date;

public final class NoPerecedero extends Producto{
    private int temperaturaAlmacenamiento;
    private int humedadAlmacenamiento;

    public NoPerecedero(String marca, Date fechaVenta, Date fechaAlmacen, double cantidad, double costo, String articulo, int temperaturaAlmacenamiento, int humedadAlmacenamiento) {
        super(marca, fechaVenta, fechaAlmacen, cantidad, costo, articulo);
        this.temperaturaAlmacenamiento = temperaturaAlmacenamiento;
        this.humedadAlmacenamiento = humedadAlmacenamiento;
    }

    public int getTemperaturaAlmacenamiento() {
        return temperaturaAlmacenamiento;
    }

    public int getHumedadAlmacenamiento() {
        return humedadAlmacenamiento;
    }
}
