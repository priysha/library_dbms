/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project.Rooms;

import Library.Application.Project.UserAuthentication.UserType;
import javax.swing.JFrame;

/**
 *
 * @author jordy
 */
public class RoomsPage extends javax.swing.JFrame {
    private final JFrame m_UserResourcesPage;
    private final String m_UserId;
    private final UserType m_UserType;

    /**
     * Creates new form RoomsPage
     * @param userResourcesPage
     * @param userId
     * @param userType
     */
    public RoomsPage(JFrame userResourcesPage, 
            String userId, 
            UserType userType) {
        initComponents();
        this.m_UserResourcesPage = userResourcesPage;
        this.m_UserId = userId;
        this.m_UserType = userType;
        SetEnableForButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confRoomsButton = new javax.swing.JButton();
        studyRoomsButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confRoomsButton.setText("Conference Rooms");
        confRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confRoomsButtonActionPerformed(evt);
            }
        });

        studyRoomsButton.setText("Study Rooms");
        studyRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyRoomsButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confRoomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(studyRoomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(confRoomsButton)
                .addGap(61, 61, 61)
                .addComponent(studyRoomsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        this.dispose();
        m_UserResourcesPage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void studyRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyRoomsButtonActionPerformed
        this.setVisible(false);
        new RoomsFilterPage(this, m_UserId, m_UserType, RoomsType.Study).setVisible(true);
    }//GEN-LAST:event_studyRoomsButtonActionPerformed

    private void confRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confRoomsButtonActionPerformed
        this.setVisible(false);
        new RoomsFilterPage(this, m_UserId, m_UserType, RoomsType.Conference).setVisible(true);
    }//GEN-LAST:event_confRoomsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confRoomsButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton studyRoomsButton;
    // End of variables declaration//GEN-END:variables

    private void SetEnableForButtons() {
        if (m_UserType.equals(UserType.Student)){
            confRoomsButton.setEnabled(false);
        }
    }
}
