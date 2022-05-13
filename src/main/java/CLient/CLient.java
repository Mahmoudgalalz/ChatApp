package CLient;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import static CLient.friends.chat;
import static CLient.friends.friendChat;
import static CLient.friends.friendsList;
import static CLient.name.Name;
import static CLient.name.din;
import static CLient.name.dout;
import static CLient.name.s;
import static CLient.name.screen;
import static CLient.name.str;
import static CLient.name.str2;
import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class CLient extends javax.swing.JFrame implements Runnable {

    public static String msg="";
   
     
    public CLient() {
        initComponents();
        nameChat.setText(friendsList [friendChat]);
       textArea.setText(chat[friendChat]);
        
    }

    
    public void send()
    {
         try
        {
            str= text.getText();
           /////       متنساش ال سكرول بانال
           
            String ss = str+"#"+ friendsList[friendChat];
                dout.writeUTF(ss);
     
            chat[friendChat] += "\n" + Name +" : "+str;
            textArea.setText(chat[friendChat]);
            text.setText("");
            
        }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        text = new javax.swing.JTextField();
        send = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        nameChat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        textArea.setBackground(new java.awt.Color(204, 204, 255));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        textArea.setForeground(new java.awt.Color(51, 51, 51));
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        text.setBackground(new java.awt.Color(204, 204, 255));
        text.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text.setForeground(new java.awt.Color(0, 51, 51));
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        send.setBackground(new java.awt.Color(255, 153, 51));
        send.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        send.setForeground(new java.awt.Color(102, 102, 102));
        send.setText("send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        nameChat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameChat.setForeground(new java.awt.Color(102, 102, 102));
        nameChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(nameChat, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(nameChat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed

       send();
    }//GEN-LAST:event_sendActionPerformed


    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLient().setVisible(true);
            }     
        });
        
        
        
      
        
      


}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameChat;
    private static javax.swing.JToggleButton send;
    private static javax.swing.JTextField text;
    public static javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
