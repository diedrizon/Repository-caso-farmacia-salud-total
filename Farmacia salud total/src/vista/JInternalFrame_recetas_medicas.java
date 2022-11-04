
package vista;

/** @author diedr */
public class JInternalFrame_recetas_medicas extends javax.swing.JInternalFrame {

    
    public JInternalFrame_recetas_medicas() {
        initComponents();
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
        jTextField_cod_medico = new javax.swing.JTextField();
        jTextField_cod_rece_mdc = new javax.swing.JTextField();
        jTextField_clinica = new javax.swing.JTextField();
        jTextField_tel_medico = new javax.swing.JTextField();
        jTextField_fh_indicaciones = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_rece_mdc = new javax.swing.JButton();
        jButton_actualizar_receta_medicas = new javax.swing.JButton();
        jButton_buscar_rece_mdc = new javax.swing.JButton();
        jButton_editar_receta_medica = new javax.swing.JButton();
        jTextField_buscar_receta_medica = new javax.swing.JTextField();
        jButton_salir_receta_medicas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_recetas_medica = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Recetas médicas");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Código de receta");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Código del médico");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Teléfono del médico");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Fecha de indicaciones");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Clínica");

        jTextField_cod_medico.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_medico.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_medico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_cod_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cod_medicoActionPerformed(evt);
            }
        });

        jTextField_cod_rece_mdc.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_rece_mdc.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_rece_mdc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_cod_rece_mdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cod_rece_mdcActionPerformed(evt);
            }
        });

        jTextField_clinica.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_clinica.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_clinica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_clinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_clinicaActionPerformed(evt);
            }
        });

        jTextField_tel_medico.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tel_medico.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_tel_medico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_tel_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tel_medicoActionPerformed(evt);
            }
        });

        jTextField_fh_indicaciones.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fh_indicaciones.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_fh_indicaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_fh_indicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fh_indicacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_cod_rece_mdc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField_clinica, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_cod_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField_fh_indicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField_tel_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_rece_mdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tel_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fh_indicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_clinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton_agregar_rece_mdc.setBackground(new java.awt.Color(204, 204, 255));
        jButton_agregar_rece_mdc.setForeground(new java.awt.Color(0, 0, 0));
        jButton_agregar_rece_mdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon agregar.png"))); // NOI18N
        jButton_agregar_rece_mdc.setText("Agregar");
        jButton_agregar_rece_mdc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_agregar_rece_mdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_rece_mdcActionPerformed(evt);
            }
        });

        jButton_actualizar_receta_medicas.setBackground(new java.awt.Color(204, 204, 255));
        jButton_actualizar_receta_medicas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar_receta_medicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon actualizar.png"))); // NOI18N
        jButton_actualizar_receta_medicas.setText("Actualizar");
        jButton_actualizar_receta_medicas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_actualizar_receta_medicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_receta_medicasActionPerformed(evt);
            }
        });

        jButton_buscar_rece_mdc.setBackground(new java.awt.Color(204, 204, 255));
        jButton_buscar_rece_mdc.setForeground(new java.awt.Color(0, 0, 0));
        jButton_buscar_rece_mdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon buscar.png"))); // NOI18N
        jButton_buscar_rece_mdc.setText("Buscar");
        jButton_buscar_rece_mdc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_buscar_rece_mdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_rece_mdcActionPerformed(evt);
            }
        });

        jButton_editar_receta_medica.setBackground(new java.awt.Color(204, 204, 255));
        jButton_editar_receta_medica.setForeground(new java.awt.Color(0, 0, 0));
        jButton_editar_receta_medica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon Editar.png"))); // NOI18N
        jButton_editar_receta_medica.setText("Editar");
        jButton_editar_receta_medica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_editar_receta_medica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_receta_medicaActionPerformed(evt);
            }
        });

        jTextField_buscar_receta_medica.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_buscar_receta_medica.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_buscar_receta_medica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_buscar_receta_medica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscar_receta_medicaActionPerformed(evt);
            }
        });

        jButton_salir_receta_medicas.setBackground(new java.awt.Color(204, 204, 255));
        jButton_salir_receta_medicas.setForeground(new java.awt.Color(0, 0, 0));
        jButton_salir_receta_medicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon salir.png"))); // NOI18N
        jButton_salir_receta_medicas.setText("Salir");
        jButton_salir_receta_medicas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_salir_receta_medicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salir_receta_medicasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton_actualizar_receta_medicas))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_agregar_rece_mdc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_editar_receta_medica))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_buscar_rece_mdc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_buscar_receta_medica, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_salir_receta_medicas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_rece_mdc)
                    .addComponent(jButton_editar_receta_medica))
                .addGap(18, 18, 18)
                .addComponent(jButton_actualizar_receta_medicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_buscar_receta_medica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar_rece_mdc))
                .addGap(28, 28, 28)
                .addComponent(jButton_salir_receta_medicas)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_recetas_medica.setBackground(new java.awt.Color(255, 255, 255));
        jTable_recetas_medica.setForeground(new java.awt.Color(0, 0, 0));
        jTable_recetas_medica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código de receta", "Código del medico", "Cliníca", "Teléfono del medico", "Fecha de indicaciones"
            }
        ));
        jTable_recetas_medica.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_recetas_medicaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable_recetas_medica);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextField_cod_rece_mdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cod_rece_mdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cod_rece_mdcActionPerformed

    private void jTextField_cod_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cod_medicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cod_medicoActionPerformed

    private void jTextField_clinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_clinicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_clinicaActionPerformed

    private void jTextField_tel_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tel_medicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tel_medicoActionPerformed

    private void jTextField_fh_indicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fh_indicacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fh_indicacionesActionPerformed

    private void jButton_agregar_rece_mdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_rece_mdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_agregar_rece_mdcActionPerformed

    private void jButton_buscar_rece_mdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_rece_mdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscar_rece_mdcActionPerformed

    private void jButton_actualizar_receta_medicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_receta_medicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_actualizar_receta_medicasActionPerformed

    private void jButton_salir_receta_medicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir_receta_medicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_salir_receta_medicasActionPerformed

    private void jButton_editar_receta_medicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_receta_medicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_editar_receta_medicaActionPerformed

    private void jTextField_buscar_receta_medicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscar_receta_medicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscar_receta_medicaActionPerformed

    private void jTable_recetas_medicaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_recetas_medicaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_recetas_medicaAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_receta_medicas;
    private javax.swing.JButton jButton_agregar_rece_mdc;
    private javax.swing.JButton jButton_buscar_rece_mdc;
    private javax.swing.JButton jButton_editar_receta_medica;
    private javax.swing.JButton jButton_salir_receta_medicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_recetas_medica;
    private javax.swing.JTextField jTextField_buscar_receta_medica;
    private javax.swing.JTextField jTextField_clinica;
    private javax.swing.JTextField jTextField_cod_medico;
    private javax.swing.JTextField jTextField_cod_rece_mdc;
    private javax.swing.JTextField jTextField_fh_indicaciones;
    private javax.swing.JTextField jTextField_tel_medico;
    // End of variables declaration//GEN-END:variables
}
