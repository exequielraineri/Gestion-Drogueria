/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class FacturaVentaCabecera {

    private int nroFactura;
    private int farmaciaID;
    private Date fechaEmision;
    private Date fechaVto;
    private Date fechaPago;

    public FacturaVentaCabecera() {
    }

    public FacturaVentaCabecera(int nroFactura, int farmaciaID, Date fechaEmision, Date fechaVto, Date fechaPago) {
        this.nroFactura = nroFactura;
        this.farmaciaID = farmaciaID;
        this.fechaEmision = fechaEmision;
        this.fechaVto = fechaVto;
        this.fechaPago = fechaPago;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public int getFarmaciaID() {
        return farmaciaID;
    }

    public void setFarmaciaID(int farmaciaID) {
        this.farmaciaID = farmaciaID;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(Date fechaVto) {
        this.fechaVto = fechaVto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

}
