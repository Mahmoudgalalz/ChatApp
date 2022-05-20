package CLient;


import static CLient.Chat.textArea;
import CLient.friends;
import static CLient.friends.chat;
import static CLient.friends.friendChat;
import static CLient.friends.friendsList;
import static CLient.friends.friendsNum;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.StringTokenizer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class name extends javax.swing.JFrame {
public  static Socket s;
   public  static DataInputStream din;
   public   static DataOutputStream dout;
   public static BufferedReader br;
   public  static String str="",str2="", screen="";
   
   
    public static String Name;
    public name() {
        initComponents();
    }

    private void join_to_server()
    {
                Name = textName.getText();
        try {
        dout.writeUTF("@" + Name); // ## <- hash to name
            dout.flush();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        this.setVisible(false);
        new friends().setVisible(true);
    }
       public void playSong (String URI) throws Exception
    {
        File file = new File(URI);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
  
        clip.start();
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textName = new javax.swing.JTextField();
        join = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        setMinimumSize(new java.awt.Dimension(550, 450));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        textName.setBackground(new java.awt.Color(204, 204, 255));
        textName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textName.setForeground(new java.awt.Color(102, 102, 102));
        textName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textName.setText("enter your name");
        textName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textNameMouseClicked(evt);
            }
        });
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNameKeyPressed(evt);
            }
        });
        jPanel1.add(textName);
        textName.setBounds(96, 149, 376, 62);

        join.setBackground(new java.awt.Color(255, 153, 51));
        join.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        join.setForeground(new java.awt.Color(102, 102, 102));
        join.setText("join");
        join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinActionPerformed(evt);
            }
        });
        join.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                joinKeyPressed(evt);
            }
        });
        jPanel1.add(join);
        join.setBounds(175, 262, 214, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\amine\\OneDrive\\Desktop\\20525674.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        textName.setText("");
    }//GEN-LAST:event_textNameActionPerformed

    private void joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinActionPerformed

        join_to_server();
        
    }//GEN-LAST:event_joinActionPerformed

    private void textNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNameMouseClicked
      textName.setText("");
    }//GEN-LAST:event_textNameMouseClicked

    private void joinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_joinKeyPressed

    }//GEN-LAST:event_joinKeyPressed

    private void textNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyPressed
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER)
                        join_to_server();
    }//GEN-LAST:event_textNameKeyPressed

    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(name.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new name().setVisible(true);
            }
        });
        //localhost
        //chatcneter.francecentral.cloudapp.azure.com  /// dns
        //chats.francecentral.cloudapp.azure.com
        //192.168.43.210
        //135880

          s=new Socket("chats.francecentral.cloudapp.azure.com",2020);
        din=new DataInputStream(s.getInputStream());
        dout=new DataOutputStream(s.getOutputStream());
         br=new BufferedReader(new InputStreamReader(System.in));
        
                System.out.println(InetAddress.getLocalHost());

  while(true)
{

str2=din.readUTF();
  new name().playSong("pop.wav");
  
  String sendName="";
  String msg="";
    System.out.println(str2);
   StringTokenizer st =new StringTokenizer(str2,"#");
   
   sendName = st.nextToken();
   msg = st.nextToken();

   int IDfriend = 1;
   
   for (int i=1; i<=friendsNum ; ++i)
   {
       System.out.println(friendsList[i] + "j");
       if (friendsList[i].equals(sendName)) {
          // System.out.println("found");
           IDfriend = i;
       }
       
   }
   

chat[IDfriend] += "\n"+ sendName +" : "+msg;

if (IDfriend == friendChat)
textArea.setText(chat[friendChat]);

}

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton join;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
