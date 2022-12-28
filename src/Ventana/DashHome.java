/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Conexion.Conexion;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import sistema_drogueria.Home;

/**
 *
 * @author ADMIN
 */
public class DashHome extends javax.swing.JPanel {

    
    
    public DashHome() {
        initComponents();
        setVisible(true);
        lblClientes.setSize(230, 115);
        lblCompras.setSize(230, 115);
        lblDrogras.setSize(230, 115);
        lblFecha.setSize(230, 115);
        lblMedicamentos.setSize(230, 115);
        lblVentas.setSize(230, 115);
        MostrarCantidades();
        ColocarImg(lblClientes, "/imagenes/clientes.png");
        ColocarImg(lblMedicamentos, "/imagenes/medicamentos.png");
        ColocarImg(lblCompras, "/imagenes/compra.png");
        ColocarImg(lblDrogras, "/imagenes/droga.png");
        ColocarImg(lblVentas, "/imagenes/venta.png");
        ColocarImg(lblFecha, "/imagenes/fecha.png");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        txtCompracant = new javax.swing.JLabel();
        txtCompranombre = new javax.swing.JLabel();
        txtVentascant = new javax.swing.JLabel();
        txtVentanombre = new javax.swing.JLabel();
        txtDrogacant = new javax.swing.JLabel();
        txtDroganombre = new javax.swing.JLabel();
        txtMedcant = new javax.swing.JLabel();
        txtMednombre = new javax.swing.JLabel();
        txtFarmnombre = new javax.swing.JLabel();
        txtFarmcant = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDrogras = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        lblMedicamentos = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFecha.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 140, 30));

        txtCompracant.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtCompracant.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCompracant, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 140, 30));

        txtCompranombre.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtCompranombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCompranombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 140, 30));

        txtVentascant.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtVentascant.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtVentascant, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 140, 30));

        txtVentanombre.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtVentanombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtVentanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 140, 30));

        txtDrogacant.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtDrogacant.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDrogacant, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 140, 30));

        txtDroganombre.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtDroganombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDroganombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 140, 30));

        txtMedcant.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtMedcant.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMedcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 140, 30));

        txtMednombre.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtMednombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMednombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, 30));

        txtFarmnombre.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtFarmnombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFarmnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 140, 30));

        txtFarmcant.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        txtFarmcant.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFarmcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, 30));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel2.setText("Sistema de gestion para Drogueria");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        lblDrogras.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblDrogras.setForeground(new java.awt.Color(255, 255, 255));
        lblDrogras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDrogras.setPreferredSize(new java.awt.Dimension(225, 115));
        jPanel1.add(lblDrogras, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 225, 115));

        lblClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes.setMaximumSize(new java.awt.Dimension(230, 150));
        lblClientes.setMinimumSize(new java.awt.Dimension(225, 115));
        lblClientes.setPreferredSize(new java.awt.Dimension(230, 115));
        jPanel1.add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 225, 115));

        lblMedicamentos.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicamentos.setPreferredSize(new java.awt.Dimension(225, 115));
        jPanel1.add(lblMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 225, 115));

        lblVentas.setBackground(new java.awt.Color(255, 204, 204));
        lblVentas.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentas.setPreferredSize(new java.awt.Dimension(225, 115));
        jPanel1.add(lblVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 225, 115));

        lblCompras.setBackground(new java.awt.Color(255, 204, 204));
        lblCompras.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblCompras.setForeground(new java.awt.Color(255, 255, 255));
        lblCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompras.setPreferredSize(new java.awt.Dimension(225, 115));
        jPanel1.add(lblCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 225, 115));

        lblFecha.setBackground(new java.awt.Color(255, 204, 204));
        lblFecha.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setPreferredSize(new java.awt.Dimension(225, 115));
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 225, 115));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblDrogras;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel txtCompracant;
    private javax.swing.JLabel txtCompranombre;
    private javax.swing.JLabel txtDrogacant;
    private javax.swing.JLabel txtDroganombre;
    private javax.swing.JLabel txtFarmcant;
    private javax.swing.JLabel txtFarmnombre;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtMedcant;
    private javax.swing.JLabel txtMednombre;
    private javax.swing.JLabel txtVentanombre;
    private javax.swing.JLabel txtVentascant;
    // End of variables declaration//GEN-END:variables

    public void ColocarImg(JLabel btn, String dir) {
        ImageIcon imagen = new ImageIcon(getClass().getResource(dir));

        Icon fondo1 = new ImageIcon(imagen.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
        btn.setIcon(fondo1);
        this.repaint();
    }

    private void MostrarCantidades() {

        try {
            Conexion con = new Conexion(Home.getUser(),Home.getPass());
            PreparedStatement ps = null;
            ResultSet rs = null;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String farmacias = "select count(*) from farmacia where farm_estado=true";
            String medicamentos = "select count(*) from medicamento where med_estado=true";
            String drogas = "select count(*) from droga where droga_estado=true";
            String ventas = "select count(*) from facturaventacabecera where fac_estado=true";
            String compras = "select count(*) from facturacompracabecera where fac_estado=true";

            ps = con.getConnection().prepareStatement(farmacias);
            rs = ps.executeQuery();
            if (rs.next()) {
                int cantidad = rs.getInt(1);
                txtFarmcant.setText(String.valueOf(cantidad));
                txtFarmnombre.setText("Farmacias");
                
            }
            
            ps = con.getConnection().prepareStatement(medicamentos);
            rs = ps.executeQuery();
            if (rs.next()) {
                int cantidad = rs.getInt(1);
                txtMedcant.setText(String.valueOf(cantidad));
                txtMednombre.setText("Medicamentos");
            }
            
            ps = con.getConnection().prepareStatement(drogas);
            rs = ps.executeQuery();
            if (rs.next()) {
                int cantidad = rs.getInt(1);
                txtDrogacant.setText(String.valueOf(cantidad));
                txtDroganombre.setText("Drogas");
            }
            
            ps = con.getConnection().prepareStatement(ventas);
            rs = ps.executeQuery();
            if (rs.next()) {
                int cantidad = rs.getInt(1);
                txtVentascant.setText(String.valueOf(cantidad));
                txtVentanombre.setText("Ventas");
            }
            
            
            ps = con.getConnection().prepareStatement(compras);
            rs = ps.executeQuery();
            if (rs.next()) {
                int cantidad = rs.getInt(1);
                txtCompracant.setText(String.valueOf(cantidad));
                txtCompranombre.setText("Compras");
            }
            
            SimpleDateFormat sf=new SimpleDateFormat("dd-MM-YYYY");
            txtFecha.setText(sf.format(new Date()));
            
            
            
            
            
            
            con.desconectar();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DashHome.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
