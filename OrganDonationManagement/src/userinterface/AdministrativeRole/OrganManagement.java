/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OrganBankEnterprise;
import Business.Network.Network;
import Business.Organization.Facilities;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrganMatchWorkRequest;
import Business.WorkQueue.OrganProcureWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saras
 */
public class OrganManagement extends javax.swing.JPanel {

    /**
     * Creates new form OrganManagement
     */
     JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory; 
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Network network;
    
    public OrganManagement(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise,EcoSystem ecoSystem,Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.organizationDirectory=organizationDirectory;
        this.enterprise=enterprise;
        this.ecoSystem=ecoSystem;
        this.network=network;
        
        initComponents();
        populateJTable();
        populateComboBox();
        match();
        //initcb_dept();
       // txt_patId.setText(""+this.ecoSystem.getPatientId());   
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
        tblOrganworkRequests = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        cmbxfacalities = new javax.swing.JComboBox<>();
        btnProcure = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tblOrganworkRequests.setForeground(new java.awt.Color(153, 51, 0));
        tblOrganworkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "OrgansRequired", "Doctor", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrganworkRequests.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tblOrganworkRequests.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tblOrganworkRequests);

        btnAssign.setBackground(new java.awt.Color(0, 102, 153));
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/assign.png"))); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        cmbxfacalities.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbxfacalities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxfacalitiesActionPerformed(evt);
            }
        });

        btnProcure.setBackground(new java.awt.Color(0, 102, 153));
        btnProcure.setForeground(new java.awt.Color(255, 255, 255));
        btnProcure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/transportation_32px.png"))); // NOI18N
        btnProcure.setText("Procure");
        btnProcure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcureActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Donor Patient", "Donor Doctor", "Organ", "Receiving patient", "Receiving Doctor", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Organ Procurement Requests");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back3.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Organ Matching Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnProcure, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(cmbxfacalities, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcure, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxfacalities, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcureActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblOrganworkRequests.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrganProcureWorkRequest orgwr = (OrganProcureWorkRequest)tblOrganworkRequests.getValueAt(selectedRow, 0);
        if(orgwr.getStatus().equalsIgnoreCase("procurement requested")) {
            orgwr.setStatus("Work Started");
            //order.setAssign(true);
        }
        
        
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already ready Procured");
            return;
        }
        
         populateJTable();
    }//GEN-LAST:event_btnProcureActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        
         if(cmbxfacalities.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a Procurement Team");
            return;
        }
        int selectedRow = tblOrganworkRequests.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select request to assign Procurement", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrganProcureWorkRequest orgwr = (OrganProcureWorkRequest)tblOrganworkRequests.getValueAt(selectedRow, 0);
        
        if(!orgwr.getStatus().equals("Work Started")){
        JOptionPane.showMessageDialog(null,"Request should be procured first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       /* order.setDeliveryMan(jcombodeliveryMan.getSelectedItem().toString());
        order.setOrderStatus("Order Picked up");
        variable= true;
        populateTable();*/
        for(Organization orga  : organizationDirectory.getOrganizationList()) {
           
           if( orga instanceof Facilities){
               //System.out.println(orga.getName()+":"+((Facilities) orga).getCounter());
               if(orga.getName().equalsIgnoreCase(cmbxfacalities.getSelectedItem().toString())){
                   orga.getWorkQueue().getWorkRequestList().add((OrganProcureWorkRequest)tblOrganworkRequests.getValueAt(selectedRow, 0));
                   ((Facilities) orga).setCounter(1);
                   
               }
           }
           
            
        
    }
      orgwr.setStatus("Assigned");
      orgwr.setTeam(cmbxfacalities.getSelectedItem().toString());
      populateJTable();
      populateComboBox();
        
       
    }//GEN-LAST:event_btnAssignActionPerformed

    private void cmbxfacalitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxfacalitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxfacalitiesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void match(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(Network n: ecoSystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(network.getName())) { 
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof OrganBankEnterprise){
                        if(e.getWorkQueue()== null){
                            System.out.println("catched by repears");
                            break;
                        }
                        for(WorkRequest wr: e.getWorkQueue().getWorkRequestList()){
                            if(wr.getStatus().equalsIgnoreCase("procurement requested") ||wr.getStatus().equalsIgnoreCase("work started")|| wr.getStatus().equalsIgnoreCase("Assigned") ||wr.getStatus().equalsIgnoreCase("InProcess")|| wr.getStatus().equalsIgnoreCase("Completed")){
                            if(wr instanceof OrganMatchWorkRequest){  
                            OrganMatchWorkRequest opr = (OrganMatchWorkRequest)wr;
                      
                            Object[] row = new Object[6];
                            row[0] = opr.getDonpatient().getName();
                            row[1] = opr.getDonpatient().getDoctor();
                            row[2] = opr.getOrgan();
                            row[3] = opr.getRecpatient().getName();
                            row[4] = opr.getRecpatient().getDoctor();
                            row[5] = opr.getStatus();
                            model.addRow(row);
                            }
                        }
                    }
                }
            }
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    private void populateJTable() {
       

        DefaultTableModel model = (DefaultTableModel) tblOrganworkRequests.getModel();
         model.setRowCount(0);
         for(Network n: ecoSystem.getNetworkList()){

            if(n.getName().equalsIgnoreCase(network.getName())) { 
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof OrganBankEnterprise){
                    if(e.getWorkQueue()== null){
                        System.out.println("catched by repears");
                      break;
                    }
                    for(WorkRequest wr: e.getWorkQueue().getWorkRequestList()){
                        if(wr.getStatus().equalsIgnoreCase("procurement requested") ||wr.getStatus().equalsIgnoreCase("work started")|| wr.getStatus().equalsIgnoreCase("Assigned") ||wr.getStatus().equalsIgnoreCase("InProcess")||wr.getStatus()==null|| wr.getStatus().equalsIgnoreCase("Completed")){
                            if(wr instanceof OrganProcureWorkRequest){
                            OrganProcureWorkRequest opr = (OrganProcureWorkRequest)wr;
                            String a ="";
                            for( String s: opr.getOrganList()){
                                a= s+";"+a;
                            }
                            Object[] row = new Object[6];
                            row[0] = opr;
                            row[1] = opr.getPatient().getName();
                            row[2] = a;
                            row[3] = opr.getPatient().getDoctor();
                            row[4] = opr.getMessage();
                            row[5] = opr.getStatus();
                            model.addRow(row);
                            }
                        }
                    }
                }
            }
            }
        }
        
               /* row[0] = order;
                row[1] = order.getCustomer().getName();
                row[2] = order.getCustomer().getHomeAddress();
                row[3] = order.getRestaurant().getRestaurantName();
                row[4] = order.getRestaurant().getAddress();
                row[5] = order.getOrderStatus();
                model.addRow(row);*/
        /**
         * DefaultTableModel model = (DefaultTableModel) tblDeliveryMan.getModel();
        model.setRowCount(0);
       // System.out.println("Hi");
        //System.out.println(("siva"+userAccount.getEmployee().getName()));
        for (Order order : business.getOrderDirectory().getOrderDirectory()) {
            
            //System.out.println("sai"+userAccount.getUsername());
            //System.out.println("siva 2");
           // System.out.println(order.getDeliveryMan()+"Rams");
           // System.out.println(userAccount.getUsername()+"kioo");
          
            
            if (order.getDeliveryMan().equals(userAccount.getUsername())) {
               // System.out.println("Vety Imp");
                Object[] row = new Object[6];
                row[0] = order;
                row[1] = order.getCustomer().getName();
                row[2] = order.getCustomer().getHomeAddress();
                row[3] = order.getRestaurant().getRestaurantName();
                row[4] = order.getRestaurant().getAddress();
                row[5] = order.getOrderStatus();
                model.addRow(row);
            }
        }
         */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcure;
    private javax.swing.JComboBox<String> cmbxfacalities;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblOrganworkRequests;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
    }

    private void populateComboBox() {
        
        cmbxfacalities.removeAllItems();
        cmbxfacalities.addItem("--Select--");
        for(Organization orga  : organizationDirectory.getOrganizationList()) {
           
           if( orga instanceof Facilities){
               if(((Facilities) orga).getCounter()==0){
               cmbxfacalities.addItem(orga.getName());}
           }
           
            
        
    }}
}
