
public class Flight
{
	private int flightNumber;
	private String flightDestination;
	private Runway runway;
	
	/*
	 * Creates attributes of a flight
	 */
	public Flight(int number, String destination, String runway)
	{
		flightNumber = number;
		flightDestination = destination;
		this.runway = runway;
	}

//  <-------------------------------------------->  //
	
	/*
	 * Returns the flight number
	 */
	public int getFlightNumber()
	{
		return flightNumber;
	}

	/*
	 * Sets the flight number
	 */
	public void setNumber(int number)
	{
		flightNumber = number;
	}

//  <-------------------------------------------->  //

	
	/*
	 * Returns the flight destination
	 */
	public String getFlightDestination()
	{
		return flightDestination;
	}

	/*
	 * Sets the flights destination
	 */
	public void setDestination(String destination)
	{
		flightDestination = destination;
	}

//  <-------------------------------------------->  //
	
	/*
	 * Returns the run way that the plane is on
	 */
	public String getRunway()
	{
		return runway;
	}

	/*
	 * Sets the run way that the plane is on
	 */
	public void setRunway(String runway)
	{
		this.runway = runway;
	}
	
} // end of Flight class
