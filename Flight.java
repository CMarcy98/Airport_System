
public class Flight
{
	private String flightNumber;
	private String flightDestination;
	private String runway;
	
	/*
	 * Creates attributes of a flight
	 */
	public Flight(String number, String destination, String runway)
	{
		flightNumber = number;
		flightDestination = destination;
		this.runway = runway;
	}

//  <-------------------------------------------->  //
	
	/*
	 * Returns the flight number
	 */
	public String getFlightNumber()
	{
		return flightNumber;
	}

	/*
	 * Sets the flight number
	 */
	public void setNumber(String number)
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
