
public class Airport {

	private Queue<Runway> runways;
	private int planeCount;
	
	/*
	 * Creates attributes of an airport
	 * @param runWayCount The number of run-ways for the airport
	 */
	public Airport(int runwayCount) {
		runways = new Queue<Runway>();
		
		planeCount = 0;
	}
	
//  <-------------------------------------------->  //
	
	/*
	 * Returns all run-ways in the airport
	 * @return The runways in the airport
	 */
	public Queue<Runway> getRunways()
	{
		return runways;
	}
	
	/*
	 * Returns the count of how many planes left the airport
	 * @return The count of planes that left the airport
	 */
	public int getPlaneCount()
	{
		return planeCount;
	}
	
//  <-------------------------------------------->  //

	
	
	
}
