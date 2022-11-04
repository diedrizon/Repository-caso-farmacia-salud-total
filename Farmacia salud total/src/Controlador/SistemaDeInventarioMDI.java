
package Controlador;

import vista.JInternalFrame_inicio_de_seccion;
import vista.JInternalFrame_laboratorio;
import vista.JInternalFrame_compra;
import vista.JInternalFrame_productos;
import vista.JInternalFrame_ventas;
import vista.JInternalFrame_empleado;
import vista.JInternalFrame_clientes;
import vista.JInternalFrame_recetas_medicas;
import javax.swing.JOptionPane;

/** @author diedr*/

public class SistemaDeInventarioMDI extends javax.swing.JFrame {

    
    public SistemaDeInventarioMDI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton_laboratorio_panel = new javax.swing.JButton();
        jButton_compra_panel = new javax.swing.JButton();
        jButton_producto_panel = new javax.swing.JButton();
        jButton_empleado_panel = new javax.swing.JButton();
        jButton_ventas_panel = new javax.swing.JButton();
        jButton_clientes_panel = new javax.swing.JButton();
        jButton_rece_mdc_panel = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        jToolBar1.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar1.setForeground(new java.awt.Color(0, 0, 0));
        jToolBar1.setRollover(true);

        jButton_laboratorio_panel.setBackground(new java.awt.Color(255, 255, 255));
        jButton_laboratorio_panel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_laboratorio_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon laboratorio.png"))); // NOI18N
        jButton_laboratorio_panel.setText("Laboratorio");
        jButton_laboratorio_panel.setFocusable(false);
        jButton_laboratorio_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_laboratorio_panel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_laboratorio_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_laboratorio_panelActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_laboratorio_panel);

        jButton_compra_panel.setBackground(new java.awt.Color(255, 255, 255));
        jButton_compra_panel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_compra_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon compra.png"))); // NOI18N
        jButton_compra_panel.setText("Compra");
        jButton_compra_panel.setFocusable(false);
        jButton_compra_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_compra_panel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_compra_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_compra_panelActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_compra_panel);

        jButton_producto_panel.setBackground(new java.awt.Color(255, 255, 255));
        jButton_producto_panel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_producto_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon producto.png"))); // NOI18N
        jButton_producto_panel.setText("Producto");
        jButton_producto_panel.setFocusable(false);
        jButton_producto_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_producto_panel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_producto_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_producto_panelActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_producto_panel);

        jButton_empleado_panel.setBackground(new java.awt.Color(255, 255, 255));
        jButton_empleado_panel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_empleado_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon empleado.png"))); // NOI18N
        jButton_empleado_panel.setText("Empleado");
        jButton_empleado_panel.setFocusable(false);
        jButton_empleado_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_empleado_panel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_empleado_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_empleado_panelActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_empleado_panel);

        jButton_ventas_panel.setBackground(new java.awt.Color(255, 255, 255));
        jButton_ventas_panel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_ventas_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon venta.png"))); // NOI18N
        jButton_ventas_panel.setText("Ventas");
        jButton_ventas_panel.setFocusable(false);
        jButton_ventas_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_ventas_panel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_ventas_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ventas_panelActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_ventas_panel);

        jButton_clientes_panel.setBackground(new java.awt.Color(255, 255, 255));
        jButton_clientes_panel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_clientes_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon cliente.png"))); // NOI18N
        jButton_clientes_panel.setText("Clientes");
        jButton_clientes_panel.setFocusable(false);
        jButton_clientes_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_clientes_panel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_clientes_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clientes_panelActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_clientes_panel);

        jButton_rece_mdc_panel.setBackground(new java.awt.Color(255, 255, 255));
        jButton_rece_mdc_panel.setForeground(new java.awt.Color(0, 0, 0));
        jButton_rece_mdc_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon receta medicas.png"))); // NOI18N
        jButton_rece_mdc_panel.setText("Receta Médicas");
        jButton_rece_mdc_panel.setFocusable(false);
        jButton_rece_mdc_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_rece_mdc_panel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_rece_mdc_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rece_mdc_panelActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_rece_mdc_panel);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButton_laboratorio_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_laboratorio_panelActionPerformed
        JInternalFrame_laboratorio est = new JInternalFrame_laboratorio();
        jDesktopPane1.add(est);
        est.show();
    }//GEN-LAST:event_jButton_laboratorio_panelActionPerformed

    private void jButton_compra_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_compra_panelActionPerformed
        JInternalFrame_compra est = new JInternalFrame_compra();
        jDesktopPane1.add(est);
        est.show();
    }//GEN-LAST:event_jButton_compra_panelActionPerformed

    private void jButton_producto_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_producto_panelActionPerformed
        JInternalFrame_productos est = new JInternalFrame_productos();
        jDesktopPane1.add(est);
        est.show();
    }//GEN-LAST:event_jButton_producto_panelActionPerformed

    private void jButton_ventas_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ventas_panelActionPerformed
        JInternalFrame_ventas est = new JInternalFrame_ventas();
        jDesktopPane1.add(est);
        est.show();
    }//GEN-LAST:event_jButton_ventas_panelActionPerformed

    private void jButton_empleado_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_empleado_panelActionPerformed
        JInternalFrame_empleado est = new JInternalFrame_empleado();
        jDesktopPane1.add(est);
        est.show();
    }//GEN-LAST:event_jButton_empleado_panelActionPerformed

    private void jButton_clientes_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clientes_panelActionPerformed
        JInternalFrame_clientes est = new JInternalFrame_clientes();
        jDesktopPane1.add(est);
        est.show();
    }//GEN-LAST:event_jButton_clientes_panelActionPerformed

    private void jButton_rece_mdc_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rece_mdc_panelActionPerformed
        JInternalFrame_recetas_medicas est = new JInternalFrame_recetas_medicas();
        jDesktopPane1.add(est);
        est.show();
    }//GEN-LAST:event_jButton_rece_mdc_panelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaDeInventarioMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton_clientes_panel;
    private javax.swing.JButton jButton_compra_panel;
    private javax.swing.JButton jButton_empleado_panel;
    private javax.swing.JButton jButton_laboratorio_panel;
    private javax.swing.JButton jButton_producto_panel;
    private javax.swing.JButton jButton_rece_mdc_panel;
    private javax.swing.JButton jButton_ventas_panel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
