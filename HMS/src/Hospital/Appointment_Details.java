package Hospital;

import com.placeholder.PlaceHolder;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Appointment_Details extends javax.swing.JFrame {
    PlaceHolder p1;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Appointment_Details() {
        initComponents();
        p1 = new PlaceHolder(txtAppointmentId_search, "Enter Appointment ID");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton_add = new javax.swing.JLabel();
        homeButton_add = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtAppointmentId = new javax.swing.JTextField();
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
        jLabel21 = new javax.swing.JLabel();
        txtDateTime = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        saveButton = new javax.swing.JLabel();
        clearButton_add = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioMr = new javax.swing.JRadioButton();
        radioMrs = new javax.swing.JRadioButton();
        jLabel54 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAssiDoctor = new javax.swing.JTextField();
        radioMiss = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logoutButton_up = new javax.swing.JLabel();
        homeButton_up = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtAppointmentId_search = new javax.swing.JTextField();
        searchButton_up = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtAppointmentId_up = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtFirstName_up = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtAge_up = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtAddress_up = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtNIC_up = new javax.swing.JTextField();
        txtLastName_up = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtPhone_up = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtCity_up = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtDateTime_up = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        updateButton = new javax.swing.JLabel();
        clearButton_up = new javax.swing.JLabel();
        radioMale_up = new javax.swing.JRadioButton();
        radioFemale_up = new javax.swing.JRadioButton();
        radioMr_up = new javax.swing.JRadioButton();
        radioMrs_up = new javax.swing.JRadioButton();
        jLabel71 = new javax.swing.JLabel();
        txtBloodGroup_up = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txtAssiDoctor_up = new javax.swing.JTextField();
        radioMiss_up = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        logoutButton_view = new javax.swing.JLabel();
        homeButton_view = new javax.swing.JLabel();
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

        jPanel1.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Actions-appointment-new-icon(2).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 64, 64);

        jPanel5.setBackground(new java.awt.Color(4, 175, 240));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Appointmnet");

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
        jLabel9.setText("Appointmnet ID");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("Patient's First Name");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("Age");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setText("Honorific");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 204));
        jLabel13.setText("Address");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 204));
        jLabel14.setText("Patient's Last Name");

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

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 204));
        jLabel21.setText("Date & Time");

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

        honoric_buttons.add(radioMr);
        radioMr.setText("Mr.");
        radioMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMrActionPerformed(evt);
            }
        });

        honoric_buttons.add(radioMrs);
        radioMrs.setText("Mrs.");
        radioMrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMrsActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 102, 204));
        jLabel54.setText("Blood Group");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 204));
        jLabel20.setText("Assigned Doctor");

        honoric_buttons.add(radioMiss);
        radioMiss.setText("Miss.");
        radioMiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMissActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAssiDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNIC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(radioMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale)))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(clearButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(297, 297, 297)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(radioMr)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMrs)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMiss))
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(436, 436, 436))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txtAssiDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
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
                            .addComponent(radioMr)
                            .addComponent(radioMrs)
                            .addComponent(radioMiss))
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
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(txtBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(80, 90, 1250, 440);

        jTabbedPane1.addTab("Add Appointmnet", jPanel1);

        jPanel2.setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Actions-appointment-new-icon(2).png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 10, 64, 64);

        jPanel6.setBackground(new java.awt.Color(4, 175, 240));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Appointmnet");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 831, Short.MAX_VALUE)
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
                .addComponent(txtAppointmentId_search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(searchButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAppointmentId_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel14);
        jPanel14.setBounds(100, 70, 530, 60);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setText("Appointmnet ID");

        txtAppointmentId_up.setEnabled(false);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 204));
        jLabel22.setText("Patient's First Name");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 204));
        jLabel24.setText("Age");

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 102, 204));
        jLabel60.setText("Honorific");

        jLabel63.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 102, 204));
        jLabel63.setText("Address");

        jLabel64.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 102, 204));
        jLabel64.setText("Patient's Last Name");

        jLabel65.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 102, 204));
        jLabel65.setText("Gender");

        jLabel66.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 102, 204));
        jLabel66.setText("NIC");

        jLabel67.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 102, 204));
        jLabel67.setText("City");

        jLabel68.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 102, 204));
        jLabel68.setText("Phone No.");

        jLabel69.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 102, 204));
        jLabel69.setText("Date & Time");

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/man-user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel70)
                .addGap(60, 60, 60))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        honoric_buttons.add(radioMr_up);
        radioMr_up.setText("Mr.");
        radioMr_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMr_upActionPerformed(evt);
            }
        });

        honoric_buttons.add(radioMrs_up);
        radioMrs_up.setText("Mrs.");
        radioMrs_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMrs_upActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 102, 204));
        jLabel71.setText("Blood Group");

        jLabel72.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 102, 204));
        jLabel72.setText("Assigned Doctor");

        honoric_buttons.add(radioMiss_up);
        radioMiss_up.setText("Miss.");
        radioMiss_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMiss_upActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAppointmentId_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAssiDoctor_up, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName_up, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNIC_up, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(radioMale_up)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioFemale_up)))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(clearButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(297, 297, 297)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPhone_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBloodGroup_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(radioMr_up)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMrs_up)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioMiss_up))
                                    .addComponent(txtCity_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress_up, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateTime_up, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(436, 436, 436))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtAppointmentId_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72)
                            .addComponent(txtAssiDoctor_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel64)
                            .addComponent(txtLastName_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel65)
                            .addComponent(radioMale_up)
                            .addComponent(radioFemale_up))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel66)
                            .addComponent(txtNIC_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMr_up)
                            .addComponent(radioMrs_up)
                            .addComponent(radioMiss_up))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(txtAddress_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(txtCity_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68)
                            .addComponent(txtPhone_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(txtBloodGroup_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)
                            .addComponent(txtDateTime_up, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton_up, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel17);
        jPanel17.setBounds(70, 140, 1250, 440);

        jTabbedPane1.addTab("Update Appointmnet", jPanel2);

        jPanel3.setLayout(null);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/Actions-appointment-new-icon(2).png"))); // NOI18N
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 10, 64, 64);

        jPanel7.setBackground(new java.awt.Color(4, 175, 240));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("View Appointmnet");

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
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 838, Short.MAX_VALUE)
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
        String query = "insert into appointment " + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtAppointmentId.getText());
            pst.setString(2, txtFirstName.getText());
            pst.setString(3, txtLastName.getText());
            pst.setString(4, txtAssiDoctor.getText());
            pst.setString(5, txtAge.getText());
            pst.setString(6, gender);
            pst.setString(7, honoric);
            pst.setString(8, txtNIC.getText());
            pst.setString(9, txtAddress.getText());
            pst.setString(10, txtCity.getText());
            pst.setString(11, txtPhone.getText());
            pst.setString(12, txtDateTime.getText());
            pst.setString(13, txtBloodGroup.getText());

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

    private void radioMrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMrActionPerformed
        honoric = "Mr";
    }//GEN-LAST:event_radioMrActionPerformed

    private void radioMrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMrsActionPerformed
        honoric = "Mrs";
    }//GEN-LAST:event_radioMrsActionPerformed

    private void searchButton_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButton_upMouseClicked
        conn = DB_connection.connect();
        String query = "select * from appointment where appointment_id = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtAppointmentId_search.getText());
            rs = pst.executeQuery();
            
            while(rs.next()){
                txtAppointmentId_up.setText(rs.getString("appointment_id"));
                txtAssiDoctor_up.setText(rs.getString("assigned_doctor"));
                txtFirstName_up.setText(rs.getString("patient_firstName"));
                txtLastName_up.setText(rs.getString("patient_lastName"));
                txtAge_up.setText(rs.getString("age"));
                gender = rs.getString("gender");
                if(gender.equals("Male")){
                    radioMale_up.setSelected(true);
                }
                else{
                    radioFemale_up.setSelected(true);
                }
                honoric = rs.getString("honoric");
                if(honoric.equals("Mr")){
                    radioMr_up.setSelected(true);
                }
                else if(honoric.equals("Mrs")){
                    radioMrs_up.setSelected(true);
                }
                else{
                    radioMiss_up.setSelected(true);
                }
                txtNIC_up.setText(rs.getString("nic"));
                txtAddress_up.setText(rs.getString("address"));
                txtCity_up.setText(rs.getString("city"));
                txtPhone_up.setText(rs.getString("phone"));
                txtDateTime_up.setText(rs.getString("date_time"));
                txtBloodGroup_up.setText(rs.getString("blood_group"));
            }
            
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_searchButton_upMouseClicked

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

    private void radioMissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMissActionPerformed
        honoric = "Miss";
    }//GEN-LAST:event_radioMissActionPerformed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        conn = DB_connection.connect();
        String query = "update appointment set patient_firstName = ?, patient_lastName = ?, assigned_doctor = ?, age = ?, gender = ?, honoric = ?, nic = ?, address = ?, city = ?, phone = ?, date_time = ?, blood_group = ? where appointment_id = ?";
        try{
            pst = conn.prepareStatement(query);
            pst.setString(1, txtFirstName_up.getText());
            pst.setString(2, txtLastName_up.getText());
            pst.setString(3, txtAssiDoctor_up.getText());
            pst.setString(4, txtAge_up.getText());
            pst.setString(5, gender);
            pst.setString(6, honoric);
            pst.setString(7, txtNIC_up.getText());
            pst.setString(8, txtAddress_up.getText());
            pst.setString(9, txtCity_up.getText());
            pst.setString(10, txtPhone_up.getText());
            pst.setString(11, txtDateTime_up.getText());
            pst.setString(12, txtBloodGroup_up.getText());
            pst.setString(13, txtAppointmentId_up.getText());
            
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

    private void radioMr_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMr_upActionPerformed
        honoric = "Mr";
    }//GEN-LAST:event_radioMr_upActionPerformed

    private void radioMrs_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMrs_upActionPerformed
        honoric = "Mrs";
    }//GEN-LAST:event_radioMrs_upActionPerformed

    private void radioMiss_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMiss_upActionPerformed
        honoric = "Miss";
    }//GEN-LAST:event_radioMiss_upActionPerformed

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

    private void clearInsertForm(){
        txtAppointmentId.setText(null);
        txtAssiDoctor.setText(null);
        txtFirstName.setText(null);
        txtLastName.setText(null);
        txtAge.setText(null);
        gender_buttons.clearSelection();
        honoric_buttons.clearSelection();
        txtNIC.setText(null);
        txtAddress.setText(null);
        txtCity.setText(null);
        txtPhone.setText(null);
        txtDateTime.setText(null);
        txtBloodGroup.setText(null);
    }
    
    private void clearUpdateForm(){
        txtAppointmentId_search.setText(null);
        txtAppointmentId_up.setText(null);
        txtAssiDoctor_up.setText(null);
        txtFirstName_up.setText(null);
        txtLastName_up.setText(null);
        txtAge_up.setText(null);
        gender_buttons.clearSelection();
        honoric_buttons.clearSelection();
        txtNIC_up.setText(null);
        txtAddress_up.setText(null);
        txtCity_up.setText(null);
        txtPhone_up.setText(null);
        txtDateTime_up.setText(null);
        txtBloodGroup_up.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AppointmentScrollPane;
    private javax.swing.JScrollPane AppointmentSearchScrollPane;
    private javax.swing.JTable AppointmentSearchTable;
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JLabel clearButton_add;
    private javax.swing.JLabel clearButton_up;
    private javax.swing.JLabel deleteButton;
    private javax.swing.ButtonGroup experience_buttons;
    private javax.swing.ButtonGroup gender_buttons;
    private javax.swing.JLabel homeButton_add;
    private javax.swing.JLabel homeButton_del;
    private javax.swing.JLabel homeButton_up;
    private javax.swing.JLabel homeButton_view;
    private javax.swing.ButtonGroup honoric_buttons;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
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
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioFemale_del;
    private javax.swing.JRadioButton radioFemale_up;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioMale_del;
    private javax.swing.JRadioButton radioMale_up;
    private javax.swing.JRadioButton radioMiss;
    private javax.swing.JRadioButton radioMiss_del;
    private javax.swing.JRadioButton radioMiss_up;
    private javax.swing.JRadioButton radioMr;
    private javax.swing.JRadioButton radioMr_del;
    private javax.swing.JRadioButton radioMr_up;
    private javax.swing.JRadioButton radioMrs;
    private javax.swing.JRadioButton radioMrs_del;
    private javax.swing.JRadioButton radioMrs_up;
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
    private javax.swing.JTextField txtAppointmentId;
    private javax.swing.JTextField txtAppointmentId_del;
    private javax.swing.JTextField txtAppointmentId_search;
    private javax.swing.JTextField txtAppointmentId_up;
    private javax.swing.JTextField txtAssiDoctor;
    private javax.swing.JTextField txtAssiDoctor_del;
    private javax.swing.JTextField txtAssiDoctor_up;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtBloodGroup_del;
    private javax.swing.JTextField txtBloodGroup_up;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCity_del;
    private javax.swing.JTextField txtCity_up;
    private javax.swing.JTextField txtDateTime;
    private javax.swing.JTextField txtDateTime_del;
    private javax.swing.JTextField txtDateTime_up;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFName_del;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFirstName_del;
    private javax.swing.JTextField txtFirstName_up;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtLName_del;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLastName_del;
    private javax.swing.JTextField txtLastName_up;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtNIC_del;
    private javax.swing.JTextField txtNIC_up;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhone_del;
    private javax.swing.JTextField txtPhone_up;
    private javax.swing.JLabel updateButton;
    // End of variables declaration//GEN-END:variables

    private String gender;
    private String honoric;
}
