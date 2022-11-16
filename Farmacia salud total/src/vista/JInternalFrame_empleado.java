package vista;

import Modelo.*;
import java.awt.Component;
import java.sql.Connection;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;
import javax.swing.JOptionPane;

/**
 * @author diedr
 */
public class JInternalFrame_empleado extends javax.swing.JInternalFrame {

    private Component rootpane;

    public JInternalFrame_empleado() {
        initComponents();
        llenarcombo();
    }

    public void limpiarCampos() {
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

    public void llenarcombo() {
        List<Class_turno> turno = new DOAturno().obtenerDatos();
        for (int i = 0; i < turno.size(); i++)
        {

            jComboBox1.addItem(new Class_turno(turno.get(i).getTp_de_turno(), turno.get(i).getH_entrada(),
                    turno.get(i).getH_salida()));
        }
        int id = jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getTp_de_turno();

        jTextField_tp_de_turno.setText("" + id);
    }

    public void obtenerDatos() {
        List<Class_empleado> empleado = new DAOempleado().obtenerDatos();

        DefaultTableModel modelo = new DefaultTableModel();

        String[] columns =
        {
            "cod_emp", "ced_emp", "nbr_1_emp",
            "nbr_2_emp", "apelli_1_emp", "apelli_2_emp", "direc_emp", "telf_emp",
            "tp_de_cargo", "tp_de_turno"
        };

        modelo.setColumnIdentifiers(columns);
        for (Class_empleado au : empleado)
        {
            String[] renglon =
            {
                Integer.toString(au.getCod_emp()), au.getCed_emp(),
                au.getNbr_1_emp(), au.getNbr_2_emp(), au.getApelli_1_emp(),
                au.getApelli_2_emp(), au.getDirec_emp(), au.getTel_emp(),
                au.getTp_de_cargo(),
                Integer.toString(au.getTp_de_turno())
            };
            modelo.addRow(renglon);
        }
        jTable_empleado.setModel(modelo);
    }

    public void obtenerturno() {
        List<Class_turno> turno = new DOAturno().obtenerDatos();

        DefaultTableModel modelo = new DefaultTableModel();

        String[] columns =
        {
            "tp_de_turno", "h_entrada", "h_salida"
        };

        modelo.setColumnIdentifiers(columns);

        for (Class_turno au : turno)
        {
            String[] renglon =
            {
                Integer.toString(au.getTp_de_turno()),
                au.getH_entrada().toString(),
                au.getH_salida().toString()
            };
            modelo.addRow(renglon);
        }
        jTable_turno.setModel(modelo);
    }

    public void actualizarempleado() {
        int cod = Integer.parseInt(this.jTextField_cod_emp.getText());
        String ced = this.jTextField_ced_emp.getText();
        String nbr1 = this.jTextField_nbr_1_emp.getText();
        String nbr2 = this.jTextField_nbr_2_emp.getText();
        String ape1 = this.jTextField_apelli_1_emp.getText();
        String ape2 = this.jTextField_apelli_2_emp.getText();
        String direc = this.jTextField_direc_emp.getText();
        String telf = this.jTextField_telf_emp.getText();
        String tp_c = this.jTextField_tp_de_cargo.getText();
        int tp_t = Integer.parseInt(this.jTextField_tp_de_turno.getText());

        DAOempleado doa = new DAOempleado();
        int res = doa.Actualizar(cod, ced, nbr1, nbr2, ape1, ape2, direc, telf, tp_c, tp_t);
        if (res == 1)
        {
            JOptionPane.showMessageDialog(rootpane, "¡Empleado actualizado!");
        } else
        {
            JOptionPane.showMessageDialog(rootpane, "¡Ocurrio un ERROR!");

        }

    }

    public void actualizarturno() {
        int tp_de_turno = Integer.parseInt(this.jTextField_tp_de_turno.getText());
        Time h_entrada = Time.valueOf(this.jTextField_h_entrada.getText());
        Time h_salida = Time.valueOf(this.jTextField_h_salida.getText());

        DOAturno doa = new DOAturno();
        int res = doa.Actualizar(tp_de_turno, h_entrada, h_salida);
        if (res == 1)
        {
            JOptionPane.showMessageDialog(rootpane, "¡Empleado actualizado!");
        } else
        {
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
        jButton_editar_empleado = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_empleado = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_turno = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_h_entrada = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField_h_salida = new javax.swing.JTextField();
        jTextField_tp_de_turno = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximizable(true);
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

        jTextField_nbr_2_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_2_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_2_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_nbr_1_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_nbr_1_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_nbr_1_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_ced_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_ced_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_ced_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_apelli_1_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_apelli_1_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_apelli_1_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_apelli_2_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_apelli_2_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_apelli_2_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_direc_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_direc_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_direc_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_telf_emp.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_telf_emp.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_telf_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_tp_de_cargo.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tp_de_cargo.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_tp_de_cargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                            .addComponent(jLabel10)
                            .addComponent(jTextField_tp_de_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
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

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Transacciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_agregar_emp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_eliminar_emp)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_editar_empleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_actualizar_emp)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_agregar_emp)
                    .addComponent(jButton_eliminar_emp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_editar_empleado)
                    .addComponent(jButton_actualizar_emp))
                .addGap(123, 123, 123))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(560, 0, 290, 340);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_empleado.setBackground(new java.awt.Color(255, 255, 255));
        jTable_empleado.setForeground(new java.awt.Color(0, 0, 0));
        jTable_empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre 1", "Nombre 2", "Apellido 1", "Apellido 2", "Dirreción ", "Telefono", "Tipo de cargo", "Tipo de turno"
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

        jTable_turno.setBackground(new java.awt.Color(255, 255, 255));
        jTable_turno.setForeground(new java.awt.Color(0, 0, 0));
        jTable_turno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo de turno", "Hora de entrada", "Hora salida"
            }
        ));
        jTable_turno.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable_turnoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable_turno);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 340, 850, 140);

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

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Hora salida");

        jTextField_h_salida.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_h_salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_tp_de_turno.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_tp_de_turno.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_tp_de_turno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_h_salida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextField_h_entrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField_tp_de_turno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_tp_de_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_h_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_h_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(380, 0, 180, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar_empActionPerformed
        String cod = jTextField_cod_emp.getText();
        String ced = jTextField_ced_emp.getText();
        String nbr1 = jTextField_nbr_1_emp.getText();
        String nbr2 = jTextField_nbr_2_emp.getText();
        String ape1 = jTextField_apelli_1_emp.getText();
        String ape2 = jTextField_apelli_2_emp.getText();
        String direc = jTextField_direc_emp.getText();
        String telf = jTextField_telf_emp.getText();
        String tp_c = jTextField_tp_de_cargo.getText();

        int fila2 = this.jTable_turno.getSelectedRow();
        jTextField_tp_de_turno.setText((String) this.jTable_turno.getValueAt(fila2, 0).toString());
        java.sql.Time h_e = Time.valueOf((String) this.jTable_turno.getValueAt(fila2, 1).toString());
        java.sql.Time h_s = Time.valueOf((String) this.jTable_turno.getValueAt(fila2, 2).toString());
        jTextField_h_entrada.setText(String.valueOf(h_e));
        jTextField_h_salida.setText(String.valueOf(h_s));

        String tp_t = jTextField_tp_de_turno.getText();

        if (cod.contentEquals("") || ced.contentEquals("") || nbr1.contentEquals("")
                || nbr2.contentEquals("") || ape1.contentEquals("") || ape2.contentEquals("") || direc.contentEquals("")
                || telf.contentEquals("") || tp_c.contentEquals("") || tp_t.contentEquals("") || fila2 == -1)
        {
            JOptionPane.showMessageDialog(rootpane,
                    "Por favor llene todo los campos y seleccione un registro de la tabla turnos"
                    + "si no chinguese");

        } else
        {

            try
            {
                int cod_e = Integer.parseInt(cod);
                int tp_tu = Integer.parseInt(tp_t);

                Class_empleado au = new DAOempleado().Insertar(cod_e, ced, nbr1, nbr2, ape1, ape2, direc, telf, tp_c, tp_tu);
                JOptionPane.showMessageDialog(rootpane, "Registro agregado");
            } catch (Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
            }

        }
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_agregar_empActionPerformed

    private void jButton_eliminar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminar_empActionPerformed
        int fila = this.jTable_turno.getSelectedRow();
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(rootpane, "Selecione el registro de la tabla");
        } else
        {
            int cod = Integer.parseInt((String) this.jTable_turno.getValueAt(fila, 0).toString());
            DOAturno dao = new DOAturno();
            dao.Eliminar(cod);
            obtenerturno();

        }
    }//GEN-LAST:event_jButton_eliminar_empActionPerformed

    private void jButton_actualizar_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar_empActionPerformed
        actualizarempleado();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jButton_actualizar_empActionPerformed

    private void jButton_editar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editar_empleadoActionPerformed
        jTextField_cod_emp.setEnabled(false);
        jTextField_tp_de_turno.setEnabled(false);
        int fila = this.jTable_empleado.getSelectedRow();
        int fila2 = this.jTable_turno.getSelectedRow();
        if ((fila == -1) || (fila2 == -1))
        {

            JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la tabla empleado y uno de turnos");
        } else
        {
            try
            {
                int cod = Integer.parseInt((String) this.jTable_empleado.getValueAt(fila, 0).toString());
                String ced = (String) this.jTable_empleado.getValueAt(fila, 1);
                String nbr1 = (String) this.jTable_empleado.getValueAt(fila, 2);
                String nbr2 = (String) this.jTable_empleado.getValueAt(fila, 3);
                String ape1 = (String) this.jTable_empleado.getValueAt(fila, 4);
                String ape2 = (String) this.jTable_empleado.getValueAt(fila, 5);
                String direc = (String) this.jTable_empleado.getValueAt(fila, 6);
                String telf = (String) this.jTable_empleado.getValueAt(fila, 7);
                String tp_c = (String) this.jTable_empleado.getValueAt(fila, 8);
                int tp_t = Integer.parseInt((String) this.jTable_empleado.getValueAt(fila, 9));

                jTextField_cod_emp.setText("" + cod);
                jTextField_ced_emp.setText(ced);
                jTextField_nbr_1_emp.setText(nbr1);
                jTextField_nbr_2_emp.setText(nbr2);
                jTextField_apelli_1_emp.setText(ape1);
                jTextField_apelli_2_emp.setText(ape2);
                jTextField_direc_emp.setText(direc);
                jTextField_telf_emp.setText(telf);
                jTextField_tp_de_cargo.setText(tp_c);
                jTextField_tp_de_turno.setText(Integer.toString(tp_t));

                //Turnos
                if (tp_t == 1)
                {
                    //Turnos
                    java.sql.Time h_e = Time.valueOf((String) this.jTable_turno.getValueAt(0, 1).toString());
                    java.sql.Time h_s = Time.valueOf((String) this.jTable_turno.getValueAt(0, 2).toString());
                    jTextField_h_entrada.setText(String.valueOf(h_e));
                    jTextField_h_salida.setText(String.valueOf(h_s));
                } else
                {
                    java.sql.Time h_e = Time.valueOf((String) this.jTable_turno.getValueAt(1, 1).toString());
                    java.sql.Time h_s = Time.valueOf((String) this.jTable_turno.getValueAt(1, 2).toString());
                    jTextField_h_entrada.setText(String.valueOf(h_e));
                    jTextField_h_salida.setText(String.valueOf(h_s));
                }

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton_editar_empleadoActionPerformed

    private void jTable_empleadoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_empleadoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_empleadoAncestorAdded

    private void jTable_turnoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable_turnoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_turnoAncestorAdded

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        int id = jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getTp_de_turno();

        jTextField_tp_de_turno.setText("" + id);
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar_emp;
    private javax.swing.JButton jButton_agregar_emp;
    private javax.swing.JButton jButton_editar_empleado;
    private javax.swing.JButton jButton_eliminar_emp;
    private javax.swing.JComboBox<Class_turno> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_empleado;
    private javax.swing.JTable jTable_turno;
    private javax.swing.JTextField jTextField_apelli_1_emp;
    private javax.swing.JTextField jTextField_apelli_2_emp;
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
