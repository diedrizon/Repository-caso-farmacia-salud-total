
package vista;

import Modelo.*;
import java.awt.Component;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;

/** @author diedr */


public class JInternalFrame_ventas extends javax.swing.JInternalFrame {

     private Component rootpane;
    
    public JInternalFrame_ventas() {
        initComponents();
    }
    public void limpiarCampos(){
    jTextField_n_factura.setText("");
    jTextField_monto_vt.setText("");
    jTextField_cant_vt.setText("");
    jTextField_fh_vt.setText("");
    }
    public void obtenerDatos(){
        
        List<Class_ventas> ventas=new DAOventas().obtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        String[] columnas={"N factura","Monto venta","Cantidad venta",
        "Fecha venta"};
        
        modelo.setColumnIdentifiers(columnas);
        for(Class_ventas au:ventas){
            
            String[]renglon0={Integer.toString(au.getN_factura()),
                   Float.toString( au.getMonto_vt()),
                   Float.toString( au.getCant_vt()),
                    au.getFh_vt().toString()}; 
        }
        jTable_venta.setModel(modelo);
    }
        public void actualizarventas(){
        int n_f=Integer.parseInt(this.jTextField_n_factura.getText());
        String mt=this.jTextField_monto_vt.getText();
        String ctd=this.jTextField_cant_vt.getText();
        String fh=(this.jTextField_fh_vt.getText());
        
        DAOventas doa=new DAOventas();
        int res=doa.Actualizar(n_f, mt, ctd, fh);
        if(res==1){
            JOptionPane.showMessageDialog(rootpane, "¡venta actualizada!");
        }
        else{
            JOptionPane.showMessageDialog(rootpane, "¡Ocurrio un ERROR!");
        }
       }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_n_factura = new javax.swing.JTextField();
        jTextField_monto_vt = new javax.swing.JTextField();
        jTextField_cant_vt = new javax.swing.JTextField();
        jTextField_fh_vt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_venta = new javax.swing.JButton();
        jButton_actualizar_ventas = new javax.swing.JButton();
        jButton_buscar_venta = new javax.swing.JButton();
        jButton_salir_ventas = new javax.swing.JButton();
        jButton_editar_venta = new javax.swing.JButton();
        jTextField_buscar_venta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_venta = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Ventas");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("N° Factura");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Monto venta");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Cantidad venta");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Fecha venta");

        jTextField_n_factura.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_n_factura.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_n_factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_n_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_n_facturaActionPerformed(evt);
            }
        });

        jTextField_monto_vt.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_monto_vt.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_monto_vt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_monto_vt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_monto_vtActionPerformed(evt);
            }
        });

        jTextField_cant_vt.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cant_vt.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cant_vt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_cant_vt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cant_vtActionPerformed(evt);
            }
        });

        jTextField_fh_vt.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fh_vt.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_fh_vt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_fh_vt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fh_vtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_monto_vt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_n_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_cant_vt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_fh_vt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_n_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cant_vt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_fh_vt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_monto_vt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton_agregar_venta.setBackground(new java.awt.Color(204, 204, 255));
        jButton_agregar_venta.setForeground(new java.awt.Color(0, 0, 0));
        jButton_agregar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon agregar.png"))); // NOI18N
        jButton_agregar_venta.setText("Agregar");
        jButton_agregar_venta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_agregar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_ventaActionPerformed(evt);
            }
        });

        jButton_actualizar_ventas.setBackground(new java.awt.Color(204, 204, 255));
        jButton_actualizar_ventas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon actualizar.png"))); // NOI18N
        jButton_actualizar_ventas.setText("Actualizar");
        jButton_actualizar_ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_actualizar_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_ventasActionPerformed(evt);
            }
        });

        jButton_buscar_venta.setBackground(new java.awt.Color(204, 204, 255));
        jButton_buscar_venta.setForeground(new java.awt.Color(0, 0, 0));
        jButton_buscar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon buscar.png"))); // NOI18N
        jButton_buscar_venta.setText("Buscar");
        jButton_buscar_venta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_buscar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_ventaActionPerformed(evt);
            }
        });

        jButton_salir_ventas.setBackground(new java.awt.Color(204, 204, 255));
        jButton_salir_ventas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_salir_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon salir.png"))); // NOI18N
        jButton_salir_ventas.setText("Salir");
        jButton_salir_ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_salir_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salir_ventasActionPerformed(evt);
            }
        });

        jButton_editar_venta.setBackground(new java.awt.Color(204, 204, 255));
        jButton_editar_venta.setForeground(new java.awt.Color(0, 0, 0));
        jButton_editar_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon Editar.png"))); // NOI18N
        jButton_editar_venta.setText("Editar");
        jButton_editar_venta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_editar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_ventaActionPerformed(evt);
            }
        });

        jTextField_buscar_venta.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_buscar_venta.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_buscar_venta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_buscar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscar_ventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_agregar_venta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton_editar_venta)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_buscar_venta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_buscar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_actualizar_ventas)
                    .addComponent(jButton_salir_ventas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_venta)
                    .addComponent(jButton_editar_venta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_actualizar_ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_buscar_venta)
                    .addComponent(jTextField_buscar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_salir_ventas)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_venta.setBackground(new java.awt.Color(255, 255, 255));
        jTable_venta.setForeground(new java.awt.Color(255, 255, 255));
        jTable_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Factura", "Mónto de venta", "Cantidad venta", "Fecha venta"
            }
        ));
        jTable_venta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_ventaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable_venta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_n_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_n_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_n_facturaActionPerformed

    private void jTextField_monto_vtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_monto_vtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_monto_vtActionPerformed

    private void jTextField_cant_vtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cant_vtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cant_vtActionPerformed

    private void jTextField_fh_vtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fh_vtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fh_vtActionPerformed

    private void jButton_agregar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_ventaActionPerformed
       String n=jTextField_n_factura.getText();
       String mt=jTextField_monto_vt.getText();
       String cant=jTextField_cant_vt.getText();
       String fh=jTextField_fh_vt.getText();
       
       if(n.contentEquals("")||mt.contentEquals("")||cant.contentEquals("")
              || fh.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
   try{
      Class_ventas au=new DAOventas().Insertar(n, mt, cant,fh );
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    }//GEN-LAST:event_jButton_agregar_ventaActionPerformed

    private void jButton_buscar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscar_ventaActionPerformed

    private void jButton_actualizar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_ventasActionPerformed
        actualizarventas();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_ventasActionPerformed

    private void jButton_salir_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir_ventasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_salir_ventasActionPerformed

    private void jButton_editar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_ventaActionPerformed
         int fila=this.jTable_venta.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int n=Integer.parseInt((String)this.jTable_venta.getValueAt(fila, 1).toString());
              String mt=(String)this.jTable_venta.getValueAt(fila,2);
              String cant=(String)this.jTable_venta.getValueAt(fila,3);
              String fh=(String)this.jTable_venta.getValueAt(fila,4).toString();
              
              jTextField_n_factura.setText(""+n);
              jTextField_monto_vt.setText(mt);
              jTextField_cant_vt.setText(cant);
              jTextField_fh_vt.setText(fh);
          }catch(Exception e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton_editar_ventaActionPerformed

    private void jTextField_buscar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscar_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscar_ventaActionPerformed

    private void jTable_ventaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_ventaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ventaAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_ventas;
    private javax.swing.JButton jButton_agregar_venta;
    private javax.swing.JButton jButton_buscar_venta;
    private javax.swing.JButton jButton_editar_venta;
    private javax.swing.JButton jButton_salir_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_venta;
    private javax.swing.JTextField jTextField_buscar_venta;
    private javax.swing.JTextField jTextField_cant_vt;
    private javax.swing.JTextField jTextField_fh_vt;
    private javax.swing.JTextField jTextField_monto_vt;
    private javax.swing.JTextField jTextField_n_factura;
    // End of variables declaration//GEN-END:variables
}
