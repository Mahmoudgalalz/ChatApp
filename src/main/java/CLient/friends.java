package CLient;

import static CLient.name.Name;
import static CLient.name.dout;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class friends extends javax.swing.JFrame {

    public static String friendsList[] = new String [1000];
    public static String chat[] = new String [1000];
    public static int friendsNum=0;
    public static int friendChat ;
    
    public friends() {
        initComponents();
        welcomeText.setText("Welcome, " + Name);
        youAreFriends.setVisible(false);
         listFriends.setListData(friendsList);
         Arrays.fill(chat, "");
         
    }
 private void ADDFriend()
 {
             for (int i=1 ; i<=friendsNum ; ++i)
        {
            if (friendsList[i].equals( addFriendText.getText()) )
            {
                youAreFriends.setVisible(true);
                return;
            }
           // System.out.println(friendsList[i]);
        }
        friendsList [++friendsNum] = addFriendText.getText();

        listFriends.setListData(friendsList);
        
         addFriendText.setText("");
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFriends = new javax.swing.JList<>();
        welcomeText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addFriendText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        youAreFriends = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Friends");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        listFriends.setBackground(new java.awt.Color(204, 204, 255));
        listFriends.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listFriends.setForeground(new java.awt.Color(51, 51, 51));
        listFriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listFriendsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listFriends);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 214, 392);

        welcomeText.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(102, 102, 102));
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(welcomeText);
        welcomeText.setBounds(80, 30, 460, 62);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("my Friends");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 130, 190, 40);

        addFriendText.setBackground(new java.awt.Color(204, 204, 255));
        addFriendText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addFriendText.setForeground(new java.awt.Color(102, 102, 102));
        addFriendText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addFriendText.setText("name's friend");
        addFriendText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFriendTextMouseClicked(evt);
            }
        });
        addFriendText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendTextActionPerformed(evt);
            }
        });
        addFriendText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addFriendTextKeyPressed(evt);
            }
        });
        jPanel1.add(addFriendText);
        addFriendText.setBounds(340, 220, 290, 65);

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Add friend");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 320, 156, 36);

        youAreFriends.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        youAreFriends.setForeground(new java.awt.Color(153, 0, 0));
        youAreFriends.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        youAreFriends.setText("you are friends");
        jPanel1.add(youAreFriends);
        youAreFriends.setBounds(360, 380, 253, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\amine\\OneDrive\\Desktop\\20525674.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 0, 670, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String ss = "logout";
        try {
            dout.writeUTF(ss);
        } catch (IOException ex) {
            Logger.getLogger(friends.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         ADDFriend();
    }//GEN-LAST:event_jButton1MouseClicked

    private void addFriendTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFriendTextActionPerformed

    private void addFriendTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFriendTextMouseClicked
        addFriendText.setText("");
        youAreFriends.setVisible(false);
    }//GEN-LAST:event_addFriendTextMouseClicked

    private void listFriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFriendsMouseClicked

     
        if (listFriends.getSelectedIndex() <= friendsNum)
        {
            friendChat = listFriends.getSelectedIndex();
             new Chat().setVisible(true);
        }

    }//GEN-LAST:event_listFriendsMouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_ENTER)
             ADDFriend();
    }//GEN-LAST:event_jButton1KeyPressed

    private void addFriendTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addFriendTextKeyPressed
                if (evt.getKeyCode() == KeyEvent.VK_ENTER)
                        ADDFriend();
    }//GEN-LAST:event_addFriendTextKeyPressed

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
            java.util.logging.Logger.getLogger(friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(friends.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new friends().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addFriendText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JList<String> listFriends;
    private javax.swing.JLabel welcomeText;
    private javax.swing.JLabel youAreFriends;
    // End of variables declaration//GEN-END:variables
}
