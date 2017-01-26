import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class UserThreads extends Thread{
	private double startTime;                          //thread times will be calculated in this class
	private double finishTime;
	private double totalTime;
	public static int port = 6789;
	private String command;
	private String host;
	
	public UserThreads(String command, String host){    //constructor for userThreads
		this.command = command;
		this.host = host;
	}//thread constructor
	
	public void run(){                                       //need to write run method for the threads
		
		try{                                                 //where we will create the sockets for the user threads
			Socket socket = new Socket(this.command, port);  //create the socket for the thread
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);   //printwriter to deal with output from client threads
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //buffered reader to read input stream
			
		}//end try
		catch(Exception e){
			
		}//end catch
		
	}//end run 
}
