package team;
import java.awt.Color;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class status extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pstuser = null;
    ResultSet rstuser = null;

    public status() {
        initComponents();
        this.setSize(870, 620);
        this.setLocationRelativeTo(null);
    }
    
    String userName;
    public status (String username){
        initComponents();
        userName = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        compNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonShow = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelBack = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        solutionField = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter complaint number :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 80, 170, 30);
        getContentPane().add(compNo);
        compNo.setBounds(320, 80, 340, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Status");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 160, 50, 30);

        jButtonShow.setText("Show");
        jButtonShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShow);
        jButtonShow.setBounds(242, 532, 90, 30);

        jButtonCancel.setText("Cancel");
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonCancel);
        jButtonCancel.setBounds(500, 532, 90, 30);

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
        jLabelBack.setBounds(20, 30, 90, 32);

        solutionField.setColumns(20);
        solutionField.setRows(5);
        jScrollPane2.setViewportView(solutionField);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(100, 190, 680, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\status.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Getting roomNo from database
    public String getRoomCompNo (){
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM room_comp WHERE username =?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
                
            if(rstuser.next()){
                compNo = rstuser.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return compNo;
    }
    
    // Getting roomNo from database
    public String getManagementCompNo (){
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM management_comp WHERE username =?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
                
            if(rstuser.next()){
                compNo = rstuser.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return compNo;
    }
    
    // Getting roomNo from database
    public String getSecurityCompNo (){
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM security_comp WHERE username =?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
                
            if(rstuser.next()){
                compNo = rstuser.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " + e.getMessage());
        }
        return compNo;
    }
    
    // Getting roomNo from database
    public String getCleaningCompNo (){
        String compNo = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
                
            String query = ("SELECT * FROM cleaning_comp WHERE username =?");
            pstuser = con.prepareStatement(query);
            pstuser.setString(1, userName);
            rstuser = pstuser.executeQuery();
                
            if(rstuser.next()){
                compNo = rstuser.getString("cNo");
            }
        }

        catch (Exception e){
            System.out.println("Exception occured " +e.getMessage());
        }
        return compNo;
    }
    
    private void jButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowActionPerformed
        String comp_no = compNo.getText();
        String cNo2 = getRoomCompNo();
        String cNo3 = getManagementCompNo();
        String cNo4 = getSecurityCompNo();
        String cNo5 = getCleaningCompNo();
        
        if(comp_no.equals(cNo2)){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                String query = ("SELECT * FROM room_comp WHERE cNo =?");
                pstuser = con.prepareStatement(query);
                pstuser.setString(1, comp_no);
                rstuser = pstuser.executeQuery();

                String sol = null;
                if(rstuser.next()){
                    sol = rstuser.getString("solution");
                    
                    if(sol != null)
                    {
                        solutionField.setText(sol);
                        JOptionPane.showMessageDialog(this, "Solution Found");
                    }
                    
                    else
                        JOptionPane.showMessageDialog(this, "No Solution Found");
                }
            }

            catch (Exception e){
                System.out.println("Exception occured " +e.getMessage());
            }
        }

        if(comp_no.equals(cNo3)){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                String query = ("SELECT * FROM management_comp WHERE cNo =?");
                pstuser = con.prepareStatement(query);
                pstuser.setString(1, comp_no);
                rstuser = pstuser.executeQuery();

                String sol = null;
                if(rstuser.next()){
                    sol = rstuser.getString("solution");
                    
                    if(sol != null)
                    {
                        solutionField.setText(sol);
                        JOptionPane.showMessageDialog(this, "Solution Found");
                    }
                    
                    else
                        JOptionPane.showMessageDialog(this, "No Solution Found");
                }
            }

            catch (Exception e){
                System.out.println("Exception occured " +e.getMessage());
            }
        }
                
        if(comp_no.equals(cNo4)){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                String query = ("SELECT * FROM security_comp WHERE cNo =?");
                pstuser = con.prepareStatement(query);
                pstuser.setString(1, comp_no);
                rstuser = pstuser.executeQuery();

                String sol = null;
                if(rstuser.next()){
                    sol = rstuser.getString("solution");
                    
                    if(sol != null)
                    {
                        solutionField.setText(sol);
                        JOptionPane.showMessageDialog(this, "Solution Found");
                    }
                    
                    else
                        JOptionPane.showMessageDialog(this, "No Solution Found");
                }
            }

            catch (Exception e){
                System.out.println("Exception occured " +e.getMessage());
            }
        }
                        
        if(comp_no.equals(cNo5)){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");   
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");

                String query = ("SELECT * FROM cleaning_comp WHERE cNo =?");
                pstuser = con.prepareStatement(query);
                pstuser.setString(1, comp_no);
                rstuser = pstuser.executeQuery();

                String sol = null;
                if(rstuser.next()){
                    sol = rstuser.getString("solution");
                    
                    if(sol != null)
                    {
                        solutionField.setText(sol);
                        JOptionPane.showMessageDialog(this, "Solution Found");
                    }
                    
                    else
                        JOptionPane.showMessageDialog(this, "No Solution Found");
                }
            }

            catch (Exception e){
                System.out.println("Exception occured " +e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonShowActionPerformed

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        userPage user = new userPage(userName);
        user.setSize(870, 620);
        user.setVisible(true);
        user.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField compNo;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea solutionField;
    // End of variables declaration//GEN-END:variables
}
