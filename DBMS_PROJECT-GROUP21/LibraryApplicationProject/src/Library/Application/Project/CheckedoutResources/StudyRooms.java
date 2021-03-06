/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project.CheckedoutResources;

import Library.Application.Project.UserAuthentication.UserType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jordy
 */
public class StudyRooms extends javax.swing.JFrame {
    
    private static final SimpleDateFormat m_SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private DefaultTableModel m_Model;
    private final JFrame m_RoomsPage;
    private final String m_UserId;
    private final UserType m_UserType;
    /**
     * Creates new form StudyRooms
     * @param roomsPage
     * @param userId
     * @param userType
     */
    public StudyRooms(JFrame roomsPage, String userId, UserType userType) {
        initComponents();
        
        this.m_RoomsPage = roomsPage;
        this.m_UserId = userId;
        this.m_UserType = userType;
        
        studyRoomsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CreateTableModel();
        PopulateStudyRoomsTable();
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
        studyRoomsTable = new javax.swing.JTable();
        goBackButton = new javax.swing.JButton();
        detailsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studyRoomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(studyRoomsTable);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(goBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(detailsButton)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(detailsButton))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        this.dispose();
        m_RoomsPage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonActionPerformed
        try {
            int selectedRow = studyRoomsTable.getSelectedRow();
            if(selectedRow == -1){
                return;
            }
            String roomNo = (String)studyRoomsTable.getModel().getValueAt(selectedRow, 0);
            String startDate = getStartDate(selectedRow);
            this.setVisible(false);
            new RoomsDetailsPage(this, "STUDYROOMRESERVATION", m_UserId, roomNo, startDate).setVisible(true);
        }
        catch (Exception e) {
            Logger.getLogger(StudyRooms.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_detailsButtonActionPerformed

    private String getStartDate(int selectedRow) throws ParseException {
        String startDate = (String)studyRoomsTable.getModel().getValueAt(selectedRow, 2);
        Date parse = m_SimpleDateFormat.parse(startDate);
        return m_SimpleDateFormat.format(parse);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton detailsButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studyRoomsTable;
    // End of variables declaration//GEN-END:variables
    
    private void CreateTableModel() {
        m_Model = new DefaultTableModel();
        m_Model.addColumn("Room Number");
        m_Model.addColumn("Library Name");
        m_Model.addColumn("Date of Booking");
        studyRoomsTable.setModel(m_Model);
    }

    private void PopulateStudyRoomsTable() {
        try {
            AddStudyRoomsToTable();
        }
        catch (Exception e) {
            Logger.getLogger(StudyRooms.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void AddStudyRoomsToTable() throws Exception{
        CheckedoutResourcesHelper.AddCheckedoutRoomsToTable("STUDYROOMRESERVATION",
            "USERID", m_UserId, "CHECKOUTDATETIME", "CHECKINDATETIME",
            "ISVOID", m_Model, "ROOMNO", "STARTDATE");
    }
}
