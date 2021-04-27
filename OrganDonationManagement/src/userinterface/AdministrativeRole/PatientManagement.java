/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author chandrasekhar
 */
public class PatientManagement extends javax.swing.JPanel {

    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory; 
    Enterprise enterprise;
    EcoSystem ecoSystem;
    /**
     * Creates new form PatientManagement
     */
    public PatientManagement(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise,EcoSystem ecoSystem) {
        this.userProcessContainer=userProcessContainer;
        this.organizationDirectory=organizationDirectory;
        this.enterprise=enterprise;
        this.ecoSystem=ecoSystem;
        
        initComponents();
        initcb_dept();
        txt_patId.setText(""+this.ecoSystem.getPatientId());      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_patId = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        cb_dept = new javax.swing.JComboBox<>();
        cb_doctor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_phnNum = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cb_gen = new javax.swing.JComboBox<>();
        patCount = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setText("Patient Details");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Patient ID :");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Age :");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Speciality :");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Doctor :");

        cb_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_deptActionPerformed(evt);
            }
        });

        cb_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_doctorActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Phone Number :");

        btn_save.setBackground(new java.awt.Color(0, 102, 153));
        btn_save.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/submit.png"))); // NOI18N
        btn_save.setText("Submit");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 102, 153));
        btn_back.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back3.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("Sex :");

        cb_gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Male", "Female", "Others" }));

        patCount.setBackground(new java.awt.Color(255, 51, 0));
        patCount.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        patCount.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txt_patId, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cb_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txt_phnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(cb_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(cb_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_back))
                .addGap(141, 141, 141)
                .addComponent(patCount, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(542, 542, 542))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(patCount))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(txt_patId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4))
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(cb_gen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))
                            .addComponent(txt_phnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addComponent(cb_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6))
                            .addComponent(cb_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(271, 271, 271))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void initcb_dept(){
        cb_dept.addItem("--Select--");
        for(Organization org: organizationDirectory.getOrganizationList()){
            if(org.getType().getValue().equalsIgnoreCase("medical")){
                cb_dept.addItem(org.getName());
            }
        }
    }
    
    public void countPatients(String doc){
        int counter=0;
        for(Organization org: organizationDirectory.getOrganizationList()){
            if(org.getType().getValue().equalsIgnoreCase("medical")){
                for(Patient p: org.getPatientDirectory().getPatientList()){
                    if(p.isAlive()&&p.getDoctor().equalsIgnoreCase(doc)){
                        counter++;
                    }
                }
            }
        }
        patCount.setText(""+counter+" Patients are in line");
    
    }
    
    
    
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if(txt_name.getText().isEmpty() || txt_age.getText().isEmpty() || txt_phnNum.getText().isEmpty() ||
               cb_dept.getSelectedIndex()==0||cb_doctor.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Please provide details in all fields");
            return;
        }
        //firstname and last name===========================
        boolean check ; 
        check = txt_name.getText().matches("^[a-zA-Z]+$");
        
        if(check == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have numerics");
            return;
        }

        //Phone Number==================================================
        
        if(txt_phnNum.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        check = txt_phnNum.getText().matches("^[0-9]+$");
        if(!check) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        //Age========================================
        check=txt_age.getText().matches("^[1-9][0-9]?$");
        if(!check){
            JOptionPane.showMessageDialog(null, "Please enter a proper age value");
            return;
        }
        check=cb_gen.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Please select a gender");
            return;
        }

        //Organization organization = (Organization) cb_dept.getSelectedItem();
        //JOptionPane.showMessageDialog(null, cb_dept.getSelectedItem());
        //JOptionPane.showMessageDialog(null, organization.getName());
        
        ArrayList<String> organs=new ArrayList<>();
        ArrayList<String> testData=new ArrayList<>();
        for(int i=0;i<organizationDirectory.getOrganizationList().size();i++){
            if(organizationDirectory.getOrganizationList().get(i).getName().equalsIgnoreCase(cb_dept.getSelectedItem().toString())){
                Organization organization=organizationDirectory.getOrganizationList().get(i);
                organization.getPatientDirectory().createPatient(ecoSystem.getPatientId(),txt_name.getText(),txt_age.getText(),cb_gen.getSelectedItem().toString(),txt_phnNum.getText(),cb_dept.getSelectedItem().toString(),cb_doctor.getSelectedItem().toString(),true,true,true,organs,testData);
                ecoSystem.incPatientId();
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Your appointment is confirmed!");
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void cb_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_doctorActionPerformed
        // TODO add your handling code here:
        if(cb_doctor.getSelectedIndex()>0){
            String doc=cb_doctor.getSelectedItem().toString();
            countPatients(doc);
        }
        
        
    }//GEN-LAST:event_cb_doctorActionPerformed

    private void cb_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_deptActionPerformed
        // TODO add your handling code here:
        cb_doctor.removeAllItems();
        cb_doctor.addItem("--Select--");
        int counter=0;
        for(int i=0;i<organizationDirectory.getOrganizationList().size();i++){
            Organization org=organizationDirectory.getOrganizationList().get(i);
            //JOptionPane.showMessageDialog(null, cb_dept.getSelectedItem().toString().equalsIgnoreCase(org.getName()));
            if(cb_dept.getSelectedItem().toString().equalsIgnoreCase(org.getName())){
                for(int j=0;j<org.getUserAccountDirectory().getUserAccountList().size();j++){
                    Employee emp=org.getUserAccountDirectory().getUserAccountList().get(j).getEmployee();
                    cb_doctor.addItem(emp.getName());
                    counter++;
                }
            }
        }
        if(counter==0){
            cb_doctor.removeAllItems();
            cb_doctor.addItem("No Doctors");
        }
    }//GEN-LAST:event_cb_deptActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_dept;
    private javax.swing.JComboBox<String> cb_doctor;
    private javax.swing.JComboBox<String> cb_gen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel patCount;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_patId;
    private javax.swing.JTextField txt_phnNum;
    // End of variables declaration//GEN-END:variables
}
