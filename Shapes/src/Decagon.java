
public class Decagon implements Shape {
	private double sideLength;
	private int numsides = 10;
	
	public double getWidth() {
		double width = (sideLength * (1+Math.sqrt(5)))	;
		return width;
	}

	public double getHeight() {
		double height = (sideLength * (1+Math.sqrt(5)));
		return height;
	}

	public double getArea() {
		double area = (5/2*(sideLength*sideLength)*Math.sqrt(5+2*Math.sqrt(5)));
		return area;
	}

	public void setSideLength(double sidelength) {
		sideLength = sidelength;
	}

	public double getPerimeter() {
		double perimeter = sideLength * numsides;
		return perimeter;
	}

	public double getInteriorAngle() {
		int interiorangle = ((numsides-2) * 180) / numsides;
		return interiorangle;
	}

	public int getNumSides() {
		return numsides;
	}

	public double getSideLength() {
		return sideLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
