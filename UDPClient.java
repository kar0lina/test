package Lab2; 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import lab.Packet;
import lab.TimeHistory;

public class UDPClient {
	public static void main(String[] args) {
		
		
		
		
		DatagramSocket aSocket = null;
		Scanner scanner = null;
		try {
			// args contain server hostname
			
			byte[] buffer1 = new byte[1024];
			InetAddress aHost = InetAddress.getByName("localhost");
			int serverPort = 9876;
			aSocket = new DatagramSocket();
			scanner = new Scanner(System.in);
			
			//Punkt 6, kropka 1 - obiekt packet klasy TimeHistory
			Integer[] buffer= {1,2,3,4,5};
			TimeHistory<Integer> packet = new TimeHistory<Integer>("device1", "fajne", 1 , 1, "unit", 1, buffer, 55);
			
			//Punkt 6, kropka 2
			byte[] data = Tools.serialize(packet);
				
				//DatagramPacket request = new DatagramPacket(data.getBytes(), data.length(), aHost, serverPort);
				DatagramPacket request = new DatagramPacket(data, data.length, aHost, serverPort);
				
				//kropka 4
				aSocket.send(request);
				DatagramPacket reply = new DatagramPacket(buffer1, buffer1.length);
				aSocket.receive(reply);
				System.out.println("Reply: " + new String(reply.getData(), 0, reply.getLength()));
				
				
				Object read = Tools.deserialize(buffer1);
				System.out.println(read.toString());
				
				
		} catch (SocketException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnknownHostException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(UDPClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			aSocket.close();
			scanner.close();
		}
		
		//Punkt 6, kropka 1 - obiekt packet klasy TimeHistory
				//Integer[] buffer= {1,2,3,4,5};
				//TimeHistory<Integer> packet = new TimeHistory<Integer>("device1", "fajne", 1 , 1, "unit", 1, buffer, 55);
				
				//Punkt 6, kropka 2
				//byte[] data = Tools.serialize(packet);
				
				//Punkt 6, kropka 3
				//DatagramPacket obiekt1 = new DatagramPacket(data, 0, null, 0);
				
				//Punkt 6, kropka 4
				//.send(obiekt1);
				
				//Punkt 6, kropka 5
				//DatagramPacket reply1 = new DatagramPacket(data, 0);
				
				//Punkt 6, kropka 6
				
				//.receive(reply1);
				
				//kropka 7
				//Files.write(new File(name).toPath(), reply1.getData());
				
				//kropka 8 
	}
}