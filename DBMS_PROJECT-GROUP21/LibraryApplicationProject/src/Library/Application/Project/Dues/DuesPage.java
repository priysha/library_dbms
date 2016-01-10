/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project.Dues;

import Library.Application.Project.UserAuthentication.UserType;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jordy
 */
public class DuesPage extends javax.swing.JFrame {
    
    private DefaultTableModel m_Model;
    private final JFrame m_UserHomePage;
    private final String m_UserId;
    private final UserType m_UserType;

    /**
     * Creates new form DuesPage
     * @param userHomePage
     * @param userId
     * @param userType
     */
    public DuesPage(JFrame userHomePage, String userId, UserType userType) {
        initComponents();
        this.m_UserHomePage = userHomePage;
        this.m_UserId = userId;
        this.m_UserType = userType;
        
        CreateTableModel();
        PopulateDuesTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        duesTable = new javax.swing.JTable();
        goBackButton = new javax.swing.JButton();
        payDuesButton = new javax.swing.JButton();
        duesLabel = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        duesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(duesTable);

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        payDuesButton.setText("Pay Dues");
        payDuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payDuesButtonActionPerformed(evt);
            }
        });

        duesLabel.setText("Please clear dues if any");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(goBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(payDuesButton)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(duesLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(duesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(payDuesButton))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void payDuesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payDuesButtonActionPerformed
        ClearAllRowsInTable();
        UpdatePaymentofDues();
        RemoveAnyHoldsOnUser();
        PopulateDuesTable();
    }//GEN-LAST:event_payDuesButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        this.dispose();
        m_UserHomePage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel duesLabel;
    private javax.swing.JTable duesTable;
    private javax.swing.JButton goBackButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton payDuesButton;
    // End of variables declaration//GEN-END:variables

    private void CreateTableModel() {
        m_Model = new DefaultTableModel();
        m_Model.addColumn("Resource Identifier");
        m_Model.addColumn("Due Date");
        m_Model.addColumn("Amount");
        m_Model.addColumn("Is Paid");
        m_Model.addColumn("Paid Date");
        m_Model.addColumn("Total");
        duesTable.setModel(m_Model);
    }

    private void PopulateDuesTable() {
        try {
            DuesHelper.AddDuesToTable(m_UserId, m_Model);
        }
        catch (Exception e) {
            Logger.getLogger(DuesPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void ClearAllRowsInTable() {
        int rowCount = m_Model.getRowCount();
        for (int i = 0; i < rowCount; i++){
            m_Model.removeRow(0);
        }
    }

    private void UpdatePaymentofDues() {
        try {
            DuesHelper.UpdatePaymentofDues(m_UserId);
        }
        catch (Exception e) {
            Logger.getLogger(DuesPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void RemoveAnyHoldsOnUser() {
        try {
            DuesHelper.RemoveHoldsOnUser(m_UserId);
        }
        catch (Exception e) {
            Logger.getLogger(DuesPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
