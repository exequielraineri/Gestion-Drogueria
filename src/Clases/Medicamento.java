/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ADMIN
 */
public class Medicamento {

    private int med_id;
    private String med_nombre;
    private Float med_precio;
    private int med_cantidad;
    private double subtotal;
    private int Med_ptoRepos;

    public int getMed_ptoRepos() {
        return Med_ptoRepos;
    }

    public void setMed_ptoRepos(int Med_ptoRepos) {
        this.Med_ptoRepos = Med_ptoRepos;
    }
    public Medicamento() {
        
    }

    public double getSubtotal() {
        
        return med_cantidad*med_precio;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Medicamento(int med_id, Float med_precio, int med_cantidad, int med_ptoRepos) {
        this.med_id = med_id;
        this.med_precio = med_precio;
        this.med_cantidad = med_cantidad;

    }

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getMed_nombre() {
        return med_nombre;
    }

    public void setMed_nombre(String med_nombre) {
        this.med_nombre = med_nombre;
    }

    public Float getMed_precio() {
        return med_precio;
    }

    public void setMed_precio(Float med_precio) {
        this.med_precio = med_precio;
    }

    public int getMed_cantidad() {
        return med_cantidad;
    }

    public void setMed_cantidad(int med_cantidad) {
        this.med_cantidad = med_cantidad;
    }

}
