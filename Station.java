package model;

public class Station {
	
	public String name;
	public String positionX;
	public String positionY;
	
	public Station(String name, String X, String Y) {
		this.name = name;
		this.positionX = X;
		this.positionY = Y;
	}
	
	public String getPositionX() {
		return positionX;
	}

	public void setPositionX(String positionX) {
		this.positionX = positionX;
	}

	public String getPositionY() {
		return positionY;
	}

	public void setPositionY(String positionY) {
		this.positionY = positionY;
	}

	public void setName(String name) {
		this.name = name;
	}
}
 