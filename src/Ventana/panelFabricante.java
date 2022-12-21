/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Conexion.Conexion;
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
public class panelFabricante extends javax.swing.JPanel {

    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel model;

    /**
     * Creates new form panelDroga
     */
    public panelFabricante() {
        initComponents();
        con = new Conexion();
        setVisible(true);
        mostrarTabla(tableFabricante);
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
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFabricante = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(800, 550));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 195, -1));

        txtNombre.setBorder(null);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setOpaque(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 93, 241, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 640, 10));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Dni");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 62, 237, -1));

        txtdni.setBorder(null);
        txtdni.setOpaque(false);
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 86, 237, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 106, 237, 10));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 237, 40));

        tableFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dni", "Domicilio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFabricante.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableFabricante);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 635, 190));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregando Fabricante");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 26, 635, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 113, 241, 10));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 240, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Domicilio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 195, -1));

        txtDomicilio.setBorder(null);
        txtDomicilio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDomicilio.setOpaque(false);
        jPanel1.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 241, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 241, 10));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!verificarCampos()) {
            try {
                String nombre = txtNombre.getText();
                int dni = Integer.parseInt(txtdni.getText());
                String domicilio = txtDomicilio.getText();
                //con = new Conexion();
                pstm = con.getConnection().prepareStatement("INSERT INTO fabricante(fabri_nombre,fabri_dni,fabri_domicilio,fabri_estado) values(?,?,?,?)");
                pstm.setString(1, nombre);
                pstm.setInt(2, dni);
                pstm.setString(3, domicilio);
                pstm.setBoolean(4, true);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego un nuevo Fabricante");
                txtdni.setText(null);
                txtNombre.setText(null);

                mostrarTabla(tableFabricante);

            } catch (SQLException ex) {
                Logger.getLogger(panelFarmaceutico.class.getName()).log(Level.SEVERE, null, ex);
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
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //con = new Conexion();
        String eliminar = "update fabricante set fabri_estado=false where fabri_id=?";
        if (tableFabricante.getSelectedRow() != -1) {
            try {
                model = (DefaultTableModel) tableFabricante.getModel();
                pstm = con.getConnection().prepareStatement(eliminar);
                pstm.setInt(1, (int) model.getValueAt(tableFabricante.getSelectedRow(), 0));
                pstm.executeUpdate();
                mostrarTabla(tableFabricante);
            } catch (SQLException ex) {
                Logger.getLogger(panelMed.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Fabricante");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tableFabricante;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables

    public void borrarTabla(JTable tabla) {

        model = (DefaultTableModel) tabla.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }

    private void mostrarTabla(JTable tabla) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //con = new Conexion();
            borrarTabla(tabla);
            model = (DefaultTableModel) tabla.getModel();

            pstm = con.getConnection().prepareStatement("select * from fabricante where fabri_estado=true");
            rs = pstm.executeQuery();
            Object[] fila = new Object[4];
            while (rs.next()) {
                fila[0] = rs.getInt("fabri_ID");
                fila[1] = rs.getString("fabri_nombre");
                fila[2] = rs.getInt("fabri_dni");
                fila[3] = rs.getString("fabri_domicilio");
                model.addRow(fila);
            }
            tabla.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
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

    private boolean verificarCampos() {
        boolean vacio = false;
        StringBuilder camposVacios = new StringBuilder();
        int i = 0;
        camposVacios.append("\tError/es:\n");
        if (txtDomicilio.getText().isEmpty()) {
            vacio = true;
            i++;
            camposVacios.append(i + "- Debe ingresar Domicilio.\n");
        }
        if (txtNombre.getText().isEmpty()) {
            vacio = true;
            i++;
            camposVacios.append(i + "- Debe ingresar Nombre.\n");
        }

        if (txtdni.getText().isEmpty()) {
            vacio = true;
            i++;
            camposVacios.append(i + "- Debe ingresar Dni.\n");
        }

        if (vacio) {
            JOptionPane.showMessageDialog(null, camposVacios);
        }
        return vacio;
    }

}