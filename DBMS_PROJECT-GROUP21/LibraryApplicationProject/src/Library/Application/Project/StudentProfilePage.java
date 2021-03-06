    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Application.Project;

import Database.Connection.Helper.DatabaseConnectionService;
import Database.Connection.Helper.Interfaces.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Prishu
 */
public class StudentProfilePage extends javax.swing.JFrame {
    private final JFrame m_studentHomePage;
    private String m_studentNo;
    
    /**
     * Creates new form StudentProfilePage
     * @param studentHomePage
     * @param studentNo
     */
    public StudentProfilePage(JFrame studentHomePage, String studentNo) {
        initComponents();
        this.m_studentHomePage = studentHomePage;
        this.m_studentNo= studentNo;
        try {
            PopulateStudentProfilePage(m_studentNo);
        }
        catch(Exception e){
            Logger.getLogger(StudentProfilePage.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        FirstNameLabel = new javax.swing.JLabel();
        firstNameTextBox = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        lastNameTextBox = new javax.swing.JTextField();
        GoBackButton = new javax.swing.JButton();
        StudentNoLabel = new javax.swing.JLabel();
        studentNoTextBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dobTextBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        homePhoneTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        workPhoneTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sexTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nationalityTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deptIdTextBox = new javax.swing.JTextField();
        streetTextBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cityTextBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pincodeTextBox = new javax.swing.JTextField();
        EditProfileButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        invisibleLabel = new javax.swing.JLabel();
        classificationLabel = new javax.swing.JLabel();
        classificationTextField = new javax.swing.JTextField();
        degreeLabel = new javax.swing.JLabel();
        degreeTextField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FirstNameLabel.setText("First Name");

        firstNameTextBox.setEditable(false);
        firstNameTextBox.setBackground(new java.awt.Color(204, 204, 204));
        firstNameTextBox.setText("jTextField1");
        firstNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextBoxActionPerformed(evt);
            }
        });

        LastNameLabel.setText("Last Name");

        lastNameTextBox.setEditable(false);
        lastNameTextBox.setBackground(new java.awt.Color(204, 204, 204));
        lastNameTextBox.setText("jTextField2");
        lastNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextBoxActionPerformed(evt);
            }
        });

        GoBackButton.setText("Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        StudentNoLabel.setText("Student No");

        studentNoTextBox.setEditable(false);
        studentNoTextBox.setBackground(new java.awt.Color(204, 204, 204));
        studentNoTextBox.setText("jTextField1");

        jLabel1.setText("Date of Birth");

        dobTextBox.setEditable(false);
        dobTextBox.setBackground(new java.awt.Color(204, 204, 204));
        dobTextBox.setText("jTextField1");

        jLabel2.setText("Home Phone");

        homePhoneTextBox.setEditable(false);
        homePhoneTextBox.setText("jTextField2");

        jLabel3.setText("Work Phone");

        workPhoneTextBox.setEditable(false);
        workPhoneTextBox.setText("jTextField3");

        jLabel4.setText("Sex");

        sexTextBox.setEditable(false);
        sexTextBox.setText("jTextField4");

        jLabel5.setText("Nationality");

        nationalityTextBox.setEditable(false);
        nationalityTextBox.setText("jTextField5");

        jLabel6.setText("Dept Id");

        deptIdTextBox.setEditable(false);
        deptIdTextBox.setBackground(new java.awt.Color(204, 204, 204));
        deptIdTextBox.setText("jTextField1");

        streetTextBox.setEditable(false);
        streetTextBox.setText("jTextField1");

        jLabel8.setText("Street");

        jLabel9.setText("City");

        cityTextBox.setEditable(false);
        cityTextBox.setText("jTextField1");

        jLabel10.setText("PinCode");

        pincodeTextBox.setEditable(false);
        pincodeTextBox.setText("jTextField1");

        EditProfileButton.setText("Edit Profile");
        EditProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.setEnabled(false);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.setEnabled(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        classificationLabel.setText("Classification");

        classificationTextField.setText("jTextField1");
        classificationTextField.setEnabled(false);

        degreeLabel.setText("Degree Program");

        degreeTextField.setText("jTextField2");
        degreeTextField.setEnabled(false);
        degreeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeTextFieldActionPerformed(evt);
            }
        });

        yearLabel.setText("Year");

        yearTextField.setText("jTextField3");
        yearTextField.setEnabled(false);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameLabel)
                    .addComponent(LastNameLabel)
                    .addComponent(StudentNoLabel)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(homePhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(classificationLabel))
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(dobTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(lastNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9))
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                                    .addComponent(studentNoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(sexTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yearLabel))
                            .addComponent(nationalityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(workPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(degreeLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(degreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(deptIdTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(streetTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(cityTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(pincodeTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(classificationTextField))
                            .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(invisibleLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(GoBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(EditProfileButton)
                .addGap(35, 35, 35)
                .addComponent(SaveButton)
                .addGap(35, 35, 35)
                .addComponent(CancelButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(deptIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(streetTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(lastNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dobTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(pincodeTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homePhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classificationLabel)
                    .addComponent(classificationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degreeLabel)
                    .addComponent(degreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sexTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nationalityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton)
                    .addComponent(EditProfileButton)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addGap(107, 107, 107)
                .addComponent(invisibleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextBoxActionPerformed

    private void lastNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextBoxActionPerformed

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        this.dispose();
        m_studentHomePage.setVisible(true);
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void EditProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileButtonActionPerformed
        EnableSaveAndCancelButtons();
        ChangeEditModeOfTextBoxes(true);
    }//GEN-LAST:event_EditProfileButtonActionPerformed


    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        try {
            UpdateStudentProfile(m_studentNo);
        }
        catch(Exception e){
            Logger.getLogger(StudentProfilePage.class.getName()).log(Level.SEVERE, null, e);
        }
        this.validate();
        ChangeEditModeOfTextBoxes(false);
        DisableSaveAndCancelButtons();
        invisibleLabel.setText("Changes saved!");
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        try {
            PopulateStudentProfilePage(m_studentNo);
        }
        catch(Exception e){
            Logger.getLogger(StudentProfilePage.class.getName()).log(Level.SEVERE, null, e);
        }
        ChangeEditModeOfTextBoxes(false);
        DisableSaveAndCancelButtons();
        invisibleLabel.setText("No changes made!");
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void degreeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeTextFieldActionPerformed
    
    private void EnableSaveAndCancelButtons() {
        SaveButton.setEnabled(true);
        CancelButton.setEnabled(true);
    }
    private void DisableSaveAndCancelButtons() {
        SaveButton.setEnabled(false);
        CancelButton.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton EditProfileButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel StudentNoLabel;
    private javax.swing.JTextField cityTextBox;
    private javax.swing.JLabel classificationLabel;
    private javax.swing.JTextField classificationTextField;
    private javax.swing.JLabel degreeLabel;
    private javax.swing.JTextField degreeTextField;
    private javax.swing.JTextField deptIdTextBox;
    private javax.swing.JTextField dobTextBox;
    private javax.swing.JTextField firstNameTextBox;
    private javax.swing.JTextField homePhoneTextBox;
    private javax.swing.JLabel invisibleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField lastNameTextBox;
    private javax.swing.JTextField nationalityTextBox;
    private javax.swing.JTextField pincodeTextBox;
    private javax.swing.JTextField sexTextBox;
    private javax.swing.JTextField streetTextBox;
    private javax.swing.JTextField studentNoTextBox;
    private javax.swing.JTextField workPhoneTextBox;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables

    private void PopulateStudentProfilePage(String studentNo)throws Exception {
        try(IDatabaseConnection connection = DatabaseConnectionService.createDatabaseConnection()){
            try(IStatementExecutor stmtExecutor = DatabaseConnectionService.createStatementExecutor(connection)){
                 String student = String.format("SELECT * FROM Students WHERE studentNo ='%s' ",studentNo);
                try (IQueryResultSet resultSet = stmtExecutor.executeQuery(student)){
                    resultSet.moveToFirstRow();
                    SetRowValuesToTextboxControls(resultSet);
                }
            }
        }
    }

    private void SetRowValuesToTextboxControls(final IQueryResultSet resultSet) {
        studentNoTextBox.setText(resultSet.getString("studentNo"));
        firstNameTextBox.setText(resultSet.getString("firstName"));
        lastNameTextBox.setText(resultSet.getString("lastName"));
        dobTextBox.setText(resultSet.getString("dob"));
        homePhoneTextBox.setText(resultSet.getString("homePhone"));
        workPhoneTextBox.setText(resultSet.getString("workPhone"));
        sexTextBox.setText(resultSet.getString("sex"));
        nationalityTextBox.setText(resultSet.getString("nationality"));
        deptIdTextBox.setText(resultSet.getString("deptId"));
        streetTextBox.setText(resultSet.getString("street"));
        cityTextBox.setText(resultSet.getString("city"));
        pincodeTextBox.setText(resultSet.getString("pincode"));
        classificationTextField.setText(resultSet.getString("STUDENTCLASSIFICATION"));
        degreeTextField.setText(resultSet.getString("DEGREEPROGRAM"));
        yearTextField.setText(resultSet.getString("STUDENTPROGRAM"));
    }
    private void UpdateStudentProfile(String studentNo)throws Exception {
         try(IDatabaseConnection connection = DatabaseConnectionService.createDatabaseConnection()){
            //Address table needs to be updated before updating the student table due to foreign key constraint
            UpdateStudentAddress(connection);
            try(IStatementExecutor stmtExecutor = DatabaseConnectionService.createStatementExecutor(connection)){
                
                String updateStudentProfileInfo = String.format("UPDATE Students "
                       +"SET homePhone = '%s',"
                       +"workPhone = '%s',"
                       +"sex = '%s',"
                       +"nationality = '%s',"
                       +"street = '%s',"
                       +"city = '%s'," 
                       +"pincode = '%s'"
                       +"WHERE studentNo = '%s'",
                        homePhoneTextBox.getText(),workPhoneTextBox.getText(),sexTextBox.getText(),nationalityTextBox.getText(),streetTextBox.getText(),cityTextBox.getText(),pincodeTextBox.getText(), studentNo);
                            
                stmtExecutor.executeUpdate(updateStudentProfileInfo);
            }
        }
    }
    private void UpdateStudentAddress(IDatabaseConnection connection)throws Exception {
       try(IStatementExecutor stmtExecutor = DatabaseConnectionService.createStatementExecutor(connection)){
            String updateStudentAddressInfo = String.format("INSERT INTO Addresses (street,city,pincode)" 
                +" SELECT '%s','%s','%s' FROM DUAL"
                +" WHERE NOT EXISTS"
                +"(SELECT * FROM Addresses WHERE street='%s' AND city='%s' AND pincode='%s') ",
                streetTextBox.getText(),cityTextBox.getText(),pincodeTextBox.getText(),streetTextBox.getText(),cityTextBox.getText(),pincodeTextBox.getText());
                         
            stmtExecutor.executeUpdate(updateStudentAddressInfo);
        }
    }


    private void ChangeEditModeOfTextBoxes(boolean makeEditable) {
        homePhoneTextBox.setEditable(makeEditable);
        workPhoneTextBox.setEditable(makeEditable);
        sexTextBox.setEditable(makeEditable);
        nationalityTextBox.setEditable(makeEditable);
        streetTextBox.setEditable(makeEditable);
        cityTextBox.setEditable(makeEditable);
        pincodeTextBox.setEditable(makeEditable);
    }
}
