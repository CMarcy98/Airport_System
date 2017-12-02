
public class Runway
{
	private String name;
	private Queue<Flight> flightQueue;
	
	public Runway(String name)
	{
		this.name = name;
		flightQueue = new Queue<Flight>(); 
	}
	
	public void add(Flight flight)
	{
		flightQueue.enqueue(flight);
	}
	
	public Queue<Flight> getFlightQueue()
	{
		return flightQueue;
	}
	
	public String getName()
	{
		return name;
	}
}
