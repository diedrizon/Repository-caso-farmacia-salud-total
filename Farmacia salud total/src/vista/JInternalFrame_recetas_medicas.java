
package vista;

import Modelo.*;
import java.awt.Component;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;

/** @author diedr */

public class JInternalFrame_recetas_medicas extends javax.swing.JInternalFrame {

    private Component rootpane;

    
    public JInternalFrame_recetas_medicas() {
        initComponents();
    }
    private void limpiarCampos(){
    jTextField_cod_rece_mdc.setText("");
    jTextField_cod_medico.setText("");
    jTextField_clinica.setText("");
    jTextField_tel_medico.setText("");
    jTextField_fh_indicaciones.setText("");
    jTextField_ced_cli.setText("");
    
}
    public void obtenerDatos(){
        
        List<Class_recetas_medicas> recetas=new DAOrecetas_medicas().obtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        String[] columns={"cod_rece_mdc","cod_medico","clinica",
        "telf_medico","fh_indicaciones","ced_cli"};
        
        modelo.setColumnIdentifiers(columns);
        for(Class_recetas_medicas au:recetas){
            String[]renglon={Integer.toString(au.getCod_rece_mdc()),
                    Integer.toString(au.getCod_medico()),
                    au.getClinica(),
                    au.getTelf_medico(),
                    au.getFh_indicaciones().toString(),
                    au.getCed_cli().toString()}; 
            modelo.addRow(renglon);
        }
         jTable_recetas_medica.setModel(modelo);
                
    }
    public void actualizar_recetas_medicas(){
        int cod_d=Integer.parseInt(this.jTextField_cod_rece_mdc.getText());
        int cod_m=Integer.parseInt(this.jTextField_cod_medico.getText());
        String clinica=this.jTextField_clinica.getText();
        String telf=this.jTextField_tel_medico.getText();
        String ced=this.jTextField_ced_cli.getText();
        Date fec=Date.valueOf(this.jTextField_fh_indicaciones.getText());
        
        DAOrecetas_medicas dao=new DAOrecetas_medicas();
        int res=dao.Actualizar(cod_d, cod_m, clinica, telf, fec, ced);
        if(res==1){
            JOptionPane.showMessageDialog(rootpane, "¡Receta actualizada!");
        }
        else{
            JOptionPane.showMessageDialog(rootpane, "¡Ocurrio un ERROR!");
        }
       }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        jTextField_ced_cli = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_rece_mdc = new javax.swing.JButton();
        jButton_actualizar_receta_medicas = new javax.swing.JButton();
        jButton_buscar_rece_mdc = new javax.swing.JButton();
        jButton_editar_receta_medica = new javax.swing.JButton();
        jTextField_buscar_receta_medica = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_recetas_medica = new javax.swing.JTable();

        jLabel7.setText("jLabel7");

        setClosable(true);

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

        jTextField_cod_rece_mdc.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_rece_mdc.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_rece_mdc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_clinica.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_clinica.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_clinica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_tel_medico.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tel_medico.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_tel_medico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_fh_indicaciones.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_fh_indicaciones.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_fh_indicaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBackground(new java.awt.Color(0, 0, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Cédula del cliente");

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
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_cod_rece_mdc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField_tel_medico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_clinica, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_cod_medico))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(126, 126, 126)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_fh_indicaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField_ced_cli)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_rece_mdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tel_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_fh_indicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_clinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ced_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_agregar_rece_mdc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_editar_receta_medica))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_buscar_rece_mdc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_actualizar_receta_medicas)
                            .addComponent(jTextField_buscar_receta_medica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_buscar_rece_mdc)
                    .addComponent(jTextField_buscar_receta_medica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_rece_mdc)
                    .addComponent(jButton_editar_receta_medica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_actualizar_receta_medicas)
                .addGap(34, 34, 34))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_recetas_medica.setBackground(new java.awt.Color(255, 255, 255));
        jTable_recetas_medica.setForeground(new java.awt.Color(0, 0, 0));
        jTable_recetas_medica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código de receta", "Código del medico", "Cliníca", "Teléfono del medico", "Fecha de indicaciones", "Cédula del cliente"
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_rece_mdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_rece_mdcActionPerformed
       String cod_rece_mdc=jTextField_cod_rece_mdc.getText();
       String cod_medico=jTextField_cod_medico.getText();
       String clinica=jTextField_clinica.getText();
       String telf_medico=jTextField_tel_medico.getText();
       String fh_indicaciones=jTextField_fh_indicaciones.getText();
       String ced_cli=jTextField_ced_cli.getText();
       
       
       if(cod_rece_mdc.contentEquals("")||cod_medico.contentEquals("")||clinica.contentEquals("")
             ||telf_medico.contentEquals("") ||fh_indicaciones.contentEquals("")|| ced_cli.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
 
    }else{
     
   try{
      int cod_r=Integer.parseInt(cod_rece_mdc);
      int cod_me=Integer.parseInt(cod_medico);
      java.sql.Date fech=Date.valueOf(fh_indicaciones);
    
      Class_recetas_medicas au=new DAOrecetas_medicas().Insertar(cod_r, cod_me, clinica, telf_medico, fech, ced_cli);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
 
   }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    
    }//GEN-LAST:event_jButton_agregar_rece_mdcActionPerformed

    private void jButton_buscar_rece_mdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_rece_mdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscar_rece_mdcActionPerformed

    private void jButton_actualizar_receta_medicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_receta_medicasActionPerformed
        actualizar_recetas_medicas();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_receta_medicasActionPerformed

    private void jButton_editar_receta_medicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_receta_medicaActionPerformed
     jTextField_cod_rece_mdc.setEnabled(false);
      int fila=this. jTable_recetas_medica.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int cod=Integer.parseInt((String)this. jTable_recetas_medica.getValueAt(fila, 0).toString());
              String cod_m=(String)this. jTable_recetas_medica.getValueAt(fila,1);
              String clinica=(String)this. jTable_recetas_medica.getValueAt(fila,2);
              String tel=(String)this. jTable_recetas_medica.getValueAt(fila,3);
              String ced_cli=(String)this. jTable_recetas_medica.getValueAt(fila,4);
              Date fec=Date.valueOf((String)this. jTable_recetas_medica.getValueAt(fila,5).toString());
              
              jTextField_cod_rece_mdc.setText(""+cod);
              jTextField_cod_medico.setText(cod_m);
              jTextField_clinica.setText(clinica);
              jTextField_tel_medico.setText(tel);
              jTextField_ced_cli.setText(ced_cli);
              jTextField_fh_indicaciones.setText(String.valueOf(fec));
          }catch(NumberFormatException e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton_editar_receta_medicaActionPerformed

    private void jTable_recetas_medicaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_recetas_medicaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_recetas_medicaAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_receta_medicas;
    private javax.swing.JButton jButton_agregar_rece_mdc;
    private javax.swing.JButton jButton_buscar_rece_mdc;
    private javax.swing.JButton jButton_editar_receta_medica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_recetas_medica;
    private javax.swing.JTextField jTextField_buscar_receta_medica;
    private javax.swing.JTextField jTextField_ced_cli;
    private javax.swing.JTextField jTextField_clinica;
    private javax.swing.JTextField jTextField_cod_medico;
    private javax.swing.JTextField jTextField_cod_rece_mdc;
    private javax.swing.JTextField jTextField_fh_indicaciones;
    private javax.swing.JTextField jTextField_tel_medico;
    // End of variables declaration//GEN-END:variables
}
