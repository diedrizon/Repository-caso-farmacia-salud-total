
package vista;

import Modelo.*;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    jTextField_fh_vt.setText("");
    jTextField_cod_emp.setText("");
    jTextField_ced_cli.setText("");
    }
    public void obtenerDatos(){
        List<Class_ventas> ventas=new DAOventas().obtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        String[] columns={"n_factura","monto_vt",
        "fh_vt","cod_emp","ced_cli"};
        
        modelo.setColumnIdentifiers(columns);
      
        for(Class_ventas au:ventas){
            String[]renglon={Integer.toString(au.getN_factura()),
                   Float.toString( au.getMonto_vt()),
                    au.getFh_vt().toString(),
                   Integer.toString(au.getCod_emp()),
                   au.getCed_cli().toString()}; 
            modelo.addRow(renglon);
        }
        jTable_venta.setModel(modelo);
    }
        public void actualizarventas(){
        int n_factura=Integer.parseInt(this.jTextField_n_factura.getText());
        float monto_vt=Float.parseFloat(this.jTextField_monto_vt.getText());
        java.sql.Date fh_vt=Date.valueOf(this.jTextField_fh_vt.getText());
        int cod_emp=Integer.parseInt(this.jTextField_cod_emp.getText());
        String ced_cli=this.jTextField_ced_cli.getText();
        
        DAOventas doa=new DAOventas();
        int res=doa.Actualizar(n_factura, monto_vt, fh_vt, cod_emp, ced_cli);
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
        jLabel5 = new javax.swing.JLabel();
        jTextField_n_factura = new javax.swing.JTextField();
        jTextField_monto_vt = new javax.swing.JTextField();
        jTextField_fh_vt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_cod_emp = new javax.swing.JTextField();
        jTextField_ced_cli = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar_ventas = new javax.swing.JButton();
        jButton_editar_venta = new javax.swing.JButton();
        jButton_agregar_venta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_venta = new javax.swing.JTable();

        setClosable(true);

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

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Fecha venta");

        jTextField_n_factura.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_n_factura.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_n_factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_monto_vt.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_monto_vt.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_monto_vt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_fh_vt.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fh_vt.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_fh_vt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Código de empleado");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 205));
        jLabel7.setText("Cédula de cliente");

        jTextField_cod_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_ced_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ced_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_ced_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_monto_vt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(jTextField_n_factura, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(jTextField_fh_vt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_cod_emp, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(jTextField_ced_cli))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_n_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cod_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_monto_vt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ced_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_fh_vt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

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

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Transacciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_agregar_venta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_editar_venta)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_actualizar_ventas)
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_venta)
                    .addComponent(jButton_editar_venta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_actualizar_ventas)
                .addGap(52, 52, 52))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_venta.setBackground(new java.awt.Color(255, 255, 255));
        jTable_venta.setForeground(new java.awt.Color(0, 0, 0));
        jTable_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "n_factura", "monto_vt", "fh_vt", "cod_emp", "ced_cli"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_ventaActionPerformed
       String n_factura=jTextField_n_factura.getText();
       String monto_vt=jTextField_monto_vt.getText();
       String fh_vt=jTextField_fh_vt.getText();
       String cod_emp=jTextField_cod_emp.getText();
       String ced_cli=jTextField_ced_cli.getText();
       
       if(n_factura.contentEquals("")||monto_vt.contentEquals("")||
               fh_vt.contentEquals("")||cod_emp.contentEquals("")||ced_cli.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
        
  }else{      
        
   try{
       int n_f=Integer.parseInt(n_factura);
       float mnt_vt=Float.parseFloat(monto_vt);
       java.sql.Date fh_v=Date.valueOf(fh_vt);
       int cod_em=Integer.parseInt(cod_emp);
       
      Class_ventas au=new DAOventas().Insertar(n_f, mnt_vt, fh_v, cod_em, ced_cli);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
      
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    }//GEN-LAST:event_jButton_agregar_ventaActionPerformed

    private void jButton_actualizar_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_ventasActionPerformed
        actualizarventas();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_ventasActionPerformed

    private void jButton_editar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_ventaActionPerformed
     jTextField_n_factura.setEnabled(false);
     jTextField_cod_emp.setEnabled(false);
     jTextField_ced_cli.setEnabled(false);
     int fila=this.jTable_venta.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int n_factura=Integer.parseInt((String)this.jTable_venta.getValueAt(fila, 0).toString());
              float monto_vt=Float.parseFloat((String)this.jTable_venta.getValueAt(fila,1));
              java.sql.Date fh_vt=Date.valueOf((String)this.jTable_venta.getValueAt(fila,2));
              int cod_emp=Integer.parseInt((String)this.jTable_venta.getValueAt(fila,3));
              String ced_cli=(String)this.jTable_venta.getValueAt(fila,4).toString();
              
              jTextField_n_factura.setText(""+n_factura);
              jTextField_monto_vt.setText(Float.toString(monto_vt));
              jTextField_fh_vt.setText(String.valueOf(fh_vt));
              jTextField_cod_emp.setText(Integer.toString(cod_emp));
              jTextField_ced_cli.setText(ced_cli);
              
          }catch(NumberFormatException e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton_editar_ventaActionPerformed

    private void jTable_ventaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_ventaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ventaAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_ventas;
    private javax.swing.JButton jButton_agregar_venta;
    private javax.swing.JButton jButton_editar_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_venta;
    private javax.swing.JTextField jTextField_ced_cli;
    private javax.swing.JTextField jTextField_cod_emp;
    private javax.swing.JTextField jTextField_fh_vt;
    private javax.swing.JTextField jTextField_monto_vt;
    private javax.swing.JTextField jTextField_n_factura;
    // End of variables declaration//GEN-END:variables
}
