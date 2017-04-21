
public class ModifiedGeometricObjects {

	public static void main(String[] args) {

		Circle c1 = new Circle(0, 0, 5);
		Circle c2 = new Circle(0, 0, 2);
		Circle maxCircle =(Circle)GeometricObject.max(c1, c2);
		System.out.println("Circle 1: " + c1);
		System.out.println("Circle 2: " + c2);
		System.out.println("Max circle is: " + maxCircle);

		MyRectangle r1 = new MyRectangle(0, 0, 10, 5);
		MyRectangle r2 = new MyRectangle(0, 0, 10, 10);
		MyRectangle maxRectangle = (MyRectangle) GeometricObject.max(r1, r2);
		System.out.println("MyRec2 1: " + r1);
		System.out.println("MyRec2 2: " + r2);
		System.out.println("Max MyRec2 is: " + maxRectangle);


	}


}

