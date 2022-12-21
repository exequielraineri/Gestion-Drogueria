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
public class FacturaVentaDetalle {

    private int idDetalle;
    private int nroFactura;
    private int medID;
    private int cantidad;
    private Float precioUnitario;

    public FacturaVentaDetalle() {
    }

    public FacturaVentaDetalle(int idDetalle, int nroFactura, int medID, int cantidad, Float precioUnitario) {
        this.idDetalle = idDetalle;
        this.nroFactura = nroFactura;
        this.medID = medID;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
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

    public int getMedID() {
        return medID;
    }

    public void setMedID(int medID) {
        this.medID = medID;
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
