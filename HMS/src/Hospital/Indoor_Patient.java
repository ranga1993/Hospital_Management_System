package Hospital;

import com.placeholder.PlaceHolder;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Indoor_Patient extends javax.swing.JFrame {
    PlaceHolder p1;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Indoor_Patient() {
        initComponents();
        p1 = new PlaceHolder(txtFName, "First Name");
        p1 = new PlaceHolder(txtLName, "Last Name");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        homeButton = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtFName = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();
        patientSearchScrollPane = new javax.swing.JScrollPane();
        patientSearchTable = new javax.swing.JTable();
        patientScrollPane = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        txtLName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 700));
        setPreferredSize(new java.awt.Dimension(1370, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/support(2).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 64, 64);

        jPanel3.setBackground(new java.awt.Color(4, 175, 240));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Indoor Patient Details");

        logoutButton.setBackground(new java.awt.Color(0, 255, 255));
        logoutButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(4, 175, 240));
        logoutButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        logoutButton.setOpaque(true);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Apps-Home-icon.png"))); // NOI18N
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 806, Short.MAX_VALUE)
                .addComponent(homeButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logoutButton))
                .addGap(58, 58, 58))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(homeButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(70, 10, 1270, 49);

        jPanel11.setLayout(null);
        jPanel11.add(txtFName);
        txtFName.setBounds(126, 16, 155, 35);

        searchButton.setBackground(new java.awt.Color(4, 175, 240));
        searchButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchButton.setText("Search");
        searchButton.setOpaque(true);
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        jPanel11.add(searchButton);
        searchButton.setBounds(491, 11, 93, 41);

        patientSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "First Name", "Last Name", "Age", "Gender", "Maritial Status", "Date", "Address", "City", "Phone No.", "Blood Group", "Ward No.", "Bed No."
            }
        ));
        patientSearchScrollPane.setViewportView(patientSearchTable);

        jPanel11.add(patientSearchScrollPane);
        patientSearchScrollPane.setBounds(20, 70, 1220, 400);

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "First Name", "Last Name", "Age", "Gender", "Maritial Status", "Date", "Address", "City", "Phone No.", "Blood Group", "Ward No.", "Bed No."
            }
        ));
        patientScrollPane.setViewportView(patientTable);

        jPanel11.add(patientScrollPane);
        patientScrollPane.setBounds(20, 70, 1218, 402);
        jPanel11.add(txtLName);
        txtLName.setBounds(299, 16, 155, 35);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(80, 80, 1260, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        new Admin_Portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        conn = DB_connection.connect();
        String query = "select * from patient where firstName = ? and lastName = ? and type = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtFName.getText());
            pst.setString(2, txtLName.getText());
            pst.setString(3, "Indoor");
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)patientSearchTable.getModel();
            tm.setRowCount(0);

            while(rs.next()){
                Object obj[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13)};
                tm.addRow(obj);
            }

            patientScrollPane.setVisible(false);
            patientSearchScrollPane.setVisible(true);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = DB_connection.connect();
        String query = "select * from patient where type = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, "Indoor");
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)patientTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object obj[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13)};
                tm.addRow(obj);
            }
            patientSearchScrollPane.setVisible(false);
            patientScrollPane.setVisible(true);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Indoor_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Indoor_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Indoor_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Indoor_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Indoor_Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JScrollPane patientScrollPane;
    private javax.swing.JScrollPane patientSearchScrollPane;
    private javax.swing.JTable patientSearchTable;
    private javax.swing.JTable patientTable;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    // End of variables declaration//GEN-END:variables
}
