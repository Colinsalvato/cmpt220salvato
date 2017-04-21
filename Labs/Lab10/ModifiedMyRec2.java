
public class ModifiedMyRec2 {
	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle(10,10);
		Rectangle rec2 = new Rectangle(10, 10);
		System.out.println(rec1.equals(rec2));
	}

	private static class Rectangle extends GeometricObject {
		private double width;
		private double height;

		public Rectangle() {
		}

		public Rectangle(
			double width, double height) {
			this.width = width;
			this.height = height;
		}

		public Rectangle(
			double width, double height, String color, boolean filled) {
			this.width = width;
			this.height = height;
			setColor(color);
			setFilled(filled);
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getArea() {
			return width * height;
		}

		public double getPerimeter() {
			return 2 * (width + height);
		}

		@Override
		public boolean equals(Object o) {
			return o instanceof Rectangle && getArea() == ((Rectangle) o).getArea();
		}
	}
}