package view;

import SwingModels.FamiliasTableModel;
import controller.FamiliasDAO;
import controller.Utils;
import model.Familias;

import javax.swing.*;
import javax.swing.table.TableModel;

import java.awt.event.*;
import java.util.List;

import static controller.Utils.TODO;

/**
 *
 * @author zeglius
 */
public class FamiliasPane extends javax.swing.JPanel {

    //<editor-fold desc="My Vars">
    private TableModel familiasTableModel;
    //</editor-fold>


    //<editor-fold desc="My Functions" defaultstate="">
    /**
     * Initialize vars
     */
    private void init() {
        familiasTableModel = new FamiliasTableModel(FamiliasDAO.getFamilias());
        jFamiliaTable.setModel(familiasTableModel);
    }

    private List<Familias> getFamiliasList() {
        return ((FamiliasTableModel) familiasTableModel).getFamiliasList();
    }
    //</editor-fold>


    /**
     * Creates new form FamiliasPane
     */
    public FamiliasPane() {
        initComponents();

        init();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jFamiliaTable = new javax.swing.JTable();
        jRemoveFamiliaButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jAddCodFamiliaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jAddNombreFamiliaTextField = new javax.swing.JTextField();
        jAddFamiliaButton = new javax.swing.JButton();
        jEditarArticulosButton = new javax.swing.JButton();

        jFamiliaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jFamiliaTable);

        jRemoveFamiliaButton.setText("-");
        jRemoveFamiliaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveFamiliaButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Añadir Familia");

        jAddCodFamiliaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddCodFamiliaTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Cod Familia");

        jLabel3.setText("Nombre Familia");

        jAddNombreFamiliaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddNombreFamiliaTextFieldActionPerformed(evt);
            }
        });

        jAddFamiliaButton.setText("Añadir");
        jAddFamiliaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddFamiliaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAddCodFamiliaTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAddNombreFamiliaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAddFamiliaButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddCodFamiliaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddNombreFamiliaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jAddFamiliaButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jEditarArticulosButton.setText("Editar articulos");
        jEditarArticulosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarArticulosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRemoveFamiliaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEditarArticulosButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRemoveFamiliaButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEditarArticulosButton)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRemoveFamiliaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveFamiliaButtonActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(
                this,
                "Desea confirmar la eliminación de la familia?",
                null,
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (selectedOption == JOptionPane.OK_OPTION) {
            if (FamiliasDAO.removeFamilia(getFamiliasList().get(jFamiliaTable.getSelectedRow()))) {
                JOptionPane.showMessageDialog(
                        this,
                        "La familia ha sido eliminada",
                        null,
                        JOptionPane.INFORMATION_MESSAGE);
            }
            Utils.waitFor(100);
            init();
        }
    }//GEN-LAST:event_jRemoveFamiliaButtonActionPerformed


    private void jAddCodFamiliaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddCodFamiliaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddCodFamiliaTextFieldActionPerformed

    private void jAddNombreFamiliaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddNombreFamiliaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddNombreFamiliaTextFieldActionPerformed

    private void jAddFamiliaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddFamiliaButtonActionPerformed
        String nomfam = jAddNombreFamiliaTextField.getText();
        String codfam = jAddCodFamiliaTextField.getText();
        if (nomfam.isBlank() || codfam.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan campos por rellenar");
            return;
        }
        Familias familias = new Familias(codfam, nomfam, null);
        if (getFamiliasList().contains(familias)){
            JOptionPane.showMessageDialog(this, "Codigo de familia ya asignado");
            return;
        }

        if (FamiliasDAO.addFamilia(familias)) {
            JOptionPane.showMessageDialog(this, "Familia fue añadida");
        } else {
            JOptionPane.showMessageDialog(this, "Algo fue mal");
        }
        Utils.waitFor(100);
        init();
    }//GEN-LAST:event_jAddFamiliaButtonActionPerformed

    private void jEditarArticulosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarArticulosButtonActionPerformed
        // TODO: 23/11/23 Implement Articulos dialog opening
        JFrame window = new JFrame();
        int selectedRow = jFamiliaTable.getSelectedRow();
        if (selectedRow <= -1) return;
        //noinspection unchecked
        window.setContentPane(new ArticulosDialogPanel(
                getFamiliasList().get(selectedRow)
        ));
        window.pack();
        window.setVisible(true);
        jEditarArticulosButton.setEnabled(false);
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                jEditarArticulosButton.setEnabled(true);
            }
        });
    }//GEN-LAST:event_jEditarArticulosButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAddCodFamiliaTextField;
    private javax.swing.JButton jAddFamiliaButton;
    private javax.swing.JTextField jAddNombreFamiliaTextField;
    private javax.swing.JButton jEditarArticulosButton;
    private javax.swing.JTable jFamiliaTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRemoveFamiliaButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
