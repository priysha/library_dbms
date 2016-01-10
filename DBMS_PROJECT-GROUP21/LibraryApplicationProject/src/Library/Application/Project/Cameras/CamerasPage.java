/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project.Cameras;

import Library.Application.Project.UserAuthentication.UserType;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jordy
 */
public class CamerasPage extends javax.swing.JFrame {

    private DefaultTableModel m_Model;
    private final JFrame m_UserResourcesPage;
    private final String m_UserId;
    private final UserType m_UserType;
    
    /**
     * Creates new form CamerasPage
     * @param userResourcesPage
     * @param userId
     * @param userType
     */
    public CamerasPage(JFrame userResourcesPage, 
            String userId, 
            UserType userType) {
        initComponents();
        this.m_UserResourcesPage = userResourcesPage;
        this.m_UserId = userId;
        this.m_UserType = userType;
        
        camerasTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CreateTableModel();
        PopulateCamerasTable();
    }
    
    private void CreateTableModel() {
        m_Model = new DefaultTableModel();
        m_Model.addColumn("ID");
        m_Model.addColumn("Make");
        m_Model.addColumn("Model");
        m_Model.addColumn("Memory");
        m_Model.addColumn("Config");
        m_Model.addColumn("Lib ID");
        m_Model.addColumn("Lib Name");
        camerasTable.setModel(m_Model);
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
        camerasTable = new javax.swing.JTable();
        goBackButton = new javax.swing.JButton();
        detailsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        camerasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(camerasTable);

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        detailsButton.setText("Details");
        detailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(goBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailsButton)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(detailsButton))
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        this.dispose();
        this.m_UserResourcesPage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonActionPerformed
        int selectedRow = camerasTable.getSelectedRow();
        String cameraId = (String)camerasTable.getModel().getValueAt(selectedRow, 0);
        this.setVisible(false);
        new CameraDetailsPage(this, m_UserId, cameraId).setVisible(true);
    }//GEN-LAST:event_detailsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable camerasTable;
    private javax.swing.JButton detailsButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void PopulateCamerasTable() {
        try {
            CamerasHelper.AddCamerasToTable(m_Model);
        }
        catch (Exception e) {
            Logger.getLogger(CamerasPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
