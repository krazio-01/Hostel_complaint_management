package team;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import co.yogesh.Captcha;
import javax.swing.border.Border;

public class Login extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    
    Captcha cap =new Captcha();
    
    public Login() {
        initComponents();
        
        this.setSize(650, 550);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setOpacity(0.9f);
        this.setVisible(true);
        
        cap.setImageCaptcha(jLabelCaptcha);
        
        // creating boundary for frame
        Border frameBoundary = BorderFactory.createMatteBorder(0, 2, 2, 2, Color.CYAN); 
        jPanel2.setBorder(frameBoundary);
        
        // creating border around close and minimize button
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelMin.setBorder(label_border);
        jLabelClose.setBorder(label_border);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonVerify = new javax.swing.JButton();
        jTextFieldCaptcha = new javax.swing.JTextField();
        jLabelCaptcha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jMenuItem1.setText("jMenuItem1");

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
        jLabel2.setText("Login Page");

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
                .addGap(76, 76, 76)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 50);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelUser.setBackground(new java.awt.Color(236, 15, 241));
        jLabelUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_user_32px.png")); // NOI18N
        jLabelUser.setText("USERNAME ");

        jLabelPass.setBackground(new java.awt.Color(236, 15, 241));
        jLabelPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_password_34px.png")); // NOI18N
        jLabelPass.setText("PASSWORD ");

        jTextFieldUser.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(149, 165, 166));
        jTextFieldUser.setText("username");
        jTextFieldUser.setBorder(null);
        jTextFieldUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUserFocusLost(evt);
            }
        });
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });

        jTextFieldPass.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldPass.setForeground(new java.awt.Color(149, 165, 166));
        jTextFieldPass.setText("password");
        jTextFieldPass.setBorder(null);
        jTextFieldPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPassFocusLost(evt);
            }
        });
        jTextFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassActionPerformed(evt);
            }
        });

        btnlogin.setBackground(new java.awt.Color(46, 204, 113));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_login_34px_2.png")); // NOI18N
        btnlogin.setText("Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnloginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnloginMouseReleased(evt);
            }
        });
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(255, 56, 56));
        btncancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_cancel_34px_2.png")); // NOI18N
        btncancel.setText("Cancel");
        btncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btncancelMouseReleased(evt);
            }
        });

        jLabelRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("Click here to create a new account");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        jComboBox.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select user type", "admin", "student" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User type");

        jButtonVerify.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonVerify.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_google_recaptcha_32px.png")); // NOI18N
        jButtonVerify.setText("Verify");
        jButtonVerify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVerifyMouseClicked(evt);
            }
        });

        jTextFieldCaptcha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelCaptcha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCaptcha.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_captcha_32px.png")); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPass)
                            .addComponent(jLabelUser)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(jTextFieldPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabelCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(84, 84, 84))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jTextFieldCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonVerify)
                        .addGap(272, 272, 272))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCaptcha, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jTextFieldCaptcha))
                .addGap(27, 27, 27)
                .addComponent(jButtonVerify)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 50, 650, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        Register rgf = new Register ();
        rgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    // mouse enter effect on minimize button
    private void jLabelMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelMin.setBorder(label_border);
        jLabelMin.setForeground(Color.black);
    }//GEN-LAST:event_jLabelMinMouseExited

    private void jLabelMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabelMin.setBorder(label_border);
        jLabelMin.setForeground(Color.white);
    }//GEN-LAST:event_jLabelMinMouseEntered

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    // mouse enter effect on close button
    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelClose.setBorder(label_border);
        jLabelClose.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCloseMouseExited

    
    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabelClose.setBorder(label_border);
        jLabelClose.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jTextFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPassActionPerformed

    private void jTextFieldUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserFocusGained
        // clearing the text field if the text is "username"
        if(jTextFieldUser.getText().trim().toLowerCase().equals("username")){
            
            jTextFieldUser.setText("");
            jTextFieldUser.setForeground(Color.white);
        }
       Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.magenta);
       jLabelUser.setBorder(jlabel_icon);

    }//GEN-LAST:event_jTextFieldUserFocusGained

    private void jTextFieldUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserFocusLost
        //if text field is equal to udername or empty
        // we will set thee "username" text in field
        
        if(jTextFieldUser.getText().trim().equals("") || jTextFieldUser.getText().trim().toLowerCase().equals("username")){
        
            jTextFieldUser.setText("username");
            jTextFieldUser.setForeground(new Color(153, 153, 153));
        }
        
        // now removing border from jLabel 
        jLabelUser.setBorder(null);
    }//GEN-LAST:event_jTextFieldUserFocusLost

    private void jTextFieldPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPassFocusGained
        // clearing the text field if the text is "password"
        // get the password text   
        
        if(jTextFieldPass.getText().trim().toLowerCase().equals("password")){         
        jTextFieldPass.setText("");
        jTextFieldPass.setForeground(Color.white);
  
        }
        
       Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.magenta);
       jLabelPass.setBorder(jlabel_icon);
    }//GEN-LAST:event_jTextFieldPassFocusGained

    private void jTextFieldPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPassFocusLost
        //if password is equal to udername or empty
        // we will set the "password" text in field
        
        // get the password text 
        if(jTextFieldPass.getText().trim().equals("") || jTextFieldPass.getText().trim().toLowerCase().equals("password")){
        
            jTextFieldPass.setText("password");
            jTextFieldPass.setForeground(new Color(153, 153, 153));
        }
        
        // now removing border from jLabel 
        jLabelPass.setBorder(null);
    }//GEN-LAST:event_jTextFieldPassFocusLost

    // creating color change for login jButton
    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseEntered
        //nothing
    }//GEN-LAST:event_btnloginMouseEntered

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseExited
        //nothing      
    }//GEN-LAST:event_btnloginMouseExited

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        //nothing
    }//GEN-LAST:event_btnloginMouseClicked

    // creating color change for cancel jButton
    private void btncancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseEntered
        //nothing
    }//GEN-LAST:event_btncancelMouseEntered

    private void btncancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseExited
        //nothing
    }//GEN-LAST:event_btncancelMouseExited

    private void btnloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMousePressed
        btnlogin.setBackground(new Color(0, 184, 148));
    }//GEN-LAST:event_btnloginMousePressed

    private void btnloginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseReleased
        btnlogin.setBackground(new Color(46, 204, 113));
    }//GEN-LAST:event_btnloginMouseReleased

    private void btncancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMousePressed
        btncancel.setBackground(new Color(255, 107, 107));
    }//GEN-LAST:event_btncancelMousePressed

    private void btncancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseReleased
        btncancel.setBackground(new Color(255, 56, 56));
    }//GEN-LAST:event_btncancelMouseReleased

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        //nothing
    }//GEN-LAST:event_jComboBoxActionPerformed
  
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

        String uname = jTextFieldUser.getText();
        String pass = jTextFieldPass.getText();
        String usertype = jComboBox.getSelectedItem().toString();
        String captcha = jTextFieldCaptcha.getText();
        
        if(uname.equals("") || pass.equals("") || usertype.equals("Select user type")){
            JOptionPane.showMessageDialog(null, "Some fields are empty", "Error" ,1);
            System.out.println("Failed to Login");
        }
        
        else if(captcha.equals("")){
            JOptionPane.showMessageDialog(null, "Fill The Captcha", "Error" ,1);
        }
        
        else if(!cap.Validate (jLabelCaptcha, captcha)){
            JOptionPane.showMessageDialog(null, "Please Verify the captcha first", "Error" ,1);
        }

        else {
            try { 
                String s1 = rst.getString("usertype");
                String s2 = rst.getString("username");
                
                JOptionPane.showMessageDialog(this, "Details Matched! Succesfully Logged in as " +s1);
                System.out.println("Succesfully Logged in :)");
                
                con.close();
                pst.close();
                rst.close();
                        
                if(jComboBox.getSelectedIndex() == 1){
                    adminPage adpage = new adminPage (s2);
                    adpage.setSize(870, 620);
                    adpage.setLocationRelativeTo(null);
                    adpage.setVisible(true);
                    this.setVisible(false);
                }
                        
                else{
                    userPage uspage = new userPage (s2);
                    uspage.setSize(870, 620);
                    uspage.setLocationRelativeTo(null);
                    uspage.setVisible(true);
                    this.setVisible(false);
                }
            }
        
            catch (Exception e) {
                if(!cap.Validate (jLabelCaptcha, captcha)){
                    JOptionPane.showMessageDialog(null, "Please Check Your Captcha Again!", "Error" ,1);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Please Verify The Captcha First!", "Error" ,1);
                }
            }            
        }
        
    }//GEN-LAST:event_btnloginActionPerformed

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        int respond = JOptionPane.showConfirmDialog(this, "Are you sure want to cancel?", "Confirm!", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        
        if(respond == JOptionPane.YES_OPTION){
            System.out.println("Exitting Login Page");
            System.exit(0);
        }
        
        if(respond == JOptionPane.NO_OPTION){
            System.out.println("Not exited");
        }
    }//GEN-LAST:event_btncancelMouseClicked

    private void jButtonVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVerifyMouseClicked

        String uname = jTextFieldUser.getText();
        String pass = jTextFieldPass.getText();
        String usertype = jComboBox.getSelectedItem().toString();
        String captcha = jTextFieldCaptcha.getText();
        
        if(uname.equals("") || pass.equals("") || usertype.equals("select user type")){
            JOptionPane.showMessageDialog(null, "Some fields are empty", "Error" ,1);
            System.out.println("Failed to Login");
        }

        else if(captcha.equals("")){
            JOptionPane.showMessageDialog(null, "Fill The Captcha!", "Error" ,1);
        }
        
        else if(!cap.Validate (jLabelCaptcha, captcha)){
            JOptionPane.showMessageDialog(null, "Captcha does not match try again", "Error" ,1);
        }
        
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
                String query = ("SELECT * FROM login WHERE username =? and password =? and usertype =?");
                pst = con.prepareStatement(query);
                pst.setString(1, uname);
                pst.setString(2, pass);
                pst.setString(3, usertype);
                rst = pst.executeQuery();
                System.out.println("All details matched succesfully");
        
                if(rst.next()){
                    if(cap.Validate (jLabelCaptcha, captcha)){
                        JOptionPane.showMessageDialog(this, "Captcha matched");
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Captcha does not match");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Captcha matched");
                    JOptionPane.showMessageDialog(this, "Username Or Password Do Not Match", "Login error" ,1);
                }
            }

            catch (Exception e){
                System.out.println("Exception occured " +e);
            }
        }
    }//GEN-LAST:event_jButtonVerifyMouseClicked
    
    private int xMouse, yMouse;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    public static void main() {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCaptcha;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCaptcha;
    private javax.swing.JTextField jTextFieldPass;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
