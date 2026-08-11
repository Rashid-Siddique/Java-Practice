package shape;

public class Rectangle extends Shape{
	
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void findArea() {
		double area = length * breadth;
		System.out.println("Area of Rectangle =" + area);
		
	}

}
