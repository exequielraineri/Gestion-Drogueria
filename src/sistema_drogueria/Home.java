/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_drogueria;

import Clases.Hilo_FechaYHora;
import Conexion.Conexion;
import Ventana.DashHome;
import Ventana.panelCompra;
import Ventana.panelInventario;
import Ventana.panelMed;
import Ventana.panelPagarFactura;
import Ventana.panelReportes;
import Ventana.panelVenta;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author ADMIN
 */
public class Home extends javax.swing.JFrame {

    DashHome dash;
    panelMed pmed;
    Date FechaYHora;
    public static Conexion con;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setLocationRelativeTo(this);
        ColocarImg("/imagenes/Fondo.png", lblogo);
        lblUser.setText("Admin");
        //ColocarImg("src/imagenes/AgregarMed1.png", btnAgregarMedicamento );
        con = new Conexion();
        setVisible(true);
        Hilo_FechaYHora hiloHora = new Hilo_FechaYHora(Dia, txtHora);
        hiloHora.start();
//        ColocarImg("/imagenes/home1.png", lblHome);
        Contenedor.removeAll();
        Contenedor.revalidate();
        Contenedor.repaint();
        dash = new DashHome();
        Contenedor.add(dash);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        btnPagar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblogo = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Dia = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(80, 134, 193));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu.setPreferredSize(new java.awt.Dimension(175, 600));
        Menu.setLayout(null);

        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventapago.png"))); // NOI18N
        btnPagar.setText("Pagar Factura");
        btnPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPagar.setPreferredSize(new java.awt.Dimension(151, 60));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        Menu.add(btnPagar);
        btnPagar.setBounds(12, 452, 151, 60);

        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome.setPreferredSize(new java.awt.Dimension(151, 60));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        Menu.add(btnHome);
        btnHome.setBounds(12, 132, 151, 60);

        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Shop.png"))); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInventario.setPreferredSize(new java.awt.Dimension(151, 60));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        Menu.add(btnInventario);
        btnInventario.setBounds(12, 212, 151, 60);

        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Shopping cart.png"))); // NOI18N
        btnVenta.setText("Realizar Venta");
        btnVenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVenta.setPreferredSize(new java.awt.Dimension(151, 60));
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        Menu.add(btnVenta);
        btnVenta.setBounds(12, 292, 151, 60);

        btnCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shopping-cart-badged.png"))); // NOI18N
        btnCompra.setText("Realizar Compra");
        btnCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompra.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCompra.setPreferredSize(new java.awt.Dimension(151, 60));
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        Menu.add(btnCompra);
        btnCompra.setBounds(12, 372, 151, 60);

        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Filter.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReportes.setPreferredSize(new java.awt.Dimension(151, 60));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        Menu.add(btnReportes);
        btnReportes.setBounds(12, 532, 151, 60);

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Menu.add(lblUser);
        lblUser.setBounds(10, 100, 150, 20);

        lblogo.setMaximumSize(new java.awt.Dimension(50, 50));
        lblogo.setMinimumSize(new java.awt.Dimension(50, 50));
        lblogo.setPreferredSize(new java.awt.Dimension(50, 50));
        Menu.add(lblogo);
        lblogo.setBounds(33, 23, 110, 80);

        getContentPane().add(Menu, java.awt.BorderLayout.LINE_START);

        Contenedor.setBackground(new java.awt.Color(80, 134, 193));
        Contenedor.setPreferredSize(new java.awt.Dimension(800, 600));
        Contenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(Contenedor, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(80, 134, 193));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 50));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 5, 5));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Settings.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SettingsSolid.png"))); // NOI18N
        jPanel1.add(jButton1);

        Dia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dia.setText("Lunes");
        jPanel1.add(Dia);

        txtHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHora.setText("00:00:00");
        txtHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtHora);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
        //Frame_Venta venta=new Frame_Venta();
        Contenedor.removeAll();
        Contenedor.revalidate();
        panelVenta venta = new panelVenta();
        Contenedor.add(venta);
        venta.setVisible(true);
        BotonSeleccionado(evt);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:

        Contenedor.removeAll();
        Contenedor.revalidate();
        panelReportes reportes = new panelReportes();
        Contenedor.add(reportes);

        BotonSeleccionado(evt);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        // TODO add your handling code here:
        Contenedor.removeAll();
        Contenedor.revalidate();
        panelCompra compra = new panelCompra();
        Contenedor.add(compra);
        compra.setVisible(true);
        BotonSeleccionado(evt);
    }//GEN-LAST:event_btnCompraActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        con.desconectar();
    }//GEN-LAST:event_formWindowClosing

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        Contenedor.removeAll();
        Contenedor.revalidate();
        panelInventario inv = new panelInventario();
        Contenedor.add(inv);
        BotonSeleccionado(evt);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        HomeDash();
        BotonSeleccionado(evt);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        Contenedor.removeAll();
        Contenedor.revalidate();
        panelPagarFactura fac = new panelPagarFactura();
        Contenedor.add(fac);
        BotonSeleccionado(evt);
    }//GEN-LAST:event_btnPagarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Dia;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblogo;
    private javax.swing.JLabel txtHora;
    // End of variables declaration//GEN-END:variables

    public void ColocarImg(String dir, JLabel btn) {
        ImageIcon imagen = new ImageIcon(getClass().getResource(dir));

        Icon fondo1 = new ImageIcon(imagen.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_DEFAULT));
        btn.setIcon(fondo1);

        this.repaint();
    }

    private void HomeDash() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Contenedor.removeAll();
        Contenedor.revalidate();
        dash = new DashHome();
//        ColocarImg("/imagenes/hom2.png", lblHome);
        Contenedor.add(dash);
        dash.setVisible(true);
    }

    private void BotonSeleccionado(ActionEvent evt) {
        switch (evt.getActionCommand()) {
            case "Home": {
                
                btnHome.setBackground(new ColorUIResource(51, 204, 255));
                btnHome.setForeground(Color.BLACK);

                btnCompra.setBackground(Color.darkGray);
                btnCompra.setForeground(Color.WHITE);

                btnInventario.setBackground(Color.darkGray);
                btnInventario.setForeground(Color.WHITE);

                btnPagar.setBackground(Color.darkGray);
                btnPagar.setForeground(Color.WHITE);

                btnReportes.setBackground(Color.darkGray);
                btnReportes.setForeground(Color.WHITE);

                btnVenta.setBackground(Color.darkGray);
                btnVenta.setForeground(Color.WHITE);
                break;
            }
            case "Inventario": {
               

                btnInventario.setBackground(new ColorUIResource(51, 204, 255));
                btnInventario.setForeground(Color.BLACK);
                
                btnCompra.setBackground(Color.darkGray);
                btnCompra.setForeground(Color.WHITE);

                btnHome.setBackground(Color.darkGray);
                btnHome.setForeground(Color.WHITE);

                btnPagar.setBackground(Color.darkGray);
                btnPagar.setForeground(Color.WHITE);

                btnReportes.setBackground(Color.darkGray);
                btnReportes.setForeground(Color.WHITE);

                btnVenta.setBackground(Color.darkGray);
                btnVenta.setForeground(Color.WHITE);
                break;
            }
            case "Realizar Venta": {
               

                btnVenta.setBackground(new ColorUIResource(51, 204, 255));
                btnVenta.setForeground(Color.BLACK);
                
                btnCompra.setBackground(Color.darkGray);
                btnCompra.setForeground(Color.WHITE);

                btnInventario.setBackground(Color.darkGray);
                btnInventario.setForeground(Color.WHITE);

                btnPagar.setBackground(Color.darkGray);
                btnPagar.setForeground(Color.WHITE);

                btnReportes.setBackground(Color.darkGray);
                btnReportes.setForeground(Color.WHITE);

                btnHome.setBackground(Color.darkGray);
                btnHome.setForeground(Color.WHITE);
                break;
            }
            case "Realizar Compra": {
                

                btnCompra.setBackground(new ColorUIResource(51, 204, 255));
                btnCompra.setForeground(Color.BLACK);
                
                btnHome.setBackground(Color.darkGray);
                btnHome.setForeground(Color.WHITE);

                btnInventario.setBackground(Color.darkGray);
                btnInventario.setForeground(Color.WHITE);

                btnPagar.setBackground(Color.darkGray);
                btnPagar.setForeground(Color.WHITE);

                btnReportes.setBackground(Color.darkGray);
                btnReportes.setForeground(Color.WHITE);

                btnVenta.setBackground(Color.darkGray);
                btnVenta.setForeground(Color.WHITE);
                break;
            }
            case "Pagar Factura": {
              

                btnPagar.setBackground(new ColorUIResource(51, 204, 255));
                btnPagar.setForeground(Color.BLACK);
                
                btnCompra.setBackground(Color.darkGray);
                btnCompra.setForeground(Color.WHITE);

                btnInventario.setBackground(Color.darkGray);
                btnInventario.setForeground(Color.WHITE);

                btnHome.setBackground(Color.darkGray);
                btnHome.setForeground(Color.WHITE);

                btnReportes.setBackground(Color.darkGray);
                btnReportes.setForeground(Color.WHITE);

                btnVenta.setBackground(Color.darkGray);
                btnVenta.setForeground(Color.WHITE);
                break;
            }
            case "Reportes": {
               

                btnReportes.setBackground(new ColorUIResource(51, 204, 255));
                btnReportes.setForeground(Color.BLACK);
                
                btnCompra.setBackground(Color.darkGray);
                btnCompra.setForeground(Color.WHITE);

                btnInventario.setBackground(Color.darkGray);
                btnInventario.setForeground(Color.WHITE);

                btnPagar.setBackground(Color.darkGray);
                btnPagar.setForeground(Color.WHITE);

                btnHome.setBackground(Color.darkGray);
                btnHome.setForeground(Color.WHITE);

                btnVenta.setBackground(Color.darkGray);
                btnVenta.setForeground(Color.WHITE);
                break;
            }
            default: {
               
                break;
            }
        }

    }
    
}