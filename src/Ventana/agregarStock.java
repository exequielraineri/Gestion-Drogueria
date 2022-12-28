/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class agregarStock extends javax.swing.JFrame {

    
    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel model;

    /**
     * Creates new form agregarStock
     */
    public agregarStock() {
        initComponents();
        setVisible(true);
        con=new Conexion(Home.getUser(),Home.getPass());
        setLocationRelativeTo(null);
        mostrarTabla(tableMedicamentos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtmed = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicamentos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnomMed = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setTitle("Gestion de Stock");
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        txtmed.setPreferredSize(new java.awt.Dimension(500, 500));

        tableMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock", "Punto Reposicion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMedicamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableMedicamentos);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        txtCantidad.setBorder(null);
        txtCantidad.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Medicamento");

        txtnomMed.setBorder(null);
        txtnomMed.setOpaque(false);
        txtnomMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomMedActionPerformed(evt);
            }
        });
        txtnomMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnomMedKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomMedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomMedKeyTyped(evt);
            }
        });

        jButton1.setText("Agregar Stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtmedLayout = new javax.swing.GroupLayout(txtmed);
        txtmed.setLayout(txtmedLayout);
        txtmedLayout.setHorizontalGroup(
            txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtmedLayout.createSequentialGroup()
                .addGroup(txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtmedLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtmedLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(txtnomMed)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addGroup(txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtmedLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(txtCantidad)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtmedLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        txtmedLayout.setVerticalGroup(
            txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtmedLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtmedLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtmedLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txtmedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnomMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtmedLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        getContentPane().add(txtmed, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            //con = new Conexion();
            if (tableMedicamentos.getSelectedRow() != -1) {
                try {
                    model = (DefaultTableModel) tableMedicamentos.getModel();
                    String upd = "update medicamento set med_cantidad=med_cantidad+? where med_id=?";
                    pstm = con.getConnection().prepareStatement(upd);
                    pstm.setInt(1, Integer.parseInt(txtCantidad.getText()));
                    pstm.setInt(2, (int) model.getValueAt(tableMedicamentos.getSelectedRow(), 0));
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se agrego al stock");
                    mostrarTabla(tableMedicamentos);
                } catch (SQLException ex) {
                    Logger.getLogger(agregarStock.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    txtnomMed.setText(null);
                    txtCantidad.setText(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
            }
        } catch (HeadlessException | NumberFormatException ex) {
            Logger.getLogger(agregarStock.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //con.desconectar();
                pstm.close();
            } catch (SQLException ex) {
                Logger.getLogger(agregarStock.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnomMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomMedActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnomMedActionPerformed

    private void txtnomMedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomMedKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomMedKeyPressed

    private void txtnomMedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomMedKeyReleased
        try {
            // TODO add your handling code here:
            borrarTabla(tableMedicamentos);
            
            String txt = txtnomMed.getText();
            model = (DefaultTableModel) tableMedicamentos.getModel();
            //con = new Conexion();
            pstm = con.getConnection().prepareStatement("Select * from medicamento where med_nombre LIKE '%" + txt + "%' and med_estado=true");
            rs = pstm.executeQuery();
            Object[] fila = new Object[5];
            while (rs.next()) {
                fila[0] = rs.getInt("med_id");
                fila[1] = rs.getString("med_nombre");
                fila[2] = "$ "+rs.getFloat("med_precio");
                fila[3] = rs.getInt("med_cantidad");
                fila[4] = rs.getInt("med_PtoRepos");
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(agregarStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtnomMedKeyReleased

    private void txtnomMedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomMedKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnomMedKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tableMedicamentos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JPanel txtmed;
    private javax.swing.JTextField txtnomMed;
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
                fila[2] = "$ "+rs.getFloat("med_precio");
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

}
