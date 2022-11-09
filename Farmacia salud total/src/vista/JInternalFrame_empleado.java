
package vista;

import Modelo.*;
import java.awt.Component;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;
import javax.swing.JOptionPane;

/** @author diedr */


public class JInternalFrame_empleado extends javax.swing.JInternalFrame {

    private Component rootpane;
   
    public JInternalFrame_empleado() {
        initComponents();
    }
    
    public void limpiarCampos(){
       jTextField_cod_emp.setText("");
       jTextField_ced_emp.setText("");
       jTextField_nbr_1_emp.setText("");
       jTextField_nbr_2_emp.setText("");
       jTextField_apelli_1_emp.setText("");
       jTextField_apelli_2_emp.setText("");
       jTextField_direc_emp.setText("");
       jTextField_telf_emp.setText("");
       jTextField_tp_de_cargo.setText("");
       jTextField_tp_de_turno.setText("");
       jTextField_h_entrada.setText("");
       jTextField_h_salida.setText("");
    }
        public void obtenerDatos(){
        
        List<Class_empleado> empleados=new DAOempleado().obtenerDatos();
        List<Class_turno> turno = new DOAturno().obtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        String[] columnas={"cod_emp","ced_emp","nbr_1_emp",
        "nbr_2_emp","apelli_1_emp", "apelli_2_emp","direc_emp","telf_emp",
        "tp_de_cargo","tp_de_turno","h_entrada","h_salida"};
        
        modelo.setColumnIdentifiers(columnas);
        for(Class_empleado au:empleados){
            String[]renglono={Integer.toString(au.getCod_emp()),au.getCed_emp(),
                    au.getNbr_1_emp(),au.getNbr_2_emp(),au.getApelli_1_emp(),
                    au.getApelli_2_emp(),au.getDirec_emp(),au.getTel_emp(),
                    au.getTp_de_cargo(),
                    Integer.toString (au.getTp_de_turno()),
                    java.sql.Time(au.getH_entrada(),
                    java.sql.Time (au.getH_salida()))};   
        }
        jTable_empleado.setModel(modelo);
                
    }
    public void actualizarempleado(){
        int cod=Integer.parseInt(this.jTextField_cod_emp.getText());
        String ced=this.jTextField_ced_emp.getText();
        String nbr1=this.jTextField_nbr_1_emp.getText();
        String nbr2=this.jTextField_nbr_2_emp.getText();
        String ape1=this.jTextField_apelli_1_emp.getText();
        String ape2=this.jTextField_apelli_2_emp.getText();
        String direc=this.jTextField_direc_emp.getText();
        String telf=this.jTextField_telf_emp.getText();
        String tp_c=this.jTextField_tp_de_cargo.getText();
        int tp_t=Integer.parseInt (this.jTextField_tp_de_turno.getText());
        String h_e=this.jTextField_h_entrada.getText();
        String h_s=this.jTextField_h_salida.getText();
        
        
        DAOempleado doa=new DAOempleado();
        int res=doa.Actualizar(cod, ced, nbr1, nbr2, ape1,
                ape2, direc, telf, tp_c, tp_t,h_e, h_s);
        if(res==1){
            JOptionPane.showMessageDialog(rootpane, "¡Empleado actualizado!");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_cod_emp = new javax.swing.JTextField();
        jTextField_nbr_2_emp = new javax.swing.JTextField();
        jTextField_nbr_1_emp = new javax.swing.JTextField();
        jTextField_ced_emp = new javax.swing.JTextField();
        jTextField_apelli_1_emp = new javax.swing.JTextField();
        jTextField_apelli_2_emp = new javax.swing.JTextField();
        jTextField_direc_emp = new javax.swing.JTextField();
        jTextField_telf_emp = new javax.swing.JTextField();
        jTextField_tp_de_cargo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_agregar_emp = new javax.swing.JButton();
        jButton_eliminar_emp = new javax.swing.JButton();
        jButton_actualizar_emp = new javax.swing.JButton();
        jButton_buscar_emp = new javax.swing.JButton();
        jButton_salir_de_empleado = new javax.swing.JButton();
        jButton_editar_empleado = new javax.swing.JButton();
        jTextField_buscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_empleado = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_h_entrada = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_h_salida = new javax.swing.JTextField();
        jTextField_tp_de_turno = new javax.swing.JTextField();

        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Empleado");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Código ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Cédula");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Nombre 1");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Nombre 2");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Apellido 1");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Apellido 2");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Dirección");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Teléfono");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Tipo de cargó");

        jTextField_cod_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_cod_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_cod_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_cod_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cod_empActionPerformed(evt);
            }
        });

        jTextField_nbr_2_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_2_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_2_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_nbr_2_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nbr_2_empActionPerformed(evt);
            }
        });

        jTextField_nbr_1_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_1_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_1_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_nbr_1_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nbr_1_empActionPerformed(evt);
            }
        });

        jTextField_ced_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ced_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_ced_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_ced_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ced_empActionPerformed(evt);
            }
        });

        jTextField_apelli_1_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_apelli_1_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_apelli_1_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_apelli_1_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apelli_1_empActionPerformed(evt);
            }
        });

        jTextField_apelli_2_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_apelli_2_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_apelli_2_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_apelli_2_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apelli_2_empActionPerformed(evt);
            }
        });

        jTextField_direc_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_direc_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_direc_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_direc_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_direc_empActionPerformed(evt);
            }
        });

        jTextField_telf_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_telf_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_telf_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_telf_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_telf_empActionPerformed(evt);
            }
        });

        jTextField_tp_de_cargo.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tp_de_cargo.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_tp_de_cargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_tp_de_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tp_de_cargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_ced_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_nbr_1_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_nbr_2_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_tp_de_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_cod_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_apelli_1_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_apelli_2_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_direc_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_telf_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
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
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_cod_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_apelli_2_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ced_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_direc_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nbr_1_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_telf_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_nbr_2_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tp_de_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_apelli_1_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 340);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jButton_agregar_emp.setBackground(new java.awt.Color(204, 204, 255));
        jButton_agregar_emp.setForeground(new java.awt.Color(0, 0, 0));
        jButton_agregar_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon agregar.png"))); // NOI18N
        jButton_agregar_emp.setText("Agregar");
        jButton_agregar_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_agregar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar_empActionPerformed(evt);
            }
        });

        jButton_eliminar_emp.setBackground(new java.awt.Color(204, 204, 255));
        jButton_eliminar_emp.setForeground(new java.awt.Color(0, 0, 0));
        jButton_eliminar_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon eliminar.png"))); // NOI18N
        jButton_eliminar_emp.setText("Eliminar");
        jButton_eliminar_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_eliminar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminar_empActionPerformed(evt);
            }
        });

        jButton_actualizar_emp.setBackground(new java.awt.Color(204, 204, 255));
        jButton_actualizar_emp.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizar_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon actualizar.png"))); // NOI18N
        jButton_actualizar_emp.setText("Actualizar");
        jButton_actualizar_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_actualizar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar_empActionPerformed(evt);
            }
        });

        jButton_buscar_emp.setBackground(new java.awt.Color(204, 204, 255));
        jButton_buscar_emp.setForeground(new java.awt.Color(0, 0, 0));
        jButton_buscar_emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon buscar.png"))); // NOI18N
        jButton_buscar_emp.setText("Buscar");
        jButton_buscar_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_buscar_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_empActionPerformed(evt);
            }
        });

        jButton_salir_de_empleado.setBackground(new java.awt.Color(204, 204, 255));
        jButton_salir_de_empleado.setForeground(new java.awt.Color(0, 0, 0));
        jButton_salir_de_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon salir.png"))); // NOI18N
        jButton_salir_de_empleado.setText("Salir");
        jButton_salir_de_empleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_salir_de_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salir_de_empleadoActionPerformed(evt);
            }
        });

        jButton_editar_empleado.setBackground(new java.awt.Color(204, 204, 255));
        jButton_editar_empleado.setForeground(new java.awt.Color(0, 0, 0));
        jButton_editar_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon Editar.png"))); // NOI18N
        jButton_editar_empleado.setText("Editar");
        jButton_editar_empleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jButton_editar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editar_empleadoActionPerformed(evt);
            }
        });

        jTextField_buscar.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_buscar.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_buscarActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_agregar_emp)
                                .addGap(79, 79, 79)
                                .addComponent(jButton_eliminar_emp))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton_editar_empleado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_actualizar_emp))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton_buscar_emp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton_salir_de_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_buscar_emp)
                    .addComponent(jTextField_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_emp)
                    .addComponent(jButton_eliminar_emp))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_editar_empleado)
                    .addComponent(jButton_actualizar_emp))
                .addGap(41, 41, 41)
                .addComponent(jButton_salir_de_empleado)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(560, 0, 260, 340);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_empleado.setBackground(new java.awt.Color(255, 255, 255));
        jTable_empleado.setForeground(new java.awt.Color(0, 0, 0));
        jTable_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre 1", "Nombre 2", "Apellido 1", "Apellido 2", "Dirreción ", "Telefono", "Tipo de cargo", "Tipo de turno", "Hora Entrada", "Hora salida"
            }
        ));
        jTable_empleado.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_empleadoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable_empleado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 340, 820, 140);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Turno");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Tipo de turno");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Hora de entrada");

        jTextField_h_entrada.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_h_entrada.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_h_entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_h_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_h_entradaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Hora salida");

        jTextField_h_salida.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_h_salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_h_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_h_salidaActionPerformed(evt);
            }
        });

        jTextField_tp_de_turno.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tp_de_turno.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_tp_de_turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_tp_de_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tp_de_turnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField_h_salida, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField_h_entrada))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel12))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel13))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel14))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField_tp_de_turno)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel11)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addComponent(jTextField_tp_de_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_h_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_h_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(380, 0, 180, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_cod_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cod_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_cod_empActionPerformed

    private void jTextField_nbr_1_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nbr_1_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nbr_1_empActionPerformed

    private void jTextField_nbr_2_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nbr_2_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nbr_2_empActionPerformed

    private void jTextField_apelli_1_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apelli_1_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apelli_1_empActionPerformed

    private void jTextField_apelli_2_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apelli_2_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apelli_2_empActionPerformed

    private void jTextField_direc_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_direc_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_direc_empActionPerformed

    private void jTextField_telf_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_telf_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_telf_empActionPerformed

    private void jTextField_tp_de_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tp_de_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tp_de_cargoActionPerformed

    private void jTextField_tp_de_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tp_de_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tp_de_turnoActionPerformed

    private void jTextField_h_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_h_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_h_entradaActionPerformed

    private void jTextField_h_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_h_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_h_salidaActionPerformed

    private void jButton_agregar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_empActionPerformed
       String cod=jTextField_cod_emp.getText();
       String ced=jTextField_ced_emp.getText();
       String nbr1=jTextField_nbr_1_emp.getText();
       String nbr2=jTextField_nbr_2_emp.getText();
       String ape1=jTextField_apelli_1_emp.getText();
       String ape2=jTextField_apelli_2_emp.getText();
       String direc=jTextField_direc_emp.getText();
       String telf=jTextField_telf_emp.getText();
       String tp_c=jTextField_tp_de_cargo.getText();
       String tp_t=jTextField_tp_de_turno.getText();
       String h_e=jTextField_h_entrada.getText();
       String h_s=jTextField_h_salida.getText();
     
       if(cod.contentEquals("")||ced.contentEquals("")||nbr1.contentEquals("")
              || nbr2.contentEquals("")||ape1.contentEquals("") || ape2.contentEquals("") || direc.contentEquals("")
                || telf.contentEquals("") || tp_c.contentEquals("") || tp_t.contentEquals("") || h_e.contentEquals("")
                || h_s.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Por favor llene todo los campos si no chinguese");
 
     
   try{
      
      Class_empleado au=new DAOempleado().Insertar(cod, ced, nbr1, nbr2, ape1,
      ape2, direc, telf, tp_c, tp_t, h_e, h_s );
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      limpiarCampos();
    }//GEN-LAST:event_jButton_agregar_empActionPerformed

    private void jButton_eliminar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_empActionPerformed
        int fila=this.jTable_empleado.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootpane, "Selecione el registro de la tabla");
        }
        else{
            int id=Integer.parseInt((String)this.jTable_empleado.getValueAt(fila, 0).toString());
            DAOempleado dao=new DAOempleado();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jButton_eliminar_empActionPerformed

    private void jButton_buscar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscar_empActionPerformed

    private void jButton_actualizar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_empActionPerformed
        actualizarempleado();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_empActionPerformed

    private void jButton_salir_de_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir_de_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_salir_de_empleadoActionPerformed

    private void jButton_editar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_empleadoActionPerformed
         int fila=this.jTable_empleado.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int cod=Integer.parseInt((String)this.jTable_empleado.getValueAt(fila, 1).toString());
              String ced=(String)this.jTable_empleado.getValueAt(fila,2);
              String nbr1=(String)this.jTable_empleado.getValueAt(fila,3);
              String nbr2=(String)this.jTable_empleado.getValueAt(fila,4);
              String ape1=(String)this.jTable_empleado.getValueAt(fila,5);
              String ape2=(String)this.jTable_empleado.getValueAt(fila,6);
              String direc=(String)this.jTable_empleado.getValueAt(fila,7);
              String telf=(String)this.jTable_empleado.getValueAt(fila,8);
              String tp_c=(String)this.jTable_empleado.getValueAt(fila,9);
              int tp_t=Integer.parseInt((String)this.jTable_empleado.getValueAt(fila,10));
              java.sql.Time h_e=Time.valueOf((String)this.jTable_empleado.getValueAt(fila,11).toString());
              java.sql.Time h_s=Time.valueOf((String)this.jTable_empleado.getValueAt(fila,12).toString());
              
              jTextField_cod_emp.setText(Integer.toString(""+cod));
              jTextField_ced_emp.setText(ced);
              jTextField_nbr_1_emp.setText(nbr1);
              jTextField_nbr_2_emp.setText(nbr2);
              jTextField_apelli_1_emp.setText(ape1);
              jTextField_apelli_2_emp.setText(ape2);
              jTextField_direc_emp.setText(direc);
              jTextField_telf_emp.setText(telf);
              jTextField_tp_de_cargo.setText(tp_c);
              jTextField_tp_de_turno.setText(Integer.toString(tp_t));
              jTextField_h_entrada.setText(String.valueOf(h_e));
              jTextField_h_salida.setText(String.valueOf(h_s));
              
          }catch(Exception e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton_editar_empleadoActionPerformed

    private void jTextField_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_buscarActionPerformed

    private void jTable_empleadoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_empleadoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_empleadoAncestorAdded

    private void jTextField_ced_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ced_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ced_empActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_emp;
    private javax.swing.JButton jButton_agregar_emp;
    private javax.swing.JButton jButton_buscar_emp;
    private javax.swing.JButton jButton_editar_empleado;
    private javax.swing.JButton jButton_eliminar_emp;
    private javax.swing.JButton jButton_salir_de_empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_empleado;
    private javax.swing.JTextField jTextField_apelli_1_emp;
    private javax.swing.JTextField jTextField_apelli_2_emp;
    private javax.swing.JTextField jTextField_buscar;
    private javax.swing.JTextField jTextField_ced_emp;
    private javax.swing.JTextField jTextField_cod_emp;
    private javax.swing.JTextField jTextField_direc_emp;
    private javax.swing.JTextField jTextField_h_entrada;
    private javax.swing.JTextField jTextField_h_salida;
    private javax.swing.JTextField jTextField_nbr_1_emp;
    private javax.swing.JTextField jTextField_nbr_2_emp;
    private javax.swing.JTextField jTextField_telf_emp;
    private javax.swing.JTextField jTextField_tp_de_cargo;
    private javax.swing.JTextField jTextField_tp_de_turno;
    // End of variables declaration//GEN-END:variables
}
