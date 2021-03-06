/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project.CheckedoutResources;

import Library.Application.Project.UserAuthentication.UserType;
import javax.swing.JFrame;

/**
 *
 * @author jordy
 */
public class PublicationsPage extends javax.swing.JFrame {

    private final JFrame m_ResourcesPage;
    private final String m_UserId;
    private final UserType m_UserType;
    /**
     * Creates new form PublicationsPage
     * @param resourcesPage
     * @param userId
     * @param userType
     */
    public PublicationsPage(JFrame resourcesPage, String userId, UserType userType) {
        initComponents();
        this.m_ResourcesPage = resourcesPage;
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
        booksButton = new javax.swing.JButton();
        journalsButton = new javax.swing.JButton();
        confButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        booksButton.setText("Books");
        booksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksButtonActionPerformed(evt);
            }
        });

        journalsButton.setText("Journals");
        journalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journalsButtonActionPerformed(evt);
            }
        });

        confButton.setText("Conference Papers");
        confButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confButtonActionPerformed(evt);
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
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(booksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(journalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(booksButton)
                .addGap(35, 35, 35)
                .addComponent(journalsButton)
                .addGap(40, 40, 40)
                .addComponent(confButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addGap(32, 32, 32))
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

    private void booksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksButtonActionPerformed
        this.setVisible(false);
        new BooksPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_booksButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        this.dispose();
        m_ResourcesPage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void journalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journalsButtonActionPerformed
        this.setVisible(false);
        new JournalsPage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_journalsButtonActionPerformed

    private void confButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confButtonActionPerformed
        this.setVisible(false);
        new ConferencePage(this, m_UserId, m_UserType).setVisible(true);
    }//GEN-LAST:event_confButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booksButton;
    private javax.swing.JButton confButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton journalsButton;
    // End of variables declaration//GEN-END:variables
}
