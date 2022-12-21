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
public class Farmaceutico {

    private int farmtico_id;
    private int farmtico_dni;
    private String farmtico_nombre;
    private String farmtico_domicilio;

    public int getFarmtico_id() {
        return farmtico_id;
    }

    public void setFarmtico_id(int farmtico_id) {
        this.farmtico_id = farmtico_id;
    }

    public int getFarmtico_dni() {
        return farmtico_dni;
    }

    public void setFarmtico_dni(int farmtico_dni) {
        this.farmtico_dni = farmtico_dni;
    }

    public String getFarmtico_nombre() {
        return farmtico_nombre;
    }

    public void setFarmtico_nombre(String farmtico_nombre) {
        this.farmtico_nombre = farmtico_nombre;
    }

    public String getFarmtico_domicilio() {
        return farmtico_domicilio;
    }

    public void setFarmtico_domicilio(String farmtico_domicilio) {
        this.farmtico_domicilio = farmtico_domicilio;
    }

    public Farmaceutico(int farmtico_id, int farmtico_dni, String farmtico_nombre, String farmtico_domicilio) {
        this.farmtico_id = farmtico_id;
        this.farmtico_dni = farmtico_dni;
        this.farmtico_nombre = farmtico_nombre;
        this.farmtico_domicilio = farmtico_domicilio;
    }

    public Farmaceutico() {
    }
}
