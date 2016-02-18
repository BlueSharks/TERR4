package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Line implements Data{
	private int sizeTotal;
	private int sizeCurrent;
	private List<Station> stations = new ArrayList<Station>();
	private List<Canton> cantons = new ArrayList<Canton>();
	
	public Line() {
		
	}
	
	public void addStation(Station station) {
		if (!stations.contains(station)) {  
			stations.add(station);
		}
	}
	
	public void addCanton(int num, int sizeCanton){
		Canton canton = null;
		if (sizeCurrent + sizeCanton <= sizeTotal){
			canton = new Canton(num, sizeCanton, sizeCurrent, sizeTotal);
			sizeCurrent += sizeCanton;
		}
		cantons.add(canton);
	}
	
	public void loadStation(String file) {
		String line, fields[];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				fields = line.split(";");
				Station station = new Station(fields[0], fields[1], fields[2]);
				addStation(station);
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public List<Station> getStation(){
		return stations;
	} 
	
	public List<Canton> getCanton(){
		return cantons;
	}
}
