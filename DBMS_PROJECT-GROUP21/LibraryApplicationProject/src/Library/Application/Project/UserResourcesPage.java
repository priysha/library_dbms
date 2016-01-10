/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project;

import Library.Application.Project.Cameras.CamerasPage;
import Library.Application.Project.UserAuthentication.UserType;
import Library.Application.Project.Publications.PublicationsPage;
import Library.Application.Project.Rooms.RoomsPage;
import javax.swing.JFrame;

/**
 *
 * @author jordy
 */
public class UserResourcesPage extends javax.swing.JFrame {
    private final JFrame m_UserHomePage;
    private final String m_UserId;
    private final UserType m_UserType;

    /**
     * Creates new form StudentResourcesPage
     * @param userHomePage
     * @param userId
     * @param userType
     */
    public UserResourcesPage(JFrame userHomePage, 
            String userId, 
            UserType userType) {
        initComponents();
        this.m_UserHomePage = userHomePage;
        this.m_UserId = userId;
        this.m_UserType = userType;
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
        publicationsButton = new javax.swing.JButton();
        roomsButton = new javax.swing.JButton();
        camerasButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        publicationsButton.setText("Publications");
        publicationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicationsButtonActionPerformed(evt);
            }
        });

        roomsButton.setText("Rooms");
        roomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsButtonActionPerformed(evt);
            }
        });

        camerasButton.setText("Cameras");
        camerasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camerasButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("go back");
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
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(publicationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(camerasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(publicationsButton)
                .addGap(33, 33, 33)
                .addComponent(roomsButton)
                .addGap(36, 36, 36)
                .addComponent(camerasButton)
                .addGap(30, 30, 30)
                .addComponent(goBackButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        m_UserHomePage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void publicationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicationsButtonActionPerformed
        this.setVisible(false);
        new PublicationsPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_publicationsButtonActionPerformed

    private void roomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsButtonActionPerformed
        this.setVisible(false);
        new RoomsPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_roomsButtonActionPerformed

    private void camerasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camerasButtonActionPerformed
        this.setVisible(false);
        new CamerasPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_camerasButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton camerasButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton publicationsButton;
    private javax.swing.JButton roomsButton;
    // End of variables declaration//GEN-END:variables
}
