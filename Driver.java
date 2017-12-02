import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		int optionNumber = -1;
		String strPlaneNumber = "";
		String strDestination = "";
		String strRunway = "";
		
		int planeNumber;
		int idNumber;
		int planeCount = 0;
		String input = "";
		
		
		while(optionNumber != 9) {
			System.out.println("\nSelect from the following menu:\n"
					+ "\t1. Plane enters the system.\n"
					+ "\t2. Plane takes off.\n"
					+ "\t3. Plane is allowed to re-enter a runwayT.\n"
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
					
				// Deletes key from tree
				case 2:
					System.out.println("Deleting a person from the tree....");

					//Reads id of person to be deleted
					System.out.print("Id of person: ");
					id = buff.readLine();
					idNumber = Integer.parseInt(id);
					//System.out.println(idNumber);
					
					break;
					
				// Searches for key in tree	
				case 3:
					if(bst.getSize() == 0) {
						System.out.println("The tree is empty.");
					} else {
						System.out.println("Searching for a person in the tree....");
	
						//Reads id of person to be deleted
						System.out.print("Id of person: ");
						id = buff.readLine();
						idNumber = Integer.parseInt(id);
						//System.out.println(idNumber);
						
						try {
							System.out.println("Searching for person with id " + idNumber + " in the tree...");
							Person foundPerson = bst.retrieve(idNumber);
							System.out.println(foundPerson.getName() + " was found with the id " + idNumber + "!");
						} catch(NullPointerException e) {
							System.out.println("Sorry, there is no one with that id.");
						}
					}
					
					break;
					
				// Displays height of tree	
				case 4:
					System.out.println("The height of the tree is currently " + bst.getHeight());
					break;
					
				// Displays size of tree
				case 5:
					System.out.println("The size of the binary search tree is: " + bst.getSize() + "\n");
					break;
				
				// Displays tree inorder
				case 6:
					System.out.println(bst.toStringInorder());				
					break;
					
				// Displays tree in preorder	
				case 7:
					System.out.println(bst.toStringPreorder());				
					break;
				
				// Displays tree in postorder
				case 8:
					System.out.println(bst.toStringPostorder());				
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
	
	
//	private static void printInOrder(TreeNode node)
//	{
//		if(node == null) {
//			return;
//		}
//		
//		//Print left child
//		printInOrder(node.getLeftChild());
//		
//		//Print current key
//		System.out.println(node.getItem().toString() + " ");
//		
//		//Print right child
//		printInOrder(node.getRightChild());
//	}
}// end driver
