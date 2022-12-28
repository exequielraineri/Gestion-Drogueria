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
public class panelFarmacia extends javax.swing.JPanel {

    
    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel model;

    /**
     * Creates new form panelFarmacia
     */
    public panelFarmacia() {
        initComponents();
        con=new Conexion(Home.getUser(),Home.getPass());
        setVisible(true);
        mostrarTablaF(tableFarmacia);
        mostrarTablaFtico(tableFarmaceutico);

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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDomicilio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtCuit = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFarmaceutico = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtFarmtico = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFarmacia = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 550));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Farmacia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 195, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Domicilio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 237, -1));

        txtNombre.setBorder(null);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setOpaque(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 93, 241, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 190, 10));

        txtDomicilio.setBorder(null);
        txtDomicilio.setOpaque(false);
        jPanel1.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 240, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 640, 10));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Cuit");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 240, -1));

        txtCuit.setBorder(null);
        txtCuit.setOpaque(false);
        jPanel1.add(txtCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 240, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 210, 10));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 210, 40));

        tableFarmaceutico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dni"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFarmaceutico.getTableHeader().setReorderingAllowed(false);
        tableFarmaceutico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableFarmaceuticoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableFarmaceutico);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 260, 230));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregando Farmacia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 26, 635, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 113, 190, 10));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Farmaceutico");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 240, -1));

        txtFarmtico.setBorder(null);
        txtFarmtico.setOpaque(false);
        txtFarmtico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFarmticoKeyReleased(evt);
            }
        });
        jPanel1.add(txtFarmtico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 240, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 210, 10));

        tableFarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cuit", "Domicilio", "Farmaceutico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFarmacia.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableFarmacia);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 328, 635, 150));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 210, 40));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!verificarCampos()){
            
        
        try {
            // TODO add your handling code here:
            if (!(txtCuit.getText().equals(null) || txtDomicilio.getText().equals(null) || txtNombre.getText().equals(null))) {
                //con = new Conexion();
                pstm = con.getConnection().prepareStatement("INSERT INTO farmacia(farm_nombre,farm_cuit,farm_domicilio,id_farmaceutico,farm_estado) values(?,?,?,?,?)");
                pstm.setString(1, txtNombre.getText());

                Integer[] cc = new Integer[11];
                String cuit = txtCuit.getText().trim();

                if (cuit.length() < 11) {
                    System.out.println("---->" + cuit.length());
                    for (int i = cuit.length(); i < 11; i++) {
                        cuit = cuit + 0;
                    }
                }

                for (int i = 0; i < 11; i++) {
                    cc[i] = Integer.parseInt(String.valueOf(cuit.charAt(i)));
                }
                cuit = new String();
                for (int i = 0; i < 11; i++) {
                    cuit = cuit + cc[i];

                }

                pstm.setString(2, cuit);
                pstm.setString(3, txtDomicilio.getText());
                int idFarmtico = obtenerID(tableFarmaceutico) == -1 ? -1 : obtenerID(tableFarmaceutico);
                pstm.setInt(4, idFarmtico);
                pstm.setBoolean(5, true);
                if (idFarmtico != -1) {
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Se agrego una nueva Farmacia");
                    txtCuit.setText(null);
                    txtNombre.setText(null);
                    txtDomicilio.setText(null);
                    txtFarmtico.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un farmaceutico");
                }

                mostrarTablaF(tableFarmacia);
                mostrarTablaFtico(tableFarmaceutico);
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar los campors");
            }

        } catch (SQLException ex) {
            Logger.getLogger(panelFarmaceutico.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tableFarmaceuticoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFarmaceuticoMouseReleased
        // TODO add your handling code here:
        model = (DefaultTableModel) tableFarmaceutico.getModel();
        txtFarmtico.setText((String) model.getValueAt(tableFarmaceutico.getSelectedRow(), 1));


    }//GEN-LAST:event_tableFarmaceuticoMouseReleased

    private void txtFarmticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFarmticoKeyReleased
        // TODO add your handling code here:

        try {
            borrarTabla(tableFarmaceutico);
            String txt = txtFarmtico.getText();
            model = (DefaultTableModel) tableFarmaceutico.getModel();
            //con = new Conexion();
            pstm = con.getConnection().prepareStatement("Select * from farmaceutico where farmtico_nombre LIKE '%" + txt + "%'");
            rs = pstm.executeQuery();
            Object[] fila = new Object[3];
            while (rs.next()) {
                fila[0] = rs.getInt("farmtico_ID");
                fila[1] = rs.getString("farmtico_nombre");
                fila[2] = rs.getInt("farmtico_dni");
                model.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(agregarStock.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtFarmticoKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //con=new Conexion();
        String eliminar="update farmacia set farm_estado=false where farm_nombre=? and farm_cuit=?";
        if(tableFarmacia.getSelectedRow()!=-1){
            try {
                model=(DefaultTableModel) tableFarmacia.getModel();
                pstm=con.getConnection().prepareStatement(eliminar);
                pstm.setString(1, String.valueOf(model.getValueAt(tableFarmacia.getSelectedRow(), 0)));
                pstm.setString(2, String.valueOf(model.getValueAt(tableFarmacia.getSelectedRow(), 1)));
                pstm.executeUpdate();
                mostrarTablaF(tableFarmacia);
            } catch (SQLException ex) {
                Logger.getLogger(panelMed.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Farmacia");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tableFarmaceutico;
    private javax.swing.JTable tableFarmacia;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtFarmtico;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
private void mostrarTablaF(JTable tabla) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //con = new Conexion();
            borrarTabla(tabla);
            model = (DefaultTableModel) tabla.getModel();

            pstm = con.getConnection().prepareStatement("select * from farmacia where farm_estado=true");
            rs = pstm.executeQuery();
            Object[] fila = new Object[4];
            while (rs.next()) {
                fila[0] = rs.getString("farm_nombre");
                fila[1] = rs.getString("farm_cuit");
                fila[2] = rs.getString("farm_domicilio");
                fila[3] = devolverNombre(rs.getInt("id_farmaceutico"));
                
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

    public void borrarTabla(JTable tabla) {

        model = (DefaultTableModel) tabla.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

    }

    private void mostrarTablaFtico(JTable tabla) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //con = new Conexion();
            borrarTabla(tabla);
            model = (DefaultTableModel) tabla.getModel();

            pstm = con.getConnection().prepareStatement("select * from farmaceutico");
            rs = pstm.executeQuery();
            Object[] fila = new Object[3];
            while (rs.next()) {
                fila[0] = rs.getInt("farmtico_ID");
                fila[1] = rs.getString("farmtico_nombre");
                fila[2] = rs.getInt("farmtico_dni");
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

    private String devolverNombre(int id) {
        ResultSet resul = null;
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //con = new Conexion();

            pstm = con.getConnection().prepareStatement("select * from farmaceutico where farmtico_id=?");
            pstm.setInt(1, id);
            resul = pstm.executeQuery();
            resul.next();
            return resul.getString("farmtico_nombre");

        } catch (SQLException ex) {
            Logger.getLogger(panelFarmacia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //con.desconectar();
                pstm.close();
                resul.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelFarmacia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;

    }

    private int obtenerID(JTable tableFarmaceutico) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (tableFarmaceutico.getSelectedRow() != -1) {
            model = (DefaultTableModel) tableFarmaceutico.getModel();

            return (int) model.getValueAt(tableFarmaceutico.getSelectedRow(), 0);
        }
        return -1;
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

        if (txtCuit.getText().isEmpty()) {
            vacio = true;
            i++;
            camposVacios.append(i + "- Debe ingresar Cuit.\n");
        }

        if (txtFarmtico.getText().isEmpty()) {
            vacio = true;
            i++;
            camposVacios.append(i + "- Debe seleccionar un Farmaceutico.\n");
        }

        if (vacio) {
            JOptionPane.showMessageDialog(null, camposVacios);
        }
        return vacio;
    }

}
