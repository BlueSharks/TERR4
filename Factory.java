package model;

public class Factory {
	
	public static Canton newCanton(int id, int riskpurcent, int praticalstate, int length) {
		return new Canton(id, riskpurcent, praticalstate, length);
	}
	
	public static Station newStation(String name, String X, String Y) {
		return new Station(name, X, Y);
	}

}
