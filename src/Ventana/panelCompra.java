/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Conexion.Conexion;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sistema_drogueria.Home;
import static sistema_drogueria.Home.con;

/**
 *
 * @author ADMIN
 */
public class panelCompra extends javax.swing.JPanel {

    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel model;

    /**
     * Creates new form panelCompra
     */
    public panelCompra() {
        initComponents();
        con = new Conexion(Home.getUser(),Home.getPass());
        borrarTabla(tablaDroga);
        txtfecha.setCalendar(Calendar.getInstance());
        agregarAlComboBox(ComboBoxFabricante);

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
        Encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cuerpo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDroga = new javax.swing.JTable();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtdroga = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtPrecioU = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboBoxFabricante = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encabezado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Encabezado.setMaximumSize(new java.awt.Dimension(800, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion Compras");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jPanel1.add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        Cuerpo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Cuerpo.setMaximumSize(new java.awt.Dimension(800, 400));
        Cuerpo.setPreferredSize(new java.awt.Dimension(800, 400));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Emisión:");

        tablaDroga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DROGA", "CANTIDAD", "PRECIO U.", "SUB TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDroga.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDroga);

        txtfecha.setRequestFocusEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Droga");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Precio U.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Stock Disponible");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });

        txtCant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantKeyReleased(evt);
            }
        });

        txtStock.setEditable(false);

        btnLimpiar.setText("X");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total");

        txtTotal.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Fabricante");

        ComboBoxFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboBoxFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ComboBoxFabricanteMouseReleased(evt);
            }
        });
        ComboBoxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFabricanteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Dni");

        txtDni.setEditable(false);

        javax.swing.GroupLayout CuerpoLayout = new javax.swing.GroupLayout(Cuerpo);
        Cuerpo.setLayout(CuerpoLayout);
        CuerpoLayout.setHorizontalGroup(
            CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuerpoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuerpoLayout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CuerpoLayout.createSequentialGroup()
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdroga, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(43, 43, 43)
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGap(50, 50, 50)
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(txtPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(CuerpoLayout.createSequentialGroup()
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CuerpoLayout.createSequentialGroup()
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        CuerpoLayout.setVerticalGroup(
            CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuerpoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuerpoLayout.createSequentialGroup()
                        .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)))
                        .addGap(3, 3, 3)
                        .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdroga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLimpiar))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(Cuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 420));

        jButton1.setText("Cancelar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 170, 50));

        jButton2.setText("Confirmar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 170, 50));

        jButton3.setText("Nuevo");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 170, 50));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String instruccion = "Select * from droga where droga_id=? and droga_estado=true";
                //con = new Conexion();
                pstm = con.getConnection().prepareStatement(instruccion);
                pstm.setInt(1, Integer.valueOf(txtId.getText()));
                rs = pstm.executeQuery();
                if (rs.next()) {
                    txtdroga.setText(rs.getString("droga_nombre"));
                    txtPrecioU.setText(String.valueOf(rs.getDouble("droga_precioU")));
                    txtStock.setText(String.valueOf(rs.getInt("droga_cantidad")));
                } else {
                    txtCant.setText(null);
                    txtdroga.setText(null);
                    txtPrecioU.setText(null);
                    txtStock.setText(null);

                }

            } catch (SQLException ex) {
                Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtCantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyReleased
        // TODO add your handling code here:
        double total = txtTotal.getText().isEmpty() ? 0 : Double.parseDouble(txtTotal.getText().substring(2, txtTotal.getText().length()));
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtStock.getText().isEmpty()) {
                agregarNuvaDroga(txtdroga.getText());

            }
            if (Integer.parseInt(txtCant.getText()) > 0) {
                model = (DefaultTableModel) tablaDroga.getModel();

                Object[] fila = new Object[5];
                double precio = Double.valueOf(txtPrecioU.getText());
                double cantidad = Double.valueOf(txtCant.getText());
                double subtotal = cantidad * precio;
                fila[0] = txtId.getText();
                fila[1] = txtdroga.getText();
                fila[2] = txtCant.getText();

                fila[3] = "$ " + precio;
                fila[4] = "$ " + subtotal;
                model.addRow(fila);
                total += subtotal;

                txtTotal.setText("$ " + String.valueOf(total));
            } else {
                txtPrecioU.setText(null);
                txtCant.setText(null);
            }

        }
    }//GEN-LAST:event_txtCantKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtCant.setText(null);
        txtId.setText(null);
        txtdroga.setText(null);
        txtPrecioU.setText(null);
        txtStock.setText(null);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void ComboBoxFabricanteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxFabricanteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxFabricanteMouseReleased

    private void ComboBoxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFabricanteActionPerformed
        // TODO add your handling code here:
        if (ComboBoxFabricante.getSelectedIndex() != -1 && !ComboBoxFabricante.getSelectedItem().equals("Seleccionar una...")) {
            try {
                System.out.println(ComboBoxFabricante.getSelectedItem().toString());
                String instruccion = "Select * from fabricante where fabri_nombre=? and fabri_estado=true";
                /*
                    SE DEB VRIFICAR POR DNI Y NO POR NOMBRE, SINO ES AMBIGUO
                 */
                //con = new Conexion();
                pstm = con.getConnection().prepareStatement(instruccion);
                pstm.setString(1, String.valueOf(ComboBoxFabricante.getSelectedItem()));
                rs = pstm.executeQuery();
                if (rs.next()) {
                    txtDni.setText(String.valueOf(rs.getInt("fabri_dni")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(panelVenta.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_ComboBoxFabricanteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "¿Seguro desea cancelar la Compra?");
        if (op == 0) {
            setearCampos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!verificarCampos()) {
            int op = JOptionPane.showConfirmDialog(null, "¿Confirma esta compra?");
            System.out.println(op);
            if (op == 0) {
                try {
                    String ins_nroFac = "Select fac_nroFac from facturacompracabecera order by fac_nroFac desc limit 1";

                    String ins_farm = "select * from fabricante where fabri_dni=?";

                    String ins_facCabezera = "Insert into facturacompracabecera(fac_fabriID,fac_fechaEmision,fac_estado) values(?,?,?)";
                    //con = new Conexion();
                    pstm = con.getConnection().prepareStatement(ins_nroFac);
                    ResultSet rr;
                    rs = pstm.executeQuery();
                    int nroFac;
                    if (rs.next()) {
                        nroFac = rs.getInt("fac_nroFac") + 1;
                    } else {
                        nroFac = 1;
                    }
                    PreparedStatement pp;
                    pp = con.getConnection().prepareStatement(ins_farm);
                    pp.setInt(1, Integer.parseInt(txtDni.getText()));
                    rr = pp.executeQuery();
                    if (rr.next()) {
                        int idF = rr.getInt("fabri_id");

                        PreparedStatement pst;
                        pst = con.getConnection().prepareStatement(ins_facCabezera);
                        pst.setInt(1, idF);
                        java.util.Date miDate = txtfecha.getDate();//fechaemision
                        Timestamp timestamp = new Timestamp(miDate.getTime());
                        pst.setTimestamp(2, timestamp);

                        pst.setBoolean(3, true);
                        GenerarDetalle(tablaDroga, nroFac);
                        //System.out.println(pst.executeUpdate());
                        pst.executeUpdate();
                        //System.out.println(pst.executeUpdate());
                        setearCampos();
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(panelVenta.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setearCampos();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxFabricante;
    private javax.swing.JPanel Cuerpo;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDroga;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtdroga;
    private com.toedter.calendar.JDateChooser txtfecha;
    // End of variables declaration//GEN-END:variables
private void agregarAlComboBox(JComboBox<String> CBoxFabricante) {
        ResultSet rr;
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String instruccion = "Select * from fabricante where fabri_estado=true";
            //con = new Conexion();

            pstm = con.getConnection().prepareStatement(instruccion);
            rr = pstm.executeQuery();
            CBoxFabricante.removeAllItems();
            CBoxFabricante.revalidate();
            CBoxFabricante.repaint();
            CBoxFabricante.addItem("Seleccione un...");
            while (rr.next()) {
                CBoxFabricante.addItem(rr.getString("fabri_nombre"));
            }
            rr.close();
        } catch (SQLException ex) {
            Logger.getLogger(panelVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarTabla(JTable tabla) {

        model = (DefaultTableModel) tabla.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }

    private void setearCampos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        borrarTabla(tablaDroga);
        txtCant.setText(null);
        txtId.setText(null);
        txtdroga.setText(null);
        txtPrecioU.setText(null);
        txtStock.setText(null);
        txtTotal.setText(null);
        txtDni.setText(null);
        ComboBoxFabricante.setSelectedIndex(0);
    }

    private void agregarNuvaDroga(String text) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //con = new Conexion();
            String ins = "INSERT INTO droga(droga_nombre,droga_cantidad,droga_precioU,droga_estado) values(?,?,?,?)";
            String ins_id = "select * from droga where droga_nombre=" + text;
            pstm = con.getConnection().prepareStatement("INSERT INTO droga(droga_id,droga_nombre,droga_cantidad,droga_precioU,droga_estado) values(?,?,?,?,?)");
            int id = txtId.getText().isEmpty() ? 0 : Integer.parseInt(txtId.getText());
            if (id != 0) {

                pstm.setInt(1, id);
                pstm.setString(2, txtdroga.getText());
                pstm.setInt(3, Integer.parseInt(txtCant.getText()));
                pstm.setFloat(4, Float.parseFloat(txtPrecioU.getText()));
                pstm.setBoolean(5, true);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego una nueva Droga");
            } else {
                pstm = con.getConnection().prepareStatement(ins);
                pstm.setString(1, text);
                pstm.setInt(2, Integer.parseInt(txtCant.getText()));
                pstm.setFloat(3, Float.parseFloat(txtPrecioU.getText()));
                pstm.setBoolean(4, true);
                pstm.executeUpdate();
                pstm = con.getConnection().prepareStatement(ins_id);
                ResultSet rr = pstm.executeQuery();
                if (rr.next()) {
                    txtId.setText(String.valueOf(rr.getInt("droga_id")));
                    JOptionPane.showMessageDialog(null, "Se agrego una nueva Droga");
                    rr.close();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GenerarDetalle(JTable tablaDrog, int nroFac) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        PreparedStatement ps;
        //con = new Conexion();
        model = (DefaultTableModel) tablaDrog.getModel();
        String ins_updSumarStock = "update droga set droga_cantidad=(droga_cantidad+?) where droga_id=?";
        String ins_detalle = "INSERT INTO facturacompradetalle(facDet_nroFacCab,facDet_DrogaID,facDet_cantidad,facDet_precioUnitario) values (?,?,?,?)";

        for (int i = 0; i < model.getRowCount(); i++) {
            try {
                int idDroga = Integer.valueOf(model.getValueAt(i, 0).toString());
                int cant = Integer.valueOf(model.getValueAt(i, 2).toString());
                float precioU = Float.valueOf(model.getValueAt(i, 3).toString().substring(2, model.getValueAt(i, 3).toString().length()));
                PreparedStatement upd = con.getConnection().prepareStatement(ins_updSumarStock);
                upd.setInt(1, cant);
                upd.setInt(2, idDroga);

                ps = con.getConnection().prepareStatement(ins_detalle);
                ps.setInt(1, nroFac);
                ps.setInt(2, idDroga);
                ps.setInt(3, cant);
                ps.setFloat(4, precioU);
                upd.executeUpdate();
                ps.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(panelCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private boolean verificarCampos() {
        boolean vacio=false;
        StringBuilder camposVacios=new StringBuilder();
        int i=0;
        camposVacios.append("\tError:\n");
        if(txtDni.getText().isEmpty()){
            vacio=true;
            i++;
            camposVacios.append(i+"- Debe seleccionar un Fabricante.\n");
        }
        if(tablaDroga.getRowCount()<1){
            vacio=true;
            i++;
            camposVacios.append(i+"- No agrego Droga a la tabla.\n");
        }
        
        if(vacio){
            JOptionPane.showMessageDialog(null, camposVacios);
        }
        return vacio;
    }


}
