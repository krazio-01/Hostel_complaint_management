package images;
import java.awt.Color;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        room = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 270, 0, 0);

        room.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        room.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                roomMouseMoved(evt);
            }
        });
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
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });
        getContentPane().add(room);
        room.setBounds(550, 270, 72, 6);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 270, 0, 0);
        getContentPane().add(jButton4);
        jButton4.setBounds(776, 410, 240, 140);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 410, 0, 140);
        getContentPane().add(jButton3);
        jButton3.setBounds(320, 410, 230, 140);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 550, 0, 0);
        getContentPane().add(jButton5);
        jButton5.setBounds(550, 550, 72, 140);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 550, 240, 0);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_roomMouseMoved

    private void roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_roomMouseClicked

    private void roomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseEntered
        room.setBackground(new Color(236, 240, 241));
    }//GEN-LAST:event_roomMouseEntered

    private void roomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseExited
        //         room.setBackground(new Color(236, 240, 241));
    }//GEN-LAST:event_roomMouseExited

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_roomActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton room;
    // End of variables declaration//GEN-END:variables
}
