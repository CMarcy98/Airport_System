import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		String strPlaneNumber = "";
		String strDestination = "";
		String strRunway = "";	
		String input = "";

		int optionNumber = -1;
		int planeNumber;
		int idNumber;
		int planeCount = 0;
		int runwayCount = 0;
		
		boolean isNumber = false;
		
		
		//Initializing airport
		System.out.println("Welcome to the Airport program");
		
		while(!isNumber) {
			System.out.print("Enter the number of runways: ");
			try {
				runwayCount = Integer.parseInt(buff.readLine());
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("Sorry, that is not a number");
			}
		}
		
		
		
		
		
		/*
		 * ---Menu options---
		 */
		while(optionNumber != 9) {
			System.out.println("\nSelect from the following menu:\n"
					+ "\t1. Plane enters the system.\n"
					+ "\t2. Plane takes off.\n"
					+ "\t3. Plane is allowed to re-enter a runway.\n"
					+ "\t4. Runway opens.\n"
					+ "\t5. Runway closes.\n"
					+ "\t6. Display info about planes waiting to take off.\n"
					+ "\t7. Display info about planes waiting to be allowed to re-enter a runway.\n"
					+ "\t8. Display number of planes who have taken off.\n"
					+ "\t9. Exit");
			System.out.print("Make your menu selection now: ");
			input = buff.readLine();
			optionNumber = Integer.parseInt(input);
			
			
			switch(optionNumber) {
			
				/* 1. Inserts plane into system.
				 * 
				 *      --Requirements--
				 * + Flight number uniqueness
				 * + Run way needs to be existing
				 * 
				 *   --Input needed--
				 * 1. Flight Number
				 * 2. Destination
				 * 3. Run way
				 */
				case 1:
					System.out.println("Entering a new plane into the system....");
					
					// Reads flight number
					System.out.print("Flight # of new plane: ");
					strPlaneNumber = buff.readLine();
					planeNumber = Integer.parseInt(strPlaneNumber);
					
					// Reads destination of new plane
					System.out.print("Enter destination of plane: ");
					strDestination = buff.readLine();
					
					// Reads run way the new plane will be entering
					System.out.print("Enter the name of the runway it will be entering:");
					strRunway = buff.readLine();
					
					//Creates Plane and adds it to the system if it passes the tests
					//TODO Make plane object
					
					break;
					
				// Plane takes off from airport
				case 2:
					
					
					break;
					
				// Plane is allowed to re-enter a run-way	
				case 3:
					
					
					break;
					
				// Run-way opens
				case 4:
					
					
					break;
					
				// Run-way closes
				case 5:
					
					
					break;
				
				// Display info about planes waiting to take off
				case 6:
					
									
					break;
					
				// Display info about planes waiting to be allowed to re-enter a run-way	
				case 7:

					
					break;
				
				// Display number of planes who have taken off
				case 8:

					System.out.println();
					break;
					
					
				// Exits program
				case 9:
					System.out.println("Exiting....");
					break;
				
				default:	
					break;
			}// end switch
		}// end while
		
	}// end main
	
}// end driver
