package team;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class report extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    ResultSet rst1 = null;
    ResultSet rst2 = null;
    ResultSet rst3 = null;
    ResultSet rst4 = null;

    public report() {
        initComponents();
        this.setSize(870, 620);
        this.setLocationRelativeTo(null);
    }
    
    String userName;
    public report (String uname){
        initComponents();
        userName = uname;
        
        DefaultTableModel model = (DefaultTableModel)jTableDetails.getModel();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            
             String query1 = ("SELECT * FROM room_comp where username =?");
                pst1 = con.prepareStatement(query1);
                pst1.setString(1, userName);
                rst1 = pst1.executeQuery();
                
                if(rst1.next()){
                    String cNo = rst1.getString("cNo");
                    String dep = rst1.getString("type");
                    String comp = rst1.getString("complaint");
                    
                    model.addRow(new Object [] {cNo, dep, comp});
                }
                
            String query2 = ("SELECT * FROM management_comp where username =?");
                pst2 = con.prepareStatement(query2);
                pst2.setString(1, userName);
                rst2 = pst2.executeQuery();
                
                if(rst2.next()){
                    String cNo = rst2.getString("cNo");
                    String dep = rst2.getString("type");
                    String comp = rst2.getString("complaint");
                    
                    model.addRow(new Object [] {cNo, dep, comp});
                }
                
            String query3 = ("SELECT * FROM security_comp where username =?");
                pst3 = con.prepareStatement(query3);
                pst3.setString(1, userName);
                rst3 = pst3.executeQuery();
                
                if(rst3.next()){
                    String cNo = rst3.getString("cNo");
                    String dep = rst3.getString("type");
                    String comp = rst3.getString("complaint");
                    
                    model.addRow(new Object [] {cNo, dep, comp});
                }
                
            String query4 = ("SELECT * FROM cleaning_comp where username =?");
                pst4 = con.prepareStatement(query4);
                pst4.setString(1, userName);
                rst4 = pst4.executeQuery();
                
                if(rst4.next()){
                    String cNo = rst4.getString("cNo");
                    String dep = rst4.getString("type");
                    String comp = rst4.getString("complaint");
                    
                    model.addRow(new Object [] {cNo, dep, comp});
                }
                
                con.close();
                pst1.close();
                pst2.close();
                pst3.close();
                pst4.close();
                rst1.close();
                rst2.close();
                rst3.close();
                rst4.close();
        }
        
        catch(Exception e){
            System.out.println("Exception"+e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetails = new javax.swing.JTable();
        jLabelBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cNo", "specific department", "complaint"
            }
        ));
        jScrollPane1.setViewportView(jTableDetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 310, 870, 310);

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
        jLabelBack.setBounds(20, 20, 90, 32);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Complaint reports");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 20, 210, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\icons8_pdf_32px.png")); // NOI18N
        jButton1.setText("Download Report in PDF");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 80, 210, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\team\\images\\report.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 870, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldata", "root", "root");
            System.out.println("Downloading PDF...");
            
//            String fileName = "C:\\Users\\mdamm\\OneDrive\\Documents\\generatePDF\\first_pdf.pdf";
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("Complaints.pdf"));
            doc.open();
            
            String query1 = ("SELECT * FROM room_comp where username =?");
            pst1 = con.prepareStatement(query1);
            pst1.setString(1, userName);
            rst1 = pst1.executeQuery();
            
            if(rst1.next()){
                String cNo = rst1.getString("cNo");
                String dep = rst1.getString("type");
                String comp = rst1.getString("complaint");
                    
                Paragraph para = new Paragraph("Your complaint no. is: "+cNo+ "\nDepartment is: " +dep+ "\nComplaint is: " +comp);
                doc.add(para);
                doc.add(new Paragraph(" "));
            }
                
            String query2 = ("SELECT * FROM management_comp where username =?");
            pst2 = con.prepareStatement(query2);
            pst2.setString(1, userName);
            rst2 = pst2.executeQuery();
                
            if(rst2.next()){
                String cNo = rst2.getString("cNo");
                String dep = rst2.getString("type");
                String comp = rst2.getString("complaint");

                Paragraph para = new Paragraph("Your complaint no. is: "+cNo+ "\nDepartment is: " +dep+ "\nComplaint is: " +comp);
                doc.add(para);
                doc.add(new Paragraph(" "));
            }
            
            String query3 = ("SELECT * FROM security_comp where username =?");
            pst3 = con.prepareStatement(query3);
            pst3.setString(1, userName);
            rst3 = pst3.executeQuery();
                
            if(rst3.next()){
                String cNo = rst3.getString("cNo");
                String dep = rst3.getString("type");
                String comp = rst3.getString("complaint");

                Paragraph para = new Paragraph("Your complaint no. is: "+cNo+ "\nDepartment is: " +dep+ "\nComplaint is: " +comp);
                doc.add(para);
                doc.add(new Paragraph(" "));
            }
                
            String query4 = ("SELECT * FROM cleaning_comp where username =?");
            pst4 = con.prepareStatement(query4);
            pst4.setString(1, userName);
            rst4 = pst4.executeQuery();
                
            if(rst4.next()){
                String cNo = rst4.getString("cNo");
                String dep = rst4.getString("type");
                String comp = rst4.getString("complaint");

                Paragraph para = new Paragraph("Your complaint no. is: "+cNo+ "\nDepartment is: " +dep+ "\nComplaint is: " +comp);
                doc.add(para);
                doc.add(new Paragraph(" "));
            }
            
            con.close();
            pst1.close();
            pst2.close();
            pst3.close();
            pst4.close();
            rst1.close();
            rst2.close();
            rst3.close();
            rst4.close();
            
            doc.close();
            JOptionPane.showMessageDialog(this, "PDF Downloaded Succesfully");
            System.out.println("Succesfully Downloaded"); 
        }

        catch (Exception e){
            System.out.println("Exception occured " +e);
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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetails;
    // End of variables declaration//GEN-END:variables
}
