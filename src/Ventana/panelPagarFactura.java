/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Conexion.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistema_drogueria.Home;
import static sistema_drogueria.Home.con;

/**
 *
 * @author ADMIN
 */
public class panelPagarFactura extends javax.swing.JPanel {

    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel model;

    /**
     * Creates new form panelPagarFactura
     */
    public panelPagarFactura() {
        initComponents();
        mostrarTiempoReal();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();
        btnPagar = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNroFactura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N?? Factura", "Farmacia", "Fecha Emision", "Fecha Vto", "Fecha Pago", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFacturas.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaFacturas);

        btnPagar.setText("Pagar");
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/10058607551581068452-16.png"))); // NOI18N
        btnPDF.setText("PDF");
        btnPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pagar Factura");

        txtNroFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNroFacturaKeyReleased(evt);
            }
        });

        jLabel1.setText("N?? Factura:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnPDF)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addComponent(btnPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        pagarFactura();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
//        // TODO add your handling code here:
        try {
            model = (DefaultTableModel) tablaFacturas.getModel();
            int nroFac = Integer.valueOf(model.getValueAt(tablaFacturas.getSelectedRow(), 0).toString());
            File file = new File("Reportes/" + nroFac + "_reporte.pdf");
            Desktop.getDesktop().open(file);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e);
        }

    }//GEN-LAST:event_btnPDFActionPerformed

    private void txtNroFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroFacturaKeyReleased
        // TODO add your handling code here:
        mostrarTiempoReal();
    }//GEN-LAST:event_txtNroFacturaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaFacturas;
    private javax.swing.JTextField txtNroFactura;
    // End of variables declaration//GEN-END:variables

    private void mostrarTabla(JTable tableMedicamentos) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //con = new Conexion();
            borrarTabla(tableMedicamentos);
            model = (DefaultTableModel) tableMedicamentos.getModel();

            pstm = con.getConnection().prepareStatement("select * from medicamento where med_estado=true");
            rs = pstm.executeQuery();
            Object[] fila = new Object[5];
            while (rs.next()) {
                fila[0] = rs.getInt("med_id");
                fila[1] = rs.getString("med_nombre");
                fila[2] = "$ " + rs.getFloat("med_precio");
                fila[3] = rs.getInt("med_cantidad");
                fila[4] = rs.getInt("med_PtoRepos");
                model.addRow(fila);
            }
            tableMedicamentos.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //con.desconectar();
                pstm.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

    }

    public void borrarTabla(JTable tabla) {

        model = (DefaultTableModel) tabla.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }

    private double calcularImporte(int nrofac) {
        ResultSet rr = null;
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //con = new Conexion();
            String ins_sum = "select sum(facDet_cantidad*facDet_precioUnitario) from facturaventadetalle where facDet_nroFacCab=" + nrofac;
            pstm = con.getConnection().prepareStatement(ins_sum);
            rr = pstm.executeQuery();
            rr.next();
            return rr.getDouble(1);

        } catch (SQLException ex) {
            Logger.getLogger(panelReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    private void pagarFactura() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        model = (DefaultTableModel) tablaFacturas.getModel();

        if (tablaFacturas.getSelectedRow() != -1) {
            if (!estaPagada(tablaFacturas.getSelectedRow())) {

                try {
                    String upd = "update facturaventacabecera set fac_fechapago=? where fac_nrofac=?";
                    int nroFac = (int) model.getValueAt(tablaFacturas.getSelectedRow(), 0);
                    con = new Conexion(Home.getUser(),Home.getPass());
                    pstm = con.getConnection().prepareStatement(upd);
                    java.util.Date f = new java.util.Date();
                    Timestamp time = new Timestamp(f.getTime());
                    pstm.setTimestamp(1, time);
                    pstm.setInt(2, nroFac);
                    int i = pstm.executeUpdate();
                    System.out.println(i);
                    if (i != 0) {
                        JOptionPane.showMessageDialog(null, "Se pag?? la factura");
                    } else {
                        JOptionPane.showConfirmDialog(null, "Error al pagar");
                    }
                    mostrarTiempoReal();
                } catch (SQLException ex) {
                    Logger.getLogger(panelPagarFactura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    private void mostrarTiempoReal() {
        try {
            // TODO add your handling code here:
            borrarTabla(tablaFacturas);
            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
            String txt = txtNroFactura.getText();
            model = (DefaultTableModel) tablaFacturas.getModel();
            //con = new Conexion();
            pstm = con.getConnection().prepareStatement("Select * from facturaventacabecera join farmacia on fac_farID=farm_id where fac_nrofac LIKE '%" + txt + "%'");
            rs = pstm.executeQuery();
            Object[] fila = new Object[6];
            while (rs.next()) {
                double importe = calcularImporte(rs.getInt("fac_nroFac"));
                fila[0] = rs.getInt("fac_nrofac");
                fila[1] = rs.getString("farm_nombre");
                fila[2] = sf.format(rs.getDate("fac_fechaEmision"));
                fila[3] = sf.format(rs.getDate("fac_fechaVto"));
                fila[4] = rs.getDate("fac_fechaPago") == null ? "NaN" : sf.format(rs.getDate("fac_fechaPago"));
                fila[5] = "$ " + importe;
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(agregarStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean estaPagada(int filaFactura) {
        boolean pago = false;
        try {
            int nroFac = (int) model.getValueAt(filaFactura, 0);
            String consulta = "select * from facturaventacabecera where fac_nrofac=" + nroFac + " and fac_fechaPago is not null";
            PreparedStatement ps = con.getConnection().prepareStatement(consulta);
            ResultSet r = ps.executeQuery();
            if (r.next()) {
                pago = true;
                JOptionPane.showMessageDialog(null, "La factura ya se encuentra pagada");
            }

        } catch (SQLException ex) {
            Logger.getLogger(panelPagarFactura.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pago;

    }

}
