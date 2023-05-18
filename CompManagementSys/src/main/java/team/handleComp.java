package team;
import java.awt.Color;
import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class handleComp extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pstadmin = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    PreparedStatement pstreg = null;
    ResultSet rstadmin = null;
    ResultSet rst1 = null;
    ResultSet rst2 = null;
    ResultSet rst3 = null;
    ResultSet rst4 = null;
    ResultSet rstreg = null;

    public handleComp() {
        initComponents();
        this.setSize(870, 620);
        this.setLocationRelativeTo(null);
        
        txt.setBackground(new Color(0, 0, 0, 1));
        
        gettingUname();
    }

    public void gettingUname(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
            String query = ("select username from login");
            
            Statement stmt = con.createStatement();
            rstreg = stmt.executeQuery(query);
            
            while(rstreg.next()){
                String uname = rstreg.getString("username");
                users.addItem(uname);
            }  
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetails = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        users = new javax.swing.JComboBox<>();
        jLabelBack = new javax.swing.JLabel();
        showbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        solField = new javax.swing.JTextArea();
        postbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cNo", "Name", "department", "complaint", "Solution"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 870, 190);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Pending Complaints");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 20, 240, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Select User");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 100, 70, 40);

        getContentPane().add(users);
        users.setBounds(190, 100, 120, 30);

        jLabelBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        jLabelBack.setBounds(30, 20, 90, 32);

        showbtn.setText("Show");
        showbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });
        getContentPane().add(showbtn);
        showbtn.setBounds(380, 110, 75, 23);

        delbtn.setText("Delete");
        delbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });
        getContentPane().add(delbtn);
        delbtn.setBounds(510, 110, 72, 23);

        solField.setColumns(20);
        solField.setRows(5);
        jScrollPane2.setViewportView(solField);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 410, 420, 170);

        postbtn.setText("Post");
        postbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        postbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postbtnActionPerformed(evt);
            }
        });
        getContentPane().add(postbtn);
        postbtn.setBounds(560, 480, 72, 23);

        resetbtn.setText("Reset");
        resetbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(resetbtn);
        resetbtn.setBounds(690, 480, 72, 23);

        txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt.setBorder(null);
        getContentPane().add(txt);
        txt.setBounds(240, 380, 110, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Selected Complaint No. = ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 380, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\closed2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        adminPage ad = new adminPage();
        ad.setSize(870, 620);
        ad.setVisible(true);
        ad.setLocationRelativeTo(null);
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
    
    public void getRoomSol (){
        String sol;
        String cNo1 = getRoomCompNo();
        
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        String user = users.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
            String roomQuery = ("SELECT solution FROM room_comp WHERE cNo =?");
            
            pst1 = con.prepareStatement(roomQuery);
            pst1.setString(1, cNo1);
            rst1 = pst1.executeQuery();
            
            if(rst1.next()){
                sol = rst1.getString("solution");
                model.addRow(new Object [] {null, null, null, null, sol});
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
    }
    
        public void getManagementSol (){
        String sol;
        String cNo2 = getManagementCompNo();
        
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        String user = users.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

            String managementQuery = ("SELECT solution FROM management_comp WHERE cNo =?");
            
            pst2 = con.prepareStatement(managementQuery);
            pst2.setString(1, cNo2);
            rst2 = pst2.executeQuery();
            
            if(rst2.next()){
                sol = rst2.getString("solution");
                model.addRow(new Object [] {null, null, null, null, sol});
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
    }
        
            public void getSecuritySol (){
        String sol;
        String cNo3 = getSecurityCompNo();
        
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        String user = users.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

            String securityQuery = ("SELECT solution FROM security_comp WHERE cNo =?");
            
            pst3 = con.prepareStatement(securityQuery);
            pst3.setString(1, cNo3);
            rst3 = pst3.executeQuery();
            
            if(rst3.next()){
                sol = rst3.getString("solution");
                model.addRow(new Object [] {null, null, null, null, sol});
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
    }
            
    public void getCleaningSol (){
        String sol;
        String cNo4 = getCleaningCompNo();
        
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        String user = users.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

            String cleaningQuery = ("SELECT solution FROM cleaning_comp WHERE cNo =?");
            
            pst4 = con.prepareStatement(cleaningQuery);
            pst4.setString(1, cNo4);
            rst4 = pst4.executeQuery();
            
            if(rst4.next()){
                sol = rst4.getString("solution");
                model.addRow(new Object [] {null, null, null, null, sol});
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
    }
    
    public void selectRow(){
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        
        cNo = model.getValueAt(jTableDetails.getSelectedRow(), 0).toString();   
        
        txt.setText(cNo);
    }
    
    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        String user = users.getSelectedItem().toString();
        
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        String email = "",no = "",comp = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
        
            String query = ("SELECT cNo, username, room_num, type, complaint FROM cleaning_comp where username = ? UNION SELECT cNo, username, "
                + "room_num, type, complaint FROM management_comp where username = ? UNION SELECT cNo, username, room_num, type, complaint FROM "
                + "room_comp where username = ? UNION SELECT cNo, username, room_num, type, complaint FROM security_comp where username = ? ");
        
            pstadmin = con.prepareStatement(query);
            pstadmin.setString(1, user);
            pstadmin.setString(2, user);
            pstadmin.setString(3, user);
            pstadmin.setString(4, user);
            rstadmin = pstadmin.executeQuery();

            while(rstadmin.next()){
                String cNo = rstadmin.getString("cNo");
                String name = rstadmin.getString("username");
                String department = rstadmin.getString("type");
                comp = rstadmin.getString("complaint");
                 
                model.addRow(new Object [] {cNo, name, department, comp, null});
            }
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_showbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        String user = users.getSelectedItem().toString();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
            String query = ("delete from admin_table where username =?");
            pstadmin = con.prepareStatement(query);
            pstadmin.setString(1, user);
            pstadmin.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Record deleted succesfully");
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_delbtnActionPerformed

    String cNo, name, email, num;
    private void jTableDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDetailsMouseClicked
        selectRow();
    }//GEN-LAST:event_jTableDetailsMouseClicked

    // Getting roomNo from database
    public String getRoomCompNo (){
        String user = users.getSelectedItem().toString();
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM room_comp WHERE username =?");
            pst1 = con.prepareStatement(query);
            pst1.setString(1, user);
            rst1 = pst1.executeQuery();
                
            if(rst1.next()){
                compNo = rst1.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return compNo;
    }
    
    // Getting roomNo from database
    public String getManagementCompNo (){
        String user = users.getSelectedItem().toString();
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM management_comp WHERE username =?");
            pst2 = con.prepareStatement(query);
            pst2.setString(1, user);
            rst2 = pst2.executeQuery();
                
            if(rst2.next()){
                compNo = rst2.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return compNo;
    }
    
    // Getting roomNo from database
    public String getSecurityCompNo (){
        String user = users.getSelectedItem().toString();
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM security_comp WHERE username =?");
            pst3 = con.prepareStatement(query);
            pst3.setString(1, user);
            rst3 = pst3.executeQuery();
                
            if(rst3.next()){
                compNo = rst3.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return compNo;
    }
    
    // Getting roomNo from database
    public String getCleaningCompNo (){
        String user = users.getSelectedItem().toString();
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM cleaning_comp WHERE username =?");
            pst4 = con.prepareStatement(query);
            pst4.setString(1, user);
            rst4 = pst4.executeQuery();
                
            if(rst4.next()){
                compNo = rst4.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return compNo;
    }
    
    // Getting email number from database
    public String getFullName (){
        String fname = null;
        String user = users.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT fullname FROM register WHERE username =?");
            pstreg = con.prepareStatement(query);
            pstreg.setString(1, user);
            rstreg = pstreg.executeQuery();
            
            if(rstreg.next()){
                fname = rstreg.getString("fullname");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
        return fname;
    }
    
    // Getting email number from database
    public String getEmail (){
        String user = users.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT email FROM register WHERE username =?");
            pstreg = con.prepareStatement(query);
            pstreg.setString(1, user);
            rstreg = pstreg.executeQuery();
            
            if(rstreg.next()){
                email = rstreg.getString("email");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
        return email;
    }
    
    // Sending Email to the user
    public void emailSent (){
        String fullname = getFullName();
        String emaill = getEmail ();
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
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emaill));
            message.setFrom(new InternetAddress("youremail@gmail.com", "Team Hostel"));
            System.out.println("Sending message...");
            message.setSubject("Admin Section");
            message.setText("Hey " +fullname+ "," + "\n\nYour Complaint was viewed and we took action on it. You can review it by going to "
                    + "check status section");
            
            Transport.send(message);
            System.out.println("Message Sent Succesfully");
        } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Email Send Fail!, Make Sure You Are connected to Internet!");
            System.out.println("Message Sent Fail!!"+e.getMessage());
        }
    }
    
    private void postbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postbtnActionPerformed
        String Sol = solField.getText();
        String cNo1 = txt.getText();
        String cNo2 = getRoomCompNo();
        String cNo3 = getManagementCompNo();
        String cNo4 = getSecurityCompNo();
        String cNo5 = getCleaningCompNo();

        if(cNo1.equals(cNo2)){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
                String compQuery = ("update room_comp set solution =? where cNo = ?");
                pst1 = con.prepareStatement(compQuery);
                pst1.setString(1, Sol);
                pst1.setString(2, cNo1);
                
                if(pst1.executeUpdate() != 0){
                    getRoomSol ();
                    emailSent ();
                    JOptionPane.showMessageDialog(this, "Succefully updated solution in Rooms");
                }
                
                else{
                    System.out.println("try again");
                }
            }

            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        if(cNo1.equals(cNo3)){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                String compQuery = ("update management_comp set solution =? where cNo = ?");
                pst2 = con.prepareStatement(compQuery);
                pst2.setString(1, Sol);
                pst2.setString(2, cNo1);
                
                if(pst2.executeUpdate() != 0){
                    getManagementSol();
                    emailSent ();
                    JOptionPane.showMessageDialog(this, "Succefully updated solution in Management");
                }
                
                else{
                    System.out.println("try again");
                }
            }

            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
                
        if(cNo1.equals(cNo4)){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                String compQuery = ("update security_comp set solution =? where cNo = ?");
                pst3 = con.prepareStatement(compQuery);
                pst3.setString(1, Sol);
                pst3.setString(2, cNo1);
                
                if(pst3.executeUpdate() != 0){
                    getSecuritySol();
                    emailSent ();
                    JOptionPane.showMessageDialog(this, "Succefully updated solution in Security");
                }
                
                else{
                    System.out.println("try again");
                }
            }

            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
                        
        if(cNo1.equals(cNo5)){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                String compQuery = ("update cleaning_comp set solution =? where cNo = ?");
                pst4 = con.prepareStatement(compQuery);
                pst4.setString(1, Sol);
                pst4.setString(2, cNo1);
               
                if(pst4.executeUpdate() != 0){
                    getCleaningSol();
                    emailSent ();
                    JOptionPane.showMessageDialog(this, "Succefully updated solution in cleaning");
                }
                
                else{
                    System.out.println("try again");
                }
            }

            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Check Again!");
        }
    }//GEN-LAST:event_postbtnActionPerformed

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
            java.util.logging.Logger.getLogger(handleComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(handleComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(handleComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(handleComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new handleComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetails;
    private javax.swing.JButton postbtn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton showbtn;
    private javax.swing.JTextArea solField;
    private javax.swing.JTextField txt;
    private javax.swing.JComboBox<String> users;
    // End of variables declaration//GEN-END:variables
}
