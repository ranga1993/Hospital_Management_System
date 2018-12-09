package Hospital;

import java.awt.Color;

public class Hospital extends javax.swing.JFrame {
    public Hospital() {
        initComponents();
        jPanel1.setBackground(new Color(4,175,240,80));
        jPanel2.setBackground(new Color(255,255,255,100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adminButton = new javax.swing.JLabel();
        receptionistButton = new javax.swing.JLabel();
        doctorButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(4, 175, 240));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Hospital Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(490, 10, 680, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login As");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(730, 200, 160, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Office-Customer-Male-Light-icon (1).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 320, 120, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/receptionist-icon (1).png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(760, 320, 120, 140);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/People-Doctor-Male-icon (1).png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(960, 310, 120, 150);

        adminButton.setBackground(new java.awt.Color(255, 255, 255));
        adminButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        adminButton.setForeground(new java.awt.Color(0, 102, 204));
        adminButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminButton.setText("Admin");
        adminButton.setOpaque(true);
        adminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminButtonMouseClicked(evt);
            }
        });
        getContentPane().add(adminButton);
        adminButton.setBounds(590, 480, 100, 40);

        receptionistButton.setBackground(new java.awt.Color(255, 255, 255));
        receptionistButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        receptionistButton.setForeground(new java.awt.Color(0, 102, 204));
        receptionistButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receptionistButton.setText("Receptionist");
        receptionistButton.setOpaque(true);
        receptionistButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionistButtonMouseClicked(evt);
            }
        });
        getContentPane().add(receptionistButton);
        receptionistButton.setBounds(760, 480, 140, 40);

        doctorButton.setBackground(new java.awt.Color(255, 255, 255));
        doctorButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        doctorButton.setForeground(new java.awt.Color(0, 102, 204));
        doctorButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorButton.setText("Doctor");
        doctorButton.setOpaque(true);
        doctorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorButtonMouseClicked(evt);
            }
        });
        getContentPane().add(doctorButton);
        doctorButton.setBounds(960, 480, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/hotel.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        new Login_admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminButtonMouseClicked

    private void receptionistButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionistButtonMouseClicked
        new Login_receptionist().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_receptionistButtonMouseClicked

    private void doctorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorButtonMouseClicked
        new Login_doctor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_doctorButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminButton;
    private javax.swing.JLabel doctorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel receptionistButton;
    // End of variables declaration//GEN-END:variables
}
