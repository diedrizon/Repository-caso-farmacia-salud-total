
package vista;

import Modelo.Class_clientes;
import Modelo.DAOclientes;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/** @author diedr */


public class JInternalFrame_clientes extends javax.swing.JInternalFrame {

    private Component rootpane;
   
    public JInternalFrame_clientes() {
        initComponents();
    }
    public void limpiarCampos(){
        jTextField_ced_cli.setText("");
        jTextField_nbr_1_cli.setText("");
        jTextField_nbr_2_cli.setText("");
        jTextField_apelli_1_cli.setText("");
        jTextField_apelli_2_cli.setText("");
        jTextField_direc_cli.setText("");
        jTextField_telf_cli.setText("");
    }
    public void obtenerDatos(){
        List<Class_clientes> clientes =new DAOclientes ().obtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        String[] columns={"ced_cli", "nbr_1_cli", "nbr_2_cli",
        "apelli_1_cli", "apelli_2_cli", "direc_cli", "telf_cli"};
        
        modelo.setColumnIdentifiers(columns);
        for(Class_clientes au:clientes){
            String[]renglon={au.getCed_cli(),au.getNbr_1_cli(),
                    au.getNbr_2_cli(),au.getApelli_1_cli(),au.getApelli_2_cli(),
                    au.getDirec_cli(),au.getTel_cli()};  
            modelo.addRow(renglon);
        }
        jTable_cliente.setModel(modelo);
                
    }
    
    public void actualizarcliente(){
        String ced_cli = this.jTextField_ced_cli.getText();
        String nbr_1_cli = this.jTextField_nbr_1_cli.getText();
        String nbr_2_cli = this.jTextField_nbr_2_cli.getText();
        String apelli_1_cli = this.jTextField_apelli_1_cli.getText();
        String apelli_2_cli = this.jTextField_apelli_2_cli.getText();
        String direc_cli = this.jTextField_direc_cli.getText();
        String telf_cli = this.jTextField_telf_cli.getText();
        
        System.out.println("Hello");
        
        DAOclientes doa = new DAOclientes();
        int res = doa.Actualizar(ced_cli, nbr_1_cli, nbr_2_cli, apelli_1_cli, apelli_2_cli, direc_cli, telf_cli);
        if(res==1){
            JOptionPane.showMessageDialog(rootpane, "¡Cliente actualizado!");
        }
        else{
            JOptionPane.showMessageDialog(rootpane, "¡Ocurrio un ERROR!");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_apelli_1_cli = new javax.swing.JTextField();
        jTextField_nbr_2_cli = new javax.swing.JTextField();
        jTextField_nbr_1_cli = new javax.swing.JTextField();
        jTextField_ced_cli = new javax.swing.JTextField();
        jTextField_apelli_2_cli = new javax.swing.JTextField();
        jTextField_direc_cli = new javax.swing.JTextField();
        jTextField_telf_cli = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_cli = new javax.swing.JButton();
        jButton_actualizar_cli = new javax.swing.JButton();
        jButton_editar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_cliente = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Cédula");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nombre 1");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Apellido 2");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Dirección");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Nombre 2");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Teléfono");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Apellido 1");

        jTextField_apelli_1_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_apelli_1_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_apelli_1_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_nbr_2_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_2_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_2_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_nbr_1_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_1_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_1_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_ced_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ced_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_ced_cli.setToolTipText("");
        jTextField_ced_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_apelli_2_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_apelli_2_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_apelli_2_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_direc_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_direc_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_direc_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_telf_cli.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_telf_cli.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_telf_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ced_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField_nbr_1_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField_nbr_2_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField_apelli_1_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField_apelli_2_cli, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jTextField_direc_cli)
                                    .addComponent(jTextField_telf_cli)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ced_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_apelli_2_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nbr_1_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_direc_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nbr_2_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_telf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_apelli_1_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_agregar_cli.setBackground(new java.awt.Color(204, 204, 255));
        jButton_agregar_cli.setForeground(new java.awt.Color(0, 0, 0));
        jButton_agregar_cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon agregar.png"))); // NOI18N
        jButton_agregar_cli.setText("Agregar");
        jButton_agregar_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_agregar_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_cliActionPerformed(evt);
            }
        });

        jButton_actualizar_cli.setBackground(new java.awt.Color(204, 204, 255));
        jButton_actualizar_cli.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar_cli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon actualizar.png"))); // NOI18N
        jButton_actualizar_cli.setText("Actualizar");
        jButton_actualizar_cli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_actualizar_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_cliActionPerformed(evt);
            }
        });

        jButton_editar.setBackground(new java.awt.Color(204, 204, 255));
        jButton_editar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon editar.png"))); // NOI18N
        jButton_editar.setText("Editar");
        jButton_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Transacciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton_agregar_cli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_editar)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton_actualizar_cli)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_actualizar_cli)
                .addGap(74, 74, 74))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_cliente.setBackground(new java.awt.Color(255, 255, 255));
        jTable_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable_cliente.setForeground(new java.awt.Color(0, 0, 0));
        jTable_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre 1", "Nombre 2", "Apellido 1", "Apellido 2", "Dirreción", "Telefono"
            }
        ));
        jTable_cliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_clienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTable_cliente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_cliActionPerformed
       String ced=jTextField_ced_cli.getText();
       String nbr1=jTextField_nbr_1_cli.getText();
       String nbr2=jTextField_nbr_2_cli.getText();
       String ape1=jTextField_apelli_1_cli.getText();
       String ape2=jTextField_apelli_2_cli.getText();
       String direc=jTextField_direc_cli.getText();
       String telf=jTextField_telf_cli.getText();
       
       if(ced.contentEquals("")||nbr1.contentEquals("")||nbr2.contentEquals("")
         || ape1.contentEquals("")||ape2.contentEquals("") ||direc.contentEquals("")
         ||telf.contentEquals("")){
           
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
 
   }else{
           
   try{
      
      Class_clientes au=new DAOclientes().Insertar(ced, nbr1, nbr2, ape1, ape2,
      direc, telf);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
      
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    }//GEN-LAST:event_jButton_agregar_cliActionPerformed

    private void jButton_actualizar_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_cliActionPerformed
        actualizarcliente();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_cliActionPerformed

    private void jButton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editarActionPerformed
     jTextField_ced_cli.setEnabled(false);
      int fila=this.jTable_cliente.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              String ced=(String)this.jTable_cliente.getValueAt(fila,0);
              String nbr1=(String)this.jTable_cliente.getValueAt(fila,1);
              String nbr2=(String)this.jTable_cliente.getValueAt(fila,2);
              String ape1=(String)this.jTable_cliente.getValueAt(fila,3);
              String ape2=(String)this.jTable_cliente.getValueAt(fila,4);
              String direc=(String)this.jTable_cliente.getValueAt(fila,5);
              String telf=(String)this.jTable_cliente.getValueAt(fila,6);
             
              jTextField_ced_cli.setText(""+ced);
              jTextField_nbr_1_cli.setText(nbr1);
              jTextField_nbr_2_cli.setText(nbr2);
              jTextField_apelli_1_cli.setText(ape1);
              jTextField_apelli_2_cli.setText(ape2);
              jTextField_direc_cli.setText(direc);
              jTextField_telf_cli.setText(telf);
          }catch(Exception e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton_editarActionPerformed

    private void jTable_clienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_clienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_clienteAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_cli;
    private javax.swing.JButton jButton_agregar_cli;
    private javax.swing.JButton jButton_editar;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_cliente;
    private javax.swing.JTextField jTextField_apelli_1_cli;
    private javax.swing.JTextField jTextField_apelli_2_cli;
    private javax.swing.JTextField jTextField_ced_cli;
    private javax.swing.JTextField jTextField_direc_cli;
    private javax.swing.JTextField jTextField_nbr_1_cli;
    private javax.swing.JTextField jTextField_nbr_2_cli;
    private javax.swing.JTextField jTextField_telf_cli;
    // End of variables declaration//GEN-END:variables
}
