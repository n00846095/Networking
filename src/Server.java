import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(6789);                       //create a server socket
		System.out.println("Server socket created");                              //prompt that server created server socket
		
		
		Socket connectionSocket = serverSocket.accept();                     //listen for connection
		System.out.println("Connection established");                        //prompt that connection is made
		

	}//end main

}
