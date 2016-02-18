package model;
/**
 * 
 * @author Bryan KITIHOUN and Mallaurie PHCAR
 *
 */

public class Train extends Thread{
	private int positionX;
	private int positionY;
	private Line line;
	private Canton currentCanton;
	private Station currentStation;
	private int speed;
	private boolean inStation = false;
	
	public Train(Line line, Canton beginCanton, int speed){
		this.line = line;
		currentCanton = beginCanton;
		//currentCanton.enter(this);
		this.speed = speed;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public Canton getCurrentCanton() {
		return currentCanton;
	}

	public void setCurrentCanton(Canton currentCanton) {
		this.currentCanton = currentCanton;
	}

	public Station getCurrentStation() {
		return currentStation;
	}

	public void setCurrentStation(Station currentStation) {
		this.currentStation = currentStation;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isInStation() {
		return inStation;
	}

	public void setInStation(boolean inStation) {
		this.inStation = inStation;
	}
	
	
}
