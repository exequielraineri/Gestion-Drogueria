/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Clases.FacturaVenta;
import Clases.Farmacia;
import Clases.Medicamento;
import Conexion.Conexion;
import LSE.Nodo;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import com.sun.org.apache.bcel.internal.generic.AASTORE;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javafx.scene.Node;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static sistema_drogueria.Home.con;

/**
 *
 * @author ADMIN
 */
public class panelVenta extends javax.swing.JPanel {

    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel model;

    Medicamento medicamento;
    Farmacia farmacia;
    FacturaVenta factura;

    /**
     * Creates new form panelVenta
     */
    public panelVenta() {
        initComponents();
        setVisible(true);
        con = new Conexion();
        borrarTabla(tablaMedicamentos);
        txtfecha.setCalendar(Calendar.getInstance());
        agregarAlComboBox(ComboBoxFarmacia);
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
        tablaMedicamentos = new javax.swing.JTable();
        txtfecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtMed = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtPrecioU = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ComboBoxFarmacia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
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
        jLabel1.setText("Gestion Ventas");

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

        tablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MEDICAMENTO", "CANTIDAD", "PRECIO U.", "SUB TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMedicamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaMedicamentos);

        txtfecha.setRequestFocusEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Medicamento");

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

        txtPrecioU.setEditable(false);

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
        jLabel11.setText("Farmacia");

        ComboBoxFarmacia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ComboBoxFarmacia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ComboBoxFarmaciaMouseReleased(evt);
            }
        });
        ComboBoxFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFarmaciaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cuit");

        txtCuit.setEditable(false);

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
                                .addGroup(CuerpoLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(109, 109, 109)
                                    .addComponent(jLabel8)
                                    .addGap(66, 66, 66)
                                    .addComponent(jLabel9))
                                .addGroup(CuerpoLayout.createSequentialGroup()
                                    .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(txtPrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
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
                .addGap(18, 18, 18)
                .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CuerpoLayout.createSequentialGroup()
                        .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)
                        .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CuerpoLayout.createSequentialGroup()
                        .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(3, 3, 3)
                        .addGroup(CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
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
                String instruccion = "Select * from medicamento where med_id=? and med_estado=true";
                //con = new Conexion();
                pstm = con.getConnection().prepareStatement(instruccion);
                pstm.setInt(1, Integer.valueOf(txtId.getText()));
                rs = pstm.executeQuery();
                if (rs.next()) {
                    txtMed.setText(rs.getString("med_nombre"));
                    txtPrecioU.setText(String.valueOf(rs.getDouble("med_precio")));
                    txtStock.setText(String.valueOf(rs.getInt("med_cantidad")));
                } else {
                    txtMed.setText(null);
                    txtPrecioU.setText(null);
                }

            } catch (SQLException ex) {
                Logger.getLogger(panelVenta.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtIdKeyReleased

    private void txtCantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantKeyReleased
        // TODO add your handling code here:
        double total = txtTotal.getText().isEmpty() ? 0 : Double.parseDouble(txtTotal.getText().substring(2, txtTotal.getText().length()));
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ((Integer.parseInt(txtCant.getText()) <= (Integer.parseInt(txtStock.getText()))) && Integer.parseInt(txtCant.getText()) > 0) {
                model = (DefaultTableModel) tablaMedicamentos.getModel();

                Object[] fila = new Object[5];
                double precio = Double.valueOf(txtPrecioU.getText());
                double cantidad = Double.valueOf(txtCant.getText());
                double subtotal = cantidad * precio;
                fila[0] = txtId.getText();
                fila[1] = txtMed.getText();
                fila[2] = txtCant.getText();

                fila[3] = "$ " + precio;
                fila[4] = "$ " + subtotal;
                model.addRow(fila);
                total += subtotal;

                txtTotal.setText("$ " + String.valueOf(total));
            } else {

                JOptionPane.showMessageDialog(null, "Excede el stock disponible");
                txtCant.setText(null);
            }

        }
    }//GEN-LAST:event_txtCantKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtCant.setText(null);
        txtId.setText(null);
        txtMed.setText(null);
        txtPrecioU.setText(null);
        txtStock.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void ComboBoxFarmaciaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxFarmaciaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxFarmaciaMouseReleased

    private void ComboBoxFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFarmaciaActionPerformed
        // TODO add your handling code here:
        if (ComboBoxFarmacia.getSelectedIndex() != -1 && !ComboBoxFarmacia.getSelectedItem().equals("Seleccionar una...")) {
            try {

                String instruccion = "Select * from farmacia where farm_nombre=? and farm_estado=true";
                //con = new Conexion();
                pstm = con.getConnection().prepareStatement(instruccion);
                pstm.setString(1, String.valueOf(ComboBoxFarmacia.getSelectedItem()));
                rs = pstm.executeQuery();
                rs.next();
                txtCuit.setText(rs.getString("farm_cuit"));

            } catch (SQLException ex) {
                Logger.getLogger(panelVenta.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_ComboBoxFarmaciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(null, "¿Seguro desea cancelar la venta?");
        if (op == 0) {
            setearCampos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!varificarCampos()) {

            int op = JOptionPane.showConfirmDialog(null, "¿Confirma esta venta?");
            if (op == 0) {
                try {

                    farmacia = new Farmacia();
                    factura = new FacturaVenta();
                    String ins_nroFac = "Select fac_nroFac from facturaventacabecera order by fac_nroFac desc limit 1";
                    String ins_farm = "select * from farmacia where farm_nombre=?";
                    Calendar fechaVto = txtfecha.getCalendar();
                    fechaVto.add(Calendar.DATE, 7);
                    java.util.Date fVto = fechaVto.getTime();
                    String ins_facCabezera = "Insert into facturaventacabecera(fac_farid,fac_fechaEmision,fac_fechavto,fac_estado) values(?,?,?,?)";
                    //con = new Conexion();
                    pstm = con.getConnection().prepareStatement(ins_nroFac);
                    rs = pstm.executeQuery();
                    rs.next();
                    int nroFac = rs.getInt("fac_nroFac") + 1;
                    factura.setNroFactura(nroFac);
                    pstm = con.getConnection().prepareStatement(ins_farm);
                    pstm.setString(1, (String) ComboBoxFarmacia.getSelectedItem());
                    rs = pstm.executeQuery();
                    rs.next();
                    int idF = rs.getInt("farm_id");

                    farmacia.setFarm_id(idF);
                    farmacia.setFarm_cuit(rs.getString("farm_cuit"));
                    farmacia.setFarm_domicilio(rs.getString("farm_domicilio"));
                    farmacia.setFarm_nombre(rs.getString("farm_nombre"));
                    farmacia.setId_farmaceutico(rs.getInt("id_farmaceutico"));
                    factura.setFarmacia(farmacia);
                    PreparedStatement ps;
                    ps = con.getConnection().prepareStatement(ins_facCabezera);
                    ps.setInt(1, idF);
                    java.util.Date miDate = txtfecha.getDate();
                    Timestamp timestamp = new Timestamp(miDate.getTime());
                    ps.setTimestamp(2, timestamp);
                    Timestamp fto = new Timestamp(fVto.getTime());
                    ps.setTimestamp(3, fto);
                    ps.setBoolean(4, true);
                    factura.setFechaEmision(txtfecha.getCalendar());
                    factura.setFechaEmision(fechaVto);

                    GenerarDetalle(tablaMedicamentos, factura.getNroFactura());
                    ps.executeUpdate();
                    setearCampos();
                    try {
                        generarPDF(factura);
                    } catch (IOException ex) {
                        Logger.getLogger(panelVenta.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> ComboBoxFarmacia;
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
    private javax.swing.JTable tablaMedicamentos;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMed;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private com.toedter.calendar.JDateChooser txtfecha;
    // End of variables declaration//GEN-END:variables
private void agregarAlComboBox(JComboBox<String> CBoxFarmacia) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String instruccion = "Select * from farmacia where farm_estado=true";
            //con = new Conexion();
            pstm = con.getConnection().prepareStatement(instruccion);
            rs = pstm.executeQuery();
            CBoxFarmacia.removeAllItems();
            CBoxFarmacia.addItem("Seleccionar una...");
            while (rs.next()) {
                CBoxFarmacia.addItem(rs.getString("farm_nombre"));
            }

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

    private void GenerarDetalle(JTable tablaMed, int nroFac) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        PreparedStatement ps;
        //con = new Conexion();
        model = (DefaultTableModel) tablaMed.getModel();
        String ins_updRestarStock = "update medicamento set med_cantidad=(med_cantidad-?) where med_id=?";
        String ins_detalle = "INSERT INTO facturaventadetalle(facDet_nroFacCab,facDet_medID,facDet_cantidad,facDet_precioUnitario) values (?,?,?,?)";

        for (int i = 0; i < model.getRowCount(); i++) {
            try {
                int idMed = Integer.valueOf(model.getValueAt(i, 0).toString());
                int cant = Integer.valueOf(model.getValueAt(i, 2).toString());
                float precioU = Float.valueOf(model.getValueAt(i, 3).toString().substring(2, model.getValueAt(i, 3).toString().length()));
                PreparedStatement upd = con.getConnection().prepareStatement(ins_updRestarStock);
                upd.setInt(1, cant);
                upd.setInt(2, idMed);

                ps = con.getConnection().prepareStatement(ins_detalle);
                ps.setInt(1, nroFac);
                ps.setInt(2, idMed);
                ps.setInt(3, cant);
                ps.setFloat(4, precioU);
                medicamento = new Medicamento();
                medicamento.setMed_id(idMed);
                medicamento.setMed_cantidad(cant);
                medicamento.setMed_precio(precioU);
                String nombre = model.getValueAt(i, 1).toString();
                medicamento.setMed_nombre(nombre);
                factura.getListaMedicamentos().insertarPri(medicamento);
                upd.executeUpdate();
                ps.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(panelVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setearCampos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        borrarTabla(tablaMedicamentos);
        txtCant.setText(null);
        txtId.setText(null);
        txtMed.setText(null);
        txtPrecioU.setText(null);
        txtStock.setText(null);
        txtTotal.setText(null);
        txtCuit.setText(null);
        ComboBoxFarmacia.setSelectedIndex(0);
    }

    private void generarPDF(FacturaVenta factura) throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Document documento = new Document();
        String ruta = "Reportes";

        crearCarpetas(ruta);
        try {
            //PdfWriter.getInstance(documento, new FileOutputStream(new File("src/Reportes/" + factura.getNroFactura() + "_reporte.pdf")));
            PdfWriter.getInstance(documento, new FileOutputStream(new File("Reportes\\" + factura.getNroFactura() + "_reporte.pdf")));

            documento.open();
            documento.setMargins(0, 0, 0, 0);
            Paragraph saltoLinea = new Paragraph(" ");

            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy HH:mm a");
            PdfPTable encabezado = new PdfPTable(2);
            encabezado.getDefaultCell().setBorder(0);
            encabezado.setHorizontalAlignment(Element.ALIGN_CENTER);

            encabezado.addCell("N° Factura: " + factura.getNroFactura() + ""
                    + "\nFarmacia: " + factura.getFarmacia().getFarm_nombre() + ""
                    + "\nDomicilio: " + factura.getFarmacia().getFarm_domicilio() + ""
                    + "\nCuit: " + factura.getFarmacia().getFarm_cuit());

            encabezado.addCell("Fecha Emision: \t" + sf.format(factura.getFechaEmision().getTime()) + ""
                    + "\nFecha Vto: \t" + sf.format(factura.getFechaVto().getTime()));

            PdfPTable listado = new PdfPTable(5);
            listado.addCell("ID");
            listado.addCell("Medicamento");
            listado.addCell("Cantidad");
            listado.addCell("precio U.");
            listado.addCell("Subtotal");

            Nodo<Medicamento> m = factura.getListaMedicamentos().inicio();
            while (m != null) {
                listado.addCell(String.valueOf(m.getDato().getMed_id()));
                listado.addCell(String.valueOf(m.getDato().getMed_nombre()));
                listado.addCell(String.valueOf(m.getDato().getMed_cantidad()));
                listado.addCell("$" + String.valueOf(m.getDato().getMed_precio()));
                listado.addCell("$" + String.valueOf(m.getDato().getSubtotal()));
                m = m.getPs();
            }

            PdfPTable total = new PdfPTable(5);
            total.getDefaultCell().setBorder(0);
            total.addCell("");
            total.addCell("");
            total.addCell("");
            total.addCell("");
            total.addCell("Total: $" + factura.getTotal());

//            Paragraph total = new Paragraph();
//            total.add(Chunk.NEWLINE);
//            total.setAlignment(Element.ALIGN_RIGHT);
//            total.add("Total: $" + factura.getTotal());
            documento.add(encabezado);
            documento.add(saltoLinea);
            documento.add(listado);
            documento.add(saltoLinea);
            documento.add(total);
            documento.add(saltoLinea);
            documento.close();

        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
        JOptionPane.showMessageDialog(null, "Se generó un pdf");
    }

    private void crearCarpetas(String ruta) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        File carpeta = new File(ruta);
        if (carpeta.exists()) {

        } else {
            carpeta.mkdirs();
        }
    }

    private boolean varificarCampos() {
        boolean vacio = false;
        StringBuilder camposVacios = new StringBuilder();
        int i = 0;
        camposVacios.append("\tError/es:\n");
        if (txtCuit.getText().isEmpty()) {
            vacio = true;
            i++;
            camposVacios.append(i + "- Debe seleccionar una Farmacia.\n");
        }
        if (tablaMedicamentos.getRowCount() < 1) {
            vacio = true;
            i++;
            camposVacios.append(i + "- No agrego Medicamento a la tabla.\n");
        }

        if (vacio) {
            JOptionPane.showMessageDialog(null, camposVacios);
        }
        return vacio;
    }

}
