
package vista;

import Modelo.*;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/** @author diedr */

public class JInternalFrame_laboratorio extends javax.swing.JInternalFrame {

    private Component rootpane;
   
    public JInternalFrame_laboratorio() {
        initComponents();
    }
    public void limpiarCampos(){
        jTextField_cod_lab.setText("");
        jTextField_nbr_lab.setText("");
        jTextField_direc_lab.setText("");
        jTextField_telf_lab.setText("");
    }
    
    public void obtenerDatos(){
        List<Class_laboratorio> laboratorio=new DAOlaboratorio().obtenerDatos();
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columns = {"cod_lab","nbr_lab","direc_lab","telf_lab"};
        
        modelo.setColumnIdentifiers(columns);
        
        for(Class_laboratorio au:laboratorio){
            String[]renglon={Integer.toString(au.getCod_lab()),au.getNbr_lab(),
                    au.getDirec_lab(),
                    au.getTelf_lab().toString()}; 
            modelo.addRow(renglon);
        }
        jTable_laboratorio.setModel(modelo);
    }
    
    public void actualizarlaboratorio(){
        int cod=Integer.parseInt(this.jTextField_cod_lab.getText());
        String nbr=this.jTextField_nbr_lab.getText();
        String direc=this.jTextField_direc_lab.getText();
        String telf=(this.jTextField_telf_lab.getText());

        DAOlaboratorio doa=new DAOlaboratorio();
        int res=doa.Actualizar(cod, nbr, direc, telf);
        if(res==1){
            JOptionPane.showMessageDialog(rootpane, "¡laboratorio actualizado!");
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
        jTextField_cod_lab = new javax.swing.JTextField();
        jTextField_nbr_lab = new javax.swing.JTextField();
        jTextField_direc_lab = new javax.swing.JTextField();
        jTextField_telf_lab = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_lab = new javax.swing.JButton();
        jButton_actualizar_laboratorio = new javax.swing.JButton();
        jButton_editar_laboratorio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_laboratorio = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Laboratorio");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Dirección");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Telefono");

        jTextField_cod_lab.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_lab.setColumns(1);
        jTextField_cod_lab.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_lab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_nbr_lab.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_lab.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_lab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_direc_lab.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_direc_lab.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_direc_lab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_telf_lab.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_telf_lab.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_telf_lab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_cod_lab, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_nbr_lab))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_direc_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_telf_lab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_direc_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_telf_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nbr_lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton_agregar_lab.setBackground(new java.awt.Color(204, 204, 255));
        jButton_agregar_lab.setForeground(new java.awt.Color(0, 0, 0));
        jButton_agregar_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon agregar.png"))); // NOI18N
        jButton_agregar_lab.setText("Agregar");
        jButton_agregar_lab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_agregar_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_labActionPerformed(evt);
            }
        });

        jButton_actualizar_laboratorio.setBackground(new java.awt.Color(204, 204, 255));
        jButton_actualizar_laboratorio.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar_laboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon actualizar.png"))); // NOI18N
        jButton_actualizar_laboratorio.setText("Actualizar");
        jButton_actualizar_laboratorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_actualizar_laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_laboratorioActionPerformed(evt);
            }
        });

        jButton_editar_laboratorio.setBackground(new java.awt.Color(204, 204, 255));
        jButton_editar_laboratorio.setForeground(new java.awt.Color(0, 0, 0));
        jButton_editar_laboratorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon Editar.png"))); // NOI18N
        jButton_editar_laboratorio.setText("Editar");
        jButton_editar_laboratorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_editar_laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_laboratorioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Transacciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_agregar_lab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_editar_laboratorio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton_actualizar_laboratorio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_lab)
                    .addComponent(jButton_editar_laboratorio))
                .addGap(34, 34, 34)
                .addComponent(jButton_actualizar_laboratorio)
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_laboratorio.setBackground(new java.awt.Color(255, 255, 255));
        jTable_laboratorio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jTable_laboratorio.setForeground(new java.awt.Color(0, 0, 0));
        jTable_laboratorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Dirección", "Telefono"
            }
        ));
        jTable_laboratorio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_laboratorioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable_laboratorio);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_labActionPerformed
       String cod_lab=jTextField_cod_lab.getText();
       String nbr=jTextField_nbr_lab.getText();
       String direc=jTextField_direc_lab.getText();
       String telf=jTextField_telf_lab.getText();
       
       
       if(cod_lab.contentEquals("")||nbr.contentEquals("")||direc.contentEquals("")
              || telf.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
      
  }else{  
           
   try{
       int cod=Integer.parseInt(cod_lab);
       
      Class_laboratorio au=new DAOlaboratorio().Insertar(cod,nbr, direc, telf);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
      
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    }//GEN-LAST:event_jButton_agregar_labActionPerformed

    private void jButton_actualizar_laboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_laboratorioActionPerformed
      actualizarlaboratorio();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_laboratorioActionPerformed

    private void jButton_editar_laboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_laboratorioActionPerformed
        jTextField_cod_lab.setEnabled(false);
        int fila=this.jTable_laboratorio.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int id=Integer.parseInt((String)this.jTable_laboratorio.getValueAt(fila, 0).toString());
              String nbr=(String)this.jTable_laboratorio.getValueAt(fila,1);
              String direc=(String)this.jTable_laboratorio.getValueAt(fila,2);
              String telf=(String)this.jTable_laboratorio.getValueAt(fila,3).toString();
             
              jTextField_cod_lab.setText(""+id);
              jTextField_nbr_lab.setText(nbr);
              jTextField_direc_lab.setText(direc);
              jTextField_telf_lab.setText(telf);
          }catch(NumberFormatException e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton_editar_laboratorioActionPerformed

    private void jTable_laboratorioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_laboratorioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_laboratorioAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_laboratorio;
    private javax.swing.JButton jButton_agregar_lab;
    private javax.swing.JButton jButton_editar_laboratorio;
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
    private javax.swing.JTable jTable_laboratorio;
    private javax.swing.JTextField jTextField_cod_lab;
    private javax.swing.JTextField jTextField_direc_lab;
    private javax.swing.JTextField jTextField_nbr_lab;
    private javax.swing.JTextField jTextField_telf_lab;
    // End of variables declaration//GEN-END:variables

    
    }

