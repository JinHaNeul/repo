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
public class Plot {
	private int depth;
	private int width;
	private int x;
	private int y;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot) {
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	public boolean encompasses(Plot plot) {
		return (this.x <= plot.x && this.y <= plot.y && (this.x + this.width) >= (plot.x + plot.width) && (this.y + this.depth) >= (plot.y + plot.depth));
	}
	
	public int getDepth() {
		return depth;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean overlaps(Plot plot) {
		return !(this.x + this.width <= plot.x || plot.x + plot.width <= this.x || this.y + this.depth <= plot.y || plot.y + plot.depth <= this.y);
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return x + "," + y + "," + width + "," + depth;
	}
}