
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

/** @author diedr*/

public class JInternalFrame_compra extends javax.swing.JInternalFrame {

    private Component rootpane;

    
    public JInternalFrame_compra() {
        initComponents();
    }
    public void limpiarCampos(){
        jTextField_cod_compra.setText("");
        jTextField_vrd_p.setText("");
        jTextField_fh_compra.setText("");
        jTextField_cod_lab.setText("");
    }
    
    public void obtenerDatos(){
        List<Class_compra> compra = new DAOcompra().obtenerDatos();
        DefaultTableModel modelo=new DefaultTableModel();
        String[] columns={"cod_cp","vrd_p","fh_cp","cod_lab"};
       
        modelo.setColumnIdentifiers(columns);
        for(Class_compra au:compra){
            String[]renglon={Integer.toString(au.getCod_cp()),
                    au.getVrd_p(),
                    au.getFh_cp().toString(),
                    Integer.toString(au.getCod_lab())};
            modelo.addRow(renglon);
        }
       jTable_compra.setModel(modelo);
    }
     public void actualizarcompra(){
        int cod_cp=Integer.parseInt(this.jTextField_cod_compra.getText());
        String vrd_p=this.jTextField_vrd_p.getText();
        java.sql.Date fh_cp=Date.valueOf(this.jTextField_fh_compra.getText());
        int cod_lab=Integer.parseInt(this.jTextField_cod_lab.getText());
       
        DAOcompra doa=new DAOcompra();
        int res=doa.Actualizar(cod_cp, vrd_p, fh_cp,  cod_lab);
        if(res==1){
            JOptionPane.showMessageDialog(rootpane, "¡compra actualizada!");
        }
        else{
            JOptionPane.showMessageDialog(rootpane, "¡Ocurrio un ERROR!");
        }
       }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_vrd_p = new javax.swing.JTextField();
        jTextField_cod_compra = new javax.swing.JTextField();
        jTextField_fh_compra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_cod_lab = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_compra = new javax.swing.JButton();
        jButton_actualizar_compra = new javax.swing.JButton();
        jButton_editar_compra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_compra = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Compra");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Código compra");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Variedad producto");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Fecha compra");

        jTextField_vrd_p.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_vrd_p.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_vrd_p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_cod_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_compra.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_fh_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fh_compra.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_fh_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Código del laboratorio");

        jTextField_cod_lab.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_lab.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_lab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jTextField_cod_compra, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jTextField_vrd_p)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_cod_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_fh_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fh_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_vrd_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cod_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton_agregar_compra.setBackground(new java.awt.Color(204, 204, 255));
        jButton_agregar_compra.setForeground(new java.awt.Color(0, 0, 0));
        jButton_agregar_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon agregar.png"))); // NOI18N
        jButton_agregar_compra.setText("Agregar");
        jButton_agregar_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_agregar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_compraActionPerformed(evt);
            }
        });

        jButton_actualizar_compra.setBackground(new java.awt.Color(204, 204, 255));
        jButton_actualizar_compra.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon actualizar.png"))); // NOI18N
        jButton_actualizar_compra.setText("Actualizar");
        jButton_actualizar_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_actualizar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_compraActionPerformed(evt);
            }
        });

        jButton_editar_compra.setBackground(new java.awt.Color(204, 204, 255));
        jButton_editar_compra.setForeground(new java.awt.Color(0, 0, 0));
        jButton_editar_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon Editar.png"))); // NOI18N
        jButton_editar_compra.setText("Editar");
        jButton_editar_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_editar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_compraActionPerformed(evt);
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_agregar_compra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_editar_compra))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton_actualizar_compra)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_compra)
                    .addComponent(jButton_editar_compra))
                .addGap(34, 34, 34)
                .addComponent(jButton_actualizar_compra)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTable_compra.setForeground(new java.awt.Color(0, 0, 0));
        jTable_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "cod_cp", "vrd_p", "fh_cp", "cod_lab"
            }
        ));
        jTable_compra.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_compraAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable_compra);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_compraActionPerformed
       String cod_cp=jTextField_cod_compra.getText();
       String vrd_p=jTextField_vrd_p.getText();
       String fh_cp=jTextField_fh_compra.getText();
       String cod_lab=jTextField_cod_lab.getText();
       
       if(cod_cp.contentEquals("")||vrd_p.contentEquals("")||fh_cp.contentEquals("")
               ||cod_lab.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
 
  }else{
     
   try{
      int cod_comp=Integer.parseInt(cod_cp);
      java.sql.Date fec=Date.valueOf(fh_cp);
      int cod_ltb=Integer.parseInt(cod_lab);
            
      Class_compra au=new DAOcompra().Insertar(cod_comp, vrd_p,fec, cod_ltb);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
  
   }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    
    }//GEN-LAST:event_jButton_agregar_compraActionPerformed

    private void jButton_actualizar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_compraActionPerformed
        actualizarcompra();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_compraActionPerformed

    private void jButton_editar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_compraActionPerformed
        jTextField_cod_compra.setEnabled(false);
        int fila=this.jTable_compra.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int id=Integer.parseInt((String)this.jTable_compra.getValueAt(fila, 0).toString());
              String vrd=(String)this.jTable_compra.getValueAt(fila,1).toString();
              java.sql.Date fh_c=Date.valueOf((String)this.jTable_compra.getValueAt(fila,2));
              int cod_lab=Integer.parseInt((String)this.jTable_compra.getValueAt(fila,3).toString());
             
              jTextField_cod_compra.setText(""+id);
              jTextField_vrd_p.setText(vrd);
              jTextField_fh_compra.setText(String.valueOf(fh_c));
              jTextField_cod_lab.setText(Integer.toString(cod_lab));
          }catch(NumberFormatException e){
              e.printStackTrace();
          }
      }
    }                                             

    private void jButtonActualizaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        actualizarcompra();
        obtenerDatos();
        limpiarCampos();
    
    }//GEN-LAST:event_jButton_editar_compraActionPerformed

    private void jTable_compraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_compraAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_compraAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_compra;
    private javax.swing.JButton jButton_agregar_compra;
    private javax.swing.JButton jButton_editar_compra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_compra;
    private javax.swing.JTextField jTextField_cod_compra;
    private javax.swing.JTextField jTextField_cod_lab;
    private javax.swing.JTextField jTextField_fh_compra;
    private javax.swing.JTextField jTextField_vrd_p;
    // End of variables declaration//GEN-END:variables
}
