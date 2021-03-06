/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.OrganBankEnterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Enterprise.TherapyEnterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mruna
 */
public class OrganizationManagementJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public OrganizationManagementJPanel(JPanel userProcessContainer,OrganizationDirectory directory,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = directory;
        this.enterprise= enterprise;
        
        initTable();
        initComboBox();
    }
    
    
    
    private void initComboBox(){
        cmbxOrganizationType.removeAllItems();
        cmbxOrganizationType.addItem("--Select--");
        for (Type type : Organization.Type.values()){
            
             if(enterprise instanceof HospitalEnterprise){
                 if(type.toString().equals("Medical") || type.toString().equals("Diagnostics")){
                 cmbxOrganizationType.addItem(type);}
             }
             if(enterprise instanceof OrganBankEnterprise){
                 if(type.toString().equals("Facilities")){
                 cmbxOrganizationType.addItem(type);}
                 
             }
             if(enterprise instanceof GovernmentEnterprise){
                 if(type.toString().equals("PoliciesFinance")|| type.toString().equals("AwarnessCampaign")){
                 cmbxOrganizationType.addItem(type);}
                 
             }
             if(enterprise instanceof TherapyEnterprise){
                 if(type.toString().equals("Therapist")){
                 cmbxOrganizationType.addItem(type);}
                 
             }
                
            
        }
    }

    private void initTable(){
        DefaultTableModel model = (DefaultTableModel) tblCurrentOrganizations.getModel();
        model.setRowCount(0);
        for (Organization organization : organizationDirectory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getName();
            row[1]= organization.getType().getValue();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCurrentOrganizations = new javax.swing.JTable();
        btnAddOrganization = new javax.swing.JButton();
        cmbxOrganizationType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblCreateOrganization = new javax.swing.JLabel();
        txtCurrentOrganizations = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrganizationName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tblCurrentOrganizations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblCurrentOrganizations.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblCurrentOrganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organisation Name", "Organisation Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCurrentOrganizations);
        if (tblCurrentOrganizations.getColumnModel().getColumnCount() > 0) {
            tblCurrentOrganizations.getColumnModel().getColumn(0).setResizable(false);
            tblCurrentOrganizations.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAddOrganization.setBackground(new java.awt.Color(0, 51, 102));
        btnAddOrganization.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        cmbxOrganizationType.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cmbxOrganizationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Organization Type :");

        btnBack.setBackground(new java.awt.Color(0, 51, 102));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back3.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCreateOrganization.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblCreateOrganization.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateOrganization.setText("CREATE ORGANIZATION");

        txtCurrentOrganizations.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        txtCurrentOrganizations.setText("Current Organizations");

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Organization Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateOrganization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(654, 654, 654)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(txtCurrentOrganizations))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbxOrganizationType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOrganizationName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCreateOrganization)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(txtCurrentOrganizations))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed

        boolean check;
        check=cmbxOrganizationType.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Select an Organisation");
        }
        
        Type type = (Type) cmbxOrganizationType.getSelectedItem();
        organizationDirectory.createOrganization(type,txtOrganizationName.getText());
        txtOrganizationName.setText("");
        initTable();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbxOrganizationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateOrganization;
    private javax.swing.JTable tblCurrentOrganizations;
    private javax.swing.JLabel txtCurrentOrganizations;
    private javax.swing.JTextField txtOrganizationName;
    // End of variables declaration//GEN-END:variables
}
