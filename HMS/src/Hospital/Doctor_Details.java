package Hospital;

import com.placeholder.PlaceHolder;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Doctor_Details extends javax.swing.JFrame {
    PlaceHolder p1;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Doctor_Details() {
        initComponents();
        p1 = new PlaceHolder(txtDoctorId_search, "Enter Doctor ID");
        p1 = new PlaceHolder(txtFName, "First Name");
        p1 = new PlaceHolder(txtLName, "Last Name");
        p1 = new PlaceHolder(txtFName_del, "First Name");
        p1 = new PlaceHolder(txtLName_del, "Last Name");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender_buttons = new javax.swing.ButtonGroup();
        maritial_buttons = new javax.swing.ButtonGroup();
        experience_buttons = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton_add = new javax.swing.JLabel();
        homeButton_add = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtJoinDate = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtLeavingDate = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        saveButton = new javax.swing.JLabel();
        clearButton_add = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioMarried = new javax.swing.JRadioButton();
        radioUnmarried = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logoutButton_up = new javax.swing.JLabel();
        homeButton_up = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtDoctorId_search = new javax.swing.JTextField();
        searchButton_up = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtDoctorId_up = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtFirstName_up = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtAge_up = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtAddress_up = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtNIC_up = new javax.swing.JTextField();
        txtLastName_up = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtPhone_up = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtCity_up = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtJoinDate_up = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtLeavingDate_up = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        updateButton = new javax.swing.JLabel();
        clearButton_up = new javax.swing.JLabel();
        radioMale_up = new javax.swing.JRadioButton();
        radioFemale_up = new javax.swing.JRadioButton();
        radioMarried_up = new javax.swing.JRadioButton();
        radioUnmarried_up = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        txtBloodGroup_up = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtUsername_up = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtPassword_up = new javax.swing.JTextField();
        txtSpecialization_up = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtRegNo_up = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logoutButton_view = new javax.swing.JLabel();
        homeButton_view = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtFName = new javax.swing.JTextField();
        searchButton = new javax.swing.JLabel();
        DoctorSearchScrollPane = new javax.swing.JScrollPane();
        DoctorSearchTable = new javax.swing.JTable();
        DoctorScrollPane = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
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
        jPanel15 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        txtDoctorId_del = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtFirstName_del = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtAge_del = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtAddress_del = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtNIC_del = new javax.swing.JTextField();
        txtLastName_del = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtPhone_del = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtCity_del = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtJoinDate_del = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtLeavingDate_del = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        radioMale_del = new javax.swing.JRadioButton();
        radioFemale_del = new javax.swing.JRadioButton();
        radioMarried_del = new javax.swing.JRadioButton();
        radioUnmarried_del = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        txtBloodGroup_del = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtUsername_del = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtPassword_del = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtRegNo_del = new javax.swing.JTextField();
        txtSpecialization_del = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 700));
        getContentPane().setLayout(null);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/People-Doctor-Male-icon(2).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 64, 64);

        jPanel5.setBackground(new java.awt.Color(4, 175, 240));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Doctor");

        logoutButton_add.setBackground(new java.awt.Color(0, 255, 255));
        logoutButton_add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logoutButton_add.setForeground(new java.awt.Color(4, 175, 240));
        logoutButton_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButton_add.setText("Logout");
        logoutButton_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        logoutButton_add.setOpaque(true);
        logoutButton_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButton_addMouseClicked(evt);
            }
        });

        homeButton_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Apps-Home-icon.png"))); // NOI18N
        homeButton_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButton_addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 860, Short.MAX_VALUE)
                .addComponent(homeButton_add)
                .addGap(18, 18, 18)
                .addComponent(logoutButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logoutButton_add))
                .addGap(58, 58, 58))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(homeButton_add)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(70, 10, 1270, 49);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Doctor ID");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("First Name");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("Age");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Maritial Status");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Address");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("Last Name");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 204));
        jLabel15.setText("Gender");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 204));
        jLabel16.setText("NIC");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 204));
        jLabel17.setText("City");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 204));
        jLabel18.setText("Phone No.");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setText("Specialization");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 204));
        jLabel21.setText("Join Date");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 204));
        jLabel22.setText("Leaving Date");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/man-user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(60, 60, 60))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveButton.setBackground(new java.awt.Color(4, 175, 240));
        saveButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveButton.setText("Save");
        saveButton.setOpaque(true);
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        clearButton_add.setBackground(new java.awt.Color(0, 204, 102));
        clearButton_add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clearButton_add.setForeground(new java.awt.Color(255, 255, 255));
        clearButton_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearButton_add.setText("Clear");
        clearButton_add.setOpaque(true);
        clearButton_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButton_addMouseClicked(evt);
            }
        });

        gender_buttons.add(radioMale);
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        gender_buttons.add(radioFemale);
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        maritial_buttons.add(radioMarried);
        radioMarried.setText("Married");
        radioMarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarriedActionPerformed(evt);
            }
        });

        maritial_buttons.add(radioUnmarried);
        radioUnmarried.setText("Unmarried");
        radioUnmarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUnmarriedActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 102, 204));
        jLabel54.setText("Blood Group");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 204));
        jLabel20.setText("Username");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 204));
        jLabel24.setText("Password");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 102, 204));
        jLabel60.setText("Med. Reg. No.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLeavingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(clearButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(radioMarried)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioUnmarried))
                                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(radioMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel60)
                                .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(radioMale)
                            .addComponent(radioFemale))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMarried)
                            .addComponent(radioUnmarried))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel54)
                            .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(txtLeavingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(80, 90, 1250, 520);

        jTabbedPane1.addTab("Add Doctor", jPanel1);

        jPanel2.setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/People-Doctor-Male-icon(2).png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 10, 64, 64);

        jPanel6.setBackground(new java.awt.Color(4, 175, 240));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Doctor");

        logoutButton_up.setBackground(new java.awt.Color(0, 255, 255));
        logoutButton_up.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logoutButton_up.setForeground(new java.awt.Color(4, 175, 240));
        logoutButton_up.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButton_up.setText("Logout");
        logoutButton_up.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        logoutButton_up.setOpaque(true);
        logoutButton_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButton_upMouseClicked(evt);
            }
        });

        homeButton_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Apps-Home-icon.png"))); // NOI18N
        homeButton_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButton_upMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 894, Short.MAX_VALUE)
                .addComponent(homeButton_up)
                .addGap(18, 18, 18)
                .addComponent(logoutButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(logoutButton_up))
                .addGap(58, 58, 58))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(homeButton_up)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(70, 10, 1270, 49);

        searchButton_up.setBackground(new java.awt.Color(4, 175, 240));
        searchButton_up.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchButton_up.setForeground(new java.awt.Color(255, 255, 255));
        searchButton_up.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchButton_up.setText("Search");
        searchButton_up.setOpaque(true);
        searchButton_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButton_upMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDoctorId_search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(searchButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorId_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel14);
        jPanel14.setBounds(100, 70, 530, 60);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 204));
        jLabel25.setText("Doctor ID");

        txtDoctorId_up.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 204));
        jLabel26.setText("First Name");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 204));
        jLabel27.setText("Age");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 204));
        jLabel28.setText("Maritial Status");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 204));
        jLabel29.setText("Address");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 204));
        jLabel30.setText("Last Name");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 204));
        jLabel31.setText("Gender");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 102, 204));
        jLabel32.setText("NIC");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 204));
        jLabel33.setText("City");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 102, 204));
        jLabel34.setText("Phone No.");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 102, 204));
        jLabel35.setText("Specialization");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 102, 204));
        jLabel36.setText("Join Date");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 204));
        jLabel37.setText("Leaving Date");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/man-user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(60, 60, 60))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateButton.setBackground(new java.awt.Color(4, 175, 240));
        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateButton.setText("Update");
        updateButton.setOpaque(true);
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        clearButton_up.setBackground(new java.awt.Color(0, 204, 102));
        clearButton_up.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clearButton_up.setForeground(new java.awt.Color(255, 255, 255));
        clearButton_up.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearButton_up.setText("Clear");
        clearButton_up.setOpaque(true);
        clearButton_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButton_upMouseClicked(evt);
            }
        });

        gender_buttons.add(radioMale_up);
        radioMale_up.setText("Male");
        radioMale_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMale_upActionPerformed(evt);
            }
        });

        gender_buttons.add(radioFemale_up);
        radioFemale_up.setText("Female");
        radioFemale_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemale_upActionPerformed(evt);
            }
        });

        maritial_buttons.add(radioMarried_up);
        radioMarried_up.setText("Married");
        radioMarried_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarried_upActionPerformed(evt);
            }
        });

        maritial_buttons.add(radioUnmarried_up);
        radioUnmarried_up.setText("Unmarried");
        radioUnmarried_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUnmarried_upActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 102, 204));
        jLabel55.setText("Blood Group");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 102, 204));
        jLabel39.setText("Username");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 102, 204));
        jLabel40.setText("Password");

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 102, 204));
        jLabel61.setText("Med. Reg. No.");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSpecialization_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCity_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtJoinDate_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPhone_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBloodGroup_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsername_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPassword_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLeavingDate_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(clearButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress_up))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(radioMarried_up)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioUnmarried_up))
                                    .addComponent(txtDoctorId_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegNo_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIC_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(radioMale_up)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale_up)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDoctorId_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel61)
                                .addComponent(txtRegNo_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel30)
                            .addComponent(txtLastName_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel31)
                            .addComponent(radioMale_up)
                            .addComponent(radioFemale_up))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel32)
                            .addComponent(txtNIC_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMarried_up)
                            .addComponent(radioUnmarried_up))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtAddress_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtCity_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(txtPhone_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel55)
                            .addComponent(txtBloodGroup_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpecialization_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJoinDate_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(txtLeavingDate_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(txtUsername_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txtPassword_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(80, 140, 1250, 480);

        jTabbedPane1.addTab("Update Doctor", jPanel2);

        jPanel3.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/People-Doctor-Male-icon(2).png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 10, 64, 64);

        jPanel7.setBackground(new java.awt.Color(4, 175, 240));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("View Receptionist");

        logoutButton_view.setBackground(new java.awt.Color(0, 255, 255));
        logoutButton_view.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        logoutButton_view.setForeground(new java.awt.Color(4, 175, 240));
        logoutButton_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutButton_view.setText("Logout");
        logoutButton_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        logoutButton_view.setOpaque(true);
        logoutButton_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButton_viewMouseClicked(evt);
            }
        });

        homeButton_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Apps-Home-icon.png"))); // NOI18N
        homeButton_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButton_viewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 860, Short.MAX_VALUE)
                .addComponent(homeButton_view)
                .addGap(18, 18, 18)
                .addComponent(logoutButton_view, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(logoutButton_view))
                .addGap(58, 58, 58))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(homeButton_view)
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

        DoctorSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor Id", "Med. Reg. No.", "First Name", "Last Name", "Age", "Gender", "Maritial Status", "NIC", "Address", "City", "Phone No.", "Specialization", "Blood Group", "Join Date", "Leaving Date", "Username", "Password"
            }
        ));
        DoctorSearchScrollPane.setViewportView(DoctorSearchTable);

        jPanel13.add(DoctorSearchScrollPane);
        DoctorSearchScrollPane.setBounds(0, 70, 1300, 400);

        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor Id", "Med. Reg. No.", "First Name", "Last Name", "Age", "Gender", "Maritial Status", "NIC", "Address", "City", "Phone No.", "Experience", "Blood Group", "Join Date", "Leaving Date", "Username", "Password"
            }
        ));
        DoctorScrollPane.setViewportView(DoctorTable);

        jPanel13.add(DoctorScrollPane);
        DoctorScrollPane.setBounds(20, 70, 1218, 402);
        jPanel13.add(txtLName);
        txtLName.setBounds(299, 16, 155, 35);

        jPanel3.add(jPanel13);
        jPanel13.setBounds(30, 80, 1320, 570);

        jTabbedPane1.addTab("View Doctor", jPanel3);

        jPanel4.setLayout(null);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/People-Doctor-Male-icon(2).png"))); // NOI18N
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 10, 64, 64);

        jPanel8.setBackground(new java.awt.Color(4, 175, 240));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Delete Receptionist");

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

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 102, 204));
        jLabel41.setText("Doctor ID");

        txtDoctorId_del.setEnabled(false);

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 102, 204));
        jLabel42.setText("First Name");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 102, 204));
        jLabel43.setText("Age");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 102, 204));
        jLabel44.setText("Maritial Status");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 102, 204));
        jLabel45.setText("Address");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 102, 204));
        jLabel46.setText("Last Name");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 102, 204));
        jLabel47.setText("Gender");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 102, 204));
        jLabel48.setText("NIC");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 102, 204));
        jLabel49.setText("City");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 102, 204));
        jLabel50.setText("Phone No.");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 102, 204));
        jLabel51.setText("Specialization");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 102, 204));
        jLabel52.setText("Join Date");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 102, 204));
        jLabel53.setText("Leaving Date");

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/man-user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addGap(60, 60, 60))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        maritial_buttons.add(radioMarried_del);
        radioMarried_del.setText("Married");
        radioMarried_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarried_delActionPerformed(evt);
            }
        });

        maritial_buttons.add(radioUnmarried_del);
        radioUnmarried_del.setText("Unmarried");
        radioUnmarried_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUnmarried_delActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 102, 204));
        jLabel57.setText("Blood Group");

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 102, 204));
        jLabel58.setText("Username");

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 102, 204));
        jLabel59.setText("Password");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 102, 204));
        jLabel62.setText("Med. Reg. No.");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSpecialization_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCity_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtJoinDate_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPhone_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBloodGroup_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsername_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPassword_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLeavingDate_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress_del))
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(radioMarried_del)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioUnmarried_del))
                                    .addComponent(txtDoctorId_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegNo_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIC_del, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(radioMale_del)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale_del)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDoctorId_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel62)
                                .addComponent(txtRegNo_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel46)
                            .addComponent(txtLastName_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel47)
                            .addComponent(radioMale_del)
                            .addComponent(radioFemale_del))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel48)
                            .addComponent(txtNIC_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMarried_del)
                            .addComponent(radioUnmarried_del))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(txtAddress_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(txtCity_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50)
                            .addComponent(txtPhone_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel57)
                            .addComponent(txtBloodGroup_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpecialization_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJoinDate_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(txtLeavingDate_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(txtUsername_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(txtPassword_del, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel15);
        jPanel15.setBounds(80, 140, 1250, 480);

        jTabbedPane1.addTab("Delete Doctor", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1370, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButton_addMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButton_addMouseClicked

    private void homeButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButton_addMouseClicked
        new Admin_Portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButton_addMouseClicked

    private void logoutButton_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButton_upMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButton_upMouseClicked

    private void homeButton_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButton_upMouseClicked
        new Admin_Portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButton_upMouseClicked

    private void logoutButton_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButton_viewMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButton_viewMouseClicked

    private void homeButton_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButton_viewMouseClicked
        new Admin_Portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButton_viewMouseClicked

    private void logoutButton_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButton_delMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButton_delMouseClicked

    private void homeButton_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButton_delMouseClicked
        new Admin_Portal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButton_delMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        conn = DB_connection.connect();
        String query = "insert into doctor " + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtDoctorId.getText());
            pst.setString(2, txtRegNo.getText());
            pst.setString(3, txtFirstName.getText());
            pst.setString(4, txtLastName.getText());
            pst.setString(5, txtAge.getText());
            pst.setString(6, gender);
            pst.setString(7, maritial);
            pst.setString(8, txtNIC.getText());
            pst.setString(9, txtAddress.getText());
            pst.setString(10, txtCity.getText());
            pst.setString(11, txtPhone.getText());
            pst.setString(12, txtSpecialization.getText());
            pst.setString(13, txtBloodGroup.getText());
            pst.setString(14, txtJoinDate.getText());
            pst.setString(15, txtLeavingDate.getText());
            pst.setString(16, txtUsername.getText());
            pst.setString(17, txtPassword.getText());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Data Successfully Added!");

            clearInsertForm();

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void clearButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton_addMouseClicked
        clearInsertForm();
    }//GEN-LAST:event_clearButton_addMouseClicked

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        gender = "Male";
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        gender = "Female";
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarriedActionPerformed
        maritial = "Married";
    }//GEN-LAST:event_radioMarriedActionPerformed

    private void radioUnmarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUnmarriedActionPerformed
        maritial = "Unmarried";
    }//GEN-LAST:event_radioUnmarriedActionPerformed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        conn = DB_connection.connect();
        String query = "update doctor set med_reg_no = ?, firstName = ?, lastName = ?, age = ?, gender = ?, maritial_status = ?, nic = ?, address = ?, city = ?, phone = ?, specialization = ?, blood_group = ?, join_date = ?, leaving_date = ?, username = ?, password = ? where doctor_id = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtRegNo_up.getText());
            pst.setString(2, txtFirstName_up.getText());
            pst.setString(3, txtLastName_up.getText());
            pst.setString(4, txtAge_up.getText());
            pst.setString(5, gender);
            pst.setString(6, maritial);
            pst.setString(7, txtNIC_up.getText());
            pst.setString(8, txtAddress_up.getText());
            pst.setString(9, txtCity_up.getText());
            pst.setString(10, txtPhone_up.getText());
            pst.setString(11, txtSpecialization_up.getText());
            pst.setString(12, txtBloodGroup_up.getText());
            pst.setString(13, txtJoinDate_up.getText());
            pst.setString(14, txtLeavingDate_up.getText());
            pst.setString(15, txtUsername_up.getText());
            pst.setString(16, txtPassword_up.getText());
            pst.setString(17, txtDoctorId_up.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Successfully Updated!");

            clearUpdateForm();
            
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void clearButton_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton_upMouseClicked
        clearUpdateForm();
    }//GEN-LAST:event_clearButton_upMouseClicked

    private void radioMale_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMale_upActionPerformed
        gender = "Male";
    }//GEN-LAST:event_radioMale_upActionPerformed

    private void radioFemale_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemale_upActionPerformed
        gender = "Female";
    }//GEN-LAST:event_radioFemale_upActionPerformed

    private void radioMarried_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarried_upActionPerformed
        maritial = "Married";
    }//GEN-LAST:event_radioMarried_upActionPerformed

    private void radioUnmarried_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUnmarried_upActionPerformed
        maritial = "Unmarried";
    }//GEN-LAST:event_radioUnmarried_upActionPerformed

    private void searchButton_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton_upMouseClicked
        conn = DB_connection.connect();
        String query = "select * from doctor where doctor_id = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtDoctorId_search.getText());
            rs = pst.executeQuery();
            
            while(rs.next()){
                txtDoctorId_up.setText(rs.getString("doctor_id"));
                txtRegNo_up.setText(rs.getString("med_reg_no"));
                txtFirstName_up.setText(rs.getString("firstName"));
                txtLastName_up.setText(rs.getString("lastName"));
                txtAge_up.setText(rs.getString("age"));
                gender = rs.getString("gender");
                if(gender.equals("Male")){
                    radioMale_up.setSelected(true);
                }
                else{
                    radioFemale_up.setSelected(true);
                }
                maritial = rs.getString("maritial_status");
                if(maritial.equals("Married")){
                    radioMarried_up.setSelected(true);
                }
                else{
                    radioUnmarried_up.setSelected(true);
                }
                txtNIC_up.setText(rs.getString("nic"));
                txtAddress_up.setText(rs.getString("address"));
                txtCity_up.setText(rs.getString("city"));
                txtPhone_up.setText(rs.getString("phone"));
                txtSpecialization_up.setText(rs.getString("specialization"));
                txtBloodGroup_up.setText(rs.getString("blood_group"));
                txtJoinDate_up.setText(rs.getString("join_date"));
                txtLeavingDate_up.setText(rs.getString("leaving_date"));
                txtUsername_up.setText(rs.getString("username"));
                txtPassword_up.setText(rs.getString("password"));
            }
            
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_searchButton_upMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        conn = DB_connection.connect();
        String query = "select * from doctor where firstName = ? and lastName = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtFName.getText());
            pst.setString(2, txtLName.getText());
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)DoctorSearchTable.getModel();
            tm.setRowCount(0);

            while(rs.next()){
                Object obj[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17)};
                tm.addRow(obj);
            }

            DoctorScrollPane.setVisible(false);
            DoctorSearchScrollPane.setVisible(true);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        conn = DB_connection.connect();
        String query = "select * from doctor";
        try{
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)DoctorTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object obj[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17)};
                tm.addRow(obj);
            }
            DoctorSearchScrollPane.setVisible(false);
            DoctorScrollPane.setVisible(true);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void searchButton_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton_delMouseClicked
        conn = DB_connection.connect();
        String query = "select * from doctor where firstName = ? and lastName = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtFName_del.getText());
            pst.setString(2, txtLName_del.getText());
            rs = pst.executeQuery();

            while(rs.next()){
                txtDoctorId_del.setText(rs.getString("doctor_id"));
                txtRegNo_del.setText(rs.getString("med_reg_no"));
                txtFirstName_del.setText(rs.getString("firstName"));
                txtLastName_del.setText(rs.getString("lastName"));
                txtAge_del.setText(rs.getString("age"));
                gender = rs.getString("gender");
                if(gender.equals("Male")){
                    radioMale_del.setSelected(true);
                }
                else{
                    radioFemale_del.setSelected(true);
                }
                maritial = rs.getString("maritial_status");
                if(maritial.equals("Married")){
                    radioMarried_del.setSelected(true);
                }
                else{
                    radioUnmarried_del.setSelected(true);
                }
                txtNIC_del.setText(rs.getString("nic"));
                txtAddress_del.setText(rs.getString("address"));
                txtCity_del.setText(rs.getString("city"));
                txtPhone_del.setText(rs.getString("phone"));
                txtSpecialization_del.setText(rs.getString("specialization"));
                txtBloodGroup_del.setText(rs.getString("blood_group"));
                txtJoinDate_del.setText(rs.getString("join_date"));
                txtLeavingDate_del.setText(rs.getString("leaving_date"));
                txtUsername_del.setText(rs.getString("username"));
                txtPassword_del.setText(rs.getString("password"));
            }

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_searchButton_delMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        conn = DB_connection.connect();
        String query = "delete from doctor where doctor_id = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtDoctorId_del.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Doctor is successfully deleted from the system!");
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

    private void radioMarried_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarried_delActionPerformed
        maritial = "Married";
    }//GEN-LAST:event_radioMarried_delActionPerformed

    private void radioUnmarried_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUnmarried_delActionPerformed
        maritial = "Unmarried";
    }//GEN-LAST:event_radioUnmarried_delActionPerformed

    private void clearInsertForm(){
        txtDoctorId.setText(null);
        txtRegNo.setText(null);
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtAge.setText(null);
        gender_buttons.clearSelection();
        maritial_buttons.clearSelection();
        txtNIC.setText(null);
        txtAddress.setText(null);
        txtCity.setText(null);
        txtPhone.setText(null);
        txtSpecialization.setText(null);
        txtBloodGroup.setText(null);
        txtJoinDate.setText(null);
        txtLeavingDate.setText(null);
        txtUsername.setText(null);
        txtPassword.setText(null);
    }
    
    private void clearUpdateForm(){
        txtDoctorId_search.setText(null);
        txtDoctorId_up.setText(null);
        txtRegNo_up.setText(null);
        txtFirstName_up.setText(null);
        txtLastName_up.setText(null);
        txtAge_up.setText(null);
        gender_buttons.clearSelection();
        maritial_buttons.clearSelection();
        txtNIC_up.setText(null);
        txtAddress_up.setText(null);
        txtCity_up.setText(null);
        txtPhone_up.setText(null);
        txtSpecialization_up.setText(null);
        txtBloodGroup_up.setText(null);
        txtJoinDate_up.setText(null);
        txtLeavingDate_up.setText(null);
        txtUsername_up.setText(null);
        txtPassword_up.setText(null);
    }
    
    private void clearDeleteForm(){
        txtFName_del.setText(null);
        txtLName_del.setText(null);
        txtDoctorId_del.setText(null);
        txtFirstName_del.setText(null);
        txtLastName_del.setText(null);
        txtAge_del.setText(null);
        gender_buttons.clearSelection();
        maritial_buttons.clearSelection();
        txtNIC_del.setText(null);
        txtAddress_del.setText(null);
        txtCity_del.setText(null);
        txtPhone_del.setText(null);
        experience_buttons.clearSelection();
        txtBloodGroup_del.setText(null);
        txtJoinDate_del.setText(null);
        txtLeavingDate_del.setText(null);
        txtUsername_del.setText(null);
        txtPassword_del.setText(null);
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
            java.util.logging.Logger.getLogger(Doctor_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JScrollPane DoctorSearchScrollPane;
    private javax.swing.JTable DoctorSearchTable;
    private javax.swing.JTable DoctorTable;
    private javax.swing.JLabel clearButton_add;
    private javax.swing.JLabel clearButton_up;
    private javax.swing.JLabel deleteButton;
    private javax.swing.ButtonGroup experience_buttons;
    private javax.swing.ButtonGroup gender_buttons;
    private javax.swing.JLabel homeButton_add;
    private javax.swing.JLabel homeButton_del;
    private javax.swing.JLabel homeButton_up;
    private javax.swing.JLabel homeButton_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logoutButton_add;
    private javax.swing.JLabel logoutButton_del;
    private javax.swing.JLabel logoutButton_up;
    private javax.swing.JLabel logoutButton_view;
    private javax.swing.ButtonGroup maritial_buttons;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioFemale_del;
    private javax.swing.JRadioButton radioFemale_up;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioMale_del;
    private javax.swing.JRadioButton radioMale_up;
    private javax.swing.JRadioButton radioMarried;
    private javax.swing.JRadioButton radioMarried_del;
    private javax.swing.JRadioButton radioMarried_up;
    private javax.swing.JRadioButton radioUnmarried;
    private javax.swing.JRadioButton radioUnmarried_del;
    private javax.swing.JRadioButton radioUnmarried_up;
    private javax.swing.JLabel saveButton;
    private javax.swing.JLabel searchButton;
    private javax.swing.JLabel searchButton_del;
    private javax.swing.JLabel searchButton_up;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress_del;
    private javax.swing.JTextField txtAddress_up;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge_del;
    private javax.swing.JTextField txtAge_up;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtBloodGroup_del;
    private javax.swing.JTextField txtBloodGroup_up;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCity_del;
    private javax.swing.JTextField txtCity_up;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorId_del;
    private javax.swing.JTextField txtDoctorId_search;
    private javax.swing.JTextField txtDoctorId_up;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFName_del;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstName_del;
    private javax.swing.JTextField txtFirstName_up;
    private javax.swing.JTextField txtJoinDate;
    private javax.swing.JTextField txtJoinDate_del;
    private javax.swing.JTextField txtJoinDate_up;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtLName_del;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastName_del;
    private javax.swing.JTextField txtLastName_up;
    private javax.swing.JTextField txtLeavingDate;
    private javax.swing.JTextField txtLeavingDate_del;
    private javax.swing.JTextField txtLeavingDate_up;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtNIC_del;
    private javax.swing.JTextField txtNIC_up;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword_del;
    private javax.swing.JTextField txtPassword_up;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhone_del;
    private javax.swing.JTextField txtPhone_up;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtRegNo_del;
    private javax.swing.JTextField txtRegNo_up;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtSpecialization_del;
    private javax.swing.JTextField txtSpecialization_up;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername_del;
    private javax.swing.JTextField txtUsername_up;
    private javax.swing.JLabel updateButton;
    // End of variables declaration//GEN-END:variables

    private String gender;
    private String maritial;
}
