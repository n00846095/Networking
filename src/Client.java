import java.util.Scanner;

public class Client {
	
	private static String host;
	private static UserThreads[] threads;
	private static String[] commands = {"placeholder", "date", "uptime", "Look up", "netstat",        //array for linux commands need to look up some
			                      "users", "Look up", "exit"};
	
	public static void main(String[] args) {
		String command;                                                                         //command for selection choice
		boolean working = true;                                                                 //to use for the while loop
		
		if(args.length != 1 ){                                                                  //user fails to enter command line argument terminates program           
			System.out.println("Error: No host name entered in command line argument");
			System.out.println("Exiting the program");
			return;
		}//end if
		
		else{                                                                                   //server host name entered as command line argument
			host = args[0];
		}//end else
		
		Scanner in = new Scanner(System.in);                                                   //scanner to read input from keyboard
		int threadNum = -1;                                                                    //declare threadNum and assign negative value
		
		while(threadNum < 1){                                                                  //loop until users are positive integer
			System.out.print("Enter the number of users: ");                                            

			if(in.hasNextInt()) {                                                                           
				threadNum = in.nextInt();
				if(threadNum < 1){                                                              //number of users must be positive
					System.out.println("Invalid Entry");
				}
			}
			else{
				in.nextLine();                                                                  //if not an integer entered
				System.out.println("Invalid entry");
			}
		}                                                                  
		
		System.out.println("Number of threads to be used: " + threadNum);
		
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		while(working){
			UserDisplay ud = new UserDisplay();
			ud.displayMenu();
			int selection = ud.getUserInputFromMenu();
			System.out.println("You selected: " + selection);                                     //just for testing
			
			command = commands[selection];                                                       //command that will be run
			System.out.println("The command is " + command);                                    //for testing
			
			if(command.equals("exit")) {                                                        //if user selects quit
				//need to notify server to quit here
		    System.out.println("Program exiting");
			working = false;                                                                    //for testing just to get out of loop
			}//end if
			
		}//end while
    
		
	}//end main
	
	private static void makeThreads(String command, String host, int threadNum ){
		threads = new UserThreads[threadNum];                                                 //create an array for UserThreads
		
		for(int i = 0; i < threadNum; i++){
			threads[i] = new UserThreads(command, host);                                       //store each thread in the array
		}//end for
	}//end makeThreads
	
	public static void runThreads(){
		
	}
	
	
}//end client class
