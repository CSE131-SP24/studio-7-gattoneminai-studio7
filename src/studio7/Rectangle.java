package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
	this.length = length;
	this.width = width;
	}
	public int area() {
		return this.length*this.width;
	}
	public int perimeter() {
		return 2*this.length+2*this.width;
		
	}
	
	
	
	public static void main(String[] args) {
		Rectangle Izzie = new Rectangle(1000000, 2);
		System.out.println( Izzie.area());
		System.out.print( Izzie.perimeter());
	
	}
	
	
}
