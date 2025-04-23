/*
 * Class: CMSC203 
 * Instructor: Professor Khandan Monshi
 * Description: ManagementCompany class manages multiple Property objects, each defined by a name, location, rent, owner, and a Plot, while ensuring properties fit within its own Plot without overlap and calculating total rental income and management fees.
 * Due: 04/22/2025
 * Platform/compiler: Eclipse Java
 * I pledge that I have completed the programming  assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Jin Ha Neul
*/
public class Property {
	private String city;
	private String owner;
	private Plot plot;
	private String propertyName;
	private double rentAmount;
	
	public Property() {
		this.propertyName = "";
        this.city = "";
        this.rentAmount = 0.0;
        this.owner = "";
        this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x,y,width,depth);
	}
	
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
		this.plot = new Plot(otherProperty.plot);
	}
	
	public String getCity() {
		return city;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
}
