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
    JLabel txtTiempo;
    
    int hora;
    int minuto;
    int segundo;
    
    

    public Hilo_FechaYHora(JLabel Dia, JLabel txtHora, JLabel tiempo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        this.txtHora = txtHora;
        this.txtdia = Dia;
        this.txtTiempo = tiempo;

    }

    @Override
    public void run() {
        hora=Integer.valueOf(0+""+0);
        minuto=Integer.valueOf(0+""+0);
        segundo=Integer.valueOf(0+""+0);

        SimpleDateFormat hf = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            fechaYhora = new Date();
            txtdia.setText(getDia(fechaYhora));
            while (true) {
                try {
                    fechaYhora = new Date();
                    Cal = Calendar.getInstance();
                    txtHora.setText(hf.format(fechaYhora));

                    txtTiempo.setText(contadorTiempo());

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

    private String contadorTiempo() {
        
        
        segundo++;
        if(segundo==60){
            minuto++;
            segundo=00;
        }
        if(minuto==60){
            hora++;
            minuto=00;
        }
        
        if(hora==24){
            hora=00;
        }
        
        String tiempo=(hora<=9?"0":"")+hora+":"+(minuto<=9?"0":"")+minuto+":"+(segundo<=9?"0":"")+segundo;
        
        return  tiempo;
        
    }

}
