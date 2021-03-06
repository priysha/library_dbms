/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project;

import Library.Application.Project.CheckedoutResources.CheckedoutResourcesPage;
import Library.Application.Project.Dues.DuesPage;
import Library.Application.Project.Notifications.NotificationsPage;
import Library.Application.Project.ResourceRequests.ResourceRequestsPage;
import Library.Application.Project.UserAuthentication.LoginPage;
import Library.Application.Project.UserAuthentication.UserType;

/**
 *
 * @author jordy
 */
public class UserHomePage extends javax.swing.JFrame {
    private final String m_UserId;
    private final UserType m_UserType;

    /**
     * Creates new form StudentHomePage
     * @param userId
     * @param userType
     */
    public UserHomePage(String userId, UserType userType) {
        initComponents();
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
        profileButton = new javax.swing.JButton();
        resourcesButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        notificationsButton = new javax.swing.JButton();
        checkedoutButton = new javax.swing.JButton();
        requestedButton = new javax.swing.JButton();
        dueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        resourcesButton.setText("Resources");
        resourcesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourcesButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        notificationsButton.setText("Notifications");
        notificationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationsButtonActionPerformed(evt);
            }
        });

        checkedoutButton.setText("Checked-out Resources");
        checkedoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkedoutButtonActionPerformed(evt);
            }
        });

        requestedButton.setText("Resource Request");
        requestedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestedButtonActionPerformed(evt);
            }
        });

        dueButton.setText("Due-Balance");
        dueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkedoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resourcesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(requestedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notificationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileButton)
                .addGap(27, 27, 27)
                .addComponent(resourcesButton)
                .addGap(29, 29, 29)
                .addComponent(checkedoutButton)
                .addGap(27, 27, 27)
                .addComponent(requestedButton)
                .addGap(30, 30, 30)
                .addComponent(notificationsButton)
                .addGap(28, 28, 28)
                .addComponent(dueButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        this.setVisible(false);
        if (m_UserType.equals(UserType.Student)){
            new StudentProfilePage(this, m_UserId).setVisible(true);
        }
        else {
            new FacultyProfilePage(this, m_UserId).setVisible(true);
        }
    }//GEN-LAST:event_profileButtonActionPerformed

    private void resourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourcesButtonActionPerformed
        this.setVisible(false);
        new UserResourcesPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_resourcesButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        this.dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationsButtonActionPerformed
        this.setVisible(false);
        new NotificationsPage(this, m_UserId).setVisible(true);
    }//GEN-LAST:event_notificationsButtonActionPerformed

    private void checkedoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkedoutButtonActionPerformed
        this.setVisible(false);
        new CheckedoutResourcesPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_checkedoutButtonActionPerformed

    private void dueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueButtonActionPerformed
        this.setVisible(false);
        new DuesPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_dueButtonActionPerformed

    private void requestedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestedButtonActionPerformed
        this.setVisible(false);
        new ResourceRequestsPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_requestedButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkedoutButton;
    private javax.swing.JButton dueButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton notificationsButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton requestedButton;
    private javax.swing.JButton resourcesButton;
    // End of variables declaration//GEN-END:variables
}
