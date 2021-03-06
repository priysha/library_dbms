/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project.Rooms;

import Library.Application.Project.UserAuthentication.UserType;
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
public class RoomsFilterPage extends javax.swing.JFrame {
    private final JFrame m_RoomsPage;
    private final String m_UserId;
    private final UserType m_UserType;
    private final RoomsType m_RoomsType;
    private static final SimpleDateFormat m_SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final float MILLI_TO_HOUR = 1000*60*60;
    private DefaultTableModel m_Model;
    
    /**
     * Creates new form RoomsFilterPage
     * @param roomsPage
     * @param userId
     * @param userType
     * @param roomsType
     */
    public RoomsFilterPage(JFrame roomsPage,
            String userId,
            UserType userType,
            RoomsType roomsType) {
        initComponents();
        this.m_RoomsPage = roomsPage;
        this.m_UserId = userId;
        this.m_UserType = userType;
        this.m_RoomsType = roomsType;
        
        roomsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CreateTableModel();
        reserveButton.setEnabled(false);
    }
    
    private void CreateTableModel() {
        m_Model = new DefaultTableModel();
        m_Model.addColumn("Room No");
        m_Model.addColumn("Floor");
        m_Model.addColumn("Capacity");
        m_Model.addColumn("Lib ID");
        m_Model.addColumn("Library Name");
        roomsTable.setModel(m_Model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        capacityLabel = new javax.swing.JLabel();
        fromSpinner = new javax.swing.JSpinner();
        toSpinner = new javax.swing.JSpinner();
        findRoomsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsTable = new javax.swing.JTable();
        roomsLabel = new javax.swing.JLabel();
        invisibleLabel = new javax.swing.JLabel();
        capacitySpinner = new javax.swing.JSpinner();
        goBackButton = new javax.swing.JButton();
        reserveButton = new javax.swing.JButton();
        reservedRoomsButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        checkinButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fromLabel.setText("From");

        toLabel.setText("To");

        capacityLabel.setText("Capacity");

        fromSpinner.setModel(new javax.swing.SpinnerDateModel());

        toSpinner.setModel(new javax.swing.SpinnerDateModel());

        findRoomsButton.setText("Find Rooms");
        findRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRoomsButtonActionPerformed(evt);
            }
        });

        roomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(roomsTable);

        roomsLabel.setText("Rooms");

        invisibleLabel.setForeground(new java.awt.Color(204, 0, 0));

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        reserveButton.setText("Reserve");
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        reservedRoomsButton.setText("Reserved Rooms");
        reservedRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservedRoomsButtonActionPerformed(evt);
            }
        });

        checkoutButton.setText("Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        checkinButton.setText("Checkin");
        checkinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(roomsLabel)
                                .addGap(18, 18, 18)
                                .addComponent(invisibleLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromLabel)
                                    .addComponent(toLabel)
                                    .addComponent(capacityLabel))
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reservedRoomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(toSpinner)
                                    .addComponent(fromSpinner)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(capacitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(findRoomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(goBackButton)
                .addGap(18, 18, 18)
                .addComponent(checkoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkinButton)
                .addGap(18, 18, 18)
                .addComponent(reserveButton)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fromLabel)
                            .addComponent(fromSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(toLabel))
                    .addComponent(toSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacityLabel)
                    .addComponent(capacitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(findRoomsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reservedRoomsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(invisibleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(reserveButton)
                    .addComponent(checkoutButton)
                    .addComponent(checkinButton))
                .addContainerGap())
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

    private void findRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findRoomsButtonActionPerformed
        if (!IsValidFromAndToDates()){
            invisibleLabel.setText("Please enter a valid From and To Date!");
            return;
        }
        if (IsBookingTimeMoreThanThreeHours()){
            invisibleLabel.setText("Cannot book a room for more than 3 hours!");
            return;
        }
        if (!IsRoomsAvailable()){
            invisibleLabel.setText("No rooms are available!");
            return;
        }
        invisibleLabel.setText("");
        ClearAllRowsInTable();
        PopulateRoomsTable();
        reserveButton.setEnabled(true);
    }//GEN-LAST:event_findRoomsButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        this.dispose();
        m_RoomsPage.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
        try {
            int selectedRow = roomsTable.getSelectedRow();
            if(selectedRow == -1){
                invisibleLabel.setText("Please select a room!");
                return;
            }
            String roomNo = (String)roomsTable.getModel().getValueAt(selectedRow, 0);
            String floor = (String)roomsTable.getModel().getValueAt(selectedRow, 1);
            String libId = (String)roomsTable.getModel().getValueAt(selectedRow, 3);
            String libName = (String)roomsTable.getModel().getValueAt(selectedRow, 4);
            String fromDate = getFromDate();
            String toDate = getToDate();
            RoomsHelper.ReserveRoom(getRoomsTableName(), m_UserId, roomNo, libId, fromDate, toDate);
            this.dispose();
            new ReservationDetailsPage(m_RoomsPage, roomNo, 
                    libName, floor, fromDate, toDate).setVisible(true);
        }
        catch (Exception e) {
            Logger.getLogger(RoomsFilterPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_reserveButtonActionPerformed

    private void reservedRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservedRoomsButtonActionPerformed
        ClearAllRowsInTable();
        PopulateTableWithReservedRooms();
        reserveButton.setEnabled(false);
    }//GEN-LAST:event_reservedRoomsButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        try{
            int selectedRow = roomsTable.getSelectedRow();
            if(selectedRow == -1){
                invisibleLabel.setText("Please select a room!");
                return;
            }
            String roomNo = (String)roomsTable.getModel().getValueAt(selectedRow, 0);
            if (RoomsHelper.CheckoutRoom(getRoomsTableName(), m_UserId, roomNo)){
                invisibleLabel.setText("Room has been Checkedout!");
                return;
            }
            invisibleLabel.setText("Room cannot be Checkedout!");
        }
        catch (Exception e) {
            Logger.getLogger(RoomsFilterPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void checkinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinButtonActionPerformed
        try{
            int selectedRow = roomsTable.getSelectedRow();
            if(selectedRow == -1){
                invisibleLabel.setText("Please select a room!");
                return;
            }
            String roomNo = (String)roomsTable.getModel().getValueAt(selectedRow, 0);
            if (RoomsHelper.CheckinRoom(getRoomsTableName(), m_UserId, roomNo)){
                invisibleLabel.setText("Room has been Checkedin!");
                return;
            }
            invisibleLabel.setText("Room cannot be Checkedin!");
        }
        catch (Exception e) {
            Logger.getLogger(RoomsFilterPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_checkinButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel capacityLabel;
    private javax.swing.JSpinner capacitySpinner;
    private javax.swing.JButton checkinButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton findRoomsButton;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JSpinner fromSpinner;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel invisibleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reserveButton;
    private javax.swing.JButton reservedRoomsButton;
    private javax.swing.JLabel roomsLabel;
    private javax.swing.JTable roomsTable;
    private javax.swing.JLabel toLabel;
    private javax.swing.JSpinner toSpinner;
    // End of variables declaration//GEN-END:variables

    private boolean IsValidFromAndToDates() {
        Date fromDate = (Date)fromSpinner.getValue();
        Date toDate = (Date)toSpinner.getValue();
        Date currentDate = new Date();
        if (fromDate.after(toDate)){
            return false;
        }
        return !fromDate.before(currentDate);
    }

    private boolean IsBookingTimeMoreThanThreeHours() {
        Date fromDate = (Date)fromSpinner.getValue();
        Date toDate = (Date)toSpinner.getValue();
        return (toDate.getTime() - fromDate.getTime())/MILLI_TO_HOUR > 3;
    }

    private boolean IsRoomsAvailable() {
        return AnyRoomsWithCapacityPresent();
    }

    private void PopulateRoomsTable() {
        try{
            String dateString = getFromDate();
            RoomsHelper.AddRoomsToTable(getRoomsTableName(), "ROOMNO", 
                "FLOOR", getCapacity(), "CAPACITY", "LIBRARYID", dateString, m_Model);
        }
        catch (Exception e) {
            Logger.getLogger(RoomsFilterPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String getFromDate() {
        Date fromDate = (Date)fromSpinner.getValue();
        String dateString = m_SimpleDateFormat.format(fromDate);
        return dateString;
    }
    
    private String getToDate() {
        Date fromDate = (Date)toSpinner.getValue();
        String dateString = m_SimpleDateFormat.format(fromDate);
        return dateString;
    }

    private boolean AnyRoomsWithCapacityPresent() {
        try{
            int capacity = getCapacity();
            if (capacity <= 0) return false;
            return RoomsHelper.AnyRoomsWithCapacityPresent(getRoomsTableName(), 
                    capacity, getCapacityColName());
        }
        catch (Exception e) {
            Logger.getLogger(RoomsFilterPage.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    private String getRoomsTableName(){
        if (m_RoomsType.equals(RoomsType.Study)){
            return "STUDYROOMS";
        }
        return "CONFERENCEROOMS";
    }
    
    private int getCapacity(){
        return (int)capacitySpinner.getValue();
    }

    private String getCapacityColName() {
        return "CAPACITY";
    }
    
    private void ClearAllRowsInTable() {
        int rowCount = m_Model.getRowCount();
        for (int i = 0; i < rowCount; i++){
            m_Model.removeRow(0);
        }
    }

    private void PopulateTableWithReservedRooms() {
        try{
            RoomsHelper.AddReservedRoomsToTable(getRoomsTableName(), m_UserId, m_Model);
        }
        catch (Exception e) {
            Logger.getLogger(RoomsFilterPage.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
