/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G0pS
 */
public class NewJFrame1fo extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1fo
     */
    String str,s="";
    public static String uname="";
     public void com(){                                                         
        
        try {
            String charset = "UTF-8";
                        String param1 = "gops";
                        String query = String.format("?q=%s", 
                                    URLEncoder.encode(param1, charset));
                        URL url = new URL("http://172.16.5.133:8084:8084/app2servlet/abcd");
                        HttpURLConnection con = null;
            try {
                con = (HttpURLConnection) url.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
            }
                        con.setRequestProperty("Accept-Charset", charset);

                        con.setDoInput(true);
                        con.setDoOutput(true);
       //		 con.setUseCaches(false);
                        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
       //
       //		 DataOutputStream printout = new DataOutputStream(con.getOutputStream());
       //
       //		 // This is the POST 
       //		 String content ="email=jad939933@hotmail.com&pass=577383";
       //
       //
       //		 printout.writeBytes(content);
       //		 printout.flush();
       //		 printout.close();





                        DataInputStream input = null;
            try {
                input = new DataInputStream(con.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
                        //Read the response
                        while (null != ((str = input.readLine()))) {
                        //System.out.println(str);
                            if(str.contains("<h1>")){
                                int a=str.indexOf(">");
                                int b=str.lastIndexOf("<");
                                str=(String) str.subSequence(a+1,b);
                                s=s+"\n"+str;
                            }
                        }
                        input.close();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea1.setText(s);
      //  System.out.println(s);
        
//        return s;
     }
    public NewJFrame1fo() {
        initComponents();
        try {
            String charset = "UTF-8";
                        String param1 = "gops";
                        String query = String.format("?q=%s", 
                                    URLEncoder.encode(param1, charset));
                        System.out.println("----Start-----");
                        URL url = new URL("http://172.16.5.133:8084/app2servlet/abcde");
                        System.out.println("----Stop-----");
                        HttpURLConnection con = null;
            try {
                con = (HttpURLConnection) url.openConnection();
            } catch (IOException ex) {
                Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
            }
                        con.setRequestProperty("Accept-Charset", charset);

                        con.setDoInput(true);
                        con.setDoOutput(true);
       //		 con.setUseCaches(false);
                        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
       //
       //		 DataOutputStream printout = new DataOutputStream(con.getOutputStream());
       //
       //		 // This is the POST 
       //		 String content ="email=jad939933@hotmail.com&pass=577383";
       //
       //
       //		 printout.writeBytes(content);
       //		 printout.flush();
       //		 printout.close();





                        DataInputStream input = null;
            try {
                input = new DataInputStream(con.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
                        //Read the response
                        while (null != ((str = input.readLine()))) {
                        //System.out.println(str);
                            if(str.contains("<h1>")){
                                int a=str.indexOf(">");
                                int b=str.lastIndexOf("<");
                                str=(String) str.subSequence(a+2,b);
                                s=s+"\n"+str;
                            }
                        }
                        input.close();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(forumthread.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextArea1.setText(s);
     //   System.out.println(s);
        jTextArea1.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("Enter your message");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Message:");

        jLabel2.setText("VideoName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String message=jTextField1.getText();
        String VName=jTextField2.getText();
        String Date=DateTime.main();
         
         inputforumdetails.main(VName,message,uname,Date);
         this.setVisible(false);
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param username
     */
    public static void main(String username) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1fo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        uname=username;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame1fo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
