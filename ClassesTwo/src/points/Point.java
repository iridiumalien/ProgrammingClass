package points;

import java.text.DecimalFormat;

public class Point {
	double xValue;
	double yValue;
	double distancex;
	double distancey;
	DecimalFormat df = new DecimalFormat("##.##");

	public Point() {
		xValue = 0.0;
		yValue = 0.0;
	}

	public Point(double x, double y) {
		xValue = x;
		yValue = y;
	}

	public double getX() {
		return xValue;
	}

	public double getY() {
		return yValue;
	}

	public int quadrant() {
		int quadrant = -1;
		if ((xValue > 0) && (yValue > 0)) {
			quadrant = 1;
		} else if ((xValue < 0) && (yValue > 0)) {
			quadrant = 2;
		} else if ((xValue < 0) && (yValue < 0)) {
			quadrant = 3;
		} else if ((xValue > 0) && (yValue < 0)) {
			quadrant = 4;
		}
		return quadrant;
	}

	public Point midpoint(Point a) {
		distancex = (a.xValue + this.xValue) / 2;
		distancey = (a.yValue + this.yValue) / 2;
		Point b = new Point(distancex, distancey);
		return b;
	}

	public String distance(Point a) {
		distancex = a.xValue - this.xValue;
		distancey = a.yValue - this.yValue;
		double dTotal = Math.pow(distancex, 2) + Math.pow(distancey, 2);
		dTotal = Math.sqrt(dTotal);
		return df.format(dTotal);
	}

	public String equation(Point a) {
		if (a.xValue == this.xValue) {
			return "x = " + xValue;
		} else if (a.xValue != this.xValue) {
			double m = (a.yValue - this.yValue) / (a.xValue - this.xValue);
			double b = a.yValue - (m * a.xValue);
			return "y = " + df.format(m) + "x + " + df.format(b);
		} else {
			return "Broke";
		}
	}

	public String vector(Point a) {
		double dTotal = Math.pow(a.xValue, 2) + Math.pow(a.yValue, 2);
		double magnitude = Math.sqrt(dTotal);
		double direction = Math.atan(a.yValue / a.xValue);
		direction = (direction * 180) / Math.PI;

		return "<<" + df.format(magnitude) + ", " + df.format(direction) + ">>";
	}

	public String toString() {
		return "(" + xValue + ", " + yValue + ")";
	}
}
