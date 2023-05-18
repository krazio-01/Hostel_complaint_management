package team;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Register extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pstregister = null;
    PreparedStatement pstlogin = null;
    ResultSet rst = null;
    
    // creating a variable to set the image path in it
    String img_path = null;
    
    public Register() {
        initComponents();
        this.setSize(650, 780);
        this.setLocationRelativeTo(null);
        this.setOpacity(0.9f);
        
        // creating boundary for frame
        Border frameBoundary = BorderFactory.createMatteBorder(0, 2, 2, 2, Color.CYAN); 
        jPanel2.setBorder(frameBoundary);
        
        // creating border around close and minimize button
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelMin.setBorder(label_border);
        jLabelClose.setBorder(label_border);
       
        //create a button group for the radiobuttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonMale);
        bg.add(jRadioButtonFem);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelReturn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFem = new javax.swing.JRadioButton();
        jLabelPic = new javax.swing.JLabel();
        jButtonPic_Select = new javax.swing.JButton();
        jLabelPath = new javax.swing.JLabel();
        jTextFieldPass = new javax.swing.JPasswordField();
        jTextFieldPassConf = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelWarningEmail = new javax.swing.JLabel();
        jLabelWarningPass = new javax.swing.JLabel();
        jLabelWarningPhone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(0, 0, 0));
        jLabelClose.setText(" x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register");

        jLabelMin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMin.setText(" -");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelClose)
                        .addComponent(jLabelMin))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 50);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(39, 60, 117));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setBackground(new java.awt.Color(39, 60, 117));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jTextFieldName.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setBorder(null);
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jTextFieldNum.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldNum.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNum.setBorder(null);
        jTextFieldNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumKeyTyped(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(46, 204, 113));
        jButtonRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_login_34px_2.png")); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRegisterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseReleased(evt);
            }
        });
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_cancel_34px_2.png")); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseReleased(evt);
            }
        });

        jLabelReturn.setBackground(new java.awt.Color(39, 60, 117));
        jLabelReturn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelReturn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReturn.setText("Click here to go back to Login Page");
        jLabelReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReturnMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(39, 60, 117));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");

        jTextFieldEmail.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(39, 60, 117));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UserName");

        jLabel8.setBackground(new java.awt.Color(39, 60, 117));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirm Password ");

        jLabelGender.setBackground(new java.awt.Color(39, 60, 117));
        jLabelGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGender.setText("Gender");

        jRadioButtonMale.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMale.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMale.setSelected(true);
        jRadioButtonMale.setText("Male");

        jRadioButtonFem.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonFem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonFem.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFem.setText("Female");
        jRadioButtonFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemActionPerformed(evt);
            }
        });

        jLabelPic.setBackground(new java.awt.Color(39, 60, 117));
        jLabelPic.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPic.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPic.setText("Image");

        jButtonPic_Select.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPic_Select.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPic_Select.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_image_32px.png")); // NOI18N
        jButtonPic_Select.setText("Select Image");
        jButtonPic_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPic_SelectActionPerformed(evt);
            }
        });

        jLabelPath.setBackground(new java.awt.Color(39, 60, 117));
        jLabelPath.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabelPath.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPath.setText("Image Path");

        jTextFieldPass.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPass.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPass.setBorder(null);
        jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassActionPerformed(evt);
            }
        });

        jTextFieldPassConf.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPassConf.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPassConf.setBorder(null);

        jLabel9.setBackground(new java.awt.Color(39, 60, 117));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Full Name ");

        jTextFieldUser.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser.setBorder(null);
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));

        jLabelWarningEmail.setForeground(new java.awt.Color(255, 0, 51));

        jLabelWarningPass.setBackground(new java.awt.Color(51, 51, 51));
        jLabelWarningPass.setForeground(new java.awt.Color(255, 0, 51));

        jLabelWarningPhone.setBackground(new java.awt.Color(51, 51, 51));
        jLabelWarningPhone.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jRadioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jRadioButtonFem, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabelPic)
                        .addGap(121, 121, 121)
                        .addComponent(jButtonPic_Select)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelPath, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButtonRegister)
                        .addGap(132, 132, 132)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel9)))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelWarningPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPass, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(jSeparator4)
                                    .addComponent(jTextFieldUser)
                                    .addComponent(jSeparator2)
                                    .addComponent(jTextFieldName)
                                    .addComponent(jTextFieldEmail)
                                    .addComponent(jSeparator3)
                                    .addComponent(jLabelWarningEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jTextFieldPassConf, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelWarningPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWarningEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWarningPass, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPassConf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWarningPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFem))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPic_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPath, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 650, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jLabelReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReturnMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelReturnMouseClicked

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMousePressed
        jButtonRegister.setBackground(new Color(0, 184, 148));
    }//GEN-LAST:event_jButtonRegisterMousePressed

    private void jButtonRegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseReleased
        jButtonRegister.setBackground(new Color(46,204,113));
    }//GEN-LAST:event_jButtonRegisterMouseReleased

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabelClose.setBorder(label_border);
        jLabelClose.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelMin.setBorder(label_border);
        jLabelMin.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jLabelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabelMin.setBorder(label_border);
        jLabelMin.setForeground(Color.white);
    }//GEN-LAST:event_jLabelMinMouseEntered

    private void jLabelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelMin.setBorder(label_border);
        jLabelMin.setForeground(Color.black);
    }//GEN-LAST:event_jLabelMinMouseExited

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked

        int respond = JOptionPane.showConfirmDialog(this, "Are you sure want to cancel?", "Confirm!", JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE);
        
        if(respond == JOptionPane.YES_OPTION){
            System.out.println("Exitting Register Page..");
            System.exit(0);
        }
        
        if(respond == JOptionPane.NO_OPTION){
            System.out.println("Not Canceled..");
        }
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMousePressed
        jButtonCancel.setBackground(new Color(255, 107, 107));
    }//GEN-LAST:event_jButtonCancelMousePressed

    private void jButtonCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseReleased
        jButtonCancel.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_jButtonCancelMouseReleased

    private void jTextFieldNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumKeyTyped
        // allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNumKeyTyped

    private void jButtonPic_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPic_SelectActionPerformed
        // select an image and set the image path into a jLabel
        String path = null;
        JFileChooser chooser = new JFileChooser();
        
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        // file extension
        FileNameExtensionFilter ext = new FileNameExtensionFilter("*Image", "jpg", "png", "jpeg");
        chooser.addChoosableFileFilter(ext);
        
        int filestate = chooser.showSaveDialog(null);
        
        try {
           // checking if the user select an image or not
            if(filestate == JFileChooser.APPROVE_OPTION){
                File selectImage = chooser.getSelectedFile();
                path = selectImage.getAbsolutePath();
                jLabelPath.setText(path);
                img_path = path;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonPic_SelectActionPerformed

    // checking valid email
    public boolean checkEmail (){
    
        String enteredEmail = jTextFieldEmail.getText();
        String str = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if(!enteredEmail.matches(str)){
           jLabelWarningEmail.setText("Please Enter Valid Email adress");
            return false; 
        }
        else{
            jLabelWarningEmail.setText("");
            return true;          
        }  
    }
       
    // checking valid phone number
    public boolean phoneNo (){
        String phone = jTextFieldNum.getText();
        
        if(phone.length() < 10){
            jLabelWarningPhone.setText("Please Enter Valid Phone Number");
            return false;
        }
        
        else{
            jLabelWarningPhone.setText("");
            return true;
        }         
    }
    
    // to check password strength
    public boolean passwordChecker (){
        String pass1 = String.valueOf(jTextFieldPass.getPassword());
        String symbol[] = {"!","@","#","$","%","^","&","*",")","(","-","_","=","+","~","`","<",">",",",".","?","/",";",":","[","]","{","}","|"};
        
        int di = 0, sy = 0, let = 0;       
        if (pass1.length() >= 8){
            for (int i = 0; i < pass1.length(); i++){
                char x = pass1.charAt(i);
                if (Character.isLetter(x)){
                    let+=1;
                }
                if (Character.isDigit(x)){
                    di += 1;
                }
                for (String j : symbol){
                    if(x == j.charAt(0))
                        sy+=1;
                }
            }
            if (di >= 1 && sy >= 1 && let >= 1){
                jLabelWarningPass.setText("");
                return true;
            }
            else {
                jLabelWarningPass.setText("Please Choose a Strong Password");
                return false;
            }
        }
        else{
           jLabelWarningPass.setText("Password Length Should Be Atleast 8 Characters");
           return false;
        }
    }
    
    // creating a function to verify empty fields
    public boolean verifyFields (){
        
        String fname = jTextFieldName.getText();
        String uname = jTextFieldUser.getText();
        String email = jTextFieldEmail.getText();
        String phone = jTextFieldNum.getText();
        String pass1 = String.valueOf(jTextFieldPass.getPassword());
        String pass2 = String.valueOf(jTextFieldPassConf.getPassword());
        String img = jLabelPath.getText();
        
        if(fname.trim().equals("") || uname.trim().equals("") || email.trim().equals("")|| phone.trim().equals("") || pass1.trim().equals("") 
                || pass2.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Some Fields are Empty", "Empty Fields!", 2);
            return false;
        }
        
        if(img.equals("Image Path")){
            JOptionPane.showMessageDialog(this, "Please Select Your Image!");
            return false;
        }
        
        if(!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(null, "Passwords Does Not Match", "Confirm Password", 2);
            return false;
        }
        
        // and if everything is fine
        else{
            return true;
        }
    }
    
    // creating function to check if entered username already exists in database
    public boolean checkUser (String username) {
        
        boolean usernameExist = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
            String query = ("SELECT * FROM `register` WHERE username =?");
            pstregister = con.prepareStatement(query);
            pstregister.setString(1, username);
            rst = pstregister.executeQuery();
            
            if(rst.next()){
                usernameExist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another", "Username Exists!", 1);
                System.out.println("Failure!");
            }
            else{
                System.out.println("Succes!");
            }
        } 
        
        catch (HeadlessException | SQLException e){
            System.out.println("Exception occured " +e);
             }
        
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usernameExist;
    }
    
    // Sending Email to the user
    public void emailSent (){
        String fname = jTextFieldName.getText();
        String uname = jTextFieldUser.getText();
        String pass1 = String.valueOf(jTextFieldPass.getPassword());
        String phone = jTextFieldNum.getText();
        String userEmail = jTextFieldEmail.getText();
        
        final String username = "youremail@gmail.com";
        final String password = "your_password";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("Amman"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
            message.setFrom(new InternetAddress("youremail@gmail.com", "Team Hostel"));
            System.out.println("Sending message...");
            message.setSubject("Account Registration!");
            message.setText("Hey " +fname+ "," + "\n\nYour account is succesfully created with details provided: "
                    + "\nUsername - " +uname+ "\n" + "Password - " +pass1.subSequence(0, 4)+ "xxxx"+"\n" + "Phone Number - " +phone+
                    "\n\nThanks For Registering, Have a Good Day :)");
            
            Transport.send(message);
            System.out.println("Message Sent Succesfully");
        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Email Send Fail!, Make Sure You Are connected to Internet!");
            System.out.println("Message Sent Fail!!"+e.getMessage());
        }
    }
    
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        
        String fname = jTextFieldName.getText();
        String uname = jTextFieldUser.getText();
        String email = jTextFieldEmail.getText();
        String pass1 = String.valueOf(jTextFieldPass.getPassword());
        String phone = jTextFieldNum.getText();
        String gender = "Male";
        
        if(jRadioButtonFem.isSelected()){
            gender = "Female";
        }
        
        if(verifyFields() && !checkUser(uname) && phoneNo () && passwordChecker() && checkEmail()){
            
            String registerQuery = ("INSERT INTO `register`(`fullname`, `username`, `email`, `password`, `phone`, `gender`, `picture`) "
                    + "VALUES (?, ?, ?, ? ,?, ?, ?)");
            String loginQuery = ("INSERT INTO `login` (`username`, `password`)" + "VALUES (?,?)");
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
                pstregister = con.prepareStatement(registerQuery);
                pstregister.setString(1, fname);
                pstregister.setString(2, uname);
                pstregister.setString(3, email);
                pstregister.setString(4, pass1);
                pstregister.setString(5, phone);
                pstregister.setString(6, gender);
                    
                // saving image as blob in database
                InputStream image = new FileInputStream(new File(img_path));
                pstregister.setBlob(7, image);
                   
                // entering values in login table
                pstlogin = con.prepareStatement(loginQuery);
                pstlogin.setString(1, uname);
                pstlogin.setString(2, pass1);
                    
                if(pstregister.executeUpdate() != 0 && pstlogin.executeUpdate() !=0){
                    emailSent ();
                    JOptionPane.showMessageDialog(null, "Your Account Has Been Created Succesfully");
                    System.out.println("Account created succesfully");
                }
                
                else {
                    JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                }
                    
                con.close();
                pstregister.close();
//                pstcomp.close();
                pstlogin.close();
            } 
                
            catch (HeadlessException | SQLException e){
            System.out.println("Exception occured " +e);
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (FileNotFoundException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jRadioButtonFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemActionPerformed

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassActionPerformed

    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //nothing
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged
    private int xMouse, yMouse;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonPic_Select;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPath;
    private javax.swing.JLabel jLabelPic;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JLabel jLabelWarningEmail;
    private javax.swing.JLabel jLabelWarningPass;
    private javax.swing.JLabel jLabelWarningPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonFem;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JPasswordField jTextFieldPass;
    private javax.swing.JPasswordField jTextFieldPassConf;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
