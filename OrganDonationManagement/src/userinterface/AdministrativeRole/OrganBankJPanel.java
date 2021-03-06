

package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  saras
 */
public class OrganBankJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Network network;
    /** Creates new form AdminWorkAreaJPanel */
    public OrganBankJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem ecoSystem,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem=ecoSystem;
        this.network=network;
        System.out.println(enterprise.getName().concat("hospital"));
        //this.enterprise.setWorkQueue(new WorkQueue());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_manageUsers = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        btn_manageEmployees = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN DASHBOARD");

        btn_manageUsers.setBackground(new java.awt.Color(0, 102, 153));
        btn_manageUsers.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manageUsers.setForeground(new java.awt.Color(255, 255, 255));
        btn_manageUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageUserAccount1.png"))); // NOI18N
        btn_manageUsers.setText("Manage User Accounts");
        btn_manageUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageUsersActionPerformed(evt);
            }
        });

        manageOrganizationJButton.setBackground(new java.awt.Color(0, 102, 153));
        manageOrganizationJButton.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageOraganisation.png"))); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        btn_manageEmployees.setBackground(new java.awt.Color(0, 102, 153));
        btn_manageEmployees.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manageEmployees.setForeground(new java.awt.Color(255, 255, 255));
        btn_manageEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageEmployees.png"))); // NOI18N
        btn_manageEmployees.setText("Manage Employees");
        btn_manageEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageEmployeesActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        jButton1.setText("View Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MicrosoftTeams-image (4).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_manageUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_manageEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(manageOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel2)))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_manageEmployees, btn_manageUsers, jButton1, manageOrganizationJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(manageOrganizationJButton)
                .addGap(18, 18, 18)
                .addComponent(btn_manageEmployees)
                .addGap(18, 18, 18)
                .addComponent(btn_manageUsers)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_manageEmployees, btn_manageUsers, manageOrganizationJButton});

    }// </editor-fold>//GEN-END:initComponents

    private void btn_manageUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageUsersActionPerformed
        UserManagement em = new UserManagement(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", em);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manageUsersActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        OrganizationManagementJPanel omj = new OrganizationManagementJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("manageOrganizationJPanel", omj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void btn_manageEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageEmployeesActionPerformed
        // TODO add your handling code here:
        EmployeeManagement em = new EmployeeManagement(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,ecoSystem);
        userProcessContainer.add("manageOrganizationJPanel", em);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manageEmployeesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrganManagement pm = new OrganManagement(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,ecoSystem,network);
        userProcessContainer.add("manageOrgan", pm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_manageEmployees;
    private javax.swing.JButton btn_manageUsers;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageOrganizationJButton;
    // End of variables declaration//GEN-END:variables
    
}
