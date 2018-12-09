package Hospital;

import com.placeholder.PlaceHolder;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Appointment_Details_doc extends javax.swing.JFrame {
    PlaceHolder p1;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Appointment_Details_doc() {
        initComponents();
        p1 = new PlaceHolder(txtFName, "First Name");
        p1 = new PlaceHolder(txtLName, "Last Name");
        p1 = new PlaceHolder(txtFName_del, "First Name");
        p1 = new PlaceHolder(txtLName_del, "Last Name");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender_buttons = new javax.swing.ButtonGroup();
        honoric_buttons = new javax.swing.ButtonGroup();
        experience_buttons = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        homeButton = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtFName = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();
        AppointmentSearchScrollPane = new javax.swing.JScrollPane();
        AppointmentSearchTable = new javax.swing.JTable();
        AppointmentScrollPane = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        txtLName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logoutButton_del = new javax.swing.JLabel();
        homeButton_del = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        searchButton_del = new javax.swing.JLabel();
        txtFName_del = new javax.swing.JTextField();
        txtLName_del = new javax.swing.JTextField();
        deleteButton = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtAppointmentId_del = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtFirstName_del = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtAge_del = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txtAddress_del = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txtNIC_del = new javax.swing.JTextField();
        txtLastName_del = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtPhone_del = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txtCity_del = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txtDateTime_del = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        radioMale_del = new javax.swing.JRadioButton();
        radioFemale_del = new javax.swing.JRadioButton();
        radioMr_del = new javax.swing.JRadioButton();
        radioMrs_del = new javax.swing.JRadioButton();
        jLabel81 = new javax.swing.JLabel();
        txtBloodGroup_del = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txtAssiDoctor_del = new javax.swing.JTextField();
        radioMiss_del = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 700));
        getContentPane().setLayout(null);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Actions-appointment-new-icon(2).png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 10, 64, 64);

        jPanel7.setBackground(new java.awt.Color(4, 175, 240));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("View Appointmnet");

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 838, Short.MAX_VALUE)
                .addComponent(homeButton)
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(logoutButton))
                .addGap(58, 58, 58))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(homeButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7);
        jPanel7.setBounds(70, 10, 1270, 49);

        jPanel13.setLayout(null);
        jPanel13.add(txtFName);
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
        jPanel13.add(searchButton);
        searchButton.setBounds(491, 11, 93, 41);

        AppointmentSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment Id", "Assigned Doctor", "First Name", "Last Name", "Age", "Gender", "Honoric", "NIC", "Address", "City", "Phone No.", "Date & Time", "Blood Group"
            }
        ));
        AppointmentSearchScrollPane.setViewportView(AppointmentSearchTable);

        jPanel13.add(AppointmentSearchScrollPane);
        AppointmentSearchScrollPane.setBounds(0, 70, 1300, 400);

        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment Id", "Assigned Doctor", "First Name", "Last Name", "Age", "Gender", "Honoric", "NIC", "Address", "City", "Phone No.", "Date & Time", "Blood Group"
            }
        ));
        AppointmentScrollPane.setViewportView(AppointmentTable);

        jPanel13.add(AppointmentScrollPane);
        AppointmentScrollPane.setBounds(20, 70, 1218, 402);
        jPanel13.add(txtLName);
        txtLName.setBounds(299, 16, 155, 35);

        jPanel3.add(jPanel13);
        jPanel13.setBounds(30, 80, 1320, 570);

        jTabbedPane1.addTab("View Appointmnet", jPanel3);

        jPanel4.setLayout(null);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Actions-appointment-new-icon(2).png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 10, 64, 64);

        jPanel8.setBackground(new java.awt.Color(4, 175, 240));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Delete Appointmnet");

        logoutButton_del.setBackground(new java.awt.Color(0, 255, 255));
        logoutButton_del.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logoutButton_del.setForeground(new java.awt.Color(4, 175, 240));
        logoutButton_del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButton_del.setText("Logout");
        logoutButton_del.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        logoutButton_del.setOpaque(true);
        logoutButton_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButton_delMouseClicked(evt);
            }
        });

        homeButton_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Apps-Home-icon.png"))); // NOI18N
        homeButton_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButton_delMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 836, Short.MAX_VALUE)
                .addComponent(homeButton_del)
                .addGap(18, 18, 18)
                .addComponent(logoutButton_del, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(logoutButton_del))
                .addGap(58, 58, 58))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(homeButton_del)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel8);
        jPanel8.setBounds(70, 10, 1270, 49);

        searchButton_del.setBackground(new java.awt.Color(4, 175, 240));
        searchButton_del.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchButton_del.setForeground(new java.awt.Color(255, 255, 255));
        searchButton_del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchButton_del.setText("Search");
        searchButton_del.setOpaque(true);
        searchButton_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButton_delMouseClicked(evt);
            }
        });

        txtFName_del.setToolTipText("");

        deleteButton.setBackground(new java.awt.Color(4, 175, 240));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButton.setText("Delete");
        deleteButton.setOpaque(true);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(searchButton_del, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 645, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton_del, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel19);
        jPanel19.setBounds(100, 70, 1240, 60);

        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 204));
        jLabel25.setText("Appointmnet ID");

        txtAppointmentId_del.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 204));
        jLabel26.setText("Patient's First Name");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 204));
        jLabel27.setText("Age");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 102, 204));
        jLabel61.setText("Honorific");

        jLabel73.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 102, 204));
        jLabel73.setText("Address");

        jLabel74.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 102, 204));
        jLabel74.setText("Patient's Last Name");

        jLabel75.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 102, 204));
        jLabel75.setText("Gender");

        jLabel76.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 102, 204));
        jLabel76.setText("NIC");

        jLabel77.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 102, 204));
        jLabel77.setText("City");

        jLabel78.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 102, 204));
        jLabel78.setText("Phone No.");

        jLabel79.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 102, 204));
        jLabel79.setText("Date & Time");

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/man-user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel80)
                .addGap(60, 60, 60))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gender_buttons.add(radioMale_del);
        radioMale_del.setText("Male");
        radioMale_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMale_delActionPerformed(evt);
            }
        });

        gender_buttons.add(radioFemale_del);
        radioFemale_del.setText("Female");
        radioFemale_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemale_delActionPerformed(evt);
            }
        });

        honoric_buttons.add(radioMr_del);
        radioMr_del.setText("Mr.");
        radioMr_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMr_delActionPerformed(evt);
            }
        });

        honoric_buttons.add(radioMrs_del);
        radioMrs_del.setText("Mrs.");
        radioMrs_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMrs_delActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 102, 204));
        jLabel81.setText("Blood Group");

        jLabel82.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 102, 204));
        jLabel82.setText("Assigned Doctor");

        honoric_buttons.add(radioMiss_del);
        radioMiss_del.setText("Miss.");
        radioMiss_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMiss_delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAppointmentId_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel74))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAssiDoctor_del, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName_del, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNIC_del, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(radioMale_del)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale_del)))
                                .addGap(102, 102, 102)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(297, 297, 297)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPhone_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBloodGroup_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel20Layout.createSequentialGroup()
                                        .addComponent(radioMr_del)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMrs_del)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMiss_del))
                                    .addComponent(txtCity_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress_del, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateTime_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(436, 436, 436))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtAppointmentId_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82)
                            .addComponent(txtAssiDoctor_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel74)
                            .addComponent(txtLastName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel75)
                            .addComponent(radioMale_del)
                            .addComponent(radioFemale_del))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel76)
                            .addComponent(txtNIC_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMr_del)
                            .addComponent(radioMrs_del)
                            .addComponent(radioMiss_del))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(txtAddress_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(txtCity_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78)
                            .addComponent(txtPhone_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(txtBloodGroup_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79)
                            .addComponent(txtDateTime_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel20);
        jPanel20.setBounds(70, 140, 1250, 440);

        jTabbedPane1.addTab("Delete Appointmnet", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1370, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        new Login_doctor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        new Doctor_Portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void logoutButton_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButton_delMouseClicked
        new Login_doctor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButton_delMouseClicked

    private void homeButton_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButton_delMouseClicked
        new Doctor_Portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButton_delMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        conn = DB_connection.connect();
        String query = "select * from appointment where patient_firstName = ? and patient_lastName = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtFName.getText());
            pst.setString(2, txtLName.getText());
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)AppointmentSearchTable.getModel();
            tm.setRowCount(0);

            while(rs.next()){
                Object obj[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13)};
                tm.addRow(obj);
            }

            AppointmentScrollPane.setVisible(false);
            AppointmentSearchScrollPane.setVisible(true);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        conn = DB_connection.connect();
        String query = "select * from appointment";
        try{
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)AppointmentTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object obj[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13)};
                tm.addRow(obj);
            }
            AppointmentSearchScrollPane.setVisible(false);
            AppointmentScrollPane.setVisible(true);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void searchButton_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton_delMouseClicked
        conn = DB_connection.connect();
        String query = "select * from appointment where patient_firstName = ? and patient_lastName = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtFName_del.getText());
            pst.setString(2, txtLName_del.getText());
            rs = pst.executeQuery();

            while(rs.next()){
                txtAppointmentId_del.setText(rs.getString("appointment_id"));
                txtAssiDoctor_del.setText(rs.getString("assigned_doctor"));
                txtFirstName_del.setText(rs.getString("patient_firstName"));
                txtLastName_del.setText(rs.getString("patient_lastName"));
                txtAge_del.setText(rs.getString("age"));
                gender = rs.getString("gender");
                if(gender.equals("Male")){
                    radioMale_del.setSelected(true);
                }
                else{
                    radioFemale_del.setSelected(true);
                }
                honoric = rs.getString("honoric");
                if(honoric.equals("Mr")){
                    radioMr_del.setSelected(true);
                }
                else if(honoric.equals("Mrs")){
                    radioMrs_del.setSelected(true);
                }
                else{
                    radioMiss_del.setSelected(true);
                }
                txtNIC_del.setText(rs.getString("nic"));
                txtAddress_del.setText(rs.getString("address"));
                txtCity_del.setText(rs.getString("city"));
                txtPhone_del.setText(rs.getString("phone"));
                txtDateTime_del.setText(rs.getString("date_time"));
                txtBloodGroup_del.setText(rs.getString("blood_group"));
            }

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_searchButton_delMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        conn = DB_connection.connect();
        String query = "delete from appointment where appointment_id = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtAppointmentId_del.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Appointment is successfully deleted from the system!");
            clearDeleteForm();

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void radioMale_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMale_delActionPerformed
        gender = "Male";
    }//GEN-LAST:event_radioMale_delActionPerformed

    private void radioFemale_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemale_delActionPerformed
        gender = "Female";
    }//GEN-LAST:event_radioFemale_delActionPerformed

    private void radioMr_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMr_delActionPerformed
        honoric = "Mr";
    }//GEN-LAST:event_radioMr_delActionPerformed

    private void radioMrs_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMrs_delActionPerformed
        honoric = "Mrs";
    }//GEN-LAST:event_radioMrs_delActionPerformed

    private void radioMiss_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMiss_delActionPerformed
        honoric = "Miss";
    }//GEN-LAST:event_radioMiss_delActionPerformed

    private void clearDeleteForm(){
        txtFName_del.setText(null);
        txtLName_del.setText(null);
        txtAppointmentId_del.setText(null);
        txtAssiDoctor_del.setText(null);
        txtFirstName_del.setText(null);
        txtLastName_del.setText(null);
        txtAge_del.setText(null);
        gender_buttons.clearSelection();
        honoric_buttons.clearSelection();
        txtNIC_del.setText(null);
        txtAddress_del.setText(null);
        txtCity_del.setText(null);
        txtPhone_del.setText(null);
        txtDateTime_del.setText(null);
        txtBloodGroup_del.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(Appointment_Details_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details_doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_Details_doc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AppointmentScrollPane;
    private javax.swing.JScrollPane AppointmentSearchScrollPane;
    private javax.swing.JTable AppointmentSearchTable;
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JLabel deleteButton;
    private javax.swing.ButtonGroup experience_buttons;
    private javax.swing.ButtonGroup gender_buttons;
    private javax.swing.JLabel homeButton;
    private javax.swing.JLabel homeButton_del;
    private javax.swing.ButtonGroup honoric_buttons;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel logoutButton_del;
    private javax.swing.JRadioButton radioFemale_del;
    private javax.swing.JRadioButton radioMale_del;
    private javax.swing.JRadioButton radioMiss_del;
    private javax.swing.JRadioButton radioMr_del;
    private javax.swing.JRadioButton radioMrs_del;
    private javax.swing.JLabel searchButton;
    private javax.swing.JLabel searchButton_del;
    private javax.swing.JTextField txtAddress_del;
    private javax.swing.JTextField txtAge_del;
    private javax.swing.JTextField txtAppointmentId_del;
    private javax.swing.JTextField txtAssiDoctor_del;
    private javax.swing.JTextField txtBloodGroup_del;
    private javax.swing.JTextField txtCity_del;
    private javax.swing.JTextField txtDateTime_del;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFName_del;
    private javax.swing.JTextField txtFirstName_del;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtLName_del;
    private javax.swing.JTextField txtLastName_del;
    private javax.swing.JTextField txtNIC_del;
    private javax.swing.JTextField txtPhone_del;
    // End of variables declaration//GEN-END:variables

    private String gender;
    private String honoric;
}
