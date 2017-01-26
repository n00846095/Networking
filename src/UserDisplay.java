import java.util.Scanner;

public class UserDisplay {
	
	public void displayMenu(){
		
		System.out.println("");	
		System.out.println("+----------------------------------+");
	    System.out.println("| MAIN MENU:                       |");
		System.out.println("+----------------------------------+");	
	    System.out.println("| 1.  Host Current Date and Time   |");
		System.out.println("| 2.  Host Uptime                  |");
		System.out.println("| 3.  Host Memory Use              |");
		System.out.println("| 4.  Host Netstat                 |");
		System.out.println("| 5.  Host Current Users           |");
		System.out.println("| 6.  Host Running Processes       |");
		System.out.println("| 7.  Quit                         |");
		System.out.println("+----------------------------------+");
	    System.out.println("");
	    System.out.print("Enter the number selection to run on server: ");
	    return;
	}//end display menu
	
	public int getUserInputFromMenu(){
		
		int choice = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(choice < 1 || choice > 7){                                                       //loop until valid selection is made by user
			if(input.hasNextInt()) {                                                                          
				choice = input.nextInt();
				if(choice < 1 || choice > 7){                                                  //if integer wasn't a valid choice
					System.out.println("Invalid choice");
					System.out.print("Enter the number selection to run on server: ");
				}
			}
			else{
				input.nextLine();                                                               //if user doesn't enter an integer
				System.out.println("Invalid choice");
				System.out.print("Enter the number selection to run on server ");
			}
		} 
		return choice;
		
	}//end getUserInputFromMenu

}

