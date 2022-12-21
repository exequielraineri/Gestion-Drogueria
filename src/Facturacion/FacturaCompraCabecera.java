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
public class FacturaCompraCabecera {

    private int nroFactura;
    private Date fechaEmision;
    private int fabricanteID;

    public FacturaCompraCabecera(int nroFactura, Date fechaEmision, int fabricanteID) {
        this.nroFactura = nroFactura;
        this.fechaEmision = fechaEmision;
        this.fabricanteID = fabricanteID;
    }

    public FacturaCompraCabecera() {
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getFabricanteID() {
        return fabricanteID;
    }

    public void setFabricanteID(int fabricanteID) {
        this.fabricanteID = fabricanteID;
    }

    
}
