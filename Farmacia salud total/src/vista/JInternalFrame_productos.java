
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

/** @author died */


public class JInternalFrame_productos extends javax.swing.JInternalFrame {

    private Component rootpane;
    
    public JInternalFrame_productos() {
        initComponents();
    }
    public void limpiarCampos(){
        jTextField_cod_prod.setText("");
        jTextField_nbr_prod.setText("");
        jTextField_prec_cp.setText("");
        jTextField_prec_vt.setText("");
        jTextField_existe_prod.setText("");
        jTextField_dcrip_prod.setText("");
        jTextField_fh_venc.setText(""); 
    }
     public void obtenerDatos(){
        
        List<Class_productos> productos= new DAOproductos().obtenerDatos();
       
        DefaultTableModel modelo=new DefaultTableModel();
        String[] columns={"cod_prod","nbr_prod","prec_cp",
        "prec_vt","existe_prod","dcrip_prod","fh_venc"};
        
        modelo.setColumnIdentifiers(columns);
        for(Class_productos au:productos){
            String[]renglon={Integer.toString(au.getCod_prod()),
                   au.getNbr_prod(),
                   Float.toString(au.getPrec_cp()),
                   Float.toString(au.getPrec_vt()),
                   Float.toString( au.getExiste_prod()),
                   au.getDcrip_prod(),
                   au.getFh_venc().toString()};  
            modelo.addRow(renglon);
        }
        jTable_productos.setModel(modelo);
                
    }
        public void actualizarproductos(){
        int cod=Integer.parseInt(this.jTextField_cod_prod.getText());
        String nbr_p=this.jTextField_nbr_prod.getText();
        float prec_c=Float.parseFloat(this.jTextField_prec_cp.getText());
        float prec_v=Float.parseFloat(this.jTextField_prec_vt.getText());
        float exite_p=Float.parseFloat(this.jTextField_existe_prod.getText());
        String dcrip=this.jTextField_dcrip_prod.getText();
        Date fh=Date.valueOf(this.jTextField_fh_venc.getText());
        
        DAOproductos doa=new DAOproductos();
        int res=doa.Actualizar(cod, nbr_p, prec_c, prec_v, exite_p,dcrip, fh);
        if(res==1){
            JOptionPane.showMessageDialog(rootpane, "??producto actualizado!");
        }
        else{
            JOptionPane.showMessageDialog(rootpane, "??Ocurrio un ERROR!");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_prec_cp = new javax.swing.JTextField();
        jTextField_cod_prod = new javax.swing.JTextField();
        jTextField_nbr_prod = new javax.swing.JTextField();
        jTextField_prec_vt = new javax.swing.JTextField();
        jTextField_fh_venc = new javax.swing.JTextField();
        jTextField_dcrip_prod = new javax.swing.JTextField();
        jTextField_existe_prod = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar_productos = new javax.swing.JButton();
        jButton_editar_compra = new javax.swing.JButton();
        jButton_agregar_prod = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("C??digo ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Precio compra");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Precio venta");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Existencia producto");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Descripci??n");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Fecha vencimiento");

        jTextField_prec_cp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_prec_cp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_prec_cp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_cod_prod.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_prod.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_prod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_nbr_prod.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_prod.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_prod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_prec_vt.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_prec_vt.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_prec_vt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_fh_venc.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fh_venc.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_fh_venc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_dcrip_prod.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_dcrip_prod.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_dcrip_prod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_existe_prod.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_existe_prod.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_existe_prod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_prec_vt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_prec_cp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(jTextField_nbr_prod, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_cod_prod, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_dcrip_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextField_fh_venc)
                            .addComponent(jTextField_existe_prod)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_existe_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nbr_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_dcrip_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_prec_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fh_venc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_prec_vt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton_actualizar_productos.setBackground(new java.awt.Color(204, 204, 255));
        jButton_actualizar_productos.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon actualizar.png"))); // NOI18N
        jButton_actualizar_productos.setText("Actualizar");
        jButton_actualizar_productos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_actualizar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_productosActionPerformed(evt);
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

        jButton_agregar_prod.setBackground(new java.awt.Color(204, 204, 255));
        jButton_agregar_prod.setForeground(new java.awt.Color(0, 0, 0));
        jButton_agregar_prod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon agregar.png"))); // NOI18N
        jButton_agregar_prod.setText("Agregar");
        jButton_agregar_prod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_agregar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_prodActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Transacciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_agregar_prod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_editar_compra)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_actualizar_productos)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_prod)
                    .addComponent(jButton_editar_compra))
                .addGap(36, 36, 36)
                .addComponent(jButton_actualizar_productos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        jTable_productos.setBackground(new java.awt.Color(255, 255, 255));
        jTable_productos.setForeground(new java.awt.Color(0, 0, 0));
        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "c??digo", "Nombre", "Precio compra", "precio venta", "Existencia producto", "Descripcion", "Fecha vencimiento"
            }
        ));
        jTable_productos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_productosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable_productos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_prodActionPerformed
       String cod_prod=jTextField_cod_prod.getText();
       String nbr_p=jTextField_nbr_prod.getText();
       String prec_c=jTextField_prec_cp.getText();
       String prec_v=jTextField_prec_vt.getText();
       String existe_p=jTextField_existe_prod.getText();
       String dcrip_p=jTextField_dcrip_prod.getText();
       String fh_v=jTextField_fh_venc.getText();
       
       if(cod_prod.contentEquals("")||nbr_p.contentEquals("")
               ||existe_p.contentEquals("")
               ||prec_c.contentEquals("")
               ||prec_v.contentEquals("")
               ||dcrip_p.contentEquals("")
               ||fh_v.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
 
  }else{
     
   try{
      int cod_p=Integer.parseInt(cod_prod);
      float prec_compra=Float.parseFloat(prec_c);
      float prec_venta=Float.parseFloat(prec_v);
      float existe=Float.parseFloat(existe_p);
      Date fech=Date.valueOf(fh_v);
      
      Class_productos au=new DAOproductos().Insertar(cod_p, nbr_p, prec_compra, prec_venta, existe, dcrip_p, fech);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
      
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    
    }//GEN-LAST:event_jButton_agregar_prodActionPerformed

    private void jButton_actualizar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_productosActionPerformed
        actualizarproductos();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_productosActionPerformed

    private void jButton_editar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_compraActionPerformed
       jTextField_cod_prod.setEnabled(false);
       int fila=this.jTable_productos.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int cod=Integer.parseInt((String)this.jTable_productos.getValueAt(fila,0));
              String nbr=(String)this.jTable_productos.getValueAt(fila,1);
              float prec_c=Float.parseFloat((String)this.jTable_productos.getValueAt(fila,2));
              float prec_v=Float.parseFloat((String)this.jTable_productos.getValueAt(fila,3));
              float existe_p=Float.parseFloat((String)this.jTable_productos.getValueAt(fila,4));
              String dcrip=(String)this.jTable_productos.getValueAt(fila,5);
              Date fh=Date.valueOf((String)this.jTable_productos.getValueAt(fila,6));
             
              jTextField_cod_prod.setText(""+cod);
              jTextField_nbr_prod.setText(nbr);
              jTextField_prec_cp.setText(Float.toString(prec_c));
              jTextField_prec_vt.setText(Float.toString(prec_v));
              jTextField_existe_prod.setText(Float.toString(existe_p));
              jTextField_dcrip_prod.setText(dcrip);
              jTextField_fh_venc.setText(String.valueOf(fh));
          }catch(NumberFormatException e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton_editar_compraActionPerformed

    private void jTable_productosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_productosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_productosAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_productos;
    private javax.swing.JButton jButton_agregar_prod;
    private javax.swing.JButton jButton_editar_compra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_productos;
    private javax.swing.JTextField jTextField_cod_prod;
    private javax.swing.JTextField jTextField_dcrip_prod;
    private javax.swing.JTextField jTextField_existe_prod;
    private javax.swing.JTextField jTextField_fh_venc;
    private javax.swing.JTextField jTextField_nbr_prod;
    private javax.swing.JTextField jTextField_prec_cp;
    private javax.swing.JTextField jTextField_prec_vt;
    // End of variables declaration//GEN-END:variables
}
