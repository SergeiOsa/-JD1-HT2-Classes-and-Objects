package oskerko.simpleObjects.task10.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {

	private List<Airline> airlineList;
	
	public AirlineList() {
		this.airlineList = new ArrayList<Airline>();
	}
	
	public AirlineList(List<Airline> airlineList) {
		this.airlineList = new ArrayList<Airline>();
	}
	
	public void add(Airline airline) {
		airlineList.add(airline);
	}
	
	public void remove(int index) {
		airlineList.remove(index);
	}
	
	public int getSize() {
		return airlineList.size();
	}
	
	public Airline getAirline(int index) {
		return airlineList.get(index);
	}
	
	public List<Airline> getAirlineList() {
		return airlineList;
	}
	
	public void setAirlineList(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}
	
}
