
package play.server;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


class ClientHandler implements Runnable{
    Scanner scn=new Scanner(System.in);
    String name;
    final DataInputStream dis;
    final DataOutputStream dos;
    Socket s;
    boolean isLoggedin;
    
    public ClientHandler(Socket s, String name, DataInputStream dis,DataOutputStream dos){
        this.dis=dis;
        this.dos=dos;
        this.name=name;
        this.s=s;
        this.isLoggedin=true;
    }

    @Override
    public void run() {
        
        String received;
        while(true){
            try {
                received=dis.readUTF();
                if(received.equals("")||received.equals(" ")){
                    System.out.println("Empty massage");
                }
                else if(received.equals("logout")){
                    this.isLoggedin=false;
                    System.out.println(this.name+" his logout");
                    this.s.close();
                    break;
                }
                else{
                StringTokenizer st=new StringTokenizer(received,"#");
                String MsgToSend=st.nextToken();
                String recipient=st.nextToken();
                

                for(ClientHandler mc: Server.ar){
                    if(mc.name.equals(recipient) && mc.isLoggedin==true){
                        mc.dos.writeUTF(this.name+"#"+MsgToSend);
                        break;
                    }
                }
                }
            }
            catch(IOException e){
                e.printStackTrace();
                
            }
        }
        
        
        try{
            this.dis.close();
            this.dos.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}


public class Server {
    
    
    static Vector<ClientHandler> ar = new Vector<>();
    // counter for clients
    
    //Driver Code 
    public static void main(String[] args) throws IOException{
        ServerSocket ss=new ServerSocket(2020);
        Socket s;
        String name=null;
        while(true){
            s=ss.accept();
            System.out.println("New client request received : "+s);
            
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            //login 
            String login=dis.readUTF();
            if(login.charAt(0)=='@'){
                name=login.substring(1);
            }
            System.out.println("Creating a new handler for this client...");
            
            // create a new handler object for handling this request
            
            ClientHandler mtch=new ClientHandler(s,name,dis,dos);
            
            Thread t=new Thread(mtch);
            System.out.println("This Client joined with username : "+mtch.name);
            System.out.println("This user joined the Active users list");
            
            ar.add(mtch);
            //start the thread
            
            t.start();
            
        }
    }
    }

