/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.FacturasDAO;
import model.Facturas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

/**
 *
 * @author zeglius
 */
public class FacturasPane extends javax.swing.JPanel {

    /**
     * Creates new form FacturasPane
     */
    public FacturasPane() {
        initComponents();
        init();
    }

    //<editor-fold desc="My Functions">
    private void init() {
        //noinspection unchecked
        List<Facturas> facturasList;
        facturasList = FacturasDAO.getFacturaList();

        facturasList.forEach(factura -> {
            DefaultTableModel model = (DefaultTableModel) jClientesTable.getModel();
            model.addRow(new Object[]{factura});
        });

    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEditButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jClientesTable = new javax.swing.JTable();

        jEditButton.setText("Editar");
        jEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditButtonActionPerformed(evt);
            }
        });

        jClientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jClientesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEditButton)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditButton)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditButtonActionPerformed
        int selectedRow = jClientesTable.getSelectedRow();
        if (selectedRow <= -1) return;
        jEditButton.setEnabled(false);
        JFrame window = new JFrame();
        window.setContentPane(new LineasFacturasPane((Facturas)jClientesTable.getValueAt(selectedRow, 0)));
        window.pack();
        window.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        jEditButton.setEnabled(true);
                    }
                }
        );
        window.setVisible(true);
    }//GEN-LAST:event_jEditButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jClientesTable;
    private javax.swing.JButton jEditButton;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
