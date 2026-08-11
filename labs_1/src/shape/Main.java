package shape;

public class Main {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		c1.findArea();
		
		Rectangle r1 = new Rectangle(5,10);
		r1.findArea();
		
		Triangle t1 = new Triangle(5,8);
		t1.findArea();
	}

}
