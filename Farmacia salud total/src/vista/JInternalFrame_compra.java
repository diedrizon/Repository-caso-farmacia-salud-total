
package vista;

import Modelo.*;
import java.awt.Component;
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
    jTextField_ctd_p.setText("");
    jTextField_ctd_t.setText("");
    jTextField_fh_compra.setText("");
    jTextField_cod_prod.setText("");
    }
     public void obtenerDatos(){
        
        List<Class_compra> compra=new DAOcompra().obtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
       
        String[] columnas={"Código compra","Variedad producto","Cantidad producto",
        "Cantidad total","Fecha compra", "Código producto"};
       
        modelo.setColumnIdentifiers(columnas);
        for(Class_compra au:compra){
            
            String[]renglon0={Integer.toString(au.getCod_compra()),au.getVrd_prod(),
                    Float.parseFloat(au.getCtd_prod()),Float.parseFloat(au.getCtd_t()),Date.valueOf(au.getFh_cp()),
                    Integer.toString(au.getCod_prod())};
        }
       jTable_compra.setModel(modelo);
    }
     public void actualizarcompra(){
        int cod=Integer.parseInt(this.jTextField_cod_compra.getText());
        String vrd=this.jTextField_vrd_p.getText();
        String ctd=this.jTextField_ctd_p.getText();
        String ct_t=this.jTextField_ctd_t.getText();
        int cod_p=Integer.parseInt (this.jTextField_cod_prod.getText());
        Date fec=Date.valueOf(this.jTextField_fh_compra.getText());
        
        DAOcompra doa=new DAOcompra();
        int res=doa.Actualizar(cod, vrd, ctd, ct_t, cod_p, fec);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_ctd_p = new javax.swing.JTextField();
        jTextField_vrd_p = new javax.swing.JTextField();
        jTextField_cod_compra = new javax.swing.JTextField();
        jTextField_cod_prod = new javax.swing.JTextField();
        jTextField_fh_compra = new javax.swing.JTextField();
        jTextField_ctd_t = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_compra = new javax.swing.JButton();
        jButton_buscar_compra = new javax.swing.JButton();
        jButton_actualizar_compra = new javax.swing.JButton();
        jButton_salir_compra = new javax.swing.JButton();
        jButton_editar_compra = new javax.swing.JButton();
        jTextField_buscar_compra = new javax.swing.JTextField();
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

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Cantidad producto");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Cantidad total");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Fecha compra");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Código producto ");

        jTextField_ctd_p.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ctd_p.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_ctd_p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_ctd_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ctd_pActionPerformed(evt);
            }
        });

        jTextField_vrd_p.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_vrd_p.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_vrd_p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_vrd_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_vrd_pActionPerformed(evt);
            }
        });

        jTextField_cod_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_compra.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_cod_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cod_compraActionPerformed(evt);
            }
        });

        jTextField_cod_prod.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_prod.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_prod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_cod_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cod_prodActionPerformed(evt);
            }
        });

        jTextField_fh_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fh_compra.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_fh_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_fh_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fh_compraActionPerformed(evt);
            }
        });

        jTextField_ctd_t.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ctd_t.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_ctd_t.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_ctd_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ctd_tActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_vrd_p, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_cod_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_ctd_t, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_fh_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_ctd_p, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ctd_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_vrd_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fh_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ctd_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cod_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jButton_buscar_compra.setBackground(new java.awt.Color(204, 204, 255));
        jButton_buscar_compra.setForeground(new java.awt.Color(0, 0, 0));
        jButton_buscar_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon buscar.png"))); // NOI18N
        jButton_buscar_compra.setText("Buscar");
        jButton_buscar_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_buscar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_compraActionPerformed(evt);
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

        jButton_salir_compra.setBackground(new java.awt.Color(204, 204, 255));
        jButton_salir_compra.setForeground(new java.awt.Color(0, 0, 0));
        jButton_salir_compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon salir.png"))); // NOI18N
        jButton_salir_compra.setText("Salir");
        jButton_salir_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_salir_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salir_compraActionPerformed(evt);
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

        jTextField_buscar_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_buscar_compra.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_buscar_compra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_buscar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscar_compraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_agregar_compra)
                        .addGap(44, 44, 44)
                        .addComponent(jButton_editar_compra))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_buscar_compra)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_buscar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton_actualizar_compra))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton_salir_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_editar_compra)
                    .addComponent(jButton_agregar_compra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_actualizar_compra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_buscar_compra)
                    .addComponent(jTextField_buscar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_salir_compra)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_compra.setBackground(new java.awt.Color(255, 255, 255));
        jTable_compra.setForeground(new java.awt.Color(0, 0, 0));
        jTable_compra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código compra", "Variedad producto", "Cantidad producto", "Cantidad total", "Fecha compra", "Código producto"
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_cod_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cod_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cod_compraActionPerformed

    private void jTextField_vrd_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_vrd_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_vrd_pActionPerformed

    private void jTextField_ctd_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ctd_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ctd_pActionPerformed

    private void jTextField_ctd_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ctd_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ctd_tActionPerformed

    private void jTextField_fh_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fh_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fh_compraActionPerformed

    private void jTextField_cod_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cod_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cod_prodActionPerformed

    private void jButton_agregar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_compraActionPerformed
       int cod=Integer.parseInt(jTextField_cod_compra.getText());
       String vrd=jTextField_vrd_p.getText();
       String ctd=jTextField_ctd_p.getText();
       String ctdt=jTextField_ctd_t.getText();
       String fh_c=jTextField_fh_compra.getText();
       int cod_p=Integer.parseInt( jTextField_cod_prod.getText());
       
       if(cod.contentEquals("")||vrd.contentEquals("")||ctd.contentEquals("")
              || ctdt.contentEquals("")||fh_c.contentEquals("")||cod_p.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
 
     
   try{
      
      Class_compra au=new DAOcompra().Insertar(cod, vrd, ctd, ctdt,fh_c, cod_p);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    
    }//GEN-LAST:event_jButton_agregar_compraActionPerformed

    private void jButton_buscar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscar_compraActionPerformed

    private void jButton_actualizar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_compraActionPerformed
        actualizarcompra();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_compraActionPerformed

    private void jButton_salir_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_salir_compraActionPerformed

    private void jButton_editar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_compraActionPerformed
         int fila=this.jTable_compra.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int id=Integer.parseInt((String)this.jTable_compra.getValueAt(fila, 0).toString());
              String cod=(String)this.jTable_compra.getValueAt(fila,1);
              String vrd=(String)this.jTable_compra.getValueAt(fila,2);
              String ctd=(String)this.jTable_compra.getValueAt(fila,3);
              String ctdt=(String)this.jTable_compra.getValueAt(fila,4);
              String fh_c=(String)this.jTable_compra.getValueAt(fila,5);
              String cod_p=(String)this.jTable_compra.getValueAt(fila,6);
             
              jTextField_cod_compra.setText(""+cod);
              jTextField_vrd_p.setText(vrd);
              jTextField_ctd_p.setText(ctd);
              jTextField_ctd_t.setText(ctdt);
              jTextField_fh_compra.setText(String.valueOf(fh_c));;
              jTextField_cod_prod.setText(cod_p);
          }catch(Exception e){
              e.printStackTrace();
          }
      }
    }                                             

    private void jButtonActualizaActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        
    
    }//GEN-LAST:event_jButton_editar_compraActionPerformed

    private void jTextField_buscar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscar_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscar_compraActionPerformed

    private void jTable_compraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_compraAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_compraAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_compra;
    private javax.swing.JButton jButton_agregar_compra;
    private javax.swing.JButton jButton_buscar_compra;
    private javax.swing.JButton jButton_editar_compra;
    private javax.swing.JButton jButton_salir_compra;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_compra;
    private javax.swing.JTextField jTextField_buscar_compra;
    private javax.swing.JTextField jTextField_cod_compra;
    private javax.swing.JTextField jTextField_cod_prod;
    private javax.swing.JTextField jTextField_ctd_p;
    private javax.swing.JTextField jTextField_ctd_t;
    private javax.swing.JTextField jTextField_fh_compra;
    private javax.swing.JTextField jTextField_vrd_p;
    // End of variables declaration//GEN-END:variables
}
