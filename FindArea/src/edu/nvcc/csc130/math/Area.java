package edu.nvcc.csc130.math;
/**
 * Use this class to find an area of different geometric shapes.
 * <br/>
 * <b>Example:</b>
 * <i>Area.triangle(2,1);</i><br/>
 * The will returns 1.0 square unit as the area of the triangle.
 * 
 * @author Tanes Kanchanawanchai
 */
public class Area {
	private static double area;
	
	/**
	 * Find an area of triangle
	 * @param base the base size of a triangle
	 * @param height the height size of a triangle
	 * @return area of triangle
	 */
	public static double triangle(double base, double height) {
		area = (1.0/2.0)*base*height;
		return area;
	}
	
	/**
	 * Find an area of rectangle
	 * @param width the width size of a rectangle
	 * @param length the length size of a rectangle
	 * @return area of rectangle
	 */
	public static double rectangle(double width, double length) {
		area = width*length;
		return area;
	}
	
	/**
	 * Find an area of circle
	 * @param radius the radius size of a circle
	 * @return area of circle
	 */
	public static double circle(double radius) {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public static double trapezoid(double base1, double base2, double height) {
		area = (1.0/2.0)*(base1+base2)*height;
		return area;
	}
}
