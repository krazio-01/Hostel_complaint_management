package team;
import java.awt.Color;
import java.sql.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Room extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pstuser = null;
    PreparedStatement pstadmin = null;
    ResultSet rstuser = null;
    ResultSet rstadmin = null;

    public Room() {
        initComponents();
        this.setSize(870, 620);
        this.setLocationRelativeTo(null);
        
        compField.setLineWrap(true);
    }
    
    String userName;
    public Room (String username){
        initComponents();
        userName = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        issue = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        room = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        compField = new javax.swing.JTextArea();
        jLabelBack = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Write your complaint");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 200, 190, 30);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Room Complaint");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 20, 190, 29);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 0);

        issue.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        issue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paint", "Electrical", "Plumbing", "Others" }));
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        getContentPane().add(issue);
        issue.setBounds(630, 100, 120, 25);

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Issue Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 100, 96, 24);

        room.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });
        getContentPane().add(room);
        room.setBounds(290, 110, 90, 25);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Room Number");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 110, 127, 24);

        compField.setColumns(20);
        compField.setRows(5);
        jScrollPane2.setViewportView(compField);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(110, 230, 680, 250);

        jLabelBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelBack.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_back_32px.png")); // NOI18N
        jLabelBack.setText("Back");
        jLabelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBackMouseExited(evt);
            }
        });
        getContentPane().add(jLabelBack);
        jLabelBack.setBounds(20, 10, 90, 32);

        Submit.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_paper_plane_32px.png")); // NOI18N
        Submit.setText("Submit");
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
        });
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(170, 500, 120, 30);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_close_32px.png")); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 500, 110, 30);

        jButton1.setText("Show my previous comp");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 500, 160, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\1_1.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 870, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueActionPerformed

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed

    }//GEN-LAST:event_roomActionPerformed

    // creating function to check if complaint already exists in database
    public boolean checComplaint (String userName) {
        
        boolean complaintExist = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
            String userquery = ("SELECT complaint FROM `room_comp` WHERE username =?");
            String adminquery = ("SELECT complaint FROM `admin_table` WHERE username =?");
            
            pstuser = con.prepareStatement(userquery);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
            
            pstadmin = con.prepareStatement(adminquery);
            pstadmin.setString(1, userName);
            rstadmin = pstadmin.executeQuery();
            
            if(rstuser.next() && rstadmin.next()){
                complaintExist = true;
            }
        } 
        
        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
        return complaintExist;
    }
    
    // Getting email number from database
    String email;
    public String getEmail (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT email FROM register WHERE username =?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
            
            if(rstuser.next()){
                email = rstuser.getString("email");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
        return email;
    }
    
    // Getting complaint number from database
    String no;
    public String getComplaintNo (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT cNo FROM room_comp WHERE username = ?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
                
            if(rstuser.next()){
                no = rstuser.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
        return no;
    }
    
    // Sending Email to the student
    public void emailSent (){
        String userEmail = getEmail();
        String compNo = getComplaintNo();
        
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
            message.setFrom(new InternetAddress("youremail@gmail.com", "Support Team"));
            System.out.println("Sending message...");
            message.setSubject("Inconvience in Rooms!");
            message.setText("Hey " +userName+ "," + "\n\nYour Complaint is Registered with us. We will see it and reach to you soon.\nYour "
                    + "Complaint number is: " +compNo+ "\n\nThanks For Feedback, Have a Good Day :)");
            
            Transport.send(message);
            System.out.println("Message Sent Succesfully");
        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Email Send Fail!, Make Sure You Are connected to Internet!");
            System.out.println("Message Sent Fail!!"+e.getMessage());
        }
    }
    
    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        dashboard obj = new dashboard (userName);
        obj.setSize(1350, 750);
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jLabelBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabelBack.setBorder(label_border);
        jLabelBack.setForeground(Color.white);
    }//GEN-LAST:event_jLabelBackMouseEntered

    private void jLabelBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabelBack.setBorder(label_border);
        jLabelBack.setForeground(Color.black);
    }//GEN-LAST:event_jLabelBackMouseExited

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitMouseClicked

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String roomNo = room.getText();
        String issueType = issue.getSelectedItem().toString();
        String complaint = compField.getText();

        if(roomNo.equals("") || complaint.equals("")){
            JOptionPane.showMessageDialog(this, "Please fill the entries!");
        }
        
        else{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                if(!checComplaint(userName)){

                    String compQuery = ("insert into room_comp(`username`, `room_num`, `type`, `complaint`) values(?,?,?,?)");
                    pstuser = con.prepareStatement(compQuery);
                    pstuser.setString(1, userName);
                    pstuser.setString(2, roomNo);
                    pstuser.setString(3, issueType);
                    pstuser.setString(4, complaint);

                    String adminQuery = ("insert into admin_table(`username`, `room_num`, `type`, `complaint`) values(?,?,?,?)");
                    pstadmin = con.prepareStatement(adminQuery);
                    pstadmin.setString(1, userName);
                    pstadmin.setString(2, roomNo);
                    pstadmin.setString(3, issueType);
                    pstadmin.setString(4, complaint);

                    if(pstuser.executeUpdate() != 0 && pstadmin.executeUpdate() != 0){
                        emailSent();
                        JOptionPane.showMessageDialog(this, "Complaint Succesfully Registered");
                        JOptionPane.showMessageDialog(this, "Your Complaint Number is = " +no);
                    }
                }

                else {
                    JOptionPane.showMessageDialog(this, "Your Complaint is already registered");

                    int respond = JOptionPane.showConfirmDialog(this, "You want to update this in your pevious complaint?", "Confirm!",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if(respond == JOptionPane.YES_OPTION){
                        String compQuery = ("update room_comp set room_num = ?, type = ?, complaint =? where username = ?");
                        pstuser = con.prepareStatement(compQuery);
                        pstuser.setString(1, roomNo);
                        pstuser.setString(2, issueType);
                        pstuser.setString(3, complaint);
                        pstuser.setString(4, userName);

                        String adminQuery = ("update admin_table set room_num = ?, type = ?, complaint =? where username = ?");
                        pstadmin = con.prepareStatement(adminQuery);
                        pstadmin.setString(5, userName);
                        pstadmin.setString(1, roomNo);
                        pstadmin.setString(2, issueType);
                        pstadmin.setString(3, complaint);

                        if(pstuser.executeUpdate() != 0 && pstadmin.executeUpdate() != 0){
                            emailSent();
                            JOptionPane.showMessageDialog(this, "Complaint Succesfully Updated");
                            JOptionPane.showMessageDialog(this, "Your Complaint Number is = " +no);
                        }

                        con.close();
                        pstuser.close();
                        pstadmin.close();
                        rstuser.close();
                        rstadmin.close();
                    }

                    if(respond == JOptionPane.NO_OPTION){
                        System.out.println("Selected no");
                    }
                }

            }

            catch (Exception e){
                System.out.println("Exception occured ");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Getting complaint from database
    String comp;
    public String getComplaint (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT complaint FROM room_comp WHERE username =?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
                
            if(rstuser.next()){
                comp = rstuser.getString("complaint");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
        return comp;
    }
    
        // Getting roomNo from database
    String roomNo;
    public String getRoomNo (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM room_comp WHERE username =?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
                
            if(rstuser.next()){
                roomNo = rstuser.getString("room_num");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return roomNo;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getComplaint();
        getRoomNo();
        getComplaintNo();
        
        if(comp != null && roomNo != null){
            try{
                Thread.sleep(300);
                room.setText(roomNo);
                compField.setText(comp);
                JOptionPane.showMessageDialog(null, "Got Complaint with complaint number = " +no);
            }
            
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        else{
            JOptionPane.showMessageDialog(this, "No Previous Complaint exists");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JTextArea compField;
    private javax.swing.JComboBox<String> issue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField room;
    // End of variables declaration//GEN-END:variables
}
