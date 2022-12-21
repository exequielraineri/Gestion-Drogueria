/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Medicamento;
import LSE.Lista;
import LSE.Nodo;
import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class FacturaVenta {

    private int nroFactura;
    private Farmacia farmacia;
    private Calendar FechaEmision;
    private Calendar FechaVto;
    private Calendar FechaPago;
    private Lista<Medicamento> listaMedicamentos;
    private double total;

    public FacturaVenta() {
        FechaPago = null;
        listaMedicamentos = new Lista<>();
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public Calendar getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(Calendar FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public Calendar getFechaVto() {
        FechaVto=FechaEmision;
        FechaVto.add(Calendar.DATE, 7);
        return FechaVto;
    }

    public void setFechaVto(Calendar FechaVto) {
        this.FechaVto = FechaVto;
    }

    public Calendar getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Calendar FechaPago) {
        this.FechaPago = FechaPago;
    }

    public double getTotal() {
        Nodo<Medicamento> m=listaMedicamentos.inicio();
        while(m!=null){
            total+=m.getDato().getSubtotal();
            m=m.getPs();
        }
                
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public Lista<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public void setListaMedicamentos(Lista<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

}
