import java.net.*;
class Sender{
public static void main(String args[])throws Exception{
 DatagramSocket ds=new DatagramSocket();
 String str="welcome java";
 InetAddress ip=InetAddress.getByName("127.0.0.1");
 DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
 ds.send(dp);
 ds.close();
}
}