/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Gopi
 */
public class SearchFiles extends javax.swing.JFrame {

    /**
     * Creates new form SearchFiles
     */
    public SearchFiles() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPCS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabelPCS.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPCS.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        jLabelPCS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPCS.setText("Predictable Convergent Solutions");
        getContentPane().add(jLabelPCS);
        jLabelPCS.setBounds(390, 60, 530, 120);

        jLabel2.setText("Search Video:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 210, 110, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(510, 210, 200, 30);

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(750, 210, 65, 30);

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 260, 200, 260);

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 550, 47, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a.jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String key=jTextField1.getText();
        String s1,s2,s3;
        ArrayList values= new ArrayList();
              
        
        int i=0;
        System.out.println("name"+key);
        try{
        Connection con=DatabaseConnection.dbConnection();
        PreparedStatement pst1=con.prepareStatement("Select * from videos");
        
         ResultSet rss=pst1.executeQuery();
                while(rss.next()){
                    
                    s1=rss.getString(1);
                    s2=rss.getString(2);s3=rss.getString(3);
                     System.out.println("S1--"+s1+"S2--"+s2+"S3--"+s3);
                    if(s1.contains(key)||s2.contains(key)||s3.contains(key)){
                        s1=s1.trim();
                        values.add(i, s1);
                        i++;
                        System.out.println("SS!"+s1);
                //        jComboBox1.addItem(s1);
                     
                    
                    }
                    
                }
               
        }
          catch(Exception e){}
        jList1.setListData(values.toArray());
//                 jList1.addListSelectionListener(new ListSelectionListener()
//               {                    
//                   @Override
//                   public void valueChanged(ListSelectionEvent lse) {
//                       
//                      String[] video_name={jList1.getSelectedValue().toString()}; 
//                      video_name[0]="file:///D:/pcs/"+jList1.getSelectedValue().toString()+".mp4";
//                      MediaPlayer.main(video_name);
//                   }
//
//               });
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        System.out.println(jList1.getSelectedValue());
        String VName=jList1.getSelectedValue().toString();
        NewVideoHTML.main(VName);
        BrowserEmbed.main(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPCS;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
