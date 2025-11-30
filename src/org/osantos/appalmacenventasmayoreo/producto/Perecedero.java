package org.osantos.appalmacenventasmayoreo.producto;

import java.util.Date;

public final class Perecedero extends Producto {
    private int vidaUtil;


    public Perecedero(String marca, Date fechaVenta, double cantidad, double costo, String articulo, int vidaUtil) {
        super(marca, fechaVenta, cantidad, costo, articulo);
        this.vidaUtil = vidaUtil;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }


    @Override
    public String toString() {

        return super.toString() +
                ", vida Util: " + vidaUtil +
                " días";
    }
}
