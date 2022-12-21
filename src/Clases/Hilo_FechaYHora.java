/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.sun.org.apache.xpath.internal.axes.WalkerFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema_drogueria.Home;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class Hilo_FechaYHora extends Thread {

    Date fechaYhora;
    Calendar Cal;
    JLabel txtdia;
    JLabel txtHora;

    public Hilo_FechaYHora(JLabel Dia, JLabel txtHora) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        this.txtHora = txtHora;
        this.txtdia = Dia;

    }

    @Override
    public void run() {
        SimpleDateFormat sf = new SimpleDateFormat("dd");
        SimpleDateFormat hf = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            fechaYhora = new Date();
            txtdia.setText(getDia(fechaYhora));
            while (true) {
                try {
                    fechaYhora = new Date();
                    Cal = Calendar.getInstance();
                    txtHora.setText(hf.format(fechaYhora));
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo_FechaYHora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    private String getDia(Date f) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*
        (0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday)
         */
        SimpleDateFormat sf = new SimpleDateFormat("dd");
        Cal = Calendar.getInstance();
        String dia = "";
        switch (f.getDay()) {
            case 0: {
                dia = "Domingo";
                break;
            }
            case 1: {
                dia = "Lunes";
                break;
            }
            case 2: {
                dia = "Martes";
                break;
            }
            case 3: {
                dia = "Miercoles";
                break;
            }
            case 4: {
                dia = "Jueves";
                break;
            }
            case 5: {
                dia = "Viernes";
                break;
            }
            case 6: {
                dia = "Sabado";
                break;
            }

        }
        return dia + " " + sf.format(Cal.getTime());
    }

}


