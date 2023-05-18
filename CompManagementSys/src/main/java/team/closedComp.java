package team;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

public class closedComp extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pstadmin = null;
    PreparedStatement pstreg = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    ResultSet rstadmin = null;
    ResultSet rstreg = null;
    ResultSet rst1 = null;
    ResultSet rst2 = null;
    ResultSet rst3 = null;
    ResultSet rst4 = null;
    
    public closedComp() {
        initComponents();
        this.setSize(870, 620);
        this.setLocationRelativeTo(null);
        
        gettingUname();
    }
    
    public void gettingUname() {
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
        users = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        showbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cNo", "Name", "Department", "complaint", "Solution"
            }
        ));
        jScrollPane1.setViewportView(jTableDetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 870, 240);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Closed Complaints");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 30, 240, 40);
        getContentPane().add(users);
        users.setBounds(240, 120, 120, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Select User");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 110, 70, 40);

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
        jLabelBack.setBounds(30, 30, 90, 32);

        showbtn.setText("SHOW");
        showbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });
        getContentPane().add(showbtn);
        showbtn.setBounds(420, 120, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\closed1.jpg")); // NOI18N
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

    // creating function to check if complaint already exists in database
    public boolean checkSolution () {
        String user = users.getSelectedItem().toString();
        boolean solutionExist = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
            String roomQuery = ("SELECT solution FROM `room_comp` WHERE username =?");
            String managementQuery = ("SELECT solution FROM `management_comp` WHERE username =?");
            String securityQuery = ("SELECT solution FROM `security_comp` WHERE username =?");
            String cleanQuery = ("SELECT solution FROM `cleaning_comp` WHERE username =?");
            
            pst1 = con.prepareStatement(roomQuery);
            pst1.setString(1, user);
            rst1 = pst1.executeQuery();
            
            pst2 = con.prepareStatement(managementQuery);
            pst2.setString(1, user);
            rst2 = pst2.executeQuery();
            
            pst3 = con.prepareStatement(securityQuery);
            pst3.setString(1, user);
            rst3 = pst3.executeQuery();
            
            pst4 = con.prepareStatement(cleanQuery);
            pst4.setString(1, user);
            rst4 = pst4.executeQuery();
            
            if(rst1.next() && rst2.next() && rst3.next() && rst4.next()){
                solutionExist = true;
            }
        } 
        
        catch (Exception e){
            System.out.println("Exception occured " +e);
        }
        return solutionExist;
    }
    
    public void getSolution() {
        
    }
    
    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        String user = users.getSelectedItem().toString();
        
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        
        if(checkSolution ()){
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
                    String comp = rstadmin.getString("complaint");
                    String uname = rstadmin.getString("username");
                    String dept = rstadmin.getString("type");

                    model.addRow(new Object [] {cNo, uname, dept, comp, null});
                }

            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
            }    
        }
        else {
           JOptionPane.showMessageDialog(this, "It's closed Complaint");
           model.addRow(new Object [] {"close", "closed", "closed", "closed", "closed"});
       }   
    }//GEN-LAST:event_showbtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(closedComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(closedComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(closedComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(closedComp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new closedComp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetails;
    private javax.swing.JButton showbtn;
    private javax.swing.JComboBox<String> users;
    // End of variables declaration//GEN-END:variables
}
