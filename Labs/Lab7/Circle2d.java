// JA: You missed the overlaps method
class circle2d {
		double x;
		double y;
		double radius;
		final double PI=3.14159;
		
		public circle2d() {
			x=0;
			y=0;
			radius=1;
		}
		public circle2d(double x, double y, double r) {
			this.x=x;
			this.y=y;
			this.radius=r;
		}
		public double getRadius() {
			return radius;
		}
		public double getArea() {
			return PI*radius*radius;
		}
		public double getPerimeter() {
			return 2*PI*radius;
		}
		public double getDistance(double X2, double Y2) {
			return Math.sqrt((X2-x)*(X2-x) +
					(Y2-y) * (Y2-y));
		}
		public boolean contains(double X2, double Y2) {
			if (getDistance(X2, Y2) < this.radius)
				return true;
			else
				return false;
		}
		public boolean contains(circle2d circle) {
			if( getDistance(circle.x, circle.y) < this.radius + circle.getRadius()) // JA
//					&& circle.radius > getDistance(circle.x, circle.y)) 
				return true;
			else
				return false;
		}
	}
