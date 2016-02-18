package model;
/**
 * @author Mallaurie PHCAR
 */

public class Canton {
	private int id; // numéro
	//private int riskpurcent; //risque d'incident technique
	//private int praticalstate; //etat de praticabilité
	private int length; //longueur
	private int beginPoint;
	private Train busyTrain = null;

	public Canton(int id, int riskpurcent, int beginPoint, int length) {
		this.id = id;
		this.length = length;
		this.beginPoint = beginPoint;
		//this.riskpurcent = riskpurcent;
		//this.praticalstate = praticalstate;
	}
	
	public int getId(){
		return id;
	}

	public int getLength() {
		return length;
	}
	
	public int getBeginPoint() {
		return beginPoint;
	}
	
	public int getLastPoint(){
		return beginPoint + length;
	}

	public void setBeginPoint(int beginPoint) {
		this.beginPoint = beginPoint;
	}

	/*
	public int getRiskPurcent() {
		return riskpurcent;
	}

	public int getPraticalState() {
		return praticalstate;
	}
*/	
	public synchronized void accessTrain(Train train){
		if(busyTrain != null){
			System.out.println(toString() + "est occupé !!! ");
			
		}
	}
	
	public synchronized void exitTrain(){
		busyTrain = null;
		notify();
		System.out.println("Le canton est libre !");
	}

	@Override
	public String toString() {
		return "Canton [id=" + id + "]";
	}

}
