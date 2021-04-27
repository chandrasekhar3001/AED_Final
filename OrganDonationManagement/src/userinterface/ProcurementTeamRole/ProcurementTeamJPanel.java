/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProcurementTeamRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OrganBankEnterprise;
import Business.Network.Network;
import Business.Organization.Facilities;
import Business.Organization.OrganManagement;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrganProcureWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saras
 */
public class ProcurementTeamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcurementTeamJPanel
     */
     JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory; 
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount account;
    Organization organization;
    Network network;
    
    public ProcurementTeamJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
       // this.organizationDirectory=organizationDirectory;
        this.enterprise=enterprise;
        this.ecoSystem=business;
        this.account = account;
        this.organization =organization;
        this.network=network;
        populateTable();
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
        tblworkRequest = new javax.swing.JTable();
        btnInProcess = new javax.swing.JButton();
        btnCompleted = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tblworkRequest.setForeground(new java.awt.Color(153, 51, 0));
        tblworkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Status", "Organs", "Patient", "Doctor"
            }
        ));
        tblworkRequest.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tblworkRequest.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(tblworkRequest);

        btnInProcess.setBackground(new java.awt.Color(0, 102, 153));
        btnInProcess.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnInProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh_24px.png"))); // NOI18N
        btnInProcess.setText("InProcess");
        btnInProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInProcessActionPerformed(evt);
            }
        });

        btnCompleted.setBackground(new java.awt.Color(0, 102, 153));
        btnCompleted.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCompleted.setForeground(new java.awt.Color(255, 255, 255));
        btnCompleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/task_completed_30px.png"))); // NOI18N
        btnCompleted.setText("Completed");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Procurement Team Dashboard");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/procurementteam.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addComponent(btnInProcess)
                        .addGap(43, 43, 43)
                        .addComponent(btnCompleted))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInProcess)
                    .addComponent(btnCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInProcessActionPerformed
        // TODO add your handling code here:
        
        
        
        int selectedRow = tblworkRequest.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select request to Process", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrganProcureWorkRequest orgwr = (OrganProcureWorkRequest)tblworkRequest.getValueAt(selectedRow, 0);
        boolean check;
        check=orgwr.getTeam().equalsIgnoreCase(organization.getName());
                
        if(!check){
            JOptionPane.showMessageDialog(null, "This task is assigned to other team");
            return;
        }
        if(orgwr.getStatus().equals("Assigned")){
        //JOptionPane.showMessageDialog(null,"Request should be procured first", "Warining", JOptionPane.WARNING_MESSAGE);
            //return;
          orgwr.setStatus("InProcess");  
        }
        
        
       /* order.setDeliveryMan(jcombodeliveryMan.getSelectedItem().toString());
        order.setOrderStatus("Order Picked up");
        variable= true;
        populateTable();*/
       /* for(Organization orga  : organizationDirectory.getOrganizationList()) {
           
           if( orga instanceof Facilities){
               //System.out.println(orga.getName()+":"+((Facilities) orga).getCounter());
               if(orga.getName().equalsIgnoreCase(cmbxfacalities.getSelectedItem().toString())){
                   orga.getWorkQueue().getWorkRequestList().add((OrganProcureWorkRequest)tblOrganworkRequests.getValueAt(selectedRow, 0));
                   ((Facilities) orga).setCounter(1);
                   
               }
           }
           
            
        
    }*/
      
     populateTable();
      //populateComboBox();
        
    }//GEN-LAST:event_btnInProcessActionPerformed

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblworkRequest.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Select request to Complete", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrganProcureWorkRequest orgwr = (OrganProcureWorkRequest)tblworkRequest.getValueAt(selectedRow, 0);
        if(!orgwr.getStatus().equals("InProcess")){
        JOptionPane.showMessageDialog(null,"Request should be InProcess", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
         // orgwr.setStatus("InProcess");  
        }
        
       /* order.setDeliveryMan(jcombodeliveryMan.getSelectedItem().toString());
        order.setOrderStatus("Order Picked up");
        variable= true;
        populateTable();*/
       
           
           
               //System.out.println(orga.getName()+":"+((Facilities) orga).getCounter());
                   if(organization instanceof Facilities){
                       orgwr.setStatus("Completed");
                  // orga.getWorkQueue().getWorkRequestList().add((OrganProcureWorkRequest)tblOrganworkRequests.getValueAt(selectedRow, 0));
                   ((Facilities) organization).setCounter(0);}
                   
               
           
           
            
        
    
      
     populateTable();  
    }//GEN-LAST:event_btnCompletedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnInProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblworkRequest;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tblworkRequest.getModel();
         model.setRowCount(0);
         for(Network n: ecoSystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(network.getName())){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof OrganBankEnterprise){
                    //ent=e;
                   // ent.getWorkQueue().getWorkRequestList().add(request);
                    //userAccount.getWorkQueue().getWorkRequestList().add(request);
                    if(e.getWorkQueue()== null){
                        System.out.println("catched by repears");
                      break;}
                    for(WorkRequest wr: e.getWorkQueue().getWorkRequestList()){
                        //System.out.println("size"+e.getWorkQueue().getWorkRequestList().size());
                        if( wr.getStatus().equals("Assigned")|| wr.getStatus().equals("InProcess")|| wr.getStatus().equals("Completed")){
                            OrganProcureWorkRequest opr = (OrganProcureWorkRequest)wr;
                            System.out.println("In Ark space ship");
                            String a ="";
                            for( String s: opr.getOrganList()){
                                a= s+":"+a;
                            }
                            Object[] row = new Object[80];
                        row[0]= opr;
                        row[1] = opr.getMessage();
                        
                        row[1] = opr.getStatus();
                        row[2] = a;
                        
                        row[3] = opr.getPatient().getName();
                        row[4] = opr.getPatient().getDoctor();
                        model.addRow(row);
                        //break;
                        }
                      
                     
                    
                    }
                }
            }
            }
        }
    }
}
