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
public class Farmacia {

    private int farm_id;
    private String farm_cuit;
    private String farm_nombre;
    private String farm_domicilio;
    private int id_farmaceutico;

    public int getFarm_id() {
        return farm_id;
    }

    public void setFarm_id(int farm_id) {
        this.farm_id = farm_id;
    }

    public String getFarm_cuit() {
        return farm_cuit;
    }

    public void setFarm_cuit(String farm_cuit) {
        this.farm_cuit = farm_cuit;
    }

    public String getFarm_nombre() {
        return farm_nombre;
    }

    public void setFarm_nombre(String farm_nombre) {
        this.farm_nombre = farm_nombre;
    }

    public String getFarm_domicilio() {
        return farm_domicilio;
    }

    public void setFarm_domicilio(String farm_domicilio) {
        this.farm_domicilio = farm_domicilio;
    }

    public int getId_farmaceutico() {
        return id_farmaceutico;
    }

    public void setId_farmaceutico(int id_farmaceutico) {
        this.id_farmaceutico = id_farmaceutico;
    }

    public Farmacia(int farm_id, String farm_cuit, String farm_nombre, String farm_domicilio, int id_farmaceutico) {
        this.farm_id = farm_id;
        this.farm_cuit = farm_cuit;
        this.farm_nombre = farm_nombre;
        this.farm_domicilio = farm_domicilio;
        this.id_farmaceutico = id_farmaceutico;
    }

    public Farmacia() {
    }

    
}
