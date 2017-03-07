import java.text.DecimalFormat;

public class Problem_9_1 {
	public static void main(String[] args) {

		Rectangle Rectangle1 = new Rectangle (4, 40);
		Rectangle Rectangle2 = new Rectangle (3.5 , 35.9);



		System.out.println( " The width of Rectangle1 is : 4");
		System.out.println( " The height of Rectangle1 is : 40");
		System.out.println( " The area of Rectangle 1 is : " + Rectangle.getArea());
		System.out.println( " The perimeter of Rectangle1 is : " + Rectangle.getPerimeter());
		System.out.println( " The width of Rectangle2 is : 3.5");
		System.out.println( " The height of Rectangle2 is : 35.9");
		System.out.println( " THe area of Rectangle2 is : " + Rectangle2.getArea());
		System.out.println( " The perimeter of Rectangle2 is : " + Rectangle2.getPerimeter());



	}

	public class Rectangle {

		double  width ;
		double height ;
		
		Rectangle(){
			width = 1;
			height = 1;
		}
		Rectangle(double newWidth, double newHeight){
			width = newWidth;
			height = newHeight;
		}
		public double getArea(){
			return width * height;
		}

		public double getPerimeter(){
			return 2 *(width + height);
		}


		void setNew(double newWidth, double newHeight){
			width = newWidth;
			height = newHeight;
		}
	}
}