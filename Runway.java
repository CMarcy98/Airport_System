
public class Runway
{
	private String name;
	private Queue<Flight> flightQueue;
	private ListArrayBasedPlus<Flight> waitingList;
	
	/*
	 * Creates a run-way with a specific name
	 * @param name The name of the run-way
	 */
	public Runway(String name)
	{
		this.name = name;
		flightQueue = new Queue<Flight>(); 
		waitingList = new ListArrayBasedPlus<Flight>();
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
	public ListArrayBasedPlus<Flight> getWaitingList()
	{
		return waitingList;
	}
	
	/*
	 * Returns the name of the run-way
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * Removes the flight from the cleared run-way and returns
	 * that plane to be moved somewhere else
	 * @return The flight that was at the beginning of the queue
	 */
	public Flight getFromRunway()
	{
		return flightQueue.dequeue();
	}
	
	/*
	 * Removes a plane from the waiting list to be 
	 * moved somewhere else
	 * @return The flight searched for or null if not found
	 */
	public Flight getFromWaiting(String flightNumber)
	{
		Flight returnFlight = null;
		
		for(int i = 0; i < waitingList.size(); i++) {
			Flight flight = waitingList.get(i);
			if(flight.getFlightNumber().equals(flightNumber)) {
				returnFlight = flight;
			}
			waitingList.remove(i);
		}
		
		return returnFlight;
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
	

	
	/*
	 * Adds a flight to enter the waiting area where
	 * it waits to re-enter the run-way
	 * @param flight The flight to be added to the waiting list
	 */
	public void addToWaiting(Flight flight)
	{
		waitingList.add(waitingList.size(), flight);
	}
	
	
} // end of class
