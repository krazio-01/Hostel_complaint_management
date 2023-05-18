package team;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class dashboard extends javax.swing.JFrame {

    public dashboard() {
        initComponents();
        this.setSize(1350, 750);
        this.setLocationRelativeTo(null);
    }
    
    String username;
    public dashboard (String uname){
        initComponents();
        username = uname;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        room = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        management = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        security = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        housekeep = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\R.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 210, 230, 140);

        room.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\1.png")); // NOI18N
        room.setText("jLabel3");
        room.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomMouseExited(evt);
            }
        });
        getContentPane().add(room);
        room.setBounds(570, 210, 230, 140);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\S.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(800, 210, 230, 140);

        management.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\3.png")); // NOI18N
        management.setText("jLabel5");
        management.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        management.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        management.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managementMouseExited(evt);
            }
        });
        getContentPane().add(management);
        management.setBounds(340, 350, 230, 140);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\F.png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 350, 230, 140);

        security.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\4.png")); // NOI18N
        security.setText("jLabel7");
        security.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        security.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                securityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                securityMouseExited(evt);
            }
        });
        getContentPane().add(security);
        security.setBounds(800, 350, 230, 140);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\M.png")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 490, 230, 140);

        housekeep.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\2.png")); // NOI18N
        housekeep.setText("jLabel9");
        housekeep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        housekeep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        housekeep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                housekeepMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                housekeepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                housekeepMouseExited(evt);
            }
        });
        getContentPane().add(housekeep);
        housekeep.setBounds(570, 490, 230, 140);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\H.png")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(800, 490, 230, 140);

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
        jLabelBack.setBounds(20, 30, 90, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\bg.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1350, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseEntered
        room.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\1_modified.png"));
    }//GEN-LAST:event_roomMouseEntered

    private void roomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseExited
        room.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java"
                + "\\images\\1.png"));
    }//GEN-LAST:event_roomMouseExited

    private void roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseClicked
        Room room = new Room(username);
        room.setVisible(true);
        room.setSize(870, 620);
        room.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_roomMouseClicked

    private void managementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managementMouseEntered
        management.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\3_modified.png"));
    }//GEN-LAST:event_managementMouseEntered

    private void managementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managementMouseExited
        management.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\"
                + "java\\images\\3.png"));
    }//GEN-LAST:event_managementMouseExited

    private void housekeepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_housekeepMouseEntered
        housekeep.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\2_modified.png"));
    }//GEN-LAST:event_housekeepMouseEntered

    private void housekeepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_housekeepMouseExited
        housekeep.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main"
                + "\\java\\images\\2.png"));
    }//GEN-LAST:event_housekeepMouseExited

    private void securityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseEntered
        security.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main\\java\\images\\4_modified.png"));
    }//GEN-LAST:event_securityMouseEntered

    private void securityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseExited
        security.setIcon(new javax.swing.ImageIcon("C:\\Users\\mdamm\\OneDrive\\Documents\\NetBeansProjects\\CompManagementSys\\src\\main"
                + "\\java\\images\\4.png"));
    }//GEN-LAST:event_securityMouseExited

    private void managementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managementMouseClicked
        Management mg = new Management(username);
        mg.setVisible(true);
        mg.setSize(870, 620);
        mg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_managementMouseClicked

    private void securityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseClicked
        Security sec = new Security(username);
        sec.setVisible(true);
        sec.setSize(870, 620);
        sec.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_securityMouseClicked

    private void housekeepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_housekeepMouseClicked
        Cleaning clean = new Cleaning(username);
        clean.setVisible(true);
        clean.setSize(870, 620);
        clean.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_housekeepMouseClicked

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        userPage user = new userPage(username);
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel housekeep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel management;
    private javax.swing.JLabel room;
    private javax.swing.JLabel security;
    // End of variables declaration//GEN-END:variables
}
