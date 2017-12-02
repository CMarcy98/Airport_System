import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ListArrayBased<Runway> runwayList = new ListArrayBased<Runway>();
		Queue<Flight> waitingFlights = new Queue<Flight>();
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of runways: ");
		int runways = in.nextInt();

		for (int i = 0; i < runways; i++)
		{
			System.out.print("Enter name of runway #" + i + ": ");
			String name = in.nextLine();
			runwayList.add(i, new Runway(name));
			System.out.println("Runway " + name + "(#" + i + ")" + " created!");
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("1. Plane enters the system.");
		System.out.println("2. Plane takes off.");
		System.out.println("3. Plane is allowed to re-enter a runway.");
		System.out.println("4. Runway opens.");
		System.out.println("5. Runway closes.");
		System.out.println("6. Display info about planes waiting to take off.");
		System.out.println("7. Display info about planes waiting to be allowed to re-enter a runway.");
		System.out.println("8. Display number of planes who have taken off.");
		System.out.println("9. End the program.");

		System.out.println();
		System.out.print("Make menu selection: ");

		int choice = in.nextInt();
		int runwayIndex = 0;
		int planesTakenOff = 0;

		while (choice != 9)
		{
			in = new Scanner(System.in);

			if (choice == 1)
			{
				int number = 0;
				String destination = "";
				String runway = "";

				System.out.println("Enter the flight number: ");
				number = in.nextInt();

				System.out.println("Enter the flight destination: ");
				destination = in.nextLine();

				System.out.println("Enter the runway: ");
				runway = in.nextLine();

				if (! flightIsUnique(number))
					System.out.println("Flight number is not unique!");
				
				else if (! runwayList.search(runway))
					System.out.println("Runway does not exist!");

				else
				{
					runwayList.get(runwayIndex).getFlightQueue().enqueue(new Flight(number, destination, runway));
					runwayIndex++;
				}
			}

			if (choice == 6)
			{
				if (! runwayList.isEmpty())
				{
					for (int i = 0; i < runwayList.size(); i++)
					{
						Runway curr = runwayList.get(i);

						if (! curr.getFlightQueue().isEmpty())
						{
							System.out.println("Runway + " + curr.getName() + "(#" + i + ")" + "has these flight numbers waiting for take off:");
							System.out.println(curr.getFlightQueue().toString());
							System.out.println();
						}

						else
							System.out.println("Runway + " + curr.getName() + "(#" + i + ") is empty.");
					}
				}
				
				else
					System.out.println("There are no planes waiting to take off.");
			}

			if (choice == 7)
			{
				if (! waitingFlights.isEmpty())
					System.out.println(waitingFlights.toString());

				else
					System.out.println("There are no planes waiting to be allowed to re-enter a runway.");
			}
			
			if (choice == 8)
				System.out.println("Number of planes taken off: " + planesTakenOff);
		}

		in.close();
	}
}
