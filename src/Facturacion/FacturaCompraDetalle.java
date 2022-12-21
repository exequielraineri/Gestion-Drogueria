/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

/**
 *
 * @author ADMIN
 */
public class FacturaCompraDetalle {
    private int idDetalle;
    private int nroFactura;
    private int drogaID;
    private int cantidad;
    private Float precioUnitario;

    public FacturaCompraDetalle(int idDetalle, int nroFactura, int drogaID, int cantidad, Float precioUnitario) {
        this.idDetalle = idDetalle;
        this.nroFactura = nroFactura;
        this.drogaID = drogaID;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public FacturaCompraDetalle() {
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public int getDrogaID() {
        return drogaID;
    }

    public void setDrogaID(int drogaID) {
        this.drogaID = drogaID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
