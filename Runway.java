
public class Runway
{
	private String name;
	private Queue<Flight> flightQueue;
	private MyListReferenceBased<Flight> waitingList;
	
	/*
	 * Creates a runway with a specific name
	 * @param name The name of the run-way
	 */
	public Runway(String name)
	{
		this.name = name;
		flightQueue = new Queue<Flight>(); 
		waitingList = new MyListReferenceBased<Flight>();
	}
	
//  <-------------------------------------------->  //
	
	/*
	 * Returns the queue of planes waiting to take off
	 * @return Returns the queue of the 
	 */
	public Queue<Flight> getFlightQueue()
	{
		return flightQueue;
	}
	
	/*
	 * Returns the list of planes waiting to re-enter the run-way
	 */
	public MyListReferenceBased<Flight> getWaitingList()
	{
		return waitingList;
	}
	
	/*
	 * Returns the name of the runway
	 */
	public String getName()
	{
		return name;
	}
	
	
//  <-------------------------------------------->  //
	
	
	/*
	 * Adds a specific flight to the run way. The plane
	 * is eligible for take-off
	 * @param flight The flight to be added 
	 */
	public void addToRunway(Flight flight)
	{
		flightQueue.enqueue(flight);
	}
	
	public void addToWaiting(Flight flight)
	{
		waitingList.add
	}
	
	
	
	
	
	
} // end of class
